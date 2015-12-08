package com.dewdrop.kram.view

import com.dewdrop.kram.model._
import org.scalajs.dom

import scala.scalajs.js.Date
import scalatags.JsDom.all._

case class SeasonView(season: Season, teams: Seq[Team]) extends View {
  final val VERSION = "0.2.2"
  private val allFixtures = season.fixtureList.filter(_._2.exists(_._2.nonEmpty))
  private val fixtureListWithPastView = FixtureListWithPastView(allFixtures, LocalDate(new Date(Date.now())))_
  private val teamSelector = TeamSelector(teams).view().render
  private val fixtureListContainer = div(fixtureListWithPastView(FixtureListView).view()).render
  override def view() = {
    teamSelector.onchange = (e: dom.Event) ⇒ {
      val teamId = teamSelector.value.toInt
      fixtureListContainer.removeChild(fixtureListContainer.firstChild)
      val newView = if (teamId > 0) fixtureListWithPastView(fixtures ⇒ CondensedFixtureListView(fixtures, teamId))
      else fixtureListWithPastView(FixtureListView)
      fixtureListContainer.appendChild(newView.view().render)
    }
    div(`class` := "container-fluid",
      h1(season.name, small(`class` := "pull-right", VERSION)),
      teamSelector, fixtureListContainer
    )
  }
}

case class TeamSelector(teams: Seq[Team]) extends View {
  override def view() = select(`class` := "form-control input-lg",
    option(value := 0, "-- все команды --"),
    for(team ← teams) yield option(value := team.id, team.name)
  )
}

case class FixtureListView(fixtureList: FixtureList) extends View {
  private val children = fixtureList.map(CalendarDayView.tupled)
  private val elem = div(paddingTop := "20px",
    for(child ← children) yield child.view()
  )
  override def view() = elem
}

case class CalendarDayView(day: CalendarDay, rounds: Map[TournamentRound, Seq[Fixture]]) extends View {
  private val children = rounds.toSeq.sortBy(_._1.tournament.id).map {
    case (round, fixtures) ⇒ TournamentRoundView(day, round, fixtures)
  }
  private val elem = div(`class` := "panel panel-default",
    div(`class` := "panel-heading", day.date.toString),
    div(`class` := "panel-body", for(child ← children) yield child.view())
  )
  override def view() = elem
}

case class TournamentRoundView(day: CalendarDay, round: TournamentRound, fixtures: Seq[Fixture]) extends View {
  private val children = fixtures.map(FixtureView)
  private val elem = div(`class` := "list-group",
    div(`class` := "list-group-item list-group-item-info",
      a(href := s"http://pbliga.com/mng_results.php?day=${day.id}&tournament=${round.tournament.id}", round.toString)),
    for(child ← children) yield child.view()
  )
  override def view() = elem
}

case class FixtureView(fixture: Fixture) extends View {
  private val host = div(`class` := "col-md-2 col-xs-3", TeamView(fixture.host.team).view())
  private val visitor = div(`class` := "col-md-2 col-xs-3", TeamView(fixture.visitor.team).view())
  private val elem = div(`class` := "list-group-item",
    div(`class` := "row",
      div(`class` := "col-md-1 col-xs-1", span(`class` := "badge", fixture.minutes)),
      host, visitor))
  override def view() = elem
}

case class TeamView(team: Team) extends View {
  override def view() = a(href := s"http://pbliga.com/mng_roster.php?id=${team.id}", team.name)
}
