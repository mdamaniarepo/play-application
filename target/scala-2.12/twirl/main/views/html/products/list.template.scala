
package views.html.products

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/(""" 
"""),_display_(/*2.2*/main("Products catalogue")/*2.28*/ {_display_(Seq[Any](format.raw/*2.30*/("""
"""),format.raw/*3.1*/("""<h2>All products</h2>

"""),format.raw/*5.17*/("""
"""),_display_(/*6.2*/if(products.isEmpty)/*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
"""),format.raw/*7.1*/("""<h2>Count of products: 0 </h2>
""")))}/*8.3*/else/*8.8*/{_display_(Seq[Any](format.raw/*8.9*/("""
"""),format.raw/*9.1*/("""<h2>Count of products - """),_display_(/*9.26*/products/*9.34*/.size()),format.raw/*9.41*/("""</h2>""")))}),format.raw/*9.48*/("""

"""),format.raw/*11.1*/("""<table class="table table-striped">
	<thead>
		<tr>
			<th>EAN</th>
			<th>Name</th>
			<th>Description</th>
		</tr>
	</thead>
	<tbody>
		"""),_display_(/*20.4*/for(product <- products) yield /*20.28*/ {_display_(Seq[Any](format.raw/*20.30*/("""
		"""),format.raw/*21.3*/("""<tr>
			<td><a href=" """),_display_(/*22.19*/routes/*22.25*/.ProductsController.details(product.ean)),format.raw/*22.65*/("""">"""),_display_(/*22.68*/product/*22.75*/.ean),format.raw/*22.79*/(""" """),format.raw/*22.80*/("""</a></td>
			<td><a href=" """),_display_(/*23.19*/routes/*23.25*/.ProductsController.details(product.ean)),format.raw/*23.65*/("""">"""),_display_(/*23.68*/product/*23.75*/.name),format.raw/*23.80*/("""</a></td>
			<td><a href=" """),_display_(/*24.19*/routes/*24.25*/.ProductsController.details(product.ean)),format.raw/*24.65*/("""">"""),_display_(/*24.68*/product/*24.75*/.description),format.raw/*24.87*/("""</a></td>
		</tr>
		""")))}),format.raw/*26.4*/("""
		"""),format.raw/*27.3*/("""<a class="btn" href=""""),_display_(/*27.25*/routes/*27.31*/.ProductsController.newProduct()),format.raw/*27.63*/("""">Add new product</a>
	</tbody>
	
</table>
""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jan 03 23:39:43 IST 2018
                  SOURCE: D:/Musings/Play/warehouse-crud-2/app/views/products/list.scala.html
                  HASH: 5a061b1cf9a76ae3c22415485ff67ac4bd69babe
                  MATRIX: 970->1|1097->33|1126->37|1160->63|1199->65|1227->67|1279->108|1307->111|1335->131|1374->133|1402->135|1452->169|1463->174|1500->175|1528->177|1579->202|1595->210|1622->217|1659->224|1690->228|1864->376|1904->400|1944->402|1975->406|2026->430|2041->436|2102->476|2132->479|2148->486|2173->490|2202->491|2258->520|2273->526|2334->566|2364->569|2380->576|2406->581|2462->610|2477->616|2538->656|2568->659|2584->666|2617->678|2670->701|2701->705|2750->727|2765->733|2818->765|2896->813
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|38->6|38->6|38->6|39->7|40->8|40->8|40->8|41->9|41->9|41->9|41->9|41->9|43->11|52->20|52->20|52->20|53->21|54->22|54->22|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|55->23|55->23|55->23|56->24|56->24|56->24|56->24|56->24|56->24|58->26|59->27|59->27|59->27|59->27|63->31
                  -- GENERATED --
              */
          