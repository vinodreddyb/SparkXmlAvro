/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package com.teliacompany.toolbox.model

import scala.annotation.switch

case class ProductType(var value: Int, var `type`: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0, "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case pos if pos == 0 => {
        value
      }.asInstanceOf[AnyRef]
      case pos if pos == 1 => {
        `type`
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case pos if pos == 0 => this.value = {
        value
      }.asInstanceOf[Int]
      case pos if pos == 1 => this.`type` = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ProductType.SCHEMA$
}

object ProductType {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProductType\",\"namespace\":\"com.teliacompany.toolbox.model\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"},{\"name\":\"type\",\"type\":\"string\"}]}")
}