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
  object Season27 extends Season {
    private object TeamsWithMinutes {
      val Arsenal = TeamWithMinutes(Teams.Arsenal, 270)
      val AstonVilla = TeamWithMinutes(Teams.AstonVilla, 180)
      val Birmingham = TeamWithMinutes(Teams.Birmingham, 0)
      val Blackburn = TeamWithMinutes(Teams.Blackburn, 0)
      val Bolton = TeamWithMinutes(Teams.Bolton, 180)
      val WestHam = TeamWithMinutes(Teams.WestHam, 270)
      val Liverpool = TeamWithMinutes(Teams.Liverpool, 270)
      val Leeds = TeamWithMinutes(Teams.Leeds, 180)
      val ManCity = TeamWithMinutes(Teams.ManCity, 360)
      val ManUnited = TeamWithMinutes(Teams.ManUnited, 0)
      val Boro = TeamWithMinutes(Teams.Boro, 0)
      val Newcastle = TeamWithMinutes(Teams.Newcastle, 0)
      val Sunderland = TeamWithMinutes(Teams.Sunderland, 0)
      val Southampton = TeamWithMinutes(Teams.Southampton, 180)
      val Tottenham = TeamWithMinutes(Teams.Tottenham, 360)
      val Fulham = TeamWithMinutes(Teams.Fulham, 90)
      val Chelsea = TeamWithMinutes(Teams.Chelsea, 0)
      val Everton = TeamWithMinutes(Teams.Everton, 270)
    }
    import TeamsWithMinutes._
    override val name = "КРАМ: 27-й сезон"
    override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Liverpool, Bolton),
        Fixture(Everton, ManCity),
        Fixture(Fulham, Boro),
        Fixture(Leeds, Southampton),
        Fixture(Sunderland, Tottenham),
        Fixture(AstonVilla, Arsenal),
        Fixture(WestHam, Newcastle)
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Liverpool, Everton),
        Fixture(Bolton, ManCity),
        Fixture(Fulham, Sunderland),
        Fixture(Tottenham, Leeds),
        Fixture(Southampton, AstonVilla),
        Fixture(Arsenal, Newcastle),
        Fixture(Boro, WestHam)
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Bolton, Leeds),
        Fixture(Everton, Fulham),
        Fixture(ManCity, Liverpool),
        Fixture(Sunderland, Newcastle),
        Fixture(AstonVilla, Tottenham),
        Fixture(Boro, Southampton),
        Fixture(WestHam, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Liverpool, Fulham),
        Fixture(ManCity, Sunderland),
        Fixture(Leeds, Everton),
        Fixture(AstonVilla, Bolton),
        Fixture(Southampton, WestHam),
        Fixture(Arsenal, Tottenham),
        Fixture(Newcastle, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Bolton, Newcastle),
        Fixture(Everton, Southampton),
        Fixture(Fulham, ManCity),
        Fixture(Tottenham, Liverpool),
        Fixture(Leeds, Sunderland),
        Fixture(Boro, Arsenal),
        Fixture(WestHam, AstonVilla)
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Liverpool, Leeds),
        Fixture(Everton, Bolton),
        Fixture(ManCity, AstonVilla),
        Fixture(Tottenham, Boro),
        Fixture(Sunderland, WestHam),
        Fixture(Southampton, Arsenal),
        Fixture(Newcastle, Fulham)
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Bolton, Tottenham),
        Fixture(Sunderland, Liverpool),
        Fixture(AstonVilla, Newcastle),
        Fixture(Southampton, Fulham),
        Fixture(Arsenal, Everton),
        Fixture(Boro, ManCity),
        Fixture(WestHam, Leeds)
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Liverpool, Southampton),
        Fixture(Bolton, Arsenal),
        Fixture(Fulham, WestHam),
        Fixture(Tottenham, Everton),
        Fixture(Leeds, AstonVilla),
        Fixture(Boro, Sunderland),
        Fixture(Newcastle, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(Everton, Boro),
        Fixture(ManCity, Southampton),
        Fixture(Sunderland, Bolton),
        Fixture(AstonVilla, Liverpool),
        Fixture(Arsenal, Fulham),
        Fixture(Newcastle, Leeds),
        Fixture(WestHam, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Liverpool, Boro),
        Fixture(Fulham, Bolton),
        Fixture(Tottenham, ManCity),
        Fixture(Leeds, Arsenal),
        Fixture(AstonVilla, Sunderland),
        Fixture(Southampton, Newcastle),
        Fixture(WestHam, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Bolton, Southampton),
        Fixture(Everton, Sunderland),
        Fixture(ManCity, WestHam),
        Fixture(Leeds, Fulham),
        Fixture(Arsenal, Liverpool),
        Fixture(Boro, AstonVilla),
        Fixture(Newcastle, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(ManCity, Arsenal),
        Fixture(Tottenham, Fulham),
        Fixture(Sunderland, Southampton),
        Fixture(AstonVilla, Everton),
        Fixture(Boro, Leeds),
        Fixture(Newcastle, Liverpool),
        Fixture(WestHam, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Liverpool, WestHam),
        Fixture(Bolton, Boro),
        Fixture(Everton, Newcastle),
        Fixture(Fulham, AstonVilla),
        Fixture(Leeds, ManCity),
        Fixture(Sunderland, Arsenal),
        Fixture(Southampton, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Liverpool, Bolton),
        ReverseFixture(Everton, ManCity),
        ReverseFixture(Fulham, Boro),
        ReverseFixture(Leeds, Southampton),
        ReverseFixture(Sunderland, Tottenham),
        ReverseFixture(AstonVilla, Arsenal),
        ReverseFixture(WestHam, Newcastle)
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Liverpool, Everton),
        ReverseFixture(Bolton, ManCity),
        ReverseFixture(Fulham, Sunderland),
        ReverseFixture(Tottenham, Leeds),
        ReverseFixture(Southampton, AstonVilla),
        ReverseFixture(Arsenal, Newcastle),
        ReverseFixture(Boro, WestHam)
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(Bolton, Leeds),
        ReverseFixture(Everton, Fulham),
        ReverseFixture(ManCity, Liverpool),
        ReverseFixture(Sunderland, Newcastle),
        ReverseFixture(AstonVilla, Tottenham),
        ReverseFixture(Boro, Southampton),
        ReverseFixture(WestHam, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Liverpool, Fulham),
        ReverseFixture(ManCity, Sunderland),
        ReverseFixture(Leeds, Everton),
        ReverseFixture(AstonVilla, Bolton),
        ReverseFixture(Southampton, WestHam),
        ReverseFixture(Arsenal, Tottenham),
        ReverseFixture(Newcastle, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(Bolton, Newcastle),
        ReverseFixture(Everton, Southampton),
        ReverseFixture(Fulham, ManCity),
        ReverseFixture(Tottenham, Liverpool),
        ReverseFixture(Leeds, Sunderland),
        ReverseFixture(Boro, Arsenal),
        ReverseFixture(WestHam, AstonVilla)
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Liverpool, Leeds),
        ReverseFixture(Everton, Bolton),
        ReverseFixture(ManCity, AstonVilla),
        ReverseFixture(Tottenham, Boro),
        ReverseFixture(Sunderland, WestHam),
        ReverseFixture(Southampton, Arsenal),
        ReverseFixture(Newcastle, Fulham)
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(Bolton, Tottenham),
        ReverseFixture(Sunderland, Liverpool),
        ReverseFixture(AstonVilla, Newcastle),
        ReverseFixture(Southampton, Fulham),
        ReverseFixture(Arsenal, Everton),
        ReverseFixture(Boro, ManCity),
        ReverseFixture(WestHam, Leeds)
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Liverpool, Southampton),
        ReverseFixture(Bolton, Arsenal),
        ReverseFixture(Fulham, WestHam),
        ReverseFixture(Tottenham, Everton),
        ReverseFixture(Leeds, AstonVilla),
        ReverseFixture(Boro, Sunderland),
        ReverseFixture(Newcastle, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(Everton, Boro),
        ReverseFixture(ManCity, Southampton),
        ReverseFixture(Sunderland, Bolton),
        ReverseFixture(AstonVilla, Liverpool),
        ReverseFixture(Arsenal, Fulham),
        ReverseFixture(Newcastle, Leeds),
        ReverseFixture(WestHam, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Liverpool, Boro),
        ReverseFixture(Fulham, Bolton),
        ReverseFixture(Tottenham, ManCity),
        ReverseFixture(Leeds, Arsenal),
        ReverseFixture(AstonVilla, Sunderland),
        ReverseFixture(Southampton, Newcastle),
        ReverseFixture(WestHam, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(Bolton, Southampton),
        ReverseFixture(Everton, Sunderland),
        ReverseFixture(ManCity, WestHam),
        ReverseFixture(Leeds, Fulham),
        ReverseFixture(Arsenal, Liverpool),
        ReverseFixture(Boro, AstonVilla),
        ReverseFixture(Newcastle, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(ManCity, Arsenal),
        ReverseFixture(Tottenham, Fulham),
        ReverseFixture(Sunderland, Southampton),
        ReverseFixture(AstonVilla, Everton),
        ReverseFixture(Boro, Leeds),
        ReverseFixture(Newcastle, Liverpool),
        ReverseFixture(WestHam, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Liverpool, WestHam),
        ReverseFixture(Bolton, Boro),
        ReverseFixture(Everton, Newcastle),
        ReverseFixture(Fulham, AstonVilla),
        ReverseFixture(Leeds, ManCity),
        ReverseFixture(Sunderland, Arsenal),
        ReverseFixture(Southampton, Tottenham)
      )
    )
    override val calendar: Map[CalendarDay, Seq[TournamentRound]] = Map(
      CalendarDay(3521, LocalDate(2016, 11, 15)) → Seq(TournamentRound(EnglandChamp, "тур 1")),
      CalendarDay(3523, LocalDate(2016, 11, 18)) → Seq(TournamentRound(EnglandChamp, "тур 2")),
      CalendarDay(3525, LocalDate(2016, 11, 22)) → Seq(TournamentRound(EnglandChamp, "тур 3")),
      CalendarDay(3527, LocalDate(2016, 11, 25)) → Seq(TournamentRound(EnglandChamp, "тур 4")),
      CalendarDay(3529, LocalDate(2016, 11, 29)) → Seq(TournamentRound(EnglandChamp, "тур 5")),
      CalendarDay(3531, LocalDate(2016, 12, 2)) → Seq(TournamentRound(EnglandChamp, "тур 6")),
      CalendarDay(3533, LocalDate(2016, 12, 6)) → Seq(TournamentRound(EnglandChamp, "тур 7")),
      CalendarDay(3535, LocalDate(2016, 12, 9)) → Seq(TournamentRound(EnglandChamp, "тур 8")),
      CalendarDay(3537, LocalDate(2016, 12, 13)) → Seq(TournamentRound(EnglandChamp, "тур 9")),
      CalendarDay(3539, LocalDate(2016, 12, 16)) → Seq(TournamentRound(EnglandChamp, "тур 10")),
      CalendarDay(3541, LocalDate(2016, 12, 20)) → Seq(TournamentRound(EnglandChamp, "тур 11")),
      CalendarDay(3543, LocalDate(2016, 12, 23)) → Seq(TournamentRound(EnglandChamp, "тур 12")),
      CalendarDay(3545, LocalDate(2016, 12, 27)) → Seq(TournamentRound(EnglandChamp, "тур 13")),
      CalendarDay(3551, LocalDate(2017, 1, 9)) → Seq(TournamentRound(EnglandChamp, "тур 14")),
      CalendarDay(3553, LocalDate(2017, 1, 11)) → Seq(TournamentRound(EnglandChamp, "тур 15")),
      CalendarDay(3555, LocalDate(2017, 1, 13)) → Seq(TournamentRound(EnglandChamp, "тур 16")),
      CalendarDay(3557, LocalDate(2017, 1, 16)) → Seq(TournamentRound(EnglandChamp, "тур 17")),
      CalendarDay(3559, LocalDate(2017, 1, 18)) → Seq(TournamentRound(EnglandChamp, "тур 18")),
      CalendarDay(3561, LocalDate(2017, 1, 20)) → Seq(TournamentRound(EnglandChamp, "тур 19")),
      CalendarDay(3563, LocalDate(2017, 1, 23)) → Seq(TournamentRound(EnglandChamp, "тур 20")),
      CalendarDay(3565, LocalDate(2017, 1, 25)) → Seq(TournamentRound(EnglandChamp, "тур 21")),
      CalendarDay(3567, LocalDate(2017, 1, 27)) → Seq(TournamentRound(EnglandChamp, "тур 22")),
      CalendarDay(3569, LocalDate(2017, 1, 30)) → Seq(TournamentRound(EnglandChamp, "тур 23")),
      CalendarDay(3571, LocalDate(2017, 2, 1)) → Seq(TournamentRound(EnglandChamp, "тур 24")),
      CalendarDay(3573, LocalDate(2017, 2, 3)) → Seq(TournamentRound(EnglandChamp, "тур 25")),
      CalendarDay(3575, LocalDate(2017, 2, 6)) → Seq(TournamentRound(EnglandChamp, "тур 26"))
    )
  }
}
