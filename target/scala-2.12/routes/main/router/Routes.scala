
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Musings/Play/warehouse-crud-2/conf/routes
// @DATE:Thu Jan 11 17:03:14 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  HomeController_0: controllers.HomeController,
  // @LINE:6
  ProductsController_2: controllers.ProductsController,
  // @LINE:23
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    HomeController_0: controllers.HomeController,
    // @LINE:6
    ProductsController_2: controllers.ProductsController,
    // @LINE:23
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, ProductsController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ProductsController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductsController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """ean<[^/]+>""", """controllers.ProductsController.details(ean:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/new""", """controllers.ProductsController.newProduct()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """ean<[^/]+>""", """controllers.ProductsController.delete(ean:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductsController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pb/product/""" + "$" + """ean<[^/]+>""", """controllers.ProductsController.productByPathBinding(ean:models.Product)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """qb/product""", """controllers.ProductsController.productByPathBinding(ean:models.Product)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/json/products""", """controllers.ProductsController.listProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/json/product/""" + "$" + """ean<[^/]+>""", """controllers.ProductsController.retrieveProduct(ean:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/json/product""", """controllers.ProductsController.createProduct()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/json/product""", """controllers.ProductsController.updateProduct()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/json/product/""" + "$" + """ean<[^/]+>""", """controllers.ProductsController.deleteProduct(ean:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_ProductsController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductsController_list1_invoker = createInvoker(
    ProductsController_2.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "list",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductsController_details2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_details2_invoker = createInvoker(
    ProductsController_2.details(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "details",
      Seq(classOf[String]),
      "GET",
      this.prefix + """product/""" + "$" + """ean<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProductsController_newProduct3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/new")))
  )
  private[this] lazy val controllers_ProductsController_newProduct3_invoker = createInvoker(
    ProductsController_2.newProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "newProduct",
      Nil,
      "GET",
      this.prefix + """products/new""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ProductsController_delete4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_delete4_invoker = createInvoker(
    ProductsController_2.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """product/""" + "$" + """ean<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ProductsController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductsController_save5_invoker = createInvoker(
    ProductsController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "save",
      Nil,
      "POST",
      this.prefix + """products""",
      """""",
      Seq("""noCSRF""")
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ProductsController_productByPathBinding6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pb/product/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_productByPathBinding6_invoker = createInvoker(
    ProductsController_2.productByPathBinding(fakeValue[models.Product]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "productByPathBinding",
      Seq(classOf[models.Product]),
      "GET",
      this.prefix + """pb/product/""" + "$" + """ean<[^/]+>""",
      """ Path Binding""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ProductsController_productByPathBinding7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("qb/product")))
  )
  private[this] lazy val controllers_ProductsController_productByPathBinding7_invoker = createInvoker(
    ProductsController_2.productByPathBinding(fakeValue[models.Product]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "productByPathBinding",
      Seq(classOf[models.Product]),
      "GET",
      this.prefix + """qb/product""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ProductsController_listProducts9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/json/products")))
  )
  private[this] lazy val controllers_ProductsController_listProducts9_invoker = createInvoker(
    ProductsController_2.listProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "listProducts",
      Nil,
      "GET",
      this.prefix + """v1/json/products""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ProductsController_retrieveProduct10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/json/product/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_retrieveProduct10_invoker = createInvoker(
    ProductsController_2.retrieveProduct(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "retrieveProduct",
      Seq(classOf[String]),
      "GET",
      this.prefix + """v1/json/product/""" + "$" + """ean<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ProductsController_createProduct11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/json/product")))
  )
  private[this] lazy val controllers_ProductsController_createProduct11_invoker = createInvoker(
    ProductsController_2.createProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "createProduct",
      Nil,
      "POST",
      this.prefix + """v1/json/product""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ProductsController_updateProduct12_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/json/product")))
  )
  private[this] lazy val controllers_ProductsController_updateProduct12_invoker = createInvoker(
    ProductsController_2.updateProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "updateProduct",
      Nil,
      "PUT",
      this.prefix + """v1/json/product""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ProductsController_deleteProduct13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/json/product/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_deleteProduct13_invoker = createInvoker(
    ProductsController_2.deleteProduct(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "deleteProduct",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """v1/json/product/""" + "$" + """ean<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:6
    case controllers_ProductsController_list1_route(params@_) =>
      call { 
        controllers_ProductsController_list1_invoker.call(ProductsController_2.list())
      }
  
    // @LINE:8
    case controllers_ProductsController_details2_route(params@_) =>
      call(params.fromPath[String]("ean", None)) { (ean) =>
        controllers_ProductsController_details2_invoker.call(ProductsController_2.details(ean))
      }
  
    // @LINE:10
    case controllers_ProductsController_newProduct3_route(params@_) =>
      call { 
        controllers_ProductsController_newProduct3_invoker.call(ProductsController_2.newProduct())
      }
  
    // @LINE:12
    case controllers_ProductsController_delete4_route(params@_) =>
      call(params.fromPath[String]("ean", None)) { (ean) =>
        controllers_ProductsController_delete4_invoker.call(ProductsController_2.delete(ean))
      }
  
    // @LINE:15
    case controllers_ProductsController_save5_route(params@_) =>
      call { 
        controllers_ProductsController_save5_invoker.call(ProductsController_2.save())
      }
  
    // @LINE:18
    case controllers_ProductsController_productByPathBinding6_route(params@_) =>
      call(params.fromPath[models.Product]("ean", None)) { (ean) =>
        controllers_ProductsController_productByPathBinding6_invoker.call(ProductsController_2.productByPathBinding(ean))
      }
  
    // @LINE:20
    case controllers_ProductsController_productByPathBinding7_route(params@_) =>
      call(params.fromQuery[models.Product]("ean", None)) { (ean) =>
        controllers_ProductsController_productByPathBinding7_invoker.call(ProductsController_2.productByPathBinding(ean))
      }
  
    // @LINE:23
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:27
    case controllers_ProductsController_listProducts9_route(params@_) =>
      call { 
        controllers_ProductsController_listProducts9_invoker.call(ProductsController_2.listProducts)
      }
  
    // @LINE:29
    case controllers_ProductsController_retrieveProduct10_route(params@_) =>
      call(params.fromPath[String]("ean", None)) { (ean) =>
        controllers_ProductsController_retrieveProduct10_invoker.call(ProductsController_2.retrieveProduct(ean))
      }
  
    // @LINE:31
    case controllers_ProductsController_createProduct11_route(params@_) =>
      call { 
        controllers_ProductsController_createProduct11_invoker.call(ProductsController_2.createProduct())
      }
  
    // @LINE:33
    case controllers_ProductsController_updateProduct12_route(params@_) =>
      call { 
        controllers_ProductsController_updateProduct12_invoker.call(ProductsController_2.updateProduct())
      }
  
    // @LINE:35
    case controllers_ProductsController_deleteProduct13_route(params@_) =>
      call(params.fromPath[String]("ean", None)) { (ean) =>
        controllers_ProductsController_deleteProduct13_invoker.call(ProductsController_2.deleteProduct(ean))
      }
  }
}
