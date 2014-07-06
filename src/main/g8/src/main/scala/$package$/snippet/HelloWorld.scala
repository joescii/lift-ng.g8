package $package$
package snippet

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import net.liftmodules.ng.Angular._
import java.util.Date
import Helpers._

class HelloWorld {
  def services = renderIfNotAlreadyDefined(angular.module("HelloServices").factory("helloService", jsObjFactory()
    .string("pageLoadTime",new Date().toString)
  ))
}

