package com.dewdrop.kram.model

import scala.scalajs.js.Date

case class LocalDate(year: Int, month: Int, day: Int) extends Comparable[LocalDate] {
  import LocalDate._
  verify(this)
  override def toString: String = f"$day%02d-$month%02d-$year%04d"
  override def compareTo(o: LocalDate): Int = {
    year - o.year match {
      case 0 ⇒ month - o.month match {
        case 0 ⇒ day - o.day
        case d ⇒ d
      }
      case d ⇒ d
    }
  }
}

object LocalDate {
  def verify(date: LocalDate): Unit = {
    val errors = validate(date)
    assert(errors.isEmpty, errors.mkString(", "))
  }
  def validate(date: LocalDate): Seq[String] = {
    import date._
    Seq(
      if (month > 0 && month < 13) None else Some(s"month value $month is incorrect"),
      if (day > 0 && day < 32) None else Some(s"day value $day is incorrect"),
      if (day > maxDayIn(year, month)) Some(s"date $year-$month-$day is incorrect") else None
    ).flatten
  }
  def maxDayIn(year: Int, month: Int): Int = {
    month match {
      case 2 if year % 4 > 0 ⇒ 28
      case 2 ⇒ 29
      case 4|6|9|11 ⇒ 30
      case _ ⇒ 31
    }
  }
  def apply(date: Date): LocalDate = LocalDate(date.getFullYear(), date.getMonth() + 1, date.getDate())
}