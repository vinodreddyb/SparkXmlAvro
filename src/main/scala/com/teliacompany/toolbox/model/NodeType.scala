/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package com.teliacompany.toolbox.model

import scala.annotation.switch

case class NodeType(var name: String, var master: Boolean, var reason: String, var customers: Int, var affected: AffectedType, var id: Int) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", false, "", 0, new AffectedType, 0)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case pos if pos == 0 => {
        name
      }.asInstanceOf[AnyRef]
      case pos if pos == 1 => {
        master
      }.asInstanceOf[AnyRef]
      case pos if pos == 2 => {
        reason
      }.asInstanceOf[AnyRef]
      case pos if pos == 3 => {
        customers
      }.asInstanceOf[AnyRef]
      case pos if pos == 4 => {
        affected
      }.asInstanceOf[AnyRef]
      case pos if pos == 5 => {
        id
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case pos if pos == 0 => this.name = {
        value.toString
      }.asInstanceOf[String]
      case pos if pos == 1 => this.master = {
        value
      }.asInstanceOf[Boolean]
      case pos if pos == 2 => this.reason = {
        value.toString
      }.asInstanceOf[String]
      case pos if pos == 3 => this.customers = {
        value
      }.asInstanceOf[Int]
      case pos if pos == 4 => this.affected = {
        value
      }.asInstanceOf[AffectedType]
      case pos if pos == 5 => this.id = {
        value
      }.asInstanceOf[Int]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = NodeType.SCHEMA$
}

object NodeType {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NodeType\",\"namespace\":\"com.teliacompany.toolbox.model\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"master\",\"type\":\"boolean\"},{\"name\":\"reason\",\"type\":\"string\"},{\"name\":\"customers\",\"type\":\"int\"},{\"name\":\"affected\",\"type\":{\"type\":\"record\",\"name\":\"AffectedType\",\"fields\":[{\"name\":\"spid\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SpidType\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"},{\"name\":\"id\",\"type\":\"int\"}]},\"java-class\":\"java.util.List\"}},{\"name\":\"product\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ProductType\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"},{\"name\":\"type\",\"type\":\"string\"}]},\"java-class\":\"java.util.List\"}}]}},{\"name\":\"id\",\"type\":\"int\"}]}")
}