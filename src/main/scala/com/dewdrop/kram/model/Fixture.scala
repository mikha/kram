package com.dewdrop.kram.model

case class Fixture(host: Team, visitor: Team) {
  lazy val minutes: Int = Math.min(host.minutes, visitor.minutes)
  lazy val hasParticipant: Boolean = host.minutes > 0 || visitor.minutes > 0
}

object ReverseFixture {
  def apply(visitor: Team, host: Team): Fixture = Fixture(host, visitor)
}