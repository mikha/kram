package com.dewdrop.kram.model

case class Team(id: Int, name: String)

case class TeamWithMinutes(team: Team, minutes: Int) {
  def id: Int = team.id
  def name: String = team.name
}