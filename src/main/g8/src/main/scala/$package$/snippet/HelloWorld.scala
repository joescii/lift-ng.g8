package $package$
package snippet

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http.S
import net.liftmodules.ng.Angular._
import java.util.Date
import Helpers._

class HelloWorld {
  def services = renderIfNotAlreadyDefined(angular.module("HelloServices").factory("helloService", jsObjFactory()
    .string("pageLoadTime",new Date().toString)
    .jsonCall("currentServerTime", Full(new Date().toString) )
    .jsonCall("toggleTicker", {
      S.session.map { _.sendCometActorMessage("HelloActor", Empty, "toggle") }
      Empty
    })
  ))
}

