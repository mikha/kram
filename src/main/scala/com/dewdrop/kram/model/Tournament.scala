package com.dewdrop.kram.model

case class Tournament(id: Int, name: String)
case class TournamentRound(tournament: Tournament, round: String) {
  override def toString: String = s"${tournament.name} - $round"
}
