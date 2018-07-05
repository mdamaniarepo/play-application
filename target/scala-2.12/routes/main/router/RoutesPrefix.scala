
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Musings/Play/warehouse-crud-2/conf/routes
// @DATE:Thu Jan 11 17:03:14 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
