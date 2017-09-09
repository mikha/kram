package com.dewdrop.kram.model

trait Season {
  def name: String
  def participantsOnly: Boolean
  protected def matchDays: Map[TournamentRound, Seq[Fixture]]
  private lazy val filteredMatchDays: Map[TournamentRound, Seq[Fixture]] = {
    if (participantsOnly) matchDays.mapValues(_.filter(_.hasParticipant)) else matchDays
  }
  protected def calendar: Map[CalendarDay, Seq[TournamentRound]]
  def fixtureList: FixtureList = {
    calendar.mapValues(tournamentRounds ⇒ filteredMatchDays.filterKeys(tournamentRounds.contains)).toSeq.sortBy(_._1.date)
  }
  def teams: Seq[Team] = {
    filteredMatchDays.values.flatten.flatMap(f ⇒ Seq(f.host, f.visitor)).toSeq.distinct.filter(t ⇒ !participantsOnly || t.participant).sortBy(_.name)
  }
}
