package com.dewdrop.kram.model

trait Season {
  def name: String
  def participantsOnly: Boolean
  def version: String
  protected def matchDays: Map[TournamentRound, Seq[Fixture]]
  private lazy val filteredMatchDays: Map[TournamentRound, Seq[Fixture]] =
    if (participantsOnly)
      matchDays.view
        .mapValues(_.filter(_.hasParticipant))
        .toMap
    else
      matchDays
  protected def calendar: Map[CalendarDay, Seq[TournamentRound]]
  def fixtureList: FixtureList =
    calendar.view
      .mapValues { tournamentRounds =>
        filteredMatchDays.view
          .filterKeys(tournamentRounds.contains)
          .toMap
      }
      .toSeq
      .sortBy(_._1.date)
  def teams: Seq[Team] = {
    filteredMatchDays.values.flatten
      .flatMap(f => Seq(f.host, f.visitor))
      .toSeq
      .distinct
      .filter(t => !participantsOnly || t.participant)
      .sortBy(_.name)
  }
}
