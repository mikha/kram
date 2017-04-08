package com.dewdrop.kram.model

object Data {
  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }
  import Tournaments._
  object Season28 extends Season {
    override val name = "КРАМ: 28-й сезон"
    private object TeamsWithMinutes {
      val Arsenal = Team(14, "Арсенал", 270)
      val AstonVilla = Team(809, "Астон Вилла", 0)
      val Birmingham = Team(23, "Бирмингем Сити", 0)
      val Blackburn = Team(862, "Блэкберн Роверс", 0)
      val Bolton = Team(40, "Болтон Уондерерс", 0)
      val WestHam = Team(195, "Вест Хэм Юнайтед", 180)
      val Liverpool = Team(143, "Ливерпуль", 270)
      val Leeds = Team(198, "Лидс Юнайтед", 120)
      val ManCity = Team(38, "Манчестер Сити", 90)
      val ManUnited = Team(88, "Манчестер Юнайтед", 0)
      val Boro = Team(432, "Мидлсбро", 180)
      val Newcastle = Team(20, "Ньюкасл Юнайтед", 0)
      val Sunderland = Team(995, "Сандерленд", 0)
      val Southampton = Team(74, "Саутгемптон", 180)
      val Tottenham = Team(19, "Тоттенхэм Хотспур", 360)
      val Fulham = Team(192, "Фулхэм", 90)
      val Chelsea = Team(70, "Челси", 0)
      val Everton = Team(803, "Эвертон", 270)
    }
    import TeamsWithMinutes._
    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Sunderland, Leeds),
        Fixture(WestHam, Boro),
        Fixture(ManCity, ManUnited),
        Fixture(Arsenal, Fulham),
        Fixture(Chelsea, Everton),
        Fixture(Liverpool, Southampton),
        Fixture(Bolton, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Sunderland, WestHam),
        Fixture(Leeds, Boro),
        Fixture(ManCity, Chelsea),
        Fixture(Everton, Arsenal),
        Fixture(Fulham, Liverpool),
        Fixture(Southampton, Tottenham),
        Fixture(ManUnited, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Leeds, Arsenal),
        Fixture(WestHam, ManCity),
        Fixture(Boro, Sunderland),
        Fixture(Chelsea, Tottenham),
        Fixture(Liverpool, Everton),
        Fixture(ManUnited, Fulham),
        Fixture(Bolton, Southampton)
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Sunderland, ManCity),
        Fixture(Boro, Chelsea),
        Fixture(Arsenal, WestHam),
        Fixture(Liverpool, Leeds),
        Fixture(Fulham, Bolton),
        Fixture(Southampton, Everton),
        Fixture(Tottenham, ManUnited)
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Leeds, Tottenham),
        Fixture(WestHam, Fulham),
        Fixture(ManCity, Boro),
        Fixture(Everton, Sunderland),
        Fixture(Arsenal, Chelsea),
        Fixture(ManUnited, Southampton),
        Fixture(Bolton, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Sunderland, Arsenal),
        Fixture(WestHam, Leeds),
        Fixture(Boro, Liverpool),
        Fixture(Everton, ManUnited),
        Fixture(Chelsea, Bolton),
        Fixture(Fulham, Southampton),
        Fixture(Tottenham, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Leeds, Everton),
        Fixture(Chelsea, Sunderland),
        Fixture(Liverpool, Tottenham),
        Fixture(Fulham, ManCity),
        Fixture(Southampton, WestHam),
        Fixture(ManUnited, Boro),
        Fixture(Bolton, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Sunderland, Fulham),
        Fixture(Leeds, Southampton),
        Fixture(ManCity, Bolton),
        Fixture(Everton, WestHam),
        Fixture(Arsenal, Liverpool),
        Fixture(ManUnited, Chelsea),
        Fixture(Tottenham, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(WestHam, ManUnited),
        Fixture(Boro, Fulham),
        Fixture(Chelsea, Leeds),
        Fixture(Liverpool, Sunderland),
        Fixture(Southampton, ManCity),
        Fixture(Tottenham, Arsenal),
        Fixture(Bolton, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Sunderland, ManUnited),
        Fixture(ManCity, Leeds),
        Fixture(Everton, Boro),
        Fixture(Arsenal, Southampton),
        Fixture(Liverpool, Chelsea),
        Fixture(Fulham, Tottenham),
        Fixture(Bolton, WestHam)
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Leeds, Fulham),
        Fixture(WestHam, Chelsea),
        Fixture(Boro, Bolton),
        Fixture(Arsenal, ManCity),
        Fixture(Southampton, Sunderland),
        Fixture(ManUnited, Liverpool),
        Fixture(Tottenham, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(Boro, Southampton),
        Fixture(Everton, ManCity),
        Fixture(Chelsea, Fulham),
        Fixture(Liverpool, WestHam),
        Fixture(ManUnited, Arsenal),
        Fixture(Tottenham, Sunderland),
        Fixture(Bolton, Leeds)
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Sunderland, Bolton),
        Fixture(Leeds, ManUnited),
        Fixture(WestHam, Tottenham),
        Fixture(ManCity, Liverpool),
        Fixture(Arsenal, Boro),
        Fixture(Chelsea, Southampton),
        Fixture(Fulham, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Sunderland, Leeds),
        ReverseFixture(WestHam, Boro),
        ReverseFixture(ManCity, ManUnited),
        ReverseFixture(Arsenal, Fulham),
        ReverseFixture(Chelsea, Everton),
        ReverseFixture(Liverpool, Southampton),
        ReverseFixture(Bolton, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Sunderland, WestHam),
        ReverseFixture(Leeds, Boro),
        ReverseFixture(ManCity, Chelsea),
        ReverseFixture(Everton, Arsenal),
        ReverseFixture(Fulham, Liverpool),
        ReverseFixture(Southampton, Tottenham),
        ReverseFixture(ManUnited, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(Leeds, Arsenal),
        ReverseFixture(WestHam, ManCity),
        ReverseFixture(Boro, Sunderland),
        ReverseFixture(Chelsea, Tottenham),
        ReverseFixture(Liverpool, Everton),
        ReverseFixture(ManUnited, Fulham),
        ReverseFixture(Bolton, Southampton)
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Sunderland, ManCity),
        ReverseFixture(Boro, Chelsea),
        ReverseFixture(Arsenal, WestHam),
        ReverseFixture(Liverpool, Leeds),
        ReverseFixture(Fulham, Bolton),
        ReverseFixture(Southampton, Everton),
        ReverseFixture(Tottenham, ManUnited)
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(Leeds, Tottenham),
        ReverseFixture(WestHam, Fulham),
        ReverseFixture(ManCity, Boro),
        ReverseFixture(Everton, Sunderland),
        ReverseFixture(Arsenal, Chelsea),
        ReverseFixture(ManUnited, Southampton),
        ReverseFixture(Bolton, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Sunderland, Arsenal),
        ReverseFixture(WestHam, Leeds),
        ReverseFixture(Boro, Liverpool),
        ReverseFixture(Everton, ManUnited),
        ReverseFixture(Chelsea, Bolton),
        ReverseFixture(Fulham, Southampton),
        ReverseFixture(Tottenham, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(Leeds, Everton),
        ReverseFixture(Chelsea, Sunderland),
        ReverseFixture(Liverpool, Tottenham),
        ReverseFixture(Fulham, ManCity),
        ReverseFixture(Southampton, WestHam),
        ReverseFixture(ManUnited, Boro),
        ReverseFixture(Bolton, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Sunderland, Fulham),
        ReverseFixture(Leeds, Southampton),
        ReverseFixture(ManCity, Bolton),
        ReverseFixture(Everton, WestHam),
        ReverseFixture(Arsenal, Liverpool),
        ReverseFixture(ManUnited, Chelsea),
        ReverseFixture(Tottenham, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(WestHam, ManUnited),
        ReverseFixture(Boro, Fulham),
        ReverseFixture(Chelsea, Leeds),
        ReverseFixture(Liverpool, Sunderland),
        ReverseFixture(Southampton, ManCity),
        ReverseFixture(Tottenham, Arsenal),
        ReverseFixture(Bolton, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Sunderland, ManUnited),
        ReverseFixture(ManCity, Leeds),
        ReverseFixture(Everton, Boro),
        ReverseFixture(Arsenal, Southampton),
        ReverseFixture(Liverpool, Chelsea),
        ReverseFixture(Fulham, Tottenham),
        ReverseFixture(Bolton, WestHam)
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(Leeds, Fulham),
        ReverseFixture(WestHam, Chelsea),
        ReverseFixture(Boro, Bolton),
        ReverseFixture(Arsenal, ManCity),
        ReverseFixture(Southampton, Sunderland),
        ReverseFixture(ManUnited, Liverpool),
        ReverseFixture(Tottenham, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(Boro, Southampton),
        ReverseFixture(Everton, ManCity),
        ReverseFixture(Chelsea, Fulham),
        ReverseFixture(Liverpool, WestHam),
        ReverseFixture(ManUnited, Arsenal),
        ReverseFixture(Tottenham, Sunderland),
        ReverseFixture(Bolton, Leeds)
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Sunderland, Bolton),
        ReverseFixture(Leeds, ManUnited),
        ReverseFixture(WestHam, Tottenham),
        ReverseFixture(ManCity, Liverpool),
        ReverseFixture(Arsenal, Boro),
        ReverseFixture(Chelsea, Southampton),
        ReverseFixture(Fulham, Everton)
      )
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] = Map(
      CalendarDay(3621, LocalDate(2017, 4, 11)) -> Seq(TournamentRound(EnglandChamp, "тур 1")),
      CalendarDay(3623, LocalDate(2017, 4, 14)) -> Seq(TournamentRound(EnglandChamp, "тур 2")),
      CalendarDay(3625, LocalDate(2017, 4, 18)) -> Seq(TournamentRound(EnglandChamp, "тур 3")),
      CalendarDay(3627, LocalDate(2017, 4, 21)) -> Seq(TournamentRound(EnglandChamp, "тур 4")),
      CalendarDay(3629, LocalDate(2017, 4, 26)) -> Seq(TournamentRound(EnglandChamp, "тур 5")),
      CalendarDay(3631, LocalDate(2017, 4, 28)) -> Seq(TournamentRound(EnglandChamp, "тур 6")),
      CalendarDay(3633, LocalDate(2017, 5, 2)) -> Seq(TournamentRound(EnglandChamp, "тур 7")),
      CalendarDay(3635, LocalDate(2017, 5, 5)) -> Seq(TournamentRound(EnglandChamp, "тур 8")),
      CalendarDay(3637, LocalDate(2017, 5, 10)) -> Seq(TournamentRound(EnglandChamp, "тур 9")),
      CalendarDay(3639, LocalDate(2017, 5, 12)) -> Seq(TournamentRound(EnglandChamp, "тур 10")),
      CalendarDay(3641, LocalDate(2017, 5, 16)) -> Seq(TournamentRound(EnglandChamp, "тур 11")),
      CalendarDay(3643, LocalDate(2017, 5, 19)) -> Seq(TournamentRound(EnglandChamp, "тур 12")),
      CalendarDay(3645, LocalDate(2017, 5, 23)) -> Seq(TournamentRound(EnglandChamp, "тур 13")),
      CalendarDay(3651, LocalDate(2017, 5, 29)) -> Seq(TournamentRound(EnglandChamp, "тур 14")),
      CalendarDay(3653, LocalDate(2017, 5, 31)) -> Seq(TournamentRound(EnglandChamp, "тур 15")),
      CalendarDay(3655, LocalDate(2017, 6, 2)) -> Seq(TournamentRound(EnglandChamp, "тур 16")),
      CalendarDay(3657, LocalDate(2017, 6, 5)) -> Seq(TournamentRound(EnglandChamp, "тур 17")),
      CalendarDay(3659, LocalDate(2017, 6, 7)) -> Seq(TournamentRound(EnglandChamp, "тур 18")),
      CalendarDay(3661, LocalDate(2017, 6, 9)) -> Seq(TournamentRound(EnglandChamp, "тур 19")),
      CalendarDay(3663, LocalDate(2017, 6, 12)) -> Seq(TournamentRound(EnglandChamp, "тур 20")),
      CalendarDay(3665, LocalDate(2017, 6, 14)) -> Seq(TournamentRound(EnglandChamp, "тур 21")),
      CalendarDay(3667, LocalDate(2017, 6, 16)) -> Seq(TournamentRound(EnglandChamp, "тур 22")),
      CalendarDay(3669, LocalDate(2017, 6, 19)) -> Seq(TournamentRound(EnglandChamp, "тур 23")),
      CalendarDay(3671, LocalDate(2017, 6, 21)) -> Seq(TournamentRound(EnglandChamp, "тур 24")),
      CalendarDay(3673, LocalDate(2017, 6, 23)) -> Seq(TournamentRound(EnglandChamp, "тур 25")),
      CalendarDay(3675, LocalDate(2017, 6, 26)) -> Seq(TournamentRound(EnglandChamp, "тур 26"))
    )
  }
}
