package com.dewdrop.kram.view

import com.dewdrop.kram.model._
import com.dewdrop.kram.view.ElementOps._
import org.scalajs.dom
import org.scalajs.dom.html
import org.scalajs.dom.html.Element

import scalatags.JsDom.all._

case class SeasonView(season: Season, teams: Seq[Team]) extends View {
  final val VERSION = "0.0.1"
  override def view(): html.Element = {
    val teamSelector = TeamSelector(teams).view()
    val fixtureList = FixtureListView(season.fixtureList.filter(_._2.exists(_._2.nonEmpty)))
    teamSelector.onchange = (e: dom.Event) ⇒ fixtureList.filterByTeam(teamSelector.value.toInt)
    div(`class` := "container-fluid",
      h1(season.name, small(`class` := "pull-right", VERSION)),
      teamSelector, fixtureList.view()
    ).render
  }
}

case class TeamSelector(teams: Seq[Team]) extends View {
  override def view() = select(`class` := "form-control input-lg",
    option(value := 0, "-- все команды --"),
    for(team ← teams) yield option(value := team.id, team.name)
  ).render
}

case class FixtureListView(fixtureList: Seq[(CalendarDay, Map[TournamentRound, Seq[Fixture]])]) extends View {
  private val children = fixtureList.map(CalendarDayView.tupled)
  private val elem = div(paddingTop := "20px",
    for(child ← children) yield child.view()
  ).render
  override def view(): Element = elem
  def filterByTeam(teamId: Int): Unit = {
    children.foreach(_.filterByTeam(teamId))
  }
}

case class CalendarDayView(day: CalendarDay, rounds: Map[TournamentRound, Seq[Fixture]]) extends MaybeVisibleView {
  private val children = rounds.toSeq.sortBy(_._1.tournament.id).map {
    case (round, fixtures) ⇒ TournamentRoundView(day, round, fixtures)
  }
  private[view] override val elem = div(`class` := "panel panel-default",
    div(`class` := "panel-heading", day.date.toString),
    div(`class` := "panel-body", for(child ← children) yield child.view())
  ).render
  def filterByTeam(teamId: Int): Unit = {
    children.foreach(_.filterByTeam(teamId))
    val visibility = children.exists(_.isVisible)
    changeVisibility(visibility)
  }
}

case class TournamentRoundView(day: CalendarDay, round: TournamentRound, fixtures: Seq[Fixture]) extends MaybeVisibleView {
  private val children = fixtures.map(FixtureView)
  private[view] override val elem = div(`class` := "list-group",
    div(`class` := "list-group-item list-group-item-info",
      a(href := s"http://pbliga.com/mng_results.php?day=${day.id}&tournament=${round.tournament.id}", round.toString)),
    for(child ← children) yield child.view()
  ).render
  def filterByTeam(teamId: Int): Unit = {
    children.foreach(_.filterByTeam(teamId))
    val visibility = children.exists(_.isVisible)
    changeVisibility(visibility)
  }
}

case class FixtureView(fixture: Fixture) extends MaybeVisibleView {
  private val host = div(`class` := "col-md-2", fixture.host.name).render
  private val visitor = div(`class` := "col-md-2", fixture.visitor.name).render
  private[view] override val elem = div(`class` := "list-group-item",
    div(`class` := "row",
      div(`class` := "col-md-1", span(`class` := "badge", fixture.minutes)),
      host, visitor
    )).render
  def filterByTeam(teamId: Int): Unit = {
    val visibility = teamId <= 0 || fixture.host.id == teamId || fixture.visitor.id == teamId
    changeVisibility(visibility)
    host.makeBold(teamId == fixture.host.id)
    visitor.makeBold(teamId == fixture.visitor.id)
  }
}

trait MaybeVisibleView extends View {
  private[view] val elem: Element
  override def view(): html.Element = elem
  def isVisible: Boolean = !elem.isHidden
  def changeVisibility(visibility: Boolean): Unit = (visibility, isVisible) match {
    case (true, false) ⇒ elem.show()
    case (false, true) ⇒ elem.hide()
    case _ ⇒
  }
}