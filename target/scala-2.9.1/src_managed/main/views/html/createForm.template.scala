
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
object createForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Reference],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(referenceForm: Form[Reference]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq(format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq(/*7.2*/main/*7.6*/ {_display_(Seq(format.raw/*7.8*/("""
    
    <h1>Add a reference</h1>
    
    """),_display_(Seq(/*11.6*/form(routes.Application.save())/*11.37*/ {_display_(Seq(format.raw/*11.39*/("""
        
        <fieldset>
        
            """),_display_(Seq(/*15.14*/inputText(referenceForm("title"), '_label -> "title"))),format.raw/*15.67*/("""
            """),_display_(Seq(/*16.14*/inputText(referenceForm("link"), '_label -> "link"))),format.raw/*16.65*/("""
            """),_display_(Seq(/*17.14*/inputText(referenceForm("note"), '_label -> "note"))),format.raw/*17.65*/("""

            

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Create this reference" class="btn primary"> or 
            <a href=""""),_display_(Seq(/*25.23*/routes/*25.29*/.Application.list())),format.raw/*25.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*28.6*/("""
    
""")))})),format.raw/*30.2*/("""
"""))}
    }
    
    def render(referenceForm:Form[Reference]) = apply(referenceForm)
    
    def f:((Form[Reference]) => play.api.templates.Html) = (referenceForm) => apply(referenceForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 01 17:06:23 GMT 2016
                    SOURCE: C:/workspace/PlayFramework/play-2.0/samples/java/computer-database/app/views/createForm.scala.html
                    HASH: 20dd5201569e5cf87c492ba1ec3adfe3025e50a6
                    MATRIX: 769->1|887->58|919->82|998->33|1028->55|1057->136|1092->142|1103->146|1136->148|1215->197|1255->228|1290->230|1376->285|1451->338|1497->353|1570->404|1616->419|1689->470|1913->663|1928->669|1969->688|2058->746|2098->755
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|36->7|36->7|36->7|40->11|40->11|40->11|44->15|44->15|45->16|45->16|46->17|46->17|54->25|54->25|54->25|57->28|59->30
                    -- GENERATED --
                */
            