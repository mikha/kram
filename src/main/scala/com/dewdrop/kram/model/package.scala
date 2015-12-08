package com.dewdrop.kram

package object model {
  type FixtureList = Seq[(CalendarDay, Map[TournamentRound, Seq[Fixture]])]
}
