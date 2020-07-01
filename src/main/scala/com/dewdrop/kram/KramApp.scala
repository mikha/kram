package com.dewdrop.kram

import com.dewdrop.kram.model.Data
import com.dewdrop.kram.view.SeasonView
import org.scalajs.dom

object KramApp {

  def main(args: Array[String]): Unit = {
    val season = SeasonView(Data.SeasonData)
    dom.document.body.appendChild(season.view().render)
  }
}
