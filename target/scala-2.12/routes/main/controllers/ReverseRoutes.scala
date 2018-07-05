
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Musings/Play/warehouse-crud-2/conf/routes
// @DATE:Thu Jan 11 17:03:14 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:4
package controllers {

  // @LINE:6
  class ReverseProductsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def listProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "v1/json/products")
    }
  
    // @LINE:29
    def retrieveProduct(ean:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "v1/json/product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ean", ean)))
    }
  
    // @LINE:8
    def details(ean:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ean", ean)))
    }
  
    // @LINE:33
    def updateProduct(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "v1/json/product")
    }
  
    // @LINE:18
    def productByPathBinding(ean:models.Product): Call = {
    
      (ean: @unchecked) match {
      
        // @LINE:18
        case (ean)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "pb/product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[models.Product]].unbind("ean", ean)))
      
      }
    
    }
  
    // @LINE:6
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:12
    def delete(ean:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ean", ean)))
    }
  
    // @LINE:15
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:35
    def deleteProduct(ean:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "v1/json/product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ean", ean)))
    }
  
    // @LINE:10
    def newProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/new")
    }
  
    // @LINE:31
    def createProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "v1/json/product")
    }
  
  }

  // @LINE:4
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
