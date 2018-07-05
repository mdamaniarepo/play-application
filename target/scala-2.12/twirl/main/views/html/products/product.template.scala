
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

object product extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Product],play.twirl.api.HtmlFormat.Appendable] {

  /* product Template File */
  def apply/*2.2*/(productForm: Form[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.30*/("""

"""),_display_(/*4.2*/main("Product Form")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""

"""),format.raw/*6.1*/("""<h1>Product Form</h1>

	"""),_display_(/*8.3*/if(productForm.hasGlobalErrors)/*8.34*/ {_display_(Seq[Any](format.raw/*8.36*/("""
		"""),format.raw/*9.3*/("""<p>Please fix the following errors<ul>
		"""),_display_(/*10.4*/for(error <- productForm.globalErrors) yield /*10.42*/ {_display_(Seq[Any](format.raw/*10.44*/("""
            """),format.raw/*11.13*/("""<li>"""),_display_(/*11.18*/error/*11.23*/.format(messages())),format.raw/*11.42*/("""</li>
        """)))}),format.raw/*12.10*/("""
		"""),format.raw/*13.3*/("""<ul></p>
	""")))}),format.raw/*14.3*/("""

	"""),_display_(/*16.3*/helper/*16.9*/.form(action = routes.ProductsController.save(), 'id -> "productForm")/*16.79*/ {_display_(Seq[Any](format.raw/*16.81*/("""
		"""),format.raw/*17.3*/("""<fieldset>
			"""),_display_(/*18.5*/helper/*18.11*/.inputText(productForm("ean"), 'id -> "ean", '_label -> "EAN")),format.raw/*18.73*/("""
			"""),_display_(/*19.5*/helper/*19.11*/.inputText(productForm("name"), 'id -> "name", '_label -> "NAME")),format.raw/*19.76*/("""
			"""),_display_(/*20.5*/helper/*20.11*/.inputText(productForm("description"), 'id -> "description", '_label -> "DESCRIPTION")),format.raw/*20.97*/("""
			"""),format.raw/*21.4*/("""<div class="control-group">
				<div class="controls">
					<input name="tags[0].id" value="1" type="checkbox"
				    """),_display_(/*24.10*/for(i <- 0 to 2) yield /*24.26*/ {_display_(Seq[Any](format.raw/*24.28*/("""
				      """),_display_(/*25.12*/if(productForm("tags[" + i + "].id").value=="1")/*25.60*/{_display_(Seq[Any](format.raw/*25.61*/(""" """),format.raw/*25.62*/("""checked """)))}),format.raw/*25.71*/("""
				    """)))}),format.raw/*26.10*/("""> lightweight
				    <input name="tags[1].id" value="2" type="checkbox"
				    """),_display_(/*28.10*/for(i <- 0 to 2) yield /*28.26*/ {_display_(Seq[Any](format.raw/*28.28*/("""
				      """),_display_(/*29.12*/if(productForm("tags[" + i + "].id").value=="2")/*29.60*/{_display_(Seq[Any](format.raw/*29.61*/(""" """),format.raw/*29.62*/("""checked """)))}),format.raw/*29.71*/("""
				    """)))}),format.raw/*30.10*/("""> metal
				    <input name="tags[2].id" value="3" type="checkbox"
				    """),_display_(/*32.10*/for(i <- 0 to 2) yield /*32.26*/ {_display_(Seq[Any](format.raw/*32.28*/("""
				      """),_display_(/*33.12*/if(productForm("tags[" + i + "].id").value=="3")/*33.60*/{_display_(Seq[Any](format.raw/*33.61*/(""" """),format.raw/*33.62*/("""checked """)))}),format.raw/*33.71*/("""
				    """)))}),format.raw/*34.10*/("""> plastic
				</div>
			</div>
		</fieldset>
      	<input type="submit" class="btn btn-primary" value="Save">
    	<a class="btn" href=""""),_display_(/*39.28*/routes/*39.34*/.ProductsController.list()),format.raw/*39.60*/("""">Cancel</a>
	""")))}),format.raw/*40.3*/("""
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(productForm:Form[Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jan 04 17:52:09 IST 2018
                  SOURCE: D:/Musings/Play/warehouse-crud-2/app/views/products/product.scala.html
                  HASH: 462024869451c4cf4430518f79701d01e9297b0e
                  MATRIX: 989->31|1112->59|1140->62|1168->82|1207->84|1235->86|1285->111|1324->142|1363->144|1392->147|1460->189|1514->227|1554->229|1595->242|1627->247|1641->252|1681->271|1727->286|1757->289|1798->300|1828->304|1842->310|1921->380|1961->382|1991->385|2032->400|2047->406|2130->468|2161->473|2176->479|2262->544|2293->549|2308->555|2415->641|2446->645|2593->765|2625->781|2665->783|2704->795|2761->843|2800->844|2829->845|2869->854|2910->864|3019->946|3051->962|3091->964|3130->976|3187->1024|3226->1025|3255->1026|3295->1035|3336->1045|3439->1121|3471->1137|3511->1139|3550->1151|3607->1199|3646->1200|3675->1201|3715->1210|3756->1220|3921->1358|3936->1364|3983->1390|4028->1405|4060->1407
                  LINES: 28->2|33->2|35->4|35->4|35->4|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|44->13|45->14|47->16|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|61->30|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|65->34|70->39|70->39|70->39|71->40|72->41
                  -- GENERATED --
              */
          