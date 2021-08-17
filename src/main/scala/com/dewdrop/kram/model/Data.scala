package com.dewdrop.kram.model

object Data {

  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }

  import Tournaments._

  object SeasonData extends Season {
    override val name = "КРАМ: 39-й сезон"
    override val version = "13.0.0"
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
      val Leeds =       Team(198, "Лидс Юнайтед",      270)
      val ManCity =     Team(38,  "Манчестер Сити",    135)
      val ManUnited =   Team(88,  "Манчестер Юнайтед", 0)
      val Boro =        Team(432, "Мидлсбро",          90)
      val Newcastle =   Team(20,  "Ньюкасл Юнайтед",   0)
      val Sunderland =  Team(995, "Сандерленд",        0)
      val Southampton = Team(74,  "Саутгемптон",       360)
      val Tottenham =   Team(19,  "Тоттенхэм Хотспур", 0)
      val Fulham =      Team(192, "Фулхэм",            0)
      val Chelsea =     Team(70,  "Челси",             360)
      val Everton =     Team(803, "Эвертон",           0)
      // @formatter:on
    }

    import TeamsWithMinutes._

    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Boro, Tottenham),
        Fixture(Bolton, Liverpool),
        Fixture(ManCity, Chelsea),
        Fixture(Southampton, ManUnited),
        Fixture(Newcastle, Sunderland),
        Fixture(Fulham, Blackburn),
        Fixture(Leeds, AstonVilla)
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Boro, Bolton),
        Fixture(Tottenham, Liverpool),
        Fixture(ManCity, Newcastle),
        Fixture(Sunderland, Southampton),
        Fixture(ManUnited, Fulham),
        Fixture(Blackburn, AstonVilla),
        Fixture(Chelsea, Leeds)
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Tottenham, Southampton),
        Fixture(Bolton, ManCity),
        Fixture(Liverpool, Boro),
        Fixture(Newcastle, AstonVilla),
        Fixture(Fulham, Sunderland),
        Fixture(Chelsea, ManUnited),
        Fixture(Leeds, Blackburn)
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Boro, ManCity),
        Fixture(Liverpool, Newcastle),
        Fixture(Southampton, Bolton),
        Fixture(Fulham, Tottenham),
        Fixture(ManUnited, Leeds),
        Fixture(Blackburn, Sunderland),
        Fixture(AstonVilla, Chelsea)
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Tottenham, AstonVilla),
        Fixture(Bolton, ManUnited),
        Fixture(ManCity, Liverpool),
        Fixture(Sunderland, Boro),
        Fixture(Southampton, Newcastle),
        Fixture(Chelsea, Blackburn),
        Fixture(Leeds, Fulham)
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Boro, Southampton),
        Fixture(Bolton, Tottenham),
        Fixture(Liverpool, Fulham),
        Fixture(Sunderland, Chelsea),
        Fixture(Newcastle, Leeds),
        Fixture(ManUnited, Blackburn),
        Fixture(AstonVilla, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Tottenham, Sunderland),
        Fixture(Newcastle, Boro),
        Fixture(Fulham, AstonVilla),
        Fixture(ManUnited, ManCity),
        Fixture(Blackburn, Bolton),
        Fixture(Chelsea, Liverpool),
        Fixture(Leeds, Southampton)
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Boro, ManUnited),
        Fixture(Tottenham, Blackburn),
        Fixture(ManCity, Leeds),
        Fixture(Sunderland, Bolton),
        Fixture(Southampton, Fulham),
        Fixture(Chelsea, Newcastle),
        Fixture(AstonVilla, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(Bolton, Chelsea),
        Fixture(Liverpool, ManUnited),
        Fixture(Newcastle, Tottenham),
        Fixture(Fulham, Boro),
        Fixture(Blackburn, ManCity),
        Fixture(AstonVilla, Southampton),
        Fixture(Leeds, Sunderland)
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Boro, Chelsea),
        Fixture(ManCity, Tottenham),
        Fixture(Sunderland, Liverpool),
        Fixture(Southampton, Blackburn),
        Fixture(Fulham, Newcastle),
        Fixture(ManUnited, AstonVilla),
        Fixture(Leeds, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Tottenham, ManUnited),
        Fixture(Bolton, Newcastle),
        Fixture(Liverpool, Leeds),
        Fixture(Southampton, ManCity),
        Fixture(Blackburn, Boro),
        Fixture(Chelsea, Fulham),
        Fixture(AstonVilla, Sunderland)
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(Liverpool, Blackburn),
        Fixture(Sunderland, ManCity),
        Fixture(Newcastle, ManUnited),
        Fixture(Fulham, Bolton),
        Fixture(Chelsea, Southampton),
        Fixture(AstonVilla, Boro),
        Fixture(Leeds, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Boro, Leeds),
        Fixture(Tottenham, Chelsea),
        Fixture(Bolton, AstonVilla),
        Fixture(ManCity, Fulham),
        Fixture(Southampton, Liverpool),
        Fixture(Newcastle, Blackburn),
        Fixture(ManUnited, Sunderland),
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Boro, Tottenham),
        ReverseFixture(Bolton, Liverpool),
        ReverseFixture(ManCity, Chelsea),
        ReverseFixture(Southampton, ManUnited),
        ReverseFixture(Newcastle, Sunderland),
        ReverseFixture(Fulham, Blackburn),
        ReverseFixture(Leeds, AstonVilla)
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Boro, Bolton),
        ReverseFixture(Tottenham, Liverpool),
        ReverseFixture(ManCity, Newcastle),
        ReverseFixture(Sunderland, Southampton),
        ReverseFixture(ManUnited, Fulham),
        ReverseFixture(Blackburn, AstonVilla),
        ReverseFixture(Chelsea, Leeds)
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(Tottenham, Southampton),
        ReverseFixture(Bolton, ManCity),
        ReverseFixture(Liverpool, Boro),
        ReverseFixture(Newcastle, AstonVilla),
        ReverseFixture(Fulham, Sunderland),
        ReverseFixture(Chelsea, ManUnited),
        ReverseFixture(Leeds, Blackburn)
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Boro, ManCity),
        ReverseFixture(Liverpool, Newcastle),
        ReverseFixture(Southampton, Bolton),
        ReverseFixture(Fulham, Tottenham),
        ReverseFixture(ManUnited, Leeds),
        ReverseFixture(Blackburn, Sunderland),
        ReverseFixture(AstonVilla, Chelsea)
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(Tottenham, AstonVilla),
        ReverseFixture(Bolton, ManUnited),
        ReverseFixture(ManCity, Liverpool),
        ReverseFixture(Sunderland, Boro),
        ReverseFixture(Southampton, Newcastle),
        ReverseFixture(Chelsea, Blackburn),
        ReverseFixture(Leeds, Fulham)
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Boro, Southampton),
        ReverseFixture(Bolton, Tottenham),
        ReverseFixture(Liverpool, Fulham),
        ReverseFixture(Sunderland, Chelsea),
        ReverseFixture(Newcastle, Leeds),
        ReverseFixture(ManUnited, Blackburn),
        ReverseFixture(AstonVilla, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(Tottenham, Sunderland),
        ReverseFixture(Newcastle, Boro),
        ReverseFixture(Fulham, AstonVilla),
        ReverseFixture(ManUnited, ManCity),
        ReverseFixture(Blackburn, Bolton),
        ReverseFixture(Chelsea, Liverpool),
        ReverseFixture(Leeds, Southampton)
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Boro, ManUnited),
        ReverseFixture(Tottenham, Blackburn),
        ReverseFixture(ManCity, Leeds),
        ReverseFixture(Sunderland, Bolton),
        ReverseFixture(Southampton, Fulham),
        ReverseFixture(Chelsea, Newcastle),
        ReverseFixture(AstonVilla, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(Bolton, Chelsea),
        ReverseFixture(Liverpool, ManUnited),
        ReverseFixture(Newcastle, Tottenham),
        ReverseFixture(Fulham, Boro),
        ReverseFixture(Blackburn, ManCity),
        ReverseFixture(AstonVilla, Southampton),
        ReverseFixture(Leeds, Sunderland)
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Boro, Chelsea),
        ReverseFixture(ManCity, Tottenham),
        ReverseFixture(Sunderland, Liverpool),
        ReverseFixture(Southampton, Blackburn),
        ReverseFixture(Fulham, Newcastle),
        ReverseFixture(ManUnited, AstonVilla),
        ReverseFixture(Leeds, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(Tottenham, ManUnited),
        ReverseFixture(Bolton, Newcastle),
        ReverseFixture(Liverpool, Leeds),
        ReverseFixture(Southampton, ManCity),
        ReverseFixture(Blackburn, Boro),
        ReverseFixture(Chelsea, Fulham),
        ReverseFixture(AstonVilla, Sunderland)
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(Liverpool, Blackburn),
        ReverseFixture(Sunderland, ManCity),
        ReverseFixture(Newcastle, ManUnited),
        ReverseFixture(Fulham, Bolton),
        ReverseFixture(Chelsea, Southampton),
        ReverseFixture(AstonVilla, Boro),
        ReverseFixture(Leeds, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Boro, Leeds),
        ReverseFixture(Tottenham, Chelsea),
        ReverseFixture(Bolton, AstonVilla),
        ReverseFixture(ManCity, Fulham),
        ReverseFixture(Southampton, Liverpool),
        ReverseFixture(Newcastle, Blackburn),
        ReverseFixture(ManUnited, Sunderland),
      ),
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] =
      Map(
        CalendarDay(4649, LocalDate(2021, 8, 19)) -> Seq(TournamentRound(EnglandChamp, "тур 1")),
        CalendarDay(4651, LocalDate(2021, 8, 23)) -> Seq(TournamentRound(EnglandChamp, "тур 2")),
        CalendarDay(4653, LocalDate(2021, 8, 26)) -> Seq(TournamentRound(EnglandChamp, "тур 3")),
        CalendarDay(4655, LocalDate(2021, 8, 30)) -> Seq(TournamentRound(EnglandChamp, "тур 4")),
        CalendarDay(4657, LocalDate(2021, 9, 2)) -> Seq(TournamentRound(EnglandChamp, "тур 5")),
        CalendarDay(4660, LocalDate(2021, 9, 6)) -> Seq(TournamentRound(EnglandChamp, "тур 6")),
        CalendarDay(4662, LocalDate(2021, 9, 9)) -> Seq(TournamentRound(EnglandChamp, "тур 7")),
        CalendarDay(4664, LocalDate(2021, 9, 13)) -> Seq(TournamentRound(EnglandChamp, "тур 8")),
        CalendarDay(4666, LocalDate(2021, 9, 16)) -> Seq(TournamentRound(EnglandChamp, "тур 9")),
        CalendarDay(4668, LocalDate(2021, 9, 20)) -> Seq(TournamentRound(EnglandChamp, "тур 10")),
        CalendarDay(4670, LocalDate(2021, 9, 23)) -> Seq(TournamentRound(EnglandChamp, "тур 11")),
        CalendarDay(4672, LocalDate(2021, 9, 27)) -> Seq(TournamentRound(EnglandChamp, "тур 12")),
        CalendarDay(4674, LocalDate(2021, 9, 29)) -> Seq(TournamentRound(EnglandChamp, "тур 13")),
        CalendarDay(4679, LocalDate(2021, 10, 4)) -> Seq(TournamentRound(EnglandChamp, "тур 14")),
        CalendarDay(4681, LocalDate(2021, 10, 6)) -> Seq(TournamentRound(EnglandChamp, "тур 15")),
        CalendarDay(4683, LocalDate(2021, 10, 8)) -> Seq(TournamentRound(EnglandChamp, "тур 16")),
        CalendarDay(4685, LocalDate(2021, 10, 11)) -> Seq(TournamentRound(EnglandChamp, "тур 17")),
        CalendarDay(4687, LocalDate(2021, 10, 13)) -> Seq(TournamentRound(EnglandChamp, "тур 18")),
        CalendarDay(4689, LocalDate(2021, 10, 15)) -> Seq(TournamentRound(EnglandChamp, "тур 19")),
        CalendarDay(4691, LocalDate(2021, 10, 18)) -> Seq(TournamentRound(EnglandChamp, "тур 20")),
        CalendarDay(4693, LocalDate(2021, 10, 20)) -> Seq(TournamentRound(EnglandChamp, "тур 21")),
        CalendarDay(4695, LocalDate(2021, 10, 22)) -> Seq(TournamentRound(EnglandChamp, "тур 22")),
        CalendarDay(4697, LocalDate(2021, 10, 25)) -> Seq(TournamentRound(EnglandChamp, "тур 23")),
        CalendarDay(4699, LocalDate(2021, 10, 27)) -> Seq(TournamentRound(EnglandChamp, "тур 24")),
        CalendarDay(4701, LocalDate(2021, 10, 29)) -> Seq(TournamentRound(EnglandChamp, "тур 25")),
        CalendarDay(4703, LocalDate(2021, 11, 1)) -> Seq(TournamentRound(EnglandChamp, "тур 26")),
      )
  }

}
