
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>reference database</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/(""""> 
    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(Seq(/*14.27*/routes/*14.33*/.Application.index())),format.raw/*14.53*/("""">
                    Reference List Manager
                </a>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(Seq(/*21.14*/content)),format.raw/*21.21*/("""
        </section>
        
    </body>
</html>
"""))}
    }
    
    def render(content:Html) = apply(content)
    
    def f:((Html) => play.api.templates.Html) = (content) => apply(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 01 15:34:55 GMT 2016
                    SOURCE: C:/workspace/PlayFramework/play-2.0/samples/java/computer-database/app/views/main.scala.html
                    HASH: d88cbdda70bb70be42762f7c4e642627e093e3e7
                    MATRIX: 752->1|839->16|1022->169|1036->175|1101->218|1205->292|1219->298|1275->332|1436->462|1451->468|1493->488|1684->648|1713->655
                    LINES: 27->1|30->1|36->7|36->7|36->7|37->8|37->8|37->8|43->14|43->14|43->14|50->21|50->21
                    -- GENERATED --
                */
            