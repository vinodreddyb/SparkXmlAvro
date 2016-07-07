package com.telia.spark

import java.io.FileNotFoundException
import java.io.IOException

import scala.annotation.implicitNotFound
import scala.io.Source
import scala.xml.XML

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

import com.telia.spark.generated.NodeType
import com.telia.spark.generated.Nodes
import com.teliacompany.toolbox.model.NodeType
import com.teliacompany.toolbox.model.SpidType
import com.teliacompany.toolbox.model.ProductType
import com.teliacompany.toolbox.model.AffectedType

import org.apache.hadoop.io.LongWritable
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.io.Text
import org.apache.avro.mapreduce.AvroJob
import org.apache.avro.mapreduce.AvroKeyOutputFormat
import org.apache.avro.mapred.AvroKey
import org.apache.hadoop.mapreduce.Job
import org.apache.hadoop.io.NullWritable
import org.apache.avro.reflect.ReflectData


object XmlToAvroDriver {

  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("SparkXmlToAvro")
    @transient val conf = new Configuration()
    conf.set(XMLInput.START_TAG_KEY, "<ticket ")
    conf.set(XMLInput.END_TAG_KEY, "</ticket>")
    val sparkContext = new SparkContext(sparkConf)
    val job = new Job(sparkContext.hadoopConfiguration)
    val xmlReadData = sparkContext.newAPIHadoopFile(args(0), classOf[XMLInput], classOf[LongWritable], classOf[Text], conf)

    // Convert to xml to avro model objects
    val xml = xmlReadData.mapValues { x => 
            val ticket = scalaxb.fromXML[com.telia.spark.generated.Ticket](XML.loadString(x.toString))
            convertFromXmlToAvroModel(ticket)
    }
    
    //Avro outputformat to write avro files   
    AvroJob.setOutputKeySchema(job,  com.teliacompany.toolbox.model.Ticket.SCHEMA$)
    val nrdd = xml.map(x => (new AvroKey(x._2),NullWritable.get()))
    nrdd.saveAsNewAPIHadoopFile(args(1), 
        classOf[com.teliacompany.toolbox.model.Ticket],
        classOf[org.apache.hadoop.io.NullWritable],
        classOf[AvroKeyOutputFormat[com.teliacompany.toolbox.model.Ticket]],
        job.getConfiguration)
  }
  
  def convertFromXmlToAvroModel(ticket:com.telia.spark.generated.Ticket) : com.teliacompany.toolbox.model.Ticket = {
    var xmlNodes = ticket.nodes.get.node
    // Node Types conversion
    val avroNodesType = xmlNodes.map { x =>
      val spits = x.affected.spid.map { spit =>
        SpidType(spit.value, spit.id.get)
      }.toList

      val productType = x.affected.product.map { product =>
        ProductType(product.value, product.typeValue.get)
      }.toList

      val avroAffectedType = AffectedType(spits, productType)
      com.teliacompany.toolbox.model.NodeType(x.name, x.master, x.reason, x.customers, avroAffectedType, x.id.get)
    }.toList

    val avroNodes = com.teliacompany.toolbox.model.Nodes(avroNodesType)

    val xmlLogs = ticket.logs.get.log
    
    //log type conversion
    val avroLogTypes = xmlLogs.map { x => 
      com.teliacompany.toolbox.model.LogType(x.text,x.time.toString(),x.typeValue,x.id.get)
    }.toList
    
    val avroLogs = com.teliacompany.toolbox.model.Logs(avroLogTypes)
    
    val avroTicket = com.teliacompany.toolbox.model.Ticket(ticket.description,
      com.teliacompany.toolbox.model.TicketType.valueOf(ticket.typeValue.toString.toUpperCase()),
      com.teliacompany.toolbox.model.SeverityType.valueOf(ticket.severity.toString().toUpperCase()),
      ticket.start.toString(),
      ticket.expected.toString(),
      ticket.finished.get.toString(), avroNodes,avroLogs,ticket.id.get,
      com.teliacompany.toolbox.model.StatusType.valueOf(ticket.status.get.toString().toUpperCase()))

    avroTicket
  }
  
}

