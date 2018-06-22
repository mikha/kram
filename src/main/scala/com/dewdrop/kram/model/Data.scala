package com.dewdrop.kram.model

object Data {
  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }
  import Tournaments._
  object SeasonData extends Season {
    override val name = "КРАМ: 31-й сезон"
    override val version = "6.0.0"
    override val participantsOnly: Boolean = true
    private object TeamsWithMinutes {
      val Arsenal = Team(14, "Арсенал", 90)
      val AstonVilla = Team(809, "Астон Вилла", 0)
      val Birmingham = Team(23, "Бирмингем Сити", 0)
      val Blackburn = Team(862, "Блэкберн Роверс", 0)
      val Bolton = Team(40, "Болтон Уондерерс", 0)
      val WestHam = Team(195, "Вест Хэм Юнайтед", 90)
      val Liverpool = Team(143, "Ливерпуль", 90)
      val Leeds = Team(198, "Лидс Юнайтед", 0)
      val ManCity = Team(38, "Манчестер Сити", 180)
      val ManUnited = Team(88, "Манчестер Юнайтед", 270)
      val Boro = Team(432, "Мидлсбро", 180)
      val Newcastle = Team(20, "Ньюкасл Юнайтед", 0)
      val Sunderland = Team(995, "Сандерленд", 0)
      val Southampton = Team(74, "Саутгемптон", 270)
      val Tottenham = Team(19, "Тоттенхэм Хотспур", 270)
      val Fulham = Team(192, "Фулхэм", 270)
      val Chelsea = Team(70, "Челси", 0)
      val Everton = Team(803, "Эвертон", 0)
    }
    import TeamsWithMinutes._
    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Bolton, Southampton),
        Fixture(AstonVilla, Fulham),
        Fixture(WestHam, Tottenham),
        Fixture(ManCity, Arsenal),
        Fixture(Sunderland, Everton),
        Fixture(ManUnited, Birmingham),
        Fixture(Liverpool, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Bolton, AstonVilla),
        Fixture(Southampton, Fulham),
        Fixture(WestHam, Sunderland),
        Fixture(Everton, ManCity),
        Fixture(Arsenal, ManUnited),
        Fixture(Birmingham, Boro),
        Fixture(Tottenham, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Southampton, ManCity),
        Fixture(AstonVilla, WestHam),
        Fixture(Fulham, Bolton),
        Fixture(Sunderland, Boro),
        Fixture(ManUnited, Everton),
        Fixture(Tottenham, Arsenal),
        Fixture(Liverpool, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Bolton, WestHam),
        Fixture(Fulham, Sunderland),
        Fixture(ManCity, AstonVilla),
        Fixture(ManUnited, Southampton),
        Fixture(Arsenal, Liverpool),
        Fixture(Birmingham, Everton),
        Fixture(Boro, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Southampton, Boro),
        Fixture(AstonVilla, Arsenal),
        Fixture(WestHam, Fulham),
        Fixture(Everton, Bolton),
        Fixture(ManCity, Sunderland),
        Fixture(Tottenham, Birmingham),
        Fixture(Liverpool, ManUnited)
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Bolton, ManCity),
        Fixture(AstonVilla, Southampton),
        Fixture(Fulham, ManUnited),
        Fixture(Everton, Tottenham),
        Fixture(Sunderland, Liverpool),
        Fixture(Arsenal, Birmingham),
        Fixture(Boro, WestHam)
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Southampton, Everton),
        Fixture(Sunderland, Bolton),
        Fixture(ManUnited, Boro),
        Fixture(Arsenal, WestHam),
        Fixture(Birmingham, AstonVilla),
        Fixture(Tottenham, Fulham),
        Fixture(Liverpool, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Bolton, Arsenal),
        Fixture(Southampton, Birmingham),
        Fixture(WestHam, Liverpool),
        Fixture(Everton, AstonVilla),
        Fixture(ManCity, ManUnited),
        Fixture(Tottenham, Sunderland),
        Fixture(Boro, Fulham)
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(AstonVilla, Tottenham),
        Fixture(Fulham, Arsenal),
        Fixture(Sunderland, Southampton),
        Fixture(ManUnited, Bolton),
        Fixture(Birmingham, WestHam),
        Fixture(Boro, ManCity),
        Fixture(Liverpool, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Bolton, Tottenham),
        Fixture(WestHam, Southampton),
        Fixture(Everton, Fulham),
        Fixture(ManCity, Birmingham),
        Fixture(ManUnited, Sunderland),
        Fixture(Arsenal, Boro),
        Fixture(Liverpool, AstonVilla)
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Southampton, Arsenal),
        Fixture(AstonVilla, Sunderland),
        Fixture(Fulham, Liverpool),
        Fixture(ManCity, WestHam),
        Fixture(Birmingham, Bolton),
        Fixture(Tottenham, ManUnited),
        Fixture(Boro, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(Fulham, Birmingham),
        Fixture(Everton, WestHam),
        Fixture(Sunderland, Arsenal),
        Fixture(ManUnited, AstonVilla),
        Fixture(Tottenham, ManCity),
        Fixture(Boro, Bolton),
        Fixture(Liverpool, Southampton)
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Bolton, Liverpool),
        Fixture(Southampton, Tottenham),
        Fixture(AstonVilla, Boro),
        Fixture(WestHam, ManUnited),
        Fixture(ManCity, Fulham),
        Fixture(Sunderland, Birmingham),
        Fixture(Arsenal, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Bolton, Southampton),
        ReverseFixture(AstonVilla, Fulham),
        ReverseFixture(WestHam, Tottenham),
        ReverseFixture(ManCity, Arsenal),
        ReverseFixture(Sunderland, Everton),
        ReverseFixture(ManUnited, Birmingham),
        ReverseFixture(Liverpool, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Bolton, AstonVilla),
        ReverseFixture(Southampton, Fulham),
        ReverseFixture(WestHam, Sunderland),
        ReverseFixture(Everton, ManCity),
        ReverseFixture(Arsenal, ManUnited),
        ReverseFixture(Birmingham, Boro),
        ReverseFixture(Tottenham, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(Southampton, ManCity),
        ReverseFixture(AstonVilla, WestHam),
        ReverseFixture(Fulham, Bolton),
        ReverseFixture(Sunderland, Boro),
        ReverseFixture(ManUnited, Everton),
        ReverseFixture(Tottenham, Arsenal),
        ReverseFixture(Liverpool, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Bolton, WestHam),
        ReverseFixture(Fulham, Sunderland),
        ReverseFixture(ManCity, AstonVilla),
        ReverseFixture(ManUnited, Southampton),
        ReverseFixture(Arsenal, Liverpool),
        ReverseFixture(Birmingham, Everton),
        ReverseFixture(Boro, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(Southampton, Boro),
        ReverseFixture(AstonVilla, Arsenal),
        ReverseFixture(WestHam, Fulham),
        ReverseFixture(Everton, Bolton),
        ReverseFixture(ManCity, Sunderland),
        ReverseFixture(Tottenham, Birmingham),
        ReverseFixture(Liverpool, ManUnited)
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Bolton, ManCity),
        ReverseFixture(AstonVilla, Southampton),
        ReverseFixture(Fulham, ManUnited),
        ReverseFixture(Everton, Tottenham),
        ReverseFixture(Sunderland, Liverpool),
        ReverseFixture(Arsenal, Birmingham),
        ReverseFixture(Boro, WestHam)
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(Southampton, Everton),
        ReverseFixture(Sunderland, Bolton),
        ReverseFixture(ManUnited, Boro),
        ReverseFixture(Arsenal, WestHam),
        ReverseFixture(Birmingham, AstonVilla),
        ReverseFixture(Tottenham, Fulham),
        ReverseFixture(Liverpool, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Bolton, Arsenal),
        ReverseFixture(Southampton, Birmingham),
        ReverseFixture(WestHam, Liverpool),
        ReverseFixture(Everton, AstonVilla),
        ReverseFixture(ManCity, ManUnited),
        ReverseFixture(Tottenham, Sunderland),
        ReverseFixture(Boro, Fulham)
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(AstonVilla, Tottenham),
        ReverseFixture(Fulham, Arsenal),
        ReverseFixture(Sunderland, Southampton),
        ReverseFixture(ManUnited, Bolton),
        ReverseFixture(Birmingham, WestHam),
        ReverseFixture(Boro, ManCity),
        ReverseFixture(Liverpool, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Bolton, Tottenham),
        ReverseFixture(WestHam, Southampton),
        ReverseFixture(Everton, Fulham),
        ReverseFixture(ManCity, Birmingham),
        ReverseFixture(ManUnited, Sunderland),
        ReverseFixture(Arsenal, Boro),
        ReverseFixture(Liverpool, AstonVilla)
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(Southampton, Arsenal),
        ReverseFixture(AstonVilla, Sunderland),
        ReverseFixture(Fulham, Liverpool),
        ReverseFixture(ManCity, WestHam),
        ReverseFixture(Birmingham, Bolton),
        ReverseFixture(Tottenham, ManUnited),
        ReverseFixture(Boro, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(Fulham, Birmingham),
        ReverseFixture(Everton, WestHam),
        ReverseFixture(Sunderland, Arsenal),
        ReverseFixture(ManUnited, AstonVilla),
        ReverseFixture(Tottenham, ManCity),
        ReverseFixture(Boro, Bolton),
        ReverseFixture(Liverpool, Southampton)
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Bolton, Liverpool),
        ReverseFixture(Southampton, Tottenham),
        ReverseFixture(AstonVilla, Boro),
        ReverseFixture(WestHam, ManUnited),
        ReverseFixture(ManCity, Fulham),
        ReverseFixture(Sunderland, Birmingham),
        ReverseFixture(Arsenal, Everton)
      )
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] = Map(
      CalendarDay(3913, LocalDate(2018, 6, 29)) -> Seq(TournamentRound(EnglandChamp, "тур 1")),
      CalendarDay(3915, LocalDate(2018, 7, 2)) -> Seq(TournamentRound(EnglandChamp, "тур 2")),
      CalendarDay(3917, LocalDate(2018, 7, 4)) -> Seq(TournamentRound(EnglandChamp, "тур 3")),
      CalendarDay(3919, LocalDate(2018, 7, 9)) -> Seq(TournamentRound(EnglandChamp, "тур 4")),
      CalendarDay(3921, LocalDate(2018, 7, 11)) -> Seq(TournamentRound(EnglandChamp, "тур 5")),
      CalendarDay(3923, LocalDate(2018, 7, 16)) -> Seq(TournamentRound(EnglandChamp, "тур 6")),
      CalendarDay(3925, LocalDate(2018, 7, 18)) -> Seq(TournamentRound(EnglandChamp, "тур 7")),
      CalendarDay(3928, LocalDate(2018, 7, 23)) -> Seq(TournamentRound(EnglandChamp, "тур 8")),
      CalendarDay(3930, LocalDate(2018, 7, 25)) -> Seq(TournamentRound(EnglandChamp, "тур 9")),
      CalendarDay(3932, LocalDate(2018, 7, 30)) -> Seq(TournamentRound(EnglandChamp, "тур 10")),
      CalendarDay(3934, LocalDate(2018, 8, 1)) -> Seq(TournamentRound(EnglandChamp, "тур 11")),
      CalendarDay(3937, LocalDate(2018, 8, 6)) -> Seq(TournamentRound(EnglandChamp, "тур 12")),
      CalendarDay(3939, LocalDate(2018, 8, 8)) -> Seq(TournamentRound(EnglandChamp, "тур 13")),
      CalendarDay(3944, LocalDate(2018, 8, 13)) -> Seq(TournamentRound(EnglandChamp, "тур 14")),
      CalendarDay(3946, LocalDate(2018, 8, 15)) -> Seq(TournamentRound(EnglandChamp, "тур 15")),
      CalendarDay(3948, LocalDate(2018, 8, 17)) -> Seq(TournamentRound(EnglandChamp, "тур 16")),
      CalendarDay(3950, LocalDate(2018, 8, 20)) -> Seq(TournamentRound(EnglandChamp, "тур 17")),
      CalendarDay(3952, LocalDate(2018, 8, 22)) -> Seq(TournamentRound(EnglandChamp, "тур 18")),
      CalendarDay(3954, LocalDate(2018, 8, 24)) -> Seq(TournamentRound(EnglandChamp, "тур 19")),
      CalendarDay(3956, LocalDate(2018, 8, 27)) -> Seq(TournamentRound(EnglandChamp, "тур 20")),
      CalendarDay(3958, LocalDate(2018, 8, 29)) -> Seq(TournamentRound(EnglandChamp, "тур 21")),
      CalendarDay(3960, LocalDate(2018, 8, 31)) -> Seq(TournamentRound(EnglandChamp, "тур 22")),
      CalendarDay(3962, LocalDate(2018, 9, 3)) -> Seq(TournamentRound(EnglandChamp, "тур 23")),
      CalendarDay(3964, LocalDate(2018, 9, 5)) -> Seq(TournamentRound(EnglandChamp, "тур 24")),
      CalendarDay(3966, LocalDate(2018, 9, 7)) -> Seq(TournamentRound(EnglandChamp, "тур 25")),
      CalendarDay(3968, LocalDate(2018, 9, 10)) -> Seq(TournamentRound(EnglandChamp, "тур 26"))
    )
  }
}
