package com.dewdrop.kram

import com.dewdrop.kram.model.Data
import com.dewdrop.kram.view.SeasonView
import org.scalajs.dom

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

object KramApp {
  @JSExport
  def main(args: Array[String]): Unit = {
    val season = SeasonView(Data.Season29)
    dom.document.body.appendChild(season.view().render)
  }

  @JSExportTopLevel("com.dewdrop.kram.KramApp")
  def jsAccessor(): KramApp.type = this
}
