package com.dewdrop.kram.view

import com.dewdrop.kram.model._

import scalatags.JsDom.all._

case class FixtureListWithPastView(fixtureList: FixtureList, date: LocalDate)(fixtureListView: FixtureList ⇒ View) extends View {
  private val (pastFixtures, futureFixtures) = fixtureList.partition(_._1.date.compareTo(date) < 0)
  override def view() = div(
    pastFixturesLinkIfPresent,
    fixtureListView(futureFixtures).view(),
    pastFixturesIfPresent
  )
  private def pastFixturesIfPresent = if (pastFixtures.nonEmpty) Seq(
    div(a(name := "pastFixtures", ""), h4(`class` := "pull-left", "Прошлые игры"), br),
    fixtureListView(pastFixtures).view()
  ) else Seq.empty
  private def pastFixturesLinkIfPresent = if (pastFixtures.nonEmpty)
    Some(div(h4(`class` := "pull-right", a(href := "#pastFixtures", "Прошлые игры")), br))
  else None
}
