/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package com.teliacompany.toolbox.model

import scala.annotation.switch

case class LogType(var text: String, var time: String, var `type`: String, var id: Int) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", "", "", 0)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case pos if pos == 0 => {
        text
      }.asInstanceOf[AnyRef]
      case pos if pos == 1 => {
        time
      }.asInstanceOf[AnyRef]
      case pos if pos == 2 => {
        `type`
      }.asInstanceOf[AnyRef]
      case pos if pos == 3 => {
        id
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case pos if pos == 0 => this.text = {
        value.toString
      }.asInstanceOf[String]
      case pos if pos == 1 => this.time = {
        value.toString
      }.asInstanceOf[String]
      case pos if pos == 2 => this.`type` = {
        value.toString
      }.asInstanceOf[String]
      case pos if pos == 3 => this.id = {
        value
      }.asInstanceOf[Int]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = LogType.SCHEMA$
}

object LogType {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LogType\",\"namespace\":\"com.teliacompany.toolbox.model\",\"fields\":[{\"name\":\"text\",\"type\":\"string\"},{\"name\":\"time\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"int\"}]}")
}