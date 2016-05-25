package com.dewdrop.kram

import com.dewdrop.kram.model.Data
import com.dewdrop.kram.view.SeasonView
import org.scalajs.dom
import scalatags.JsDom.all._
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

@JSExport
object KramApp extends JSApp {
  @JSExport
  override def main(): Unit = {
    val season = SeasonView(Data.Season26, Data.Teams.AllEnglish)
    dom.document.body.appendChild(season.view().render)
  }
}
