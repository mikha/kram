package com.dewdrop.kram.view

import com.dewdrop.kram.model._
import org.scalajs.dom.html.Div

import scalatags.JsDom
import scalatags.JsDom.all._

case class CondensedFixtureListView(fixtureList: Seq[(CalendarDay, Map[TournamentRound, Seq[Fixture]])], teamId: Int) extends View {
  private def renderTeam(team: Team, host: Boolean): JsDom.TypedTag[Div] = div(`class` := "col-xs-3" + (if (host) " text-right" else ""),
    if (team.id == teamId) b(TeamView(team).view()) else TeamView(team).view())
  private val fixturesElements = fixtureList.flatMap {
    case (day, rounds) ⇒ rounds.flatMap {
      case (round, fixtures) ⇒ fixtures.filter(f ⇒ f.host.id == teamId || f.visitor.id == teamId).map { fixture ⇒
        div(`class` := "list-group-item",
          div(`class` := "row",
            div(`class` := "col-xs-2", span(day.date.toString)),
            renderTeam(fixture.host, host = true),
            div(`class` := "col-xs-1 text-center", span(`class` := "badge", fixture.minutes)),
            renderTeam(fixture.visitor, host = false),
            div(`class` := "col-xs-3",
              a(href := s"http://pbliga.com/mng_results.php?day=${day.id}&tournament=${round.tournament.id}", round.toString))
          ))
      }
    }
  }
  override def view(): JsDom.TypedTag[Div] = div(`class` := "list-group", paddingTop := "20px", fixturesElements)
}
