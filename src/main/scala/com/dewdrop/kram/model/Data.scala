package com.dewdrop.kram.model

object Data {
  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }
  object Teams {
    val Arsenal = Team(14, "Арсенал")
    val AstonVilla = Team(809, "Астон Вилла")
    val Birmingham = Team(23, "Бирмингем Сити")
    val Blackburn = Team(862, "Блэкберн Роверс")
    val Bolton = Team(40, "Болтон Уондерерс")
    val WestHam = Team(195, "Вест Хэм Юнайтед")
    val Liverpool = Team(143, "Ливерпуль")
    val Leeds = Team(198, "Лидс Юнайтед")
    val ManCity = Team(38, "Манчестер Сити")
    val ManUnited = Team(88, "Манчестер Юнайтед")
    val Boro = Team(432, "Мидлсбро")
    val Newcastle = Team(20, "Ньюкасл Юнайтед")
    val Sunderland = Team(995, "Сандерленд")
    val Southampton = Team(74, "Саутгемптон")
    val Tottenham = Team(19, "Тоттенхэм Хотспур")
    val Fulham = Team(192, "Фулхэм")
    val Chelsea = Team(70, "Челси")
    val Everton = Team(803, "Эвертон")
    val AllEnglish = Seq(Arsenal, AstonVilla, Birmingham, Blackburn, Bolton, WestHam, Liverpool, Leeds, ManCity, ManUnited,
      Boro, Newcastle, Sunderland, Southampton, Tottenham, Fulham, Chelsea, Everton)
  }
  import Tournaments._
  object Season25 extends Season {
    private object TeamsWithMinutes {
      val Arsenal = TeamWithMinutes(Teams.Arsenal, 270)
      val AstonVilla = TeamWithMinutes(Teams.AstonVilla, 270)
      val Birmingham = TeamWithMinutes(Teams.Birmingham, 360)
      val Blackburn = TeamWithMinutes(Teams.Blackburn, 180)
      val Bolton = TeamWithMinutes(Teams.Bolton, 270)
      val WestHam = TeamWithMinutes(Teams.WestHam, 360)
      val Liverpool = TeamWithMinutes(Teams.Liverpool, 180)
      val Leeds = TeamWithMinutes(Teams.Leeds, 360)
      val ManCity = TeamWithMinutes(Teams.ManCity, 270)
      val ManUnited = TeamWithMinutes(Teams.ManUnited, 360)
      val Boro = TeamWithMinutes(Teams.Boro, 90)
      val Newcastle = TeamWithMinutes(Teams.Newcastle, 180)
      val Sunderland = TeamWithMinutes(Teams.Sunderland, 180)
      val Southampton = TeamWithMinutes(Teams.Southampton, 120)
      val Tottenham = TeamWithMinutes(Teams.Tottenham, 270)
      val Fulham = TeamWithMinutes(Teams.Fulham, 180)
      val Chelsea = TeamWithMinutes(Teams.Chelsea, 0)
      val Everton = TeamWithMinutes(Teams.Everton, 360)

    }
    import TeamsWithMinutes._
    override val name = "КРАМ: 25-й сезон"
    override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(GreatBritain, "тур 1") -> Seq(
        Fixture(Arsenal, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Leeds, Fulham),
        Fixture(AstonVilla, Liverpool),
        Fixture(Sunderland, Boro),
        Fixture(ManCity, Tottenham),
        Fixture(Chelsea, Bolton),
        Fixture(ManUnited, Blackburn),
        Fixture(WestHam, Southampton)
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Leeds, AstonVilla),
        Fixture(Fulham, Liverpool),
        Fixture(Sunderland, Chelsea),
        Fixture(Bolton, ManCity),
        Fixture(Tottenham, ManUnited),
        Fixture(Blackburn, Southampton),
        Fixture(Boro, WestHam)
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Fulham, ManCity),
        Fixture(AstonVilla, Sunderland),
        Fixture(Liverpool, Leeds),
        Fixture(Chelsea, Southampton),
        Fixture(ManUnited, Bolton),
        Fixture(Boro, Tottenham),
        Fixture(WestHam, Blackburn)
      ),
      TournamentRound(GreatBritain, "тур 4") -> Seq(
        Fixture(Newcastle, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Leeds, Sunderland),
        Fixture(Liverpool, Chelsea),
        Fixture(ManCity, AstonVilla),
        Fixture(ManUnited, Fulham),
        Fixture(Tottenham, WestHam),
        Fixture(Blackburn, Bolton),
        Fixture(Southampton, Boro)
      ),
      TournamentRound(GreatBritain, "тур 5") -> Seq(
        Fixture(Everton, Newcastle)
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Fulham, Southampton),
        Fixture(AstonVilla, Tottenham),
        Fixture(Sunderland, Liverpool),
        Fixture(Bolton, Leeds),
        Fixture(ManCity, Chelsea),
        Fixture(Boro, Blackburn),
        Fixture(WestHam, ManUnited)
      ),
      TournamentRound(GreatBritain, "тур 6") -> Seq(
        Fixture(Newcastle, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Leeds, ManCity),
        Fixture(AstonVilla, Fulham),
        Fixture(Liverpool, ManUnited),
        Fixture(Bolton, Boro),
        Fixture(Chelsea, WestHam),
        Fixture(Tottenham, Blackburn),
        Fixture(Southampton, Sunderland)
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Fulham, Bolton),
        Fixture(Chelsea, Leeds),
        Fixture(ManUnited, Southampton),
        Fixture(Tottenham, Sunderland),
        Fixture(Blackburn, AstonVilla),
        Fixture(Boro, Liverpool),
        Fixture(WestHam, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Leeds, Tottenham),
        Fixture(Fulham, Blackburn),
        Fixture(Sunderland, WestHam),
        Fixture(Bolton, AstonVilla),
        Fixture(ManCity, ManUnited),
        Fixture(Boro, Chelsea),
        Fixture(Southampton, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(AstonVilla, Boro),
        Fixture(Liverpool, Tottenham),
        Fixture(Chelsea, Fulham),
        Fixture(ManUnited, Leeds),
        Fixture(Blackburn, Sunderland),
        Fixture(Southampton, ManCity),
        Fixture(WestHam, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Leeds, Boro),
        Fixture(Sunderland, Fulham),
        Fixture(Bolton, Liverpool),
        Fixture(ManCity, Blackburn),
        Fixture(ManUnited, Chelsea),
        Fixture(Tottenham, Southampton),
        Fixture(WestHam, AstonVilla)
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Fulham, Tottenham),
        Fixture(AstonVilla, Chelsea),
        Fixture(Liverpool, WestHam),
        Fixture(ManCity, Sunderland),
        Fixture(Blackburn, Leeds),
        Fixture(Boro, ManUnited),
        Fixture(Southampton, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(Liverpool, Blackburn),
        Fixture(Bolton, Sunderland),
        Fixture(Chelsea, Tottenham),
        Fixture(ManUnited, AstonVilla),
        Fixture(Boro, ManCity),
        Fixture(Southampton, Leeds),
        Fixture(WestHam, Fulham)
      ),
      TournamentRound(GreatBritain, "тур 13") -> Seq(
        Fixture(Birmingham, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Leeds, WestHam),
        Fixture(Fulham, Boro),
        Fixture(AstonVilla, Southampton),
        Fixture(Sunderland, ManUnited),
        Fixture(ManCity, Liverpool),
        Fixture(Chelsea, Blackburn),
        Fixture(Tottenham, Bolton)
      ),
      TournamentRound(GreatBritain, "тур 14") -> Seq(
        Fixture(Arsenal, Birmingham)
      ),
      TournamentRound(GreatBritain, "тур 16") -> Seq(
        ReverseFixture(Arsenal, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Leeds, Fulham),
        ReverseFixture(AstonVilla, Liverpool),
        ReverseFixture(Sunderland, Boro),
        ReverseFixture(ManCity, Tottenham),
        ReverseFixture(Chelsea, Bolton),
        ReverseFixture(ManUnited, Blackburn),
        ReverseFixture(WestHam, Southampton)
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Leeds, AstonVilla),
        ReverseFixture(Fulham, Liverpool),
        ReverseFixture(Sunderland, Chelsea),
        ReverseFixture(Bolton, ManCity),
        ReverseFixture(Tottenham, ManUnited),
        ReverseFixture(Blackburn, Southampton),
        ReverseFixture(Boro, WestHam)
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(Fulham, ManCity),
        ReverseFixture(AstonVilla, Sunderland),
        ReverseFixture(Liverpool, Leeds),
        ReverseFixture(Chelsea, Southampton),
        ReverseFixture(ManUnited, Bolton),
        ReverseFixture(Boro, Tottenham),
        ReverseFixture(WestHam, Blackburn)
      ),
      TournamentRound(GreatBritain, "тур 19") -> Seq(
        ReverseFixture(Newcastle, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Leeds, Sunderland),
        ReverseFixture(Liverpool, Chelsea),
        ReverseFixture(ManCity, AstonVilla),
        ReverseFixture(ManUnited, Fulham),
        ReverseFixture(Tottenham, WestHam),
        ReverseFixture(Blackburn, Bolton),
        ReverseFixture(Southampton, Boro)
      ),
      TournamentRound(GreatBritain, "тур 20") -> Seq(
        ReverseFixture(Everton, Newcastle)
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(Fulham, Southampton),
        ReverseFixture(AstonVilla, Tottenham),
        ReverseFixture(Sunderland, Liverpool),
        ReverseFixture(Bolton, Leeds),
        ReverseFixture(ManCity, Chelsea),
        ReverseFixture(Boro, Blackburn),
        ReverseFixture(WestHam, ManUnited)
      ),
      TournamentRound(GreatBritain, "тур 21") -> Seq(
        ReverseFixture(Newcastle, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Leeds, ManCity),
        ReverseFixture(AstonVilla, Fulham),
        ReverseFixture(Liverpool, ManUnited),
        ReverseFixture(Bolton, Boro),
        ReverseFixture(Chelsea, WestHam),
        ReverseFixture(Tottenham, Blackburn),
        ReverseFixture(Southampton, Sunderland)
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(Fulham, Bolton),
        ReverseFixture(Chelsea, Leeds),
        ReverseFixture(ManUnited, Southampton),
        ReverseFixture(Tottenham, Sunderland),
        ReverseFixture(Blackburn, AstonVilla),
        ReverseFixture(Boro, Liverpool),
        ReverseFixture(WestHam, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Leeds, Tottenham),
        ReverseFixture(Fulham, Blackburn),
        ReverseFixture(Sunderland, WestHam),
        ReverseFixture(Bolton, AstonVilla),
        ReverseFixture(ManCity, ManUnited),
        ReverseFixture(Boro, Chelsea),
        ReverseFixture(Southampton, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(AstonVilla, Boro),
        ReverseFixture(Liverpool, Tottenham),
        ReverseFixture(Chelsea, Fulham),
        ReverseFixture(ManUnited, Leeds),
        ReverseFixture(Blackburn, Sunderland),
        ReverseFixture(Southampton, ManCity),
        ReverseFixture(WestHam, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Leeds, Boro),
        ReverseFixture(Sunderland, Fulham),
        ReverseFixture(Bolton, Liverpool),
        ReverseFixture(ManCity, Blackburn),
        ReverseFixture(ManUnited, Chelsea),
        ReverseFixture(Tottenham, Southampton),
        ReverseFixture(WestHam, AstonVilla)
      ),
      TournamentRound(GreatBritain, "тур 28") -> Seq(
        ReverseFixture(Birmingham, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(Fulham, Tottenham),
        ReverseFixture(AstonVilla, Chelsea),
        ReverseFixture(Liverpool, WestHam),
        ReverseFixture(ManCity, Sunderland),
        ReverseFixture(Blackburn, Leeds),
        ReverseFixture(Boro, ManUnited),
        ReverseFixture(Southampton, Bolton)
      ),
      TournamentRound(GreatBritain, "тур 29") -> Seq(
        ReverseFixture(Arsenal, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(Liverpool, Blackburn),
        ReverseFixture(Bolton, Sunderland),
        ReverseFixture(Chelsea, Tottenham),
        ReverseFixture(ManUnited, AstonVilla),
        ReverseFixture(Boro, ManCity),
        ReverseFixture(Southampton, Leeds),
        ReverseFixture(WestHam, Fulham)
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Leeds, WestHam),
        ReverseFixture(Fulham, Boro),
        ReverseFixture(AstonVilla, Southampton),
        ReverseFixture(Sunderland, ManUnited),
        ReverseFixture(ManCity, Liverpool),
        ReverseFixture(Chelsea, Blackburn),
        ReverseFixture(Tottenham, Bolton)
      )
    )
    override val calendar: Map[CalendarDay, Seq[TournamentRound]] = Map(
      CalendarDay(3301, LocalDate(2015, 12, 8)) → Seq(TournamentRound(EnglandChamp, "тур 1"), TournamentRound(GreatBritain, "тур 1")),
      CalendarDay(3303, LocalDate(2015, 12, 11)) → Seq(TournamentRound(EnglandChamp, "тур 2"), TournamentRound(GreatBritain, "тур 2")),
      CalendarDay(3305, LocalDate(2015, 12, 15)) → Seq(TournamentRound(EnglandChamp, "тур 3"), TournamentRound(GreatBritain, "тур 3")),
      CalendarDay(3307, LocalDate(2015, 12, 18)) → Seq(TournamentRound(EnglandChamp, "тур 4"), TournamentRound(GreatBritain, "тур 4")),
      CalendarDay(3309, LocalDate(2015, 12, 22)) → Seq(TournamentRound(EnglandChamp, "тур 5"), TournamentRound(GreatBritain, "тур 5")),
      CalendarDay(3311, LocalDate(2015, 12, 25)) → Seq(TournamentRound(EnglandChamp, "тур 6"), TournamentRound(GreatBritain, "тур 6")),
      CalendarDay(3313, LocalDate(2015, 12, 29)) → Seq(TournamentRound(EnglandChamp, "тур 7"), TournamentRound(GreatBritain, "тур 7")),
      CalendarDay(3315, LocalDate(2016, 1, 4)) → Seq(TournamentRound(EnglandChamp, "тур 8"), TournamentRound(GreatBritain, "тур 8")),
      CalendarDay(3317, LocalDate(2016, 1, 8)) → Seq(TournamentRound(EnglandChamp, "тур 9"), TournamentRound(GreatBritain, "тур 9")),
      CalendarDay(3319, LocalDate(2016, 1, 12)) → Seq(TournamentRound(EnglandChamp, "тур 10"), TournamentRound(GreatBritain, "тур 10")),
      CalendarDay(3321, LocalDate(2016, 1, 15)) → Seq(TournamentRound(EnglandChamp, "тур 11"), TournamentRound(GreatBritain, "тур 11")),
      CalendarDay(3323, LocalDate(2016, 1, 19)) → Seq(TournamentRound(EnglandChamp, "тур 12"), TournamentRound(GreatBritain, "тур 12")),
      CalendarDay(3325, LocalDate(2016, 1, 22)) → Seq(TournamentRound(EnglandChamp, "тур 13"), TournamentRound(GreatBritain, "тур 13")),
      CalendarDay(3326, LocalDate(2016, 1, 25)) → Seq(TournamentRound(GreatBritain, "тур 14")),
      CalendarDay(3328, LocalDate(2016, 1, 27)) → Seq(TournamentRound(GreatBritain, "тур 15")),
      CalendarDay(3331, LocalDate(2016, 2, 1)) → Seq(TournamentRound(EnglandChamp, "тур 14"), TournamentRound(GreatBritain, "тур 16")),
      CalendarDay(3333, LocalDate(2016, 2, 3)) → Seq(TournamentRound(EnglandChamp, "тур 15"), TournamentRound(GreatBritain, "тур 17")),
      CalendarDay(3335, LocalDate(2016, 2, 5)) → Seq(TournamentRound(EnglandChamp, "тур 16"), TournamentRound(GreatBritain, "тур 18")),
      CalendarDay(3337, LocalDate(2016, 2, 8)) → Seq(TournamentRound(EnglandChamp, "тур 17"), TournamentRound(GreatBritain, "тур 19")),
      CalendarDay(3339, LocalDate(2016, 2, 10)) → Seq(TournamentRound(EnglandChamp, "тур 18"), TournamentRound(GreatBritain, "тур 20")),
      CalendarDay(3341, LocalDate(2016, 2, 12)) → Seq(TournamentRound(EnglandChamp, "тур 19"), TournamentRound(GreatBritain, "тур 21")),
      CalendarDay(3343, LocalDate(2016, 2, 15)) → Seq(TournamentRound(EnglandChamp, "тур 20"), TournamentRound(GreatBritain, "тур 22")),
      CalendarDay(3345, LocalDate(2016, 2, 17)) → Seq(TournamentRound(EnglandChamp, "тур 21"), TournamentRound(GreatBritain, "тур 23")),
      CalendarDay(3346, LocalDate(2016, 2, 18)) → Seq(TournamentRound(GreatBritain, "тур 24")),
      CalendarDay(3347, LocalDate(2016, 2, 19)) → Seq(TournamentRound(EnglandChamp, "тур 22"), TournamentRound(GreatBritain, "тур 25")),
      CalendarDay(3349, LocalDate(2016, 2, 22)) → Seq(TournamentRound(EnglandChamp, "тур 23"), TournamentRound(GreatBritain, "тур 26")),
      CalendarDay(3350, LocalDate(2016, 2, 23)) → Seq(TournamentRound(GreatBritain, "тур 27")),
      CalendarDay(3351, LocalDate(2016, 2, 24)) → Seq(TournamentRound(EnglandChamp, "тур 24"), TournamentRound(GreatBritain, "тур 28")),
      CalendarDay(3353, LocalDate(2016, 2, 26)) → Seq(TournamentRound(EnglandChamp, "тур 25"), TournamentRound(GreatBritain, "тур 29")),
      CalendarDay(3355, LocalDate(2016, 3, 1)) → Seq(TournamentRound(EnglandChamp, "тур 26"), TournamentRound(GreatBritain, "тур 30"))
    )
  }
}
