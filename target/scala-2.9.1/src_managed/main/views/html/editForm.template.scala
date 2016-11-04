
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
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Reference],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, referenceForm: Form[Reference]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq(format.raw/*1.44*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq(/*7.2*/main/*7.6*/ {_display_(Seq(format.raw/*7.8*/("""
    
    <h1>Edit reference</h1>
    
    """),_display_(Seq(/*11.6*/form(routes.Application.update(id))/*11.41*/ {_display_(Seq(format.raw/*11.43*/("""
        
        <fieldset>
        
            """),_display_(Seq(/*15.14*/inputText(referenceForm("title"), '_label -> "title"))),format.raw/*15.67*/("""
            """),_display_(Seq(/*16.14*/inputText(referenceForm("link"), '_label -> "link"))),format.raw/*16.65*/("""
            """),_display_(Seq(/*17.14*/inputText(referenceForm("note"), '_label -> "note"))),format.raw/*17.65*/("""
        
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save this reference" class="btn primary"> or 
            <a href=""""),_display_(Seq(/*23.23*/routes/*23.29*/.Application.list())),format.raw/*23.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*26.6*/("""
    
    """),_display_(Seq(/*28.6*/form(routes.Application.delete(id), 'class -> "topRight")/*28.63*/ {_display_(Seq(format.raw/*28.65*/("""
        <input type="submit" value="Delete this reference" class="btn danger">
    """)))})),format.raw/*30.6*/("""
    
""")))})),format.raw/*32.2*/("""
"""))}
    }
    
    def render(id:Long,referenceForm:Form[Reference]) = apply(id,referenceForm)
    
    def f:((Long,Form[Reference]) => play.api.templates.Html) = (id,referenceForm) => apply(id,referenceForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 04 00:10:38 GMT 2016
                    SOURCE: C:/workspace/sc1_list_manager/app/views/editForm.scala.html
                    HASH: 6b8ea2297fe5dcd435bf2012e34ae7731c54b318
                    MATRIX: 772->1|900->68|932->92|1011->43|1041->65|1070->146|1105->152|1116->156|1149->158|1227->206|1271->241|1306->243|1392->298|1467->351|1513->366|1586->417|1632->432|1705->483|1919->666|1934->672|1975->691|2064->749|2107->762|2173->819|2208->821|2326->908|2366->917
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|36->7|36->7|36->7|40->11|40->11|40->11|44->15|44->15|45->16|45->16|46->17|46->17|52->23|52->23|52->23|55->26|57->28|57->28|57->28|59->30|61->32
                    -- GENERATED --
                */
            