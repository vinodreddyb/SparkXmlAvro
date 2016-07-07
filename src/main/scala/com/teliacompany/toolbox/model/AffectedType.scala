/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package com.teliacompany.toolbox.model

import scala.annotation.switch

case class AffectedType(var spid: List[SpidType], var product: List[ProductType]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty, List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case pos if pos == 0 => {
        scala.collection.JavaConversions.bufferAsJavaList({
          spid map { x =>
            x
          }
        }.toBuffer)
      }.asInstanceOf[AnyRef]
      case pos if pos == 1 => {
        scala.collection.JavaConversions.bufferAsJavaList({
          product map { x =>
            x
          }
        }.toBuffer)
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case pos if pos == 0 => this.spid = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConversions.asScalaIterator(array.iterator).toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[SpidType]]
      case pos if pos == 1 => this.product = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConversions.asScalaIterator(array.iterator).toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[ProductType]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = AffectedType.SCHEMA$
}

object AffectedType {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AffectedType\",\"namespace\":\"com.teliacompany.toolbox.model\",\"fields\":[{\"name\":\"spid\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SpidType\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"},{\"name\":\"id\",\"type\":\"int\"}]},\"java-class\":\"java.util.List\"}},{\"name\":\"product\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ProductType\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"},{\"name\":\"type\",\"type\":\"string\"}]},\"java-class\":\"java.util.List\"}}]}")
}