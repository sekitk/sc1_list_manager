
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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(loginForm: Form[Application.Login]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.3*/implicitFieldConstructor/*5.27*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq(format.raw/*1.38*/("""
	"""),format.raw/*3.1*/("""

	"""),format.raw/*5.81*/("""
	"""),_display_(Seq(/*6.3*/main/*6.7*/{_display_(Seq(format.raw/*6.8*/("""
		<h1>Sign in</h1>
		"""),_display_(Seq(/*8.4*/if(loginForm.hasGlobalErrors)/*8.33*/{_display_(Seq(format.raw/*8.34*/("""
		<p class="error">
		"""),_display_(Seq(/*10.4*/loginForm/*10.13*/.globalError.message)),format.raw/*10.33*/("""
		</p>
		""")))})),format.raw/*12.4*/("""
			"""),_display_(Seq(/*13.5*/form(routes.Application.authenticate)/*13.42*/ {_display_(Seq(format.raw/*13.44*/("""
				<fieldset>
					"""),_display_(Seq(/*15.7*/inputText(loginForm("email"),'_lable -> "email"))),format.raw/*15.55*/("""
					"""),_display_(Seq(/*16.7*/inputText(loginForm("password"),'_lable -> "password"))),format.raw/*16.61*/("""
					</fieldset>
					<div class="actions">
					<input type="submit" value="Login" class="btn primary"> or
					<a href=""""),_display_(Seq(/*20.16*/routes/*20.22*/.Application.list())),format.raw/*20.41*/("""" class="btn">Cancel</a>
					</div>

			""")))})),format.raw/*23.5*/("""
	""")))})),format.raw/*24.3*/("""								    
"""))}
    }
    
    def render(loginForm:Form[Application.Login]) = apply(loginForm)
    
    def f:((Form[Application.Login]) => play.api.templates.Html) = (loginForm) => apply(loginForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 04 11:46:46 GMT 2016
                    SOURCE: C:/workspace/sc1_list_manager/app/views/login.scala.html
                    HASH: e0580ede8579cff68d8bb3f14af8924983502f3b
                    MATRIX: 772->1|893->60|925->84|1004->37|1032->56|1062->138|1094->141|1105->145|1137->146|1189->169|1226->198|1259->199|1313->223|1331->232|1373->252|1415->263|1450->268|1496->305|1531->307|1583->329|1653->377|1690->384|1766->438|1921->562|1936->568|1977->587|2050->629|2084->632
                    LINES: 27->1|30->5|30->5|31->1|32->3|34->5|35->6|35->6|35->6|37->8|37->8|37->8|39->10|39->10|39->10|41->12|42->13|42->13|42->13|44->15|44->15|45->16|45->16|49->20|49->20|49->20|52->23|53->24
                    -- GENERATED --
                */
            