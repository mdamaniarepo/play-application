
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Musings/Play/warehouse-crud-2/conf/routes
// @DATE:Thu Jan 11 17:03:14 IST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:4
package controllers.javascript {

  // @LINE:6
  class ReverseProductsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def listProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.listProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/json/products"})
        }
      """
    )
  
    // @LINE:29
    def retrieveProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.retrieveProduct",
      """
        function(ean0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/json/product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ean", ean0))})
        }
      """
    )
  
    // @LINE:8
    def details: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.details",
      """
        function(ean0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ean", ean0))})
        }
      """
    )
  
    // @LINE:33
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.updateProduct",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/json/product"})
        }
      """
    )
  
    // @LINE:18
    def productByPathBinding: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.productByPathBinding",
      """
        function(ean0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pb/product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[models.Product]].javascriptUnbind + """)("ean", ean0))})
          }
        
        }
      """
    )
  
    // @LINE:6
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:12
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.delete",
      """
        function(ean0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ean", ean0))})
        }
      """
    )
  
    // @LINE:15
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:35
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.deleteProduct",
      """
        function(ean0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/json/product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ean", ean0))})
        }
      """
    )
  
    // @LINE:10
    def newProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.newProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/new"})
        }
      """
    )
  
    // @LINE:31
    def createProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.createProduct",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/json/product"})
        }
      """
    )
  
  }

  // @LINE:4
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
