package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom

import net.liftweb.json.JsonDSL._
import net.liftweb.json.JsonAST._
import net.liftweb.json.pretty

object TutorialApp extends JSApp {
  def main(): Unit = {
    val j = ("a" -> 2) ~ ("b" -> "Hello.")
    dom.console.log(pretty(render(j)))
  }
}