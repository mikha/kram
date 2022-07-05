package com.dewdrop.kram.model

object Data {

  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }

  import Tournaments._

  object SeasonData extends Season {
    override val name = "КРАМ: 41-й сезон"
    override val version = "15.0.0"
    override val participantsOnly: Boolean = true

    private object TeamsWithMinutes {
      // @formatter:off
      val Arsenal =     Team(14,  "Арсенал",           0)
      val AstonVilla =  Team(809, "Астон Вилла",       0)
      val Birmingham =  Team(23,  "Бирмингем Сити",    0)
      val Blackburn =   Team(862, "Блэкберн Роверс",   0)
      val Bolton =      Team(40,  "Болтон Уондерерс",  270)
      val WestHam =     Team(195, "Вест Хэм Юнайтед",  0)
      val Liverpool =   Team(143, "Ливерпуль",         270)
      val Leeds =       Team(198, "Лидс Юнайтед",      90)
      val ManCity =     Team(38,  "Манчестер Сити",    120)
      val ManUnited =   Team(88,  "Манчестер Юнайтед", 120)
      val Boro =        Team(432, "Мидлсбро",          0)
      val Newcastle =   Team(20,  "Ньюкасл Юнайтед",   0)
      val Sunderland =  Team(995, "Сандерленд",        90)
      val Southampton = Team(74,  "Саутгемптон",       90)
      val Tottenham =   Team(19,  "Тоттенхэм Хотспур", 120)
      val Fulham =      Team(192, "Фулхэм",            0)
      val Chelsea =     Team(70,  "Челси",             180)
      val Everton =     Team(803, "Эвертон",           0)
      // @formatter:on
    }

    import TeamsWithMinutes._

    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Fulham, Sunderland),
        Fixture(Chelsea, AstonVilla),
        Fixture(Liverpool, Bolton),
        Fixture(Southampton, Boro),
        Fixture(Tottenham, Newcastle),
        Fixture(Blackburn, ManCity),
        Fixture(ManUnited, Leeds),
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Fulham, Chelsea),
        Fixture(Sunderland, AstonVilla),
        Fixture(Liverpool, Tottenham),
        Fixture(Newcastle, Southampton),
        Fixture(Boro, Blackburn),
        Fixture(ManCity, Leeds),
        Fixture(Bolton, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Sunderland, Southampton),
        Fixture(Chelsea, Liverpool),
        Fixture(AstonVilla, Fulham),
        Fixture(Tottenham, Leeds),
        Fixture(Blackburn, Newcastle),
        Fixture(Bolton, Boro),
        Fixture(ManUnited, ManCity),
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Fulham, Liverpool),
        Fixture(AstonVilla, Tottenham),
        Fixture(Southampton, Chelsea),
        Fixture(Blackburn, Sunderland),
        Fixture(Boro, ManUnited),
        Fixture(ManCity, Newcastle),
        Fixture(Leeds, Bolton),
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Sunderland, Leeds),
        Fixture(Chelsea, Boro),
        Fixture(Liverpool, AstonVilla),
        Fixture(Newcastle, Fulham),
        Fixture(Southampton, Tottenham),
        Fixture(Bolton, ManCity),
        Fixture(ManUnited, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Fulham, Southampton),
        Fixture(Chelsea, Sunderland),
        Fixture(AstonVilla, Blackburn),
        Fixture(Newcastle, Bolton),
        Fixture(Tottenham, ManUnited),
        Fixture(Boro, ManCity),
        Fixture(Leeds, Liverpool),
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Sunderland, Newcastle),
        Fixture(Tottenham, Fulham),
        Fixture(Blackburn, Leeds),
        Fixture(Boro, Liverpool),
        Fixture(ManCity, Chelsea),
        Fixture(Bolton, AstonVilla),
        Fixture(ManUnited, Southampton),
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Fulham, Boro),
        Fixture(Sunderland, ManCity),
        Fixture(Liverpool, ManUnited),
        Fixture(Newcastle, Chelsea),
        Fixture(Southampton, Blackburn),
        Fixture(Bolton, Tottenham),
        Fixture(Leeds, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(Chelsea, Bolton),
        Fixture(AstonVilla, Boro),
        Fixture(Tottenham, Sunderland),
        Fixture(Blackburn, Fulham),
        Fixture(ManCity, Liverpool),
        Fixture(Leeds, Southampton),
        Fixture(ManUnited, Newcastle),
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Fulham, Bolton),
        Fixture(Liverpool, Sunderland),
        Fixture(Newcastle, AstonVilla),
        Fixture(Southampton, ManCity),
        Fixture(Blackburn, Tottenham),
        Fixture(Boro, Leeds),
        Fixture(ManUnited, Chelsea),
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Sunderland, Boro),
        Fixture(Chelsea, Tottenham),
        Fixture(AstonVilla, ManUnited),
        Fixture(Southampton, Liverpool),
        Fixture(ManCity, Fulham),
        Fixture(Bolton, Blackburn),
        Fixture(Leeds, Newcastle),
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(AstonVilla, ManCity),
        Fixture(Newcastle, Liverpool),
        Fixture(Tottenham, Boro),
        Fixture(Blackburn, Chelsea),
        Fixture(Bolton, Southampton),
        Fixture(Leeds, Fulham),
        Fixture(ManUnited, Sunderland),
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Fulham, ManUnited),
        Fixture(Sunderland, Bolton),
        Fixture(Chelsea, Leeds),
        Fixture(Liverpool, Blackburn),
        Fixture(Southampton, AstonVilla),
        Fixture(Tottenham, ManCity),
        Fixture(Boro, Newcastle),
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Fulham, Sunderland),
        ReverseFixture(Chelsea, AstonVilla),
        ReverseFixture(Liverpool, Bolton),
        ReverseFixture(Southampton, Boro),
        ReverseFixture(Tottenham, Newcastle),
        ReverseFixture(Blackburn, ManCity),
        ReverseFixture(ManUnited, Leeds),
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Fulham, Chelsea),
        ReverseFixture(Sunderland, AstonVilla),
        ReverseFixture(Liverpool, Tottenham),
        ReverseFixture(Newcastle, Southampton),
        ReverseFixture(Boro, Blackburn),
        ReverseFixture(ManCity, Leeds),
        ReverseFixture(Bolton, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(Sunderland, Southampton),
        ReverseFixture(Chelsea, Liverpool),
        ReverseFixture(AstonVilla, Fulham),
        ReverseFixture(Tottenham, Leeds),
        ReverseFixture(Blackburn, Newcastle),
        ReverseFixture(Bolton, Boro),
        ReverseFixture(ManUnited, ManCity),
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Fulham, Liverpool),
        ReverseFixture(AstonVilla, Tottenham),
        ReverseFixture(Southampton, Chelsea),
        ReverseFixture(Blackburn, Sunderland),
        ReverseFixture(Boro, ManUnited),
        ReverseFixture(ManCity, Newcastle),
        ReverseFixture(Leeds, Bolton),
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(Sunderland, Leeds),
        ReverseFixture(Chelsea, Boro),
        ReverseFixture(Liverpool, AstonVilla),
        ReverseFixture(Newcastle, Fulham),
        ReverseFixture(Southampton, Tottenham),
        ReverseFixture(Bolton, ManCity),
        ReverseFixture(ManUnited, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Fulham, Southampton),
        ReverseFixture(Chelsea, Sunderland),
        ReverseFixture(AstonVilla, Blackburn),
        ReverseFixture(Newcastle, Bolton),
        ReverseFixture(Tottenham, ManUnited),
        ReverseFixture(Boro, ManCity),
        ReverseFixture(Leeds, Liverpool),
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(Sunderland, Newcastle),
        ReverseFixture(Tottenham, Fulham),
        ReverseFixture(Blackburn, Leeds),
        ReverseFixture(Boro, Liverpool),
        ReverseFixture(ManCity, Chelsea),
        ReverseFixture(Bolton, AstonVilla),
        ReverseFixture(ManUnited, Southampton),
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Fulham, Boro),
        ReverseFixture(Sunderland, ManCity),
        ReverseFixture(Liverpool, ManUnited),
        ReverseFixture(Newcastle, Chelsea),
        ReverseFixture(Southampton, Blackburn),
        ReverseFixture(Bolton, Tottenham),
        ReverseFixture(Leeds, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(Chelsea, Bolton),
        ReverseFixture(AstonVilla, Boro),
        ReverseFixture(Tottenham, Sunderland),
        ReverseFixture(Blackburn, Fulham),
        ReverseFixture(ManCity, Liverpool),
        ReverseFixture(Leeds, Southampton),
        ReverseFixture(ManUnited, Newcastle),
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Fulham, Bolton),
        ReverseFixture(Liverpool, Sunderland),
        ReverseFixture(Newcastle, AstonVilla),
        ReverseFixture(Southampton, ManCity),
        ReverseFixture(Blackburn, Tottenham),
        ReverseFixture(Boro, Leeds),
        ReverseFixture(ManUnited, Chelsea),
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(Sunderland, Boro),
        ReverseFixture(Chelsea, Tottenham),
        ReverseFixture(AstonVilla, ManUnited),
        ReverseFixture(Southampton, Liverpool),
        ReverseFixture(ManCity, Fulham),
        ReverseFixture(Bolton, Blackburn),
        ReverseFixture(Leeds, Newcastle),
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(AstonVilla, ManCity),
        ReverseFixture(Newcastle, Liverpool),
        ReverseFixture(Tottenham, Boro),
        ReverseFixture(Blackburn, Chelsea),
        ReverseFixture(Bolton, Southampton),
        ReverseFixture(Leeds, Fulham),
        ReverseFixture(ManUnited, Sunderland),
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Fulham, ManUnited),
        ReverseFixture(Sunderland, Bolton),
        ReverseFixture(Chelsea, Leeds),
        ReverseFixture(Liverpool, Blackburn),
        ReverseFixture(Southampton, AstonVilla),
        ReverseFixture(Tottenham, ManCity),
        ReverseFixture(Boro, Newcastle),
      ),
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] =
      Map(
        CalendarDay(4849, LocalDate(2022, 7, 7)) -> Seq(TournamentRound(EnglandChamp, "тур 1")),
        CalendarDay(4851, LocalDate(2022, 7, 11)) -> Seq(TournamentRound(EnglandChamp, "тур 2")),
        CalendarDay(4853, LocalDate(2022, 7, 14)) -> Seq(TournamentRound(EnglandChamp, "тур 3")),
        CalendarDay(4855, LocalDate(2022, 7, 18)) -> Seq(TournamentRound(EnglandChamp, "тур 4")),
        CalendarDay(4857, LocalDate(2022, 7, 21)) -> Seq(TournamentRound(EnglandChamp, "тур 5")),
        CalendarDay(4860, LocalDate(2022, 7, 25)) -> Seq(TournamentRound(EnglandChamp, "тур 6")),
        CalendarDay(4862, LocalDate(2022, 7, 28)) -> Seq(TournamentRound(EnglandChamp, "тур 7")),
        CalendarDay(4864, LocalDate(2022, 8, 1)) -> Seq(TournamentRound(EnglandChamp, "тур 8")),
        CalendarDay(4866, LocalDate(2022, 8, 4)) -> Seq(TournamentRound(EnglandChamp, "тур 9")),
        CalendarDay(4868, LocalDate(2022, 8, 8)) -> Seq(TournamentRound(EnglandChamp, "тур 10")),
        CalendarDay(4870, LocalDate(2022, 8, 11)) -> Seq(TournamentRound(EnglandChamp, "тур 11")),
        CalendarDay(4872, LocalDate(2022, 8, 15)) -> Seq(TournamentRound(EnglandChamp, "тур 12")),
        CalendarDay(4874, LocalDate(2022, 8, 17)) -> Seq(TournamentRound(EnglandChamp, "тур 13")),
        CalendarDay(4879, LocalDate(2022, 8, 22)) -> Seq(TournamentRound(EnglandChamp, "тур 14")),
        CalendarDay(4881, LocalDate(2022, 8, 24)) -> Seq(TournamentRound(EnglandChamp, "тур 15")),
        CalendarDay(4883, LocalDate(2022, 8, 26)) -> Seq(TournamentRound(EnglandChamp, "тур 16")),
        CalendarDay(4885, LocalDate(2022, 8, 29)) -> Seq(TournamentRound(EnglandChamp, "тур 17")),
        CalendarDay(4887, LocalDate(2022, 8, 31)) -> Seq(TournamentRound(EnglandChamp, "тур 18")),
        CalendarDay(4889, LocalDate(2022, 9, 2)) -> Seq(TournamentRound(EnglandChamp, "тур 19")),
        CalendarDay(4891, LocalDate(2022, 9, 5)) -> Seq(TournamentRound(EnglandChamp, "тур 20")),
        CalendarDay(4893, LocalDate(2022, 9, 7)) -> Seq(TournamentRound(EnglandChamp, "тур 21")),
        CalendarDay(4895, LocalDate(2022, 9, 9)) -> Seq(TournamentRound(EnglandChamp, "тур 22")),
        CalendarDay(4897, LocalDate(2022, 9, 12)) -> Seq(TournamentRound(EnglandChamp, "тур 23")),
        CalendarDay(4899, LocalDate(2022, 9, 14)) -> Seq(TournamentRound(EnglandChamp, "тур 24")),
        CalendarDay(4901, LocalDate(2022, 9, 16)) -> Seq(TournamentRound(EnglandChamp, "тур 25")),
        CalendarDay(4903, LocalDate(2022, 9, 19)) -> Seq(TournamentRound(EnglandChamp, "тур 26")),
      )
  }

}
