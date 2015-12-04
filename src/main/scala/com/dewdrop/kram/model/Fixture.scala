package com.dewdrop.kram.model

case class Fixture(host: TeamWithMinutes, visitor: TeamWithMinutes) {
  val minutes = Math.min(host.minutes, visitor.minutes)
}

object ReverseFixture {
  def apply(visitor: TeamWithMinutes, host: TeamWithMinutes): Fixture = Fixture(host, visitor)
}