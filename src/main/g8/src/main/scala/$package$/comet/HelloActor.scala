package $package$
package comet

import net.liftmodules.ng._
import net.liftweb.util.Schedule
import java.util.Date

class HelloActor extends AngularActor { self =>
  var activated = false

  def schedule:Unit = Schedule(() => {self ! "tick"; schedule}, 1000)
  schedule

  override def lowPriority = {
    case "toggle" => activated = !activated
    case "tick" => if(activated) scope.assign("ticker", new Date().toString)
  }

}