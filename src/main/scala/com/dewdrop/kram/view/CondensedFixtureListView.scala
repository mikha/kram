package com.dewdrop.kram.view

import com.dewdrop.kram.model._

import scalatags.JsDom.all._

case class CondensedFixtureListView(fixtureList: Seq[(CalendarDay, Map[TournamentRound, Seq[Fixture]])], teamId: Int) extends View {
  private def renderTeam(team: Team) = div(`class` := "col-md-2 col-xs-3",
    if (team.id == teamId) b(TeamView(team).view()).render else TeamView(team).view())
  private val fixturesElements = fixtureList.flatMap {
    case (day, rounds) ⇒ rounds.flatMap {
      case (round, fixtures) ⇒ fixtures.filter(f ⇒ f.host.id == teamId || f.visitor.id == teamId).map { fixture ⇒
        div(`class` := "list-group-item",
          div(`class` := "row",
            div(`class` := "col-md-1 col-xs-1", span(`class` := "badge", fixture.minutes)),
            renderTeam(fixture.host.team), renderTeam(fixture.visitor.team),
            div(`class` := "col-md-1 col-xs-2", span(day.date.toString)),
            div(`class` := "col-md-2 col-xs-3",
              a(href := s"http://pbliga.com/mng_results.php?day=${day.id}&tournament=${round.tournament.id}", round.toString))
          )).render
      }
    }
  }
  override def view() = div(`class` := "list-group", paddingTop := "20px", fixturesElements).render
}
