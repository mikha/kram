package com.dewdrop.kram.model

object Data {
  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }
  import Tournaments._
  object Season29 extends Season {
    override val name = "КРАМ: 30-й сезон"
    override val version = "5.0.0"
    override val participantsOnly: Boolean = true
    private object TeamsWithMinutes {
      val Arsenal = Team(14, "Арсенал", 180)
      val AstonVilla = Team(809, "Астон Вилла", 0)
      val Birmingham = Team(23, "Бирмингем Сити", 0)
      val Blackburn = Team(862, "Блэкберн Роверс", 270)
      val Bolton = Team(40, "Болтон Уондерерс", 0)
      val WestHam = Team(195, "Вест Хэм Юнайтед", 90)
      val Liverpool = Team(143, "Ливерпуль", 180)
      val Leeds = Team(198, "Лидс Юнайтед", 90)
      val ManCity = Team(38, "Манчестер Сити", 180)
      val ManUnited = Team(88, "Манчестер Юнайтед", 270)
      val Boro = Team(432, "Мидлсбро", 180)
      val Newcastle = Team(20, "Ньюкасл Юнайтед", 0)
      val Sunderland = Team(995, "Сандерленд", 0)
      val Southampton = Team(74, "Саутгемптон", 270)
      val Tottenham = Team(19, "Тоттенхэм Хотспур", 270)
      val Fulham = Team(192, "Фулхэм", 270)
      val Chelsea = Team(70, "Челси", 0)
      val Everton = Team(803, "Эвертон", 90)
    }
    import TeamsWithMinutes._
    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Fulham, Southampton),
        Fixture(ManCity, Everton),
        Fixture(Boro, Leeds),
        Fixture(Bolton, Tottenham),
        Fixture(WestHam, Birmingham),
        Fixture(ManUnited, Sunderland),
        Fixture(Newcastle, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Fulham, ManCity),
        Fixture(Southampton, Everton),
        Fixture(Boro, WestHam),
        Fixture(Birmingham, Bolton),
        Fixture(Tottenham, ManUnited),
        Fixture(Sunderland, Arsenal),
        Fixture(Leeds, Newcastle)
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Southampton, Bolton),
        Fixture(ManCity, Boro),
        Fixture(Everton, Fulham),
        Fixture(WestHam, Arsenal),
        Fixture(ManUnited, Birmingham),
        Fixture(Leeds, Tottenham),
        Fixture(Newcastle, Sunderland)
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Fulham, Boro),
        Fixture(Everton, WestHam),
        Fixture(Bolton, ManCity),
        Fixture(ManUnited, Southampton),
        Fixture(Tottenham, Newcastle),
        Fixture(Sunderland, Birmingham),
        Fixture(Arsenal, Leeds)
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Southampton, Arsenal),
        Fixture(ManCity, Tottenham),
        Fixture(Boro, Everton),
        Fixture(Birmingham, Fulham),
        Fixture(Bolton, WestHam),
        Fixture(Leeds, Sunderland),
        Fixture(Newcastle, ManUnited)
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Fulham, Bolton),
        Fixture(ManCity, Southampton),
        Fixture(Everton, ManUnited),
        Fixture(Birmingham, Leeds),
        Fixture(WestHam, Newcastle),
        Fixture(Tottenham, Sunderland),
        Fixture(Arsenal, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Southampton, Birmingham),
        Fixture(WestHam, Fulham),
        Fixture(ManUnited, Arsenal),
        Fixture(Tottenham, Boro),
        Fixture(Sunderland, ManCity),
        Fixture(Leeds, Everton),
        Fixture(Newcastle, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Fulham, Tottenham),
        Fixture(Southampton, Sunderland),
        Fixture(Boro, Newcastle),
        Fixture(Birmingham, ManCity),
        Fixture(Bolton, ManUnited),
        Fixture(Leeds, WestHam),
        Fixture(Arsenal, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(ManCity, Leeds),
        Fixture(Everton, Tottenham),
        Fixture(WestHam, Southampton),
        Fixture(ManUnited, Fulham),
        Fixture(Sunderland, Boro),
        Fixture(Arsenal, Bolton),
        Fixture(Newcastle, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Fulham, Leeds),
        Fixture(Boro, Southampton),
        Fixture(Birmingham, Everton),
        Fixture(Bolton, Sunderland),
        Fixture(ManUnited, WestHam),
        Fixture(Tottenham, Arsenal),
        Fixture(Newcastle, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Southampton, Tottenham),
        Fixture(ManCity, WestHam),
        Fixture(Everton, Newcastle),
        Fixture(Bolton, Boro),
        Fixture(Sunderland, Fulham),
        Fixture(Leeds, ManUnited),
        Fixture(Arsenal, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(Everton, Sunderland),
        Fixture(Birmingham, Boro),
        Fixture(WestHam, Tottenham),
        Fixture(ManUnited, ManCity),
        Fixture(Leeds, Bolton),
        Fixture(Arsenal, Fulham),
        Fixture(Newcastle, Southampton)
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Fulham, Newcastle),
        Fixture(Southampton, Leeds),
        Fixture(ManCity, Arsenal),
        Fixture(Boro, ManUnited),
        Fixture(Bolton, Everton),
        Fixture(WestHam, Sunderland),
        Fixture(Tottenham, Birmingham)
      ),
      TournamentRound(GreatBritain, "тур 14") -> Seq(
        Fixture(Blackburn, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Fulham, Southampton),
        ReverseFixture(ManCity, Everton),
        ReverseFixture(Boro, Leeds),
        ReverseFixture(Bolton, Tottenham),
        ReverseFixture(WestHam, Birmingham),
        ReverseFixture(ManUnited, Sunderland),
        ReverseFixture(Newcastle, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Fulham, ManCity),
        ReverseFixture(Southampton, Everton),
        ReverseFixture(Boro, WestHam),
        ReverseFixture(Birmingham, Bolton),
        ReverseFixture(Tottenham, ManUnited),
        ReverseFixture(Sunderland, Arsenal),
        ReverseFixture(Leeds, Newcastle)
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(Southampton, Bolton),
        ReverseFixture(ManCity, Boro),
        ReverseFixture(Everton, Fulham),
        ReverseFixture(WestHam, Arsenal),
        ReverseFixture(ManUnited, Birmingham),
        ReverseFixture(Leeds, Tottenham),
        ReverseFixture(Newcastle, Sunderland)
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Fulham, Boro),
        ReverseFixture(Everton, WestHam),
        ReverseFixture(Bolton, ManCity),
        ReverseFixture(ManUnited, Southampton),
        ReverseFixture(Tottenham, Newcastle),
        ReverseFixture(Sunderland, Birmingham),
        ReverseFixture(Arsenal, Leeds)
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(Southampton, Arsenal),
        ReverseFixture(ManCity, Tottenham),
        ReverseFixture(Boro, Everton),
        ReverseFixture(Birmingham, Fulham),
        ReverseFixture(Bolton, WestHam),
        ReverseFixture(Leeds, Sunderland),
        ReverseFixture(Newcastle, ManUnited)
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Fulham, Bolton),
        ReverseFixture(ManCity, Southampton),
        ReverseFixture(Everton, ManUnited),
        ReverseFixture(Birmingham, Leeds),
        ReverseFixture(WestHam, Newcastle),
        ReverseFixture(Tottenham, Sunderland),
        ReverseFixture(Arsenal, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(Southampton, Birmingham),
        ReverseFixture(WestHam, Fulham),
        ReverseFixture(ManUnited, Arsenal),
        ReverseFixture(Tottenham, Boro),
        ReverseFixture(Sunderland, ManCity),
        ReverseFixture(Leeds, Everton),
        ReverseFixture(Newcastle, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Fulham, Tottenham),
        ReverseFixture(Southampton, Sunderland),
        ReverseFixture(Boro, Newcastle),
        ReverseFixture(Birmingham, ManCity),
        ReverseFixture(Bolton, ManUnited),
        ReverseFixture(Leeds, WestHam),
        ReverseFixture(Arsenal, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(ManCity, Leeds),
        ReverseFixture(Everton, Tottenham),
        ReverseFixture(WestHam, Southampton),
        ReverseFixture(ManUnited, Fulham),
        ReverseFixture(Sunderland, Boro),
        ReverseFixture(Arsenal, Bolton),
        ReverseFixture(Newcastle, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Fulham, Leeds),
        ReverseFixture(Boro, Southampton),
        ReverseFixture(Birmingham, Everton),
        ReverseFixture(Bolton, Sunderland),
        ReverseFixture(ManUnited, WestHam),
        ReverseFixture(Tottenham, Arsenal),
        ReverseFixture(Newcastle, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(Southampton, Tottenham),
        ReverseFixture(ManCity, WestHam),
        ReverseFixture(Everton, Newcastle),
        ReverseFixture(Bolton, Boro),
        ReverseFixture(Sunderland, Fulham),
        ReverseFixture(Leeds, ManUnited),
        ReverseFixture(Arsenal, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(Everton, Sunderland),
        ReverseFixture(Birmingham, Boro),
        ReverseFixture(WestHam, Tottenham),
        ReverseFixture(ManUnited, ManCity),
        ReverseFixture(Leeds, Bolton),
        ReverseFixture(Arsenal, Fulham),
        ReverseFixture(Newcastle, Southampton)
      ),
      TournamentRound(GreatBritain, "тур 29") -> Seq(
        ReverseFixture(Blackburn, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Fulham, Newcastle),
        ReverseFixture(Southampton, Leeds),
        ReverseFixture(ManCity, Arsenal),
        ReverseFixture(Boro, ManUnited),
        ReverseFixture(Bolton, Everton),
        ReverseFixture(WestHam, Sunderland),
        ReverseFixture(Tottenham, Birmingham)
      )
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] = Map(
      CalendarDay(3831, LocalDate(2018, 2, 23)) -> Seq(TournamentRound(EnglandChamp, "тур 6")),
      CalendarDay(3833, LocalDate(2018, 2, 27)) -> Seq(TournamentRound(EnglandChamp, "тур 7")),
      CalendarDay(3835, LocalDate(2018, 3, 2)) -> Seq(TournamentRound(EnglandChamp, "тур 8")),
      CalendarDay(3837, LocalDate(2018, 3, 6)) -> Seq(TournamentRound(EnglandChamp, "тур 9")),
      CalendarDay(3839, LocalDate(2018, 3, 9)) -> Seq(TournamentRound(EnglandChamp, "тур 10")),
      CalendarDay(3841, LocalDate(2018, 3, 13)) -> Seq(TournamentRound(EnglandChamp, "тур 11")),
      CalendarDay(3843, LocalDate(2018, 3, 16)) -> Seq(TournamentRound(EnglandChamp, "тур 12")),
      CalendarDay(3845, LocalDate(2018, 3, 20)) -> Seq(TournamentRound(EnglandChamp, "тур 13")),
      CalendarDay(3846, LocalDate(2018, 3, 22)) -> Seq(TournamentRound(GreatBritain, "тур 14")),
      CalendarDay(3850, LocalDate(2018, 3, 26)) -> Seq(TournamentRound(EnglandChamp, "тур 14")),
      CalendarDay(3852, LocalDate(2018, 3, 28)) -> Seq(TournamentRound(EnglandChamp, "тур 15")),
      CalendarDay(3854, LocalDate(2018, 3, 30)) -> Seq(TournamentRound(EnglandChamp, "тур 16")),
      CalendarDay(3856, LocalDate(2018, 4, 2)) -> Seq(TournamentRound(EnglandChamp, "тур 17")),
      CalendarDay(3858, LocalDate(2018, 4, 4)) -> Seq(TournamentRound(EnglandChamp, "тур 18")),
      CalendarDay(3860, LocalDate(2018, 4, 6)) -> Seq(TournamentRound(EnglandChamp, "тур 19")),
      CalendarDay(3862, LocalDate(2018, 4, 9)) -> Seq(TournamentRound(EnglandChamp, "тур 20")),
      CalendarDay(3864, LocalDate(2018, 4, 11)) -> Seq(TournamentRound(EnglandChamp, "тур 21")),
      CalendarDay(3866, LocalDate(2018, 4, 13)) -> Seq(TournamentRound(EnglandChamp, "тур 22")),
      CalendarDay(3868, LocalDate(2018, 4, 16)) -> Seq(TournamentRound(EnglandChamp, "тур 23")),
      CalendarDay(3870, LocalDate(2018, 4, 18)) -> Seq(TournamentRound(EnglandChamp, "тур 24")),
      CalendarDay(3872, LocalDate(2018, 4, 20)) -> Seq(TournamentRound(EnglandChamp, "тур 25"), TournamentRound(GreatBritain, "тур 29")),
      CalendarDay(3874, LocalDate(2018, 4, 23)) -> Seq(TournamentRound(EnglandChamp, "тур 26"))
    )
  }
}
