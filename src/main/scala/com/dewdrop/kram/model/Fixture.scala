package com.dewdrop.kram.model

case class Fixture(host: Team, visitor: Team) {
  lazy val minutes: Int = Math.min(host.minutes, visitor.minutes)
  lazy val hasParticipant: Boolean = host.participant || visitor.participant
}

object ReverseFixture {
  def apply(visitor: Team, host: Team): Fixture = Fixture(host, visitor)
}