package com.dewdrop.kram.model

case class Fixture(host: Team, visitor: Team) {
  def minutesInRound(round: Int): Int = Math.min(host.minutesInRound(round), visitor.minutesInRound(round))
  lazy val hasParticipant: Boolean = host.participant || visitor.participant
}

object ReverseFixture {
  def apply(visitor: Team, host: Team): Fixture = Fixture(host, visitor)
}