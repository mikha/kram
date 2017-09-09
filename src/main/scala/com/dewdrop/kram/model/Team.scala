package com.dewdrop.kram.model

case class Team(id: Int, name: String, minutes: Int) {
  val participant: Boolean = minutes > 0
}