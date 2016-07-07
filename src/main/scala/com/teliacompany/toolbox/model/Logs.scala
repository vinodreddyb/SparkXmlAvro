/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package com.teliacompany.toolbox.model

import scala.annotation.switch

case class Logs(var log: List[LogType]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case pos if pos == 0 => {
        scala.collection.JavaConversions.bufferAsJavaList({
          log map { x =>
            x
          }
        }.toBuffer)
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case pos if pos == 0 => this.log = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConversions.asScalaIterator(array.iterator).toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[LogType]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = Logs.SCHEMA$
}

object Logs {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Logs\",\"namespace\":\"com.teliacompany.toolbox.model\",\"fields\":[{\"name\":\"log\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LogType\",\"fields\":[{\"name\":\"text\",\"type\":\"string\"},{\"name\":\"time\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"int\"}]},\"java-class\":\"java.util.List\"}}]}")
}