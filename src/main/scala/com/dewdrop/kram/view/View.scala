package com.dewdrop.kram.view

import org.scalajs.dom.html.Element

import scalatags.JsDom

trait View {
  def view(): JsDom.all.ConcreteHtmlTag[Element]
}
