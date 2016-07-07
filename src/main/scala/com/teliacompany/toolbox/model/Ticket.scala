package com.teliacompany.toolbox.model

import scala.annotation.switch

case class Ticket(var description: String, var `type`: TicketType, var severity: SeverityType, var start: String, var expected: String, var finished: String, var nodes: Nodes, var logs: Logs, var id: Int, var status: StatusType) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", null, null, "", "", "", new Nodes, new Logs, 0, null)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case pos if pos == 0 => {
        description
      }.asInstanceOf[AnyRef]
      case pos if pos == 1 => {
        `type`
      }.asInstanceOf[AnyRef]
      case pos if pos == 2 => {
        severity
      }.asInstanceOf[AnyRef]
      case pos if pos == 3 => {
        start
      }.asInstanceOf[AnyRef]
      case pos if pos == 4 => {
        expected
      }.asInstanceOf[AnyRef]
      case pos if pos == 5 => {
        finished
      }.asInstanceOf[AnyRef]
      case pos if pos == 6 => {
        nodes
      }.asInstanceOf[AnyRef]
      case pos if pos == 7 => {
        logs
      }.asInstanceOf[AnyRef]
      case pos if pos == 8 => {
        id
      }.asInstanceOf[AnyRef]
      case pos if pos == 9 => {
        status
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case pos if pos == 0 => this.description = {
        value.toString
      }.asInstanceOf[String]
      case pos if pos == 1 => this.`type` = {
        value
      }.asInstanceOf[TicketType]
      case pos if pos == 2 => this.severity = {
        value
      }.asInstanceOf[SeverityType]
      case pos if pos == 3 => this.start = {
        value.toString
      }.asInstanceOf[String]
      case pos if pos == 4 => this.expected = {
        value.toString
      }.asInstanceOf[String]
      case pos if pos == 5 => this.finished = {
        value.toString
      }.asInstanceOf[String]
      case pos if pos == 6 => this.nodes = {
        value
      }.asInstanceOf[Nodes]
      case pos if pos == 7 => this.logs = {
        value
      }.asInstanceOf[Logs]
      case pos if pos == 8 => this.id = {
        value
      }.asInstanceOf[Int]
      case pos if pos == 9 => this.status = {
        value
      }.asInstanceOf[StatusType]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = Ticket.SCHEMA$
}

object Ticket {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Ticket\",\"namespace\":\"com.teliacompany.toolbox.model\",\"fields\":[{\"name\":\"description\",\"type\":\"string\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"TicketType\",\"symbols\":[\"ACUTE\",\"PLANNED\",\"AUTO\"]}},{\"name\":\"severity\",\"type\":{\"type\":\"enum\",\"name\":\"SeverityType\",\"symbols\":[\"STOP\",\"DISTURBANCE\",\"INFO\"]}},{\"name\":\"start\",\"type\":\"string\"},{\"name\":\"expected\",\"type\":\"string\"},{\"name\":\"finished\",\"type\":\"string\"},{\"name\":\"nodes\",\"type\":{\"type\":\"record\",\"name\":\"Nodes\",\"fields\":[{\"name\":\"node\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"NodeType\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"master\",\"type\":\"boolean\"},{\"name\":\"reason\",\"type\":\"string\"},{\"name\":\"customers\",\"type\":\"int\"},{\"name\":\"affected\",\"type\":{\"type\":\"record\",\"name\":\"AffectedType\",\"fields\":[{\"name\":\"spid\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SpidType\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"},{\"name\":\"id\",\"type\":\"int\"}]},\"java-class\":\"java.util.List\"}},{\"name\":\"product\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ProductType\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"},{\"name\":\"type\",\"type\":\"string\"}]},\"java-class\":\"java.util.List\"}}]}},{\"name\":\"id\",\"type\":\"int\"}]},\"java-class\":\"java.util.List\"}}]}},{\"name\":\"logs\",\"type\":{\"type\":\"record\",\"name\":\"Logs\",\"fields\":[{\"name\":\"log\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LogType\",\"fields\":[{\"name\":\"text\",\"type\":\"string\"},{\"name\":\"time\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"int\"}]},\"java-class\":\"java.util.List\"}}]}},{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"status\",\"type\":{\"type\":\"enum\",\"name\":\"StatusType\",\"symbols\":[\"OPEN\",\"CLOSED\"]}}]}")
}