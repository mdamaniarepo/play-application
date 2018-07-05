
package views.html

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
    </head>
    <body>
        """),format.raw/*19.32*/("""
        """),_display_(/*20.10*/if(flash.containsKey("success"))/*20.42*/{_display_(Seq[Any](format.raw/*20.43*/("""
		  """),format.raw/*21.5*/("""<div class="alert alert-success">
		    """),_display_(/*22.8*/flash/*22.13*/.get("success")),format.raw/*22.28*/("""
		  """),format.raw/*23.5*/("""</div>
		""")))}),format.raw/*24.4*/("""

		"""),_display_(/*26.4*/if(flash.containsKey("error"))/*26.34*/{_display_(Seq[Any](format.raw/*26.35*/("""
		  """),format.raw/*27.5*/("""<div class="alert alert-error">
		    """),_display_(/*28.8*/flash/*28.13*/.get("error")),format.raw/*28.26*/("""
		  """),format.raw/*29.5*/("""</div>
		""")))}),format.raw/*30.4*/("""
		
        """),_display_(/*32.10*/content),format.raw/*32.17*/("""

        """),format.raw/*34.9*/("""<script src=""""),_display_(/*34.23*/routes/*34.29*/.Assets.versioned("javascripts/main.js")),format.raw/*34.69*/("""" type="text/javascript"></script>
        <script type='text/javascript'>
		   function del(urlToDelete) """),format.raw/*36.32*/("""{"""),format.raw/*36.33*/("""
			   """),format.raw/*37.7*/("""alert("DELETE");
		      $.ajax("""),format.raw/*38.16*/("""{"""),format.raw/*38.17*/("""
		        """),format.raw/*39.11*/("""url: urlToDelete,
		        type: 'DELETE',
		        success: function(results) """),format.raw/*41.38*/("""{"""),format.raw/*41.39*/("""
		          """),format.raw/*42.13*/("""// Refresh the page
		          location.reload();
		        """),format.raw/*44.11*/("""}"""),format.raw/*44.12*/("""
		      """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/(""");
		   """),format.raw/*46.6*/("""}"""),format.raw/*46.7*/("""
		"""),format.raw/*47.3*/("""</script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jan 03 23:39:43 IST 2018
                  SOURCE: D:/Musings/Play/warehouse-crud-2/app/views/main.scala.html
                  HASH: 819f005335a2955b5ad0a1819ffaaa8cebe588ad
                  MATRIX: 1211->266|1336->296|1366->300|1449->408|1486->418|1521->426|1547->431|1637->494|1652->500|1715->541|1804->603|1819->609|1880->648|1945->776|1983->787|2024->819|2063->820|2096->826|2164->868|2178->873|2214->888|2247->894|2288->905|2321->912|2360->942|2399->943|2432->949|2498->989|2512->994|2546->1007|2579->1013|2620->1024|2662->1039|2690->1046|2729->1058|2770->1072|2785->1078|2846->1118|2982->1226|3011->1227|3046->1235|3107->1268|3136->1269|3176->1281|3287->1364|3316->1365|3358->1379|3449->1442|3478->1443|3515->1453|3544->1454|3580->1463|3608->1464|3639->1468
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|49->19|50->20|50->20|50->20|51->21|52->22|52->22|52->22|53->23|54->24|56->26|56->26|56->26|57->27|58->28|58->28|58->28|59->29|60->30|62->32|62->32|64->34|64->34|64->34|64->34|66->36|66->36|67->37|68->38|68->38|69->39|71->41|71->41|72->42|74->44|74->44|75->45|75->45|76->46|76->46|77->47
                  -- GENERATED --
              */
          