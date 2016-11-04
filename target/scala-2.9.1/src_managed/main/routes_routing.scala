// @SOURCE:C:/workspace/sc1_list_manager/conf/routes
// @HASH:e3d63dea7f44dcb0e1b895694dd1bb3392f46f5e
// @DATE:Fri Nov 04 00:10:38 GMT 2016

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_list1 = Route("GET", PathPattern(List(StaticPart("/references"))))
                    

// @LINE:12
val controllers_Application_create2 = Route("GET", PathPattern(List(StaticPart("/reference/new"))))
                    

// @LINE:13
val controllers_Application_save3 = Route("POST", PathPattern(List(StaticPart("/references"))))
                    

// @LINE:16
val controllers_Application_edit4 = Route("GET", PathPattern(List(StaticPart("/references/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:17
val controllers_Application_update5 = Route("POST", PathPattern(List(StaticPart("/references/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:20
val controllers_Application_delete6 = Route("POST", PathPattern(List(StaticPart("/references/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:23
val controllers_Assets_at7 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:26
val controllers_Application_login8 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:28
val controllers_Application_authenticate9 = Route("POST", PathPattern(List(StaticPart("/login"))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/references""","""controllers.Application.list(p:Int ?= 0, s:String ?= "title", o:String ?= "asc", f:String ?= "")"""),("""GET""","""/reference/new""","""controllers.Application.create()"""),("""POST""","""/references""","""controllers.Application.save()"""),("""GET""","""/references/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""POST""","""/references/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""POST""","""/references/$id<[^/]+>/delete""","""controllers.Application.delete(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/login""","""controllers.Application.login()"""),("""POST""","""/login""","""controllers.Application.authenticate()"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_list1(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("title")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(_root_.controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String])))
   }
}
                    

// @LINE:12
case controllers_Application_create2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Nil))
   }
}
                    

// @LINE:13
case controllers_Application_save3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Nil))
   }
}
                    

// @LINE:16
case controllers_Application_edit4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:17
case controllers_Application_update5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:20
case controllers_Application_delete6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:23
case controllers_Assets_at7(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:26
case controllers_Application_login8(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil))
   }
}
                    

// @LINE:28
case controllers_Application_authenticate9(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil))
   }
}
                    
}
    
}
                