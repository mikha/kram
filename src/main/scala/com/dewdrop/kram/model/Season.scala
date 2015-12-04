package com.dewdrop.kram.model

trait Season {
  def name: String
  def matchDays: Map[TournamentRound, Seq[Fixture]]
  def calendar: Map[CalendarDay, Seq[TournamentRound]]
  def fixtureList: Seq[(CalendarDay, Map[TournamentRound, Seq[Fixture]])] = {
    val mdMap = matchDays
    calendar.map {
      case (calendarDay, tournamentRounds) ⇒ calendarDay → mdMap.filterKeys(tournamentRounds.contains)
    }.toSeq.sortBy(_._1.date)
  }
}
