
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Page[Reference],String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: Page[Reference], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.Html = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq(format.raw/*32.38*/("""
    <th class=""""),_display_(Seq(/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq(/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq(/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq(/*34.34*/title)),format.raw/*34.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.Application.list(newPage, sortBy, order, currentFilter)
    
}};
Seq(format.raw/*1.100*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq(/*38.2*/main/*38.6*/ {_display_(Seq(format.raw/*38.8*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq(/*40.25*/Messages("reference.list.title", currentPage.getTotalRowCount))),format.raw/*40.87*/("""</h1>

    """),_display_(Seq(/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq(format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq(/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq(/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq(/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by title...">
            <input type="submit" id="searchsubmit" value="Filter by title" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq(/*55.48*/routes/*55.54*/.Application.create())),format.raw/*55.75*/("""">Add new reference</a>
        
    </div>
    
    """),_display_(Seq(/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq(format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq(format.raw/*65.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq(/*70.22*/header("title", "title"))),format.raw/*70.46*/("""
                    """),_display_(Seq(/*71.22*/header("link", "link"))),format.raw/*71.44*/("""
                    """),_display_(Seq(/*72.22*/header("note", "note"))),format.raw/*72.44*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq(/*77.18*/for(reference <- currentPage.getList) yield /*77.55*/ {_display_(Seq(format.raw/*77.57*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq(/*79.39*/routes/*79.45*/.Application.edit(reference.id))),format.raw/*79.76*/("""">"""),_display_(Seq(/*79.79*/reference/*79.88*/.title)),format.raw/*79.94*/("""</a></td>
                        <td>
                            """),_display_(Seq(/*81.30*/if(reference.link == null)/*81.56*/ {_display_(Seq(format.raw/*81.58*/("""
                                <em>-</em>
                            """)))}/*83.31*/else/*83.36*/{_display_(Seq(format.raw/*83.37*/("""
                                """),_display_(Seq(/*84.34*/reference/*84.43*/.link)),format.raw/*84.48*/("""
                            """)))})),format.raw/*85.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*88.30*/if(reference.note == null)/*88.56*/ {_display_(Seq(format.raw/*88.58*/("""
                                <em>-</em>
                            """)))}/*90.31*/else/*90.36*/{_display_(Seq(format.raw/*90.37*/("""
                                """),_display_(Seq(/*91.34*/reference/*91.43*/.note)),format.raw/*91.48*/("""
                            """)))})),format.raw/*92.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*95.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq(/*102.18*/if(currentPage.hasPrev)/*102.41*/ {_display_(Seq(format.raw/*102.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq(/*104.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*104.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*106.19*/else/*106.24*/{_display_(Seq(format.raw/*106.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*110.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq(/*112.36*/currentPage/*112.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*112.80*/("""</a>
                </li>
                """),_display_(Seq(/*114.18*/if(currentPage.hasNext)/*114.41*/ {_display_(Seq(format.raw/*114.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq(/*116.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*116.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*118.19*/else/*118.24*/{_display_(Seq(format.raw/*118.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*122.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*126.6*/("""
        
""")))})),format.raw/*128.2*/("""

            
"""))}
    }
    
    def render(currentPage:Page[Reference],currentSortBy:String,currentOrder:String,currentFilter:String) = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((Page[Reference],String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 01 17:08:07 GMT 2016
                    SOURCE: C:/workspace/PlayFramework/play-2.0/samples/java/computer-database/app/views/list.scala.html
                    HASH: 10cc7e91aac54573aac49c9d245a453ddc7d2a2e
                    MATRIX: 784->1|943->876|957->882|1046->912|1095->930|1107->933|1146->950|1186->959|1220->985|1308->1049|1361->1071|1395->1083|1429->1086|1456->1091|1496->233|1507->237|2055->99|2086->230|2115->759|2147->873|2176->1109|2211->1114|2223->1118|2257->1120|2320->1152|2404->1214|2448->1228|2489->1260|2524->1262|2638->1345|2652->1350|2689->1365|2743->1388|2836->1450|2873->1465|2986->1547|3021->1560|3260->1768|3275->1774|3318->1795|3406->1853|3452->1890|3487->1892|3617->2005|3630->2010|3664->2011|3820->2136|3866->2160|3920->2183|3964->2205|4018->2228|4062->2250|4180->2337|4233->2374|4268->2376|4365->2442|4380->2448|4433->2479|4467->2482|4485->2491|4513->2497|4614->2567|4649->2593|4684->2595|4778->2671|4791->2676|4825->2677|4891->2712|4909->2721|4936->2726|4999->2757|5122->2849|5157->2875|5192->2877|5286->2953|5299->2958|5333->2959|5399->2994|5417->3003|5444->3008|5507->3039|5616->3116|5779->3247|5812->3270|5848->3272|5955->3347|6018->3387|6105->3455|6119->3460|6154->3461|6329->3603|6436->3678|6457->3689|6513->3722|6591->3768|6624->3791|6660->3793|6767->3868|6830->3908|6913->3972|6927->3977|6962->3978|7133->4116|7217->4168|7262->4181
                    LINES: 27->1|29->32|29->32|31->32|32->33|32->33|32->33|32->33|32->33|32->33|33->34|33->34|33->34|33->34|35->6|35->6|57->1|59->5|60->27|62->31|63->36|65->38|65->38|65->38|67->40|67->40|69->42|69->42|69->42|71->44|71->44|71->44|73->46|77->50|77->50|78->51|78->51|82->55|82->55|82->55|86->59|86->59|86->59|92->65|92->65|92->65|97->70|97->70|98->71|98->71|99->72|99->72|104->77|104->77|104->77|106->79|106->79|106->79|106->79|106->79|106->79|108->81|108->81|108->81|110->83|110->83|110->83|111->84|111->84|111->84|112->85|115->88|115->88|115->88|117->90|117->90|117->90|118->91|118->91|118->91|119->92|122->95|129->102|129->102|129->102|131->104|131->104|133->106|133->106|133->106|137->110|139->112|139->112|139->112|141->114|141->114|141->114|143->116|143->116|145->118|145->118|145->118|149->122|153->126|155->128
                    -- GENERATED --
                */
            