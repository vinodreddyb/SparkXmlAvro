// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package com.telia.spark.generated

import scala.concurrent.Future


/**
usage:
val obj = scalaxb.fromXML[com.telia.spark.generated.Foo](node)
val document = scalaxb.toXML[com.telia.spark.generated.Foo](obj, "foo", com.telia.spark.generated.defaultScope)
**/
object `package` extends XMLProtocol { }

trait XMLProtocol extends scalaxb.XMLStandardTypes {
  implicit lazy val executionContext = scala.concurrent.ExecutionContext.Implicits.global

  val defaultScope = scalaxb.toScope(Some("xs") -> "http://www.w3.org/2001/XMLSchema",
    Some("xsi") -> "http://www.w3.org/2001/XMLSchema-instance")
  implicit lazy val GeneratedNodesFormat: scalaxb.XMLFormat[com.telia.spark.generated.Nodes] = new DefaultGeneratedNodesFormat {}
  implicit lazy val GeneratedLogsFormat: scalaxb.XMLFormat[com.telia.spark.generated.Logs] = new DefaultGeneratedLogsFormat {}
  implicit lazy val GeneratedTicketFormat: scalaxb.XMLFormat[com.telia.spark.generated.Ticket] = new DefaultGeneratedTicketFormat {}
  implicit lazy val GeneratedNodeTypeFormat: scalaxb.XMLFormat[com.telia.spark.generated.NodeType] = new DefaultGeneratedNodeTypeFormat {}
  implicit lazy val GeneratedAffectedTypeFormat: scalaxb.XMLFormat[com.telia.spark.generated.AffectedType] = new DefaultGeneratedAffectedTypeFormat {}
  implicit lazy val GeneratedProductTypeFormat: scalaxb.XMLFormat[com.telia.spark.generated.ProductType] = new DefaultGeneratedProductTypeFormat {}
  implicit lazy val GeneratedSpidTypeFormat: scalaxb.XMLFormat[com.telia.spark.generated.SpidType] = new DefaultGeneratedSpidTypeFormat {}
  implicit lazy val GeneratedLogTypeFormat: scalaxb.XMLFormat[com.telia.spark.generated.LogType] = new DefaultGeneratedLogTypeFormat {}
  implicit lazy val GeneratedStatusTypeFormat: scalaxb.XMLFormat[com.telia.spark.generated.StatusType] = new DefaultGeneratedStatusTypeFormat {}
  implicit lazy val GeneratedTicketTypeFormat: scalaxb.XMLFormat[com.telia.spark.generated.TicketType] = new DefaultGeneratedTicketTypeFormat {}
  implicit lazy val GeneratedSeverityTypeFormat: scalaxb.XMLFormat[com.telia.spark.generated.SeverityType] = new DefaultGeneratedSeverityTypeFormat {}

  trait DefaultGeneratedNodesFormat extends scalaxb.ElemNameParser[com.telia.spark.generated.Nodes] {
    val targetNamespace: Option[String] = None
    
    def parser(node: scala.xml.Node, stack: List[scalaxb.ElemName]): Parser[com.telia.spark.generated.Nodes] =
      phrase(safeRep(scalaxb.ElemName(None, "node")) ^^
      { case p1 =>
      com.telia.spark.generated.Nodes(p1.toSeq map { scalaxb.fromXML[com.telia.spark.generated.NodeType](_, scalaxb.ElemName(node) :: stack) }: _*) })
    
    def writesChildNodes(__obj: com.telia.spark.generated.Nodes, __scope: scala.xml.NamespaceBinding): Seq[scala.xml.Node] =
      (__obj.node flatMap { scalaxb.toXML[com.telia.spark.generated.NodeType](_, None, Some("node"), __scope, false) })

  }

  trait DefaultGeneratedLogsFormat extends scalaxb.ElemNameParser[com.telia.spark.generated.Logs] {
    val targetNamespace: Option[String] = None
    
    def parser(node: scala.xml.Node, stack: List[scalaxb.ElemName]): Parser[com.telia.spark.generated.Logs] =
      phrase(safeRep(scalaxb.ElemName(None, "log")) ^^
      { case p1 =>
      com.telia.spark.generated.Logs(p1.toSeq map { scalaxb.fromXML[com.telia.spark.generated.LogType](_, scalaxb.ElemName(node) :: stack) }: _*) })
    
    def writesChildNodes(__obj: com.telia.spark.generated.Logs, __scope: scala.xml.NamespaceBinding): Seq[scala.xml.Node] =
      (__obj.log flatMap { scalaxb.toXML[com.telia.spark.generated.LogType](_, None, Some("log"), __scope, false) })

  }

  trait DefaultGeneratedTicketFormat extends scalaxb.ElemNameParser[com.telia.spark.generated.Ticket] {
    val targetNamespace: Option[String] = None
    
    def parser(node: scala.xml.Node, stack: List[scalaxb.ElemName]): Parser[com.telia.spark.generated.Ticket] =
      phrase((scalaxb.ElemName(None, "description")) ~ 
      (scalaxb.ElemName(None, "type")) ~ 
      (scalaxb.ElemName(None, "severity")) ~ 
      (scalaxb.ElemName(None, "start")) ~ 
      (scalaxb.ElemName(None, "expected")) ~ 
      opt(scalaxb.ElemName(None, "finished")) ~ 
      opt(scalaxb.ElemName(None, "nodes")) ~ 
      opt(scalaxb.ElemName(None, "logs")) ^^
      { case p1 ~ p2 ~ p3 ~ p4 ~ p5 ~ p6 ~ p7 ~ p8 =>
      com.telia.spark.generated.Ticket(scalaxb.fromXML[String](p1, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[com.telia.spark.generated.TicketType](p2, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[com.telia.spark.generated.SeverityType](p3, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[javax.xml.datatype.XMLGregorianCalendar](p4, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[javax.xml.datatype.XMLGregorianCalendar](p5, scalaxb.ElemName(node) :: stack),
        p6.headOption map { scalaxb.fromXML[javax.xml.datatype.XMLGregorianCalendar](_, scalaxb.ElemName(node) :: stack) },
        p7.headOption map { scalaxb.fromXML[com.telia.spark.generated.Nodes](_, scalaxb.ElemName(node) :: stack) },
        p8.headOption map { scalaxb.fromXML[com.telia.spark.generated.Logs](_, scalaxb.ElemName(node) :: stack) },
        scala.collection.immutable.ListMap(List(
        (node \ "@id").headOption map { x => scalaxb.DataRecord(x, node, scalaxb.fromXML[Int](x, scalaxb.ElemName(node) :: stack)) } map { "@id" -> _ },
        (node \ "@status").headOption map { x => scalaxb.DataRecord(x, node, scalaxb.fromXML[com.telia.spark.generated.StatusType](x, scalaxb.ElemName(node) :: stack)) } map { "@status" -> _ }
        ).flatten[(String, scalaxb.DataRecord[Any])]: _*)) })
    
    override def writesAttribute(__obj: com.telia.spark.generated.Ticket, __scope: scala.xml.NamespaceBinding): scala.xml.MetaData = {
      var attr: scala.xml.MetaData  = scala.xml.Null
      __obj.attributes.toList map {
        case ("@id", _) => __obj.id foreach { x => attr = scala.xml.Attribute(null, "id", x.toString, attr) }
        case ("@status", _) => __obj.status foreach { x => attr = scala.xml.Attribute(null, "status", x.toString, attr) }
        case (key, x) => attr = scala.xml.Attribute((x.namespace map { __scope.getPrefix(_) }).orNull, x.key.orNull, x.value.toString, attr)
      }
      attr
    }

    def writesChildNodes(__obj: com.telia.spark.generated.Ticket, __scope: scala.xml.NamespaceBinding): Seq[scala.xml.Node] =
      Seq.concat(scalaxb.toXML[String](__obj.description, None, Some("description"), __scope, false),
        scalaxb.toXML[com.telia.spark.generated.TicketType](__obj.typeValue, None, Some("type"), __scope, false),
        scalaxb.toXML[com.telia.spark.generated.SeverityType](__obj.severity, None, Some("severity"), __scope, false),
        scalaxb.toXML[javax.xml.datatype.XMLGregorianCalendar](__obj.start, None, Some("start"), __scope, false),
        scalaxb.toXML[javax.xml.datatype.XMLGregorianCalendar](__obj.expected, None, Some("expected"), __scope, false),
        __obj.finished map { scalaxb.toXML[javax.xml.datatype.XMLGregorianCalendar](_, None, Some("finished"), __scope, false) } getOrElse {Nil},
        __obj.nodes map { scalaxb.toXML[com.telia.spark.generated.Nodes](_, None, Some("nodes"), __scope, false) } getOrElse {Nil},
        __obj.logs map { scalaxb.toXML[com.telia.spark.generated.Logs](_, None, Some("logs"), __scope, false) } getOrElse {Nil})

  }

  trait DefaultGeneratedNodeTypeFormat extends scalaxb.ElemNameParser[com.telia.spark.generated.NodeType] {
    val targetNamespace: Option[String] = None
    
    override def typeName: Option[String] = Some("NodeType")

    def parser(node: scala.xml.Node, stack: List[scalaxb.ElemName]): Parser[com.telia.spark.generated.NodeType] =
      phrase((scalaxb.ElemName(None, "name")) ~ 
      (scalaxb.ElemName(None, "master")) ~ 
      (scalaxb.ElemName(None, "reason")) ~ 
      (scalaxb.ElemName(None, "customers")) ~ 
      (scalaxb.ElemName(None, "affected")) ^^
      { case p1 ~ p2 ~ p3 ~ p4 ~ p5 =>
      com.telia.spark.generated.NodeType(scalaxb.fromXML[String](p1, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[Boolean](p2, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[String](p3, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[Int](p4, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[com.telia.spark.generated.AffectedType](p5, scalaxb.ElemName(node) :: stack),
        scala.collection.immutable.ListMap(List(
        (node \ "@id").headOption map { x => scalaxb.DataRecord(x, node, scalaxb.fromXML[Int](x, scalaxb.ElemName(node) :: stack)) } map { "@id" -> _ }
        ).flatten[(String, scalaxb.DataRecord[Any])]: _*)) })
    
    override def writesAttribute(__obj: com.telia.spark.generated.NodeType, __scope: scala.xml.NamespaceBinding): scala.xml.MetaData = {
      var attr: scala.xml.MetaData  = scala.xml.Null
      __obj.attributes.toList map {
        case ("@id", _) => __obj.id foreach { x => attr = scala.xml.Attribute(null, "id", x.toString, attr) }
        case (key, x) => attr = scala.xml.Attribute((x.namespace map { __scope.getPrefix(_) }).orNull, x.key.orNull, x.value.toString, attr)
      }
      attr
    }

    def writesChildNodes(__obj: com.telia.spark.generated.NodeType, __scope: scala.xml.NamespaceBinding): Seq[scala.xml.Node] =
      Seq.concat(scalaxb.toXML[String](__obj.name, None, Some("name"), __scope, false),
        scalaxb.toXML[Boolean](__obj.master, None, Some("master"), __scope, false),
        scalaxb.toXML[String](__obj.reason, None, Some("reason"), __scope, false),
        scalaxb.toXML[Int](__obj.customers, None, Some("customers"), __scope, false),
        scalaxb.toXML[com.telia.spark.generated.AffectedType](__obj.affected, None, Some("affected"), __scope, false))

  }

  trait DefaultGeneratedAffectedTypeFormat extends scalaxb.ElemNameParser[com.telia.spark.generated.AffectedType] {
    val targetNamespace: Option[String] = None
    
    override def typeName: Option[String] = Some("AffectedType")

    def parser(node: scala.xml.Node, stack: List[scalaxb.ElemName]): Parser[com.telia.spark.generated.AffectedType] =
      phrase(safeRep(scalaxb.ElemName(None, "spid")) ~ 
      safeRep(scalaxb.ElemName(None, "product")) ^^
      { case p1 ~ p2 =>
      com.telia.spark.generated.AffectedType(p1.toSeq map { scalaxb.fromXML[com.telia.spark.generated.SpidType](_, scalaxb.ElemName(node) :: stack) },
        p2.toSeq map { scalaxb.fromXML[com.telia.spark.generated.ProductType](_, scalaxb.ElemName(node) :: stack) }) })
    
    def writesChildNodes(__obj: com.telia.spark.generated.AffectedType, __scope: scala.xml.NamespaceBinding): Seq[scala.xml.Node] =
      Seq.concat(__obj.spid flatMap { scalaxb.toXML[com.telia.spark.generated.SpidType](_, None, Some("spid"), __scope, false) },
        __obj.product flatMap { scalaxb.toXML[com.telia.spark.generated.ProductType](_, None, Some("product"), __scope, false) })

  }

  trait DefaultGeneratedProductTypeFormat extends scalaxb.XMLFormat[com.telia.spark.generated.ProductType] with scalaxb.CanWriteChildNodes[com.telia.spark.generated.ProductType] {
    val targetNamespace: Option[String] = None
    import scalaxb.ElemName._
    
    def reads(seq: scala.xml.NodeSeq, stack: List[scalaxb.ElemName]): Either[String, com.telia.spark.generated.ProductType] = seq match {
      case node: scala.xml.Node => Right(com.telia.spark.generated.ProductType(scalaxb.fromXML[Int](node, scalaxb.ElemName(node) :: stack),
        scala.collection.immutable.ListMap(List(
        (node \ "@type").headOption map { x => scalaxb.DataRecord(x, node, scalaxb.fromXML[String](x, scalaxb.ElemName(node) :: stack)) } map { "@type" -> _ }
        ).flatten[(String, scalaxb.DataRecord[Any])]: _*)))
      case _ => Left("reads failed: seq must be scala.xml.Node")
    }
    
    override def writesAttribute(__obj: com.telia.spark.generated.ProductType, __scope: scala.xml.NamespaceBinding): scala.xml.MetaData = {
      var attr: scala.xml.MetaData  = scala.xml.Null
      __obj.attributes.toList map {
        case ("@type", _) => __obj.typeValue foreach { x => attr = scala.xml.Attribute(null, "type", x.toString, attr) }
        case (key, x) => attr = scala.xml.Attribute((x.namespace map { __scope.getPrefix(_) }).orNull, x.key.orNull, x.value.toString, attr)
      }
      attr
    }

    def writesChildNodes(__obj: com.telia.spark.generated.ProductType, __scope: scala.xml.NamespaceBinding): Seq[scala.xml.Node] =
      Seq(scala.xml.Text(__obj.value.toString))


  }

  trait DefaultGeneratedSpidTypeFormat extends scalaxb.XMLFormat[com.telia.spark.generated.SpidType] with scalaxb.CanWriteChildNodes[com.telia.spark.generated.SpidType] {
    val targetNamespace: Option[String] = None
    import scalaxb.ElemName._
    
    def reads(seq: scala.xml.NodeSeq, stack: List[scalaxb.ElemName]): Either[String, com.telia.spark.generated.SpidType] = seq match {
      case node: scala.xml.Node => Right(com.telia.spark.generated.SpidType(scalaxb.fromXML[Int](node, scalaxb.ElemName(node) :: stack),
        scala.collection.immutable.ListMap(List(
        (node \ "@id").headOption map { x => scalaxb.DataRecord(x, node, scalaxb.fromXML[Int](x, scalaxb.ElemName(node) :: stack)) } map { "@id" -> _ }
        ).flatten[(String, scalaxb.DataRecord[Any])]: _*)))
      case _ => Left("reads failed: seq must be scala.xml.Node")
    }
    
    override def writesAttribute(__obj: com.telia.spark.generated.SpidType, __scope: scala.xml.NamespaceBinding): scala.xml.MetaData = {
      var attr: scala.xml.MetaData  = scala.xml.Null
      __obj.attributes.toList map {
        case ("@id", _) => __obj.id foreach { x => attr = scala.xml.Attribute(null, "id", x.toString, attr) }
        case (key, x) => attr = scala.xml.Attribute((x.namespace map { __scope.getPrefix(_) }).orNull, x.key.orNull, x.value.toString, attr)
      }
      attr
    }

    def writesChildNodes(__obj: com.telia.spark.generated.SpidType, __scope: scala.xml.NamespaceBinding): Seq[scala.xml.Node] =
      Seq(scala.xml.Text(__obj.value.toString))


  }

  trait DefaultGeneratedLogTypeFormat extends scalaxb.ElemNameParser[com.telia.spark.generated.LogType] {
    val targetNamespace: Option[String] = None
    
    override def typeName: Option[String] = Some("LogType")

    def parser(node: scala.xml.Node, stack: List[scalaxb.ElemName]): Parser[com.telia.spark.generated.LogType] =
      phrase((scalaxb.ElemName(None, "text")) ~ 
      (scalaxb.ElemName(None, "time")) ~ 
      (scalaxb.ElemName(None, "type")) ^^
      { case p1 ~ p2 ~ p3 =>
      com.telia.spark.generated.LogType(scalaxb.fromXML[String](p1, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[javax.xml.datatype.XMLGregorianCalendar](p2, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[String](p3, scalaxb.ElemName(node) :: stack),
        scala.collection.immutable.ListMap(List(
        (node \ "@id").headOption map { x => scalaxb.DataRecord(x, node, scalaxb.fromXML[Int](x, scalaxb.ElemName(node) :: stack)) } map { "@id" -> _ }
        ).flatten[(String, scalaxb.DataRecord[Any])]: _*)) })
    
    override def writesAttribute(__obj: com.telia.spark.generated.LogType, __scope: scala.xml.NamespaceBinding): scala.xml.MetaData = {
      var attr: scala.xml.MetaData  = scala.xml.Null
      __obj.attributes.toList map {
        case ("@id", _) => __obj.id foreach { x => attr = scala.xml.Attribute(null, "id", x.toString, attr) }
        case (key, x) => attr = scala.xml.Attribute((x.namespace map { __scope.getPrefix(_) }).orNull, x.key.orNull, x.value.toString, attr)
      }
      attr
    }

    def writesChildNodes(__obj: com.telia.spark.generated.LogType, __scope: scala.xml.NamespaceBinding): Seq[scala.xml.Node] =
      Seq.concat(scalaxb.toXML[String](__obj.text, None, Some("text"), __scope, false),
        scalaxb.toXML[javax.xml.datatype.XMLGregorianCalendar](__obj.time, None, Some("time"), __scope, false),
        scalaxb.toXML[String](__obj.typeValue, None, Some("type"), __scope, false))

  }

  def buildGeneratedStatusTypeFormat = new DefaultGeneratedStatusTypeFormat {}
  trait DefaultGeneratedStatusTypeFormat extends scalaxb.XMLFormat[com.telia.spark.generated.StatusType] {
    val targetNamespace: Option[String] = None
    
    def reads(seq: scala.xml.NodeSeq, stack: List[scalaxb.ElemName]): Either[String, com.telia.spark.generated.StatusType] = seq match {
      case elem: scala.xml.Elem => Right(com.telia.spark.generated.StatusType.fromString(elem.text, elem.scope))
      case _ => Right(com.telia.spark.generated.StatusType.fromString(seq.text, scala.xml.TopScope))
    }
    
    def writes(__obj: com.telia.spark.generated.StatusType, __namespace: Option[String], __elementLabel: Option[String],
        __scope: scala.xml.NamespaceBinding, __typeAttribute: Boolean): scala.xml.NodeSeq =
      scala.xml.Elem(scalaxb.Helper.getPrefix(__namespace, __scope).orNull, 
        __elementLabel getOrElse { sys.error("missing element label.") },
        scala.xml.Null, __scope, true, scala.xml.Text(__obj.toString))
  }

  def buildGeneratedTicketTypeFormat = new DefaultGeneratedTicketTypeFormat {}
  trait DefaultGeneratedTicketTypeFormat extends scalaxb.XMLFormat[com.telia.spark.generated.TicketType] {
    val targetNamespace: Option[String] = None
    
    def reads(seq: scala.xml.NodeSeq, stack: List[scalaxb.ElemName]): Either[String, com.telia.spark.generated.TicketType] = seq match {
      case elem: scala.xml.Elem => Right(com.telia.spark.generated.TicketType.fromString(elem.text, elem.scope))
      case _ => Right(com.telia.spark.generated.TicketType.fromString(seq.text, scala.xml.TopScope))
    }
    
    def writes(__obj: com.telia.spark.generated.TicketType, __namespace: Option[String], __elementLabel: Option[String],
        __scope: scala.xml.NamespaceBinding, __typeAttribute: Boolean): scala.xml.NodeSeq =
      scala.xml.Elem(scalaxb.Helper.getPrefix(__namespace, __scope).orNull, 
        __elementLabel getOrElse { sys.error("missing element label.") },
        scala.xml.Null, __scope, true, scala.xml.Text(__obj.toString))
  }

  def buildGeneratedSeverityTypeFormat = new DefaultGeneratedSeverityTypeFormat {}
  trait DefaultGeneratedSeverityTypeFormat extends scalaxb.XMLFormat[com.telia.spark.generated.SeverityType] {
    val targetNamespace: Option[String] = None
    
    def reads(seq: scala.xml.NodeSeq, stack: List[scalaxb.ElemName]): Either[String, com.telia.spark.generated.SeverityType] = seq match {
      case elem: scala.xml.Elem => Right(com.telia.spark.generated.SeverityType.fromString(elem.text, elem.scope))
      case _ => Right(com.telia.spark.generated.SeverityType.fromString(seq.text, scala.xml.TopScope))
    }
    
    def writes(__obj: com.telia.spark.generated.SeverityType, __namespace: Option[String], __elementLabel: Option[String],
        __scope: scala.xml.NamespaceBinding, __typeAttribute: Boolean): scala.xml.NodeSeq =
      scala.xml.Elem(scalaxb.Helper.getPrefix(__namespace, __scope).orNull, 
        __elementLabel getOrElse { sys.error("missing element label.") },
        scala.xml.Null, __scope, true, scala.xml.Text(__obj.toString))
  }


}

