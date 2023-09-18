package com.dewdrop.kram.model

import scala.language.implicitConversions

case class Team(id: Int, name: String, roundMinutes: RoundMinutes*) {
  private lazy val roundMinutesDesc = roundMinutes.sortBy(_.fromRound).reverse
  def minutesInRound(round: Int): Int = roundMinutesDesc.find(_.fromRound <= round).map(_.minutes).getOrElse(0)

  lazy val participant: Boolean = roundMinutes.exists(_.minutes > 0)
}

case class RoundMinutes(fromRound: Int, minutes: Int)

object Team {
  def apply(id: Int, name: String, minutes: Int): Team =
    Team(id, name, 1 -> minutes)
}

object RoundMinutes {
  implicit def tupleToRoundMinutes(roundMinutes: (Int, Int)): RoundMinutes =
    RoundMinutes(fromRound = roundMinutes._1, minutes = roundMinutes._2)
}