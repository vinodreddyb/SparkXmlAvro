/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package com.teliacompany.toolbox.model

import scala.annotation.switch

case class Nodes(var node: List[NodeType]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case pos if pos == 0 => {
        scala.collection.JavaConversions.bufferAsJavaList({
          node map { x =>
            x
          }
        }.toBuffer)
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case pos if pos == 0 => this.node = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConversions.asScalaIterator(array.iterator).toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[NodeType]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = Nodes.SCHEMA$
}

object Nodes {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Nodes\",\"namespace\":\"com.teliacompany.toolbox.model\",\"fields\":[{\"name\":\"node\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"NodeType\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"master\",\"type\":\"boolean\"},{\"name\":\"reason\",\"type\":\"string\"},{\"name\":\"customers\",\"type\":\"int\"},{\"name\":\"affected\",\"type\":{\"type\":\"record\",\"name\":\"AffectedType\",\"fields\":[{\"name\":\"spid\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SpidType\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"},{\"name\":\"id\",\"type\":\"int\"}]},\"java-class\":\"java.util.List\"}},{\"name\":\"product\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ProductType\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"},{\"name\":\"type\",\"type\":\"string\"}]},\"java-class\":\"java.util.List\"}}]}},{\"name\":\"id\",\"type\":\"int\"}]},\"java-class\":\"java.util.List\"}}]}")
}