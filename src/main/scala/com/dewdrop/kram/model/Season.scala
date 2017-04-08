package com.dewdrop.kram.model

trait Season {
  def name: String
  protected def matchDays: Map[TournamentRound, Seq[Fixture]]
  private lazy val filteredMatchDays: Map[TournamentRound, Seq[Fixture]] = {
    matchDays.mapValues(_.filter(_.hasParticipant))
  }
  protected def calendar: Map[CalendarDay, Seq[TournamentRound]]
  def fixtureList: FixtureList = {
    calendar.mapValues(tournamentRounds ⇒ filteredMatchDays.filterKeys(tournamentRounds.contains)).toSeq.sortBy(_._1.date)
  }
  def teams: Seq[Team] = {
    filteredMatchDays.values.flatten.flatMap(f ⇒ Seq(f.host, f.visitor)).toSeq.distinct.filter(_.minutes > 0).sortBy(_.name)
  }
}
