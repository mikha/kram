package com.dewdrop.kram.model

object Data {

  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }

  import Tournaments._

  object SeasonData extends Season {
    override val name = "КРАМ: 38-й сезон"
    override val version = "12.0.0"
    override val participantsOnly: Boolean = true

    private object TeamsWithMinutes {
      // @formatter:off
      val Arsenal =     Team(14,  "Арсенал",           0)
      val AstonVilla =  Team(809, "Астон Вилла",       0)
      val Birmingham =  Team(23,  "Бирмингем Сити",    0)
      val Blackburn =   Team(862, "Блэкберн Роверс",   0)
      val Bolton =      Team(40,  "Болтон Уондерерс",  360)
      val WestHam =     Team(195, "Вест Хэм Юнайтед",  0)
      val Liverpool =   Team(143, "Ливерпуль",         270)
      val Leeds =       Team(198, "Лидс Юнайтед",      270)
      val ManCity =     Team(38,  "Манчестер Сити",    315)
      val ManUnited =   Team(88,  "Манчестер Юнайтед", 0)
      val Boro =        Team(432, "Мидлсбро",          90)
      val Newcastle =   Team(20,  "Ньюкасл Юнайтед",   0)
      val Sunderland =  Team(995, "Сандерленд",        0)
      val Southampton = Team(74,  "Саутгемптон",       369)
      val Tottenham =   Team(19,  "Тоттенхэм Хотспур", 0)
      val Fulham =      Team(192, "Фулхэм",            0)
      val Chelsea =     Team(70,  "Челси",             360)
      val Everton =     Team(803, "Эвертон",           0)
      // @formatter:on
    }

    import TeamsWithMinutes._

    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Chelsea, ManCity),
        Fixture(Fulham, WestHam),
        Fixture(Sunderland, Leeds),
        Fixture(Tottenham, Bolton),
        Fixture(Boro, Liverpool),
        Fixture(ManUnited, AstonVilla),
        Fixture(Southampton, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Chelsea, Fulham),
        Fixture(ManCity, WestHam),
        Fixture(Sunderland, Boro),
        Fixture(Liverpool, Tottenham),
        Fixture(Bolton, ManUnited),
        Fixture(AstonVilla, Blackburn),
        Fixture(Leeds, Southampton),
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(ManCity, Tottenham),
        Fixture(Fulham, Sunderland),
        Fixture(WestHam, Chelsea),
        Fixture(Boro, Blackburn),
        Fixture(ManUnited, Liverpool),
        Fixture(Leeds, Bolton),
        Fixture(Southampton, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Chelsea, Sunderland),
        Fixture(WestHam, Boro),
        Fixture(Tottenham, Fulham),
        Fixture(ManUnited, ManCity),
        Fixture(Bolton, Southampton),
        Fixture(AstonVilla, Liverpool),
        Fixture(Blackburn, Leeds),
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(ManCity, Blackburn),
        Fixture(Fulham, Bolton),
        Fixture(Sunderland, WestHam),
        Fixture(Liverpool, Chelsea),
        Fixture(Tottenham, Boro),
        Fixture(Leeds, AstonVilla),
        Fixture(Southampton, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Chelsea, Tottenham),
        Fixture(Fulham, ManCity),
        Fixture(WestHam, ManUnited),
        Fixture(Liverpool, Leeds),
        Fixture(Boro, Southampton),
        Fixture(Bolton, AstonVilla),
        Fixture(Blackburn, Sunderland),
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(ManCity, Liverpool),
        Fixture(Boro, Chelsea),
        Fixture(ManUnited, Blackburn),
        Fixture(Bolton, Sunderland),
        Fixture(AstonVilla, Fulham),
        Fixture(Leeds, WestHam),
        Fixture(Southampton, Tottenham),
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Chelsea, Bolton),
        Fixture(ManCity, AstonVilla),
        Fixture(Sunderland, Southampton),
        Fixture(Liverpool, Fulham),
        Fixture(Tottenham, ManUnited),
        Fixture(Leeds, Boro),
        Fixture(Blackburn, WestHam),
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(Fulham, Leeds),
        Fixture(WestHam, Bolton),
        Fixture(Boro, ManCity),
        Fixture(ManUnited, Chelsea),
        Fixture(AstonVilla, Sunderland),
        Fixture(Blackburn, Tottenham),
        Fixture(Southampton, Liverpool),
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Chelsea, Leeds),
        Fixture(Sunderland, ManCity),
        Fixture(Liverpool, WestHam),
        Fixture(Tottenham, AstonVilla),
        Fixture(ManUnited, Boro),
        Fixture(Bolton, Blackburn),
        Fixture(Southampton, Fulham),
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(ManCity, Bolton),
        Fixture(Fulham, Boro),
        Fixture(WestHam, Southampton),
        Fixture(Tottenham, Sunderland),
        Fixture(AstonVilla, Chelsea),
        Fixture(Leeds, ManUnited),
        Fixture(Blackburn, Liverpool),
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(WestHam, AstonVilla),
        Fixture(Liverpool, Sunderland),
        Fixture(Boro, Bolton),
        Fixture(ManUnited, Fulham),
        Fixture(Leeds, Tottenham),
        Fixture(Blackburn, Chelsea),
        Fixture(Southampton, ManCity),
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Chelsea, Southampton),
        Fixture(ManCity, Leeds),
        Fixture(Fulham, Blackburn),
        Fixture(Sunderland, ManUnited),
        Fixture(Tottenham, WestHam),
        Fixture(Boro, AstonVilla),
        Fixture(Bolton, Liverpool),
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Chelsea, ManCity),
        ReverseFixture(Fulham, WestHam),
        ReverseFixture(Sunderland, Leeds),
        ReverseFixture(Tottenham, Bolton),
        ReverseFixture(Boro, Liverpool),
        ReverseFixture(ManUnited, AstonVilla),
        ReverseFixture(Southampton, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Chelsea, Fulham),
        ReverseFixture(ManCity, WestHam),
        ReverseFixture(Sunderland, Boro),
        ReverseFixture(Liverpool, Tottenham),
        ReverseFixture(Bolton, ManUnited),
        ReverseFixture(AstonVilla, Blackburn),
        ReverseFixture(Leeds, Southampton),
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(ManCity, Tottenham),
        ReverseFixture(Fulham, Sunderland),
        ReverseFixture(WestHam, Chelsea),
        ReverseFixture(Boro, Blackburn),
        ReverseFixture(ManUnited, Liverpool),
        ReverseFixture(Leeds, Bolton),
        ReverseFixture(Southampton, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Chelsea, Sunderland),
        ReverseFixture(WestHam, Boro),
        ReverseFixture(Tottenham, Fulham),
        ReverseFixture(ManUnited, ManCity),
        ReverseFixture(Bolton, Southampton),
        ReverseFixture(AstonVilla, Liverpool),
        ReverseFixture(Blackburn, Leeds),
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(ManCity, Blackburn),
        ReverseFixture(Fulham, Bolton),
        ReverseFixture(Sunderland, WestHam),
        ReverseFixture(Liverpool, Chelsea),
        ReverseFixture(Tottenham, Boro),
        ReverseFixture(Leeds, AstonVilla),
        ReverseFixture(Southampton, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Chelsea, Tottenham),
        ReverseFixture(Fulham, ManCity),
        ReverseFixture(WestHam, ManUnited),
        ReverseFixture(Liverpool, Leeds),
        ReverseFixture(Boro, Southampton),
        ReverseFixture(Bolton, AstonVilla),
        ReverseFixture(Blackburn, Sunderland),
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(ManCity, Liverpool),
        ReverseFixture(Boro, Chelsea),
        ReverseFixture(ManUnited, Blackburn),
        ReverseFixture(Bolton, Sunderland),
        ReverseFixture(AstonVilla, Fulham),
        ReverseFixture(Leeds, WestHam),
        ReverseFixture(Southampton, Tottenham),
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Chelsea, Bolton),
        ReverseFixture(ManCity, AstonVilla),
        ReverseFixture(Sunderland, Southampton),
        ReverseFixture(Liverpool, Fulham),
        ReverseFixture(Tottenham, ManUnited),
        ReverseFixture(Leeds, Boro),
        ReverseFixture(Blackburn, WestHam),
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(Fulham, Leeds),
        ReverseFixture(WestHam, Bolton),
        ReverseFixture(Boro, ManCity),
        ReverseFixture(ManUnited, Chelsea),
        ReverseFixture(AstonVilla, Sunderland),
        ReverseFixture(Blackburn, Tottenham),
        ReverseFixture(Southampton, Liverpool),
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Chelsea, Leeds),
        ReverseFixture(Sunderland, ManCity),
        ReverseFixture(Liverpool, WestHam),
        ReverseFixture(Tottenham, AstonVilla),
        ReverseFixture(ManUnited, Boro),
        ReverseFixture(Bolton, Blackburn),
        ReverseFixture(Southampton, Fulham),
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(ManCity, Bolton),
        ReverseFixture(Fulham, Boro),
        ReverseFixture(WestHam, Southampton),
        ReverseFixture(Tottenham, Sunderland),
        ReverseFixture(AstonVilla, Chelsea),
        ReverseFixture(Leeds, ManUnited),
        ReverseFixture(Blackburn, Liverpool),
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(WestHam, AstonVilla),
        ReverseFixture(Liverpool, Sunderland),
        ReverseFixture(Boro, Bolton),
        ReverseFixture(ManUnited, Fulham),
        ReverseFixture(Leeds, Tottenham),
        ReverseFixture(Blackburn, Chelsea),
        ReverseFixture(Southampton, ManCity),
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Chelsea, Southampton),
        ReverseFixture(ManCity, Leeds),
        ReverseFixture(Fulham, Blackburn),
        ReverseFixture(Sunderland, ManUnited),
        ReverseFixture(Tottenham, WestHam),
        ReverseFixture(Boro, AstonVilla),
        ReverseFixture(Bolton, Liverpool),
      ),
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] =
      Map(
        CalendarDay(4560, LocalDate(2021, 4, 2)) -> Seq(TournamentRound(EnglandChamp, "тур 1")),
        CalendarDay(4562, LocalDate(2021, 4, 5)) -> Seq(TournamentRound(EnglandChamp, "тур 2")),
        CalendarDay(4564, LocalDate(2021, 4, 8)) -> Seq(TournamentRound(EnglandChamp, "тур 3")),
        CalendarDay(4566, LocalDate(2021, 4, 12)) -> Seq(TournamentRound(EnglandChamp, "тур 4")),
        CalendarDay(4568, LocalDate(2021, 4, 15)) -> Seq(TournamentRound(EnglandChamp, "тур 5")),
        CalendarDay(4571, LocalDate(2021, 4, 19)) -> Seq(TournamentRound(EnglandChamp, "тур 6")),
        CalendarDay(4573, LocalDate(2021, 4, 22)) -> Seq(TournamentRound(EnglandChamp, "тур 7")),
        CalendarDay(4575, LocalDate(2021, 4, 26)) -> Seq(TournamentRound(EnglandChamp, "тур 8")),
        CalendarDay(4577, LocalDate(2021, 4, 29)) -> Seq(TournamentRound(EnglandChamp, "тур 9")),
        CalendarDay(4579, LocalDate(2021, 5, 3)) -> Seq(TournamentRound(EnglandChamp, "тур 10")),
        CalendarDay(4581, LocalDate(2021, 5, 6)) -> Seq(TournamentRound(EnglandChamp, "тур 11")),
        CalendarDay(4583, LocalDate(2021, 5, 10)) -> Seq(TournamentRound(EnglandChamp, "тур 12")),
        CalendarDay(4585, LocalDate(2021, 5, 12)) -> Seq(TournamentRound(EnglandChamp, "тур 13")),
        CalendarDay(4590, LocalDate(2021, 5, 17)) -> Seq(TournamentRound(EnglandChamp, "тур 14")),
        CalendarDay(4592, LocalDate(2021, 5, 19)) -> Seq(TournamentRound(EnglandChamp, "тур 15")),
        CalendarDay(4594, LocalDate(2021, 5, 21)) -> Seq(TournamentRound(EnglandChamp, "тур 16")),
        CalendarDay(4596, LocalDate(2021, 5, 24)) -> Seq(TournamentRound(EnglandChamp, "тур 17")),
        CalendarDay(4598, LocalDate(2021, 5, 26)) -> Seq(TournamentRound(EnglandChamp, "тур 18")),
        CalendarDay(4600, LocalDate(2021, 5, 28)) -> Seq(TournamentRound(EnglandChamp, "тур 19")),
        CalendarDay(4602, LocalDate(2021, 5, 31)) -> Seq(TournamentRound(EnglandChamp, "тур 20")),
        CalendarDay(4604, LocalDate(2021, 6, 2)) -> Seq(TournamentRound(EnglandChamp, "тур 21")),
        CalendarDay(4606, LocalDate(2021, 6, 4)) -> Seq(TournamentRound(EnglandChamp, "тур 22")),
        CalendarDay(4608, LocalDate(2021, 6, 7)) -> Seq(TournamentRound(EnglandChamp, "тур 23")),
        CalendarDay(4610, LocalDate(2021, 6, 9)) -> Seq(TournamentRound(EnglandChamp, "тур 24")),
        CalendarDay(4612, LocalDate(2021, 6, 11)) -> Seq(TournamentRound(EnglandChamp, "тур 25")),
        CalendarDay(4614, LocalDate(2021, 6, 14)) -> Seq(TournamentRound(EnglandChamp, "тур 26")),
      )
  }

}
