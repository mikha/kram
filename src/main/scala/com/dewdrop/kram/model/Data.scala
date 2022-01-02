package com.dewdrop.kram.model

object Data {

  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }

  import Tournaments._

  object SeasonData extends Season {
    override val name = "КРАМ: 40-й сезон"
    override val version = "14.0.0"
    override val participantsOnly: Boolean = true

    private object TeamsWithMinutes {
      // @formatter:off
      val Arsenal =     Team(14,  "Арсенал",           0)
      val AstonVilla =  Team(809, "Астон Вилла",       180)
      val Birmingham =  Team(23,  "Бирмингем Сити",    0)
      val Blackburn =   Team(862, "Блэкберн Роверс",   0)
      val Bolton =      Team(40,  "Болтон Уондерерс",  360)
      val WestHam =     Team(195, "Вест Хэм Юнайтед",  0)
      val Liverpool =   Team(143, "Ливерпуль",         0)
      val Leeds =       Team(198, "Лидс Юнайтед",      270)
      val ManCity =     Team(38,  "Манчестер Сити",    180)
      val ManUnited =   Team(88,  "Манчестер Юнайтед", 90)
      val Boro =        Team(432, "Мидлсбро",          90)
      val Newcastle =   Team(20,  "Ньюкасл Юнайтед",   0)
      val Sunderland =  Team(995, "Сандерленд",        0)
      val Southampton = Team(74,  "Саутгемптон",       360)
      val Tottenham =   Team(19,  "Тоттенхэм Хотспур", 0)
      val Fulham =      Team(192, "Фулхэм",            0)
      val Chelsea =     Team(70,  "Челси",             0)
      val Everton =     Team(803, "Эвертон",           0)
      // @formatter:on
    }

    import TeamsWithMinutes._

    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Leeds, Blackburn),
        Fixture(Fulham, Tottenham),
        Fixture(Boro, Southampton),
        Fixture(ManUnited, Birmingham),
        Fixture(AstonVilla, Newcastle),
        Fixture(Bolton, ManCity),
        Fixture(Liverpool, Sunderland),
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Fulham, Birmingham),
        Fixture(Blackburn, Boro),
        Fixture(Tottenham, Leeds),
        Fixture(Southampton, ManCity),
        Fixture(Newcastle, ManUnited),
        Fixture(Liverpool, AstonVilla),
        Fixture(Sunderland, Bolton),
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Leeds, Boro),
        Fixture(Tottenham, Southampton),
        Fixture(Birmingham, Blackburn),
        Fixture(Newcastle, Fulham),
        Fixture(AstonVilla, Sunderland),
        Fixture(Bolton, ManUnited),
        Fixture(ManCity, Liverpool),
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Fulham, ManCity),
        Fixture(Blackburn, AstonVilla),
        Fixture(Boro, Tottenham),
        Fixture(ManUnited, Leeds),
        Fixture(Birmingham, Southampton),
        Fixture(Liverpool, Bolton),
        Fixture(Sunderland, Newcastle),
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Leeds, Birmingham),
        Fixture(Blackburn, Fulham),
        Fixture(Tottenham, Newcastle),
        Fixture(ManUnited, Liverpool),
        Fixture(Southampton, Sunderland),
        Fixture(AstonVilla, Bolton),
        Fixture(ManCity, Boro),
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Fulham, ManUnited),
        Fixture(Southampton, Leeds),
        Fixture(Newcastle, ManCity),
        Fixture(AstonVilla, Boro),
        Fixture(Bolton, Blackburn),
        Fixture(Liverpool, Tottenham),
        Fixture(Sunderland, Birmingham),
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Leeds, AstonVilla),
        Fixture(Fulham, Bolton),
        Fixture(Boro, Sunderland),
        Fixture(ManUnited, Blackburn),
        Fixture(Birmingham, Newcastle),
        Fixture(Liverpool, Southampton),
        Fixture(ManCity, Tottenham),
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(Blackburn, Liverpool),
        Fixture(Tottenham, AstonVilla),
        Fixture(Southampton, Fulham),
        Fixture(Newcastle, Leeds),
        Fixture(Bolton, Boro),
        Fixture(ManCity, Birmingham),
        Fixture(Sunderland, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Leeds, Liverpool),
        Fixture(Boro, Fulham),
        Fixture(ManUnited, Tottenham),
        Fixture(Birmingham, Bolton),
        Fixture(Newcastle, Southampton),
        Fixture(AstonVilla, ManCity),
        Fixture(Sunderland, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Fulham, AstonVilla),
        Fixture(Blackburn, Southampton),
        Fixture(Tottenham, Sunderland),
        Fixture(Birmingham, Boro),
        Fixture(Bolton, Leeds),
        Fixture(Liverpool, Newcastle),
        Fixture(ManCity, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(Tottenham, Bolton),
        Fixture(ManUnited, Boro),
        Fixture(Southampton, AstonVilla),
        Fixture(Newcastle, Blackburn),
        Fixture(Liverpool, Birmingham),
        Fixture(ManCity, Leeds),
        Fixture(Sunderland, Fulham),
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Leeds, Sunderland),
        Fixture(Fulham, Liverpool),
        Fixture(Blackburn, ManCity),
        Fixture(Boro, Newcastle),
        Fixture(Birmingham, Tottenham),
        Fixture(Southampton, Bolton),
        Fixture(AstonVilla, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Leeds, Fulham),
        ReverseFixture(Blackburn, Tottenham),
        ReverseFixture(Boro, Liverpool),
        ReverseFixture(Birmingham, AstonVilla),
        ReverseFixture(Southampton, ManUnited),
        ReverseFixture(Newcastle, Bolton),
        ReverseFixture(Sunderland, ManCity),
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Leeds, Blackburn),
        ReverseFixture(Fulham, Tottenham),
        ReverseFixture(Boro, Southampton),
        ReverseFixture(ManUnited, Birmingham),
        ReverseFixture(AstonVilla, Newcastle),
        ReverseFixture(Bolton, ManCity),
        ReverseFixture(Liverpool, Sunderland),
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(Fulham, Birmingham),
        ReverseFixture(Blackburn, Boro),
        ReverseFixture(Tottenham, Leeds),
        ReverseFixture(Southampton, ManCity),
        ReverseFixture(Newcastle, ManUnited),
        ReverseFixture(Liverpool, AstonVilla),
        ReverseFixture(Sunderland, Bolton),
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Leeds, Boro),
        ReverseFixture(Tottenham, Southampton),
        ReverseFixture(Birmingham, Blackburn),
        ReverseFixture(Newcastle, Fulham),
        ReverseFixture(AstonVilla, Sunderland),
        ReverseFixture(Bolton, ManUnited),
        ReverseFixture(ManCity, Liverpool),
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(Fulham, ManCity),
        ReverseFixture(Blackburn, AstonVilla),
        ReverseFixture(Boro, Tottenham),
        ReverseFixture(ManUnited, Leeds),
        ReverseFixture(Birmingham, Southampton),
        ReverseFixture(Liverpool, Bolton),
        ReverseFixture(Sunderland, Newcastle),
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Leeds, Birmingham),
        ReverseFixture(Blackburn, Fulham),
        ReverseFixture(Tottenham, Newcastle),
        ReverseFixture(ManUnited, Liverpool),
        ReverseFixture(Southampton, Sunderland),
        ReverseFixture(AstonVilla, Bolton),
        ReverseFixture(ManCity, Boro),
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(Fulham, ManUnited),
        ReverseFixture(Southampton, Leeds),
        ReverseFixture(Newcastle, ManCity),
        ReverseFixture(AstonVilla, Boro),
        ReverseFixture(Bolton, Blackburn),
        ReverseFixture(Liverpool, Tottenham),
        ReverseFixture(Sunderland, Birmingham),
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Leeds, AstonVilla),
        ReverseFixture(Fulham, Bolton),
        ReverseFixture(Boro, Sunderland),
        ReverseFixture(ManUnited, Blackburn),
        ReverseFixture(Birmingham, Newcastle),
        ReverseFixture(Liverpool, Southampton),
        ReverseFixture(ManCity, Tottenham),
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(Blackburn, Liverpool),
        ReverseFixture(Tottenham, AstonVilla),
        ReverseFixture(Southampton, Fulham),
        ReverseFixture(Newcastle, Leeds),
        ReverseFixture(Bolton, Boro),
        ReverseFixture(ManCity, Birmingham),
        ReverseFixture(Sunderland, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Leeds, Liverpool),
        ReverseFixture(Boro, Fulham),
        ReverseFixture(ManUnited, Tottenham),
        ReverseFixture(Birmingham, Bolton),
        ReverseFixture(Newcastle, Southampton),
        ReverseFixture(AstonVilla, ManCity),
        ReverseFixture(Sunderland, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(Fulham, AstonVilla),
        ReverseFixture(Blackburn, Southampton),
        ReverseFixture(Tottenham, Sunderland),
        ReverseFixture(Birmingham, Boro),
        ReverseFixture(Bolton, Leeds),
        ReverseFixture(Liverpool, Newcastle),
        ReverseFixture(ManCity, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(Tottenham, Bolton),
        ReverseFixture(ManUnited, Boro),
        ReverseFixture(Southampton, AstonVilla),
        ReverseFixture(Newcastle, Blackburn),
        ReverseFixture(Liverpool, Birmingham),
        ReverseFixture(ManCity, Leeds),
        ReverseFixture(Sunderland, Fulham),
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Leeds, Sunderland),
        ReverseFixture(Fulham, Liverpool),
        ReverseFixture(Blackburn, ManCity),
        ReverseFixture(Boro, Newcastle),
        ReverseFixture(Birmingham, Tottenham),
        ReverseFixture(Southampton, Bolton),
        ReverseFixture(AstonVilla, ManUnited),
      ),
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] =
      Map(
        CalendarDay(4742, LocalDate(2021, 12, 29)) -> Seq(TournamentRound(EnglandChamp, "тур 1")),
        CalendarDay(4744, LocalDate(2022, 1, 4)) -> Seq(TournamentRound(EnglandChamp, "тур 2")),
        CalendarDay(4746, LocalDate(2022, 1, 6)) -> Seq(TournamentRound(EnglandChamp, "тур 3")),
        CalendarDay(4748, LocalDate(2022, 1, 10)) -> Seq(TournamentRound(EnglandChamp, "тур 4")),
        CalendarDay(4750, LocalDate(2022, 1, 13)) -> Seq(TournamentRound(EnglandChamp, "тур 5")),
        CalendarDay(4753, LocalDate(2022, 1, 17)) -> Seq(TournamentRound(EnglandChamp, "тур 6")),
        CalendarDay(4755, LocalDate(2022, 1, 21)) -> Seq(TournamentRound(EnglandChamp, "тур 7")),
        CalendarDay(4757, LocalDate(2022, 1, 24)) -> Seq(TournamentRound(EnglandChamp, "тур 8")),
        CalendarDay(4759, LocalDate(2022, 1, 27)) -> Seq(TournamentRound(EnglandChamp, "тур 9")),
        CalendarDay(4761, LocalDate(2022, 1, 31)) -> Seq(TournamentRound(EnglandChamp, "тур 10")),
        CalendarDay(4763, LocalDate(2022, 2, 3)) -> Seq(TournamentRound(EnglandChamp, "тур 11")),
        CalendarDay(4765, LocalDate(2022, 2, 7)) -> Seq(TournamentRound(EnglandChamp, "тур 12")),
        CalendarDay(4767, LocalDate(2022, 2, 9)) -> Seq(TournamentRound(EnglandChamp, "тур 13")),
        CalendarDay(4772, LocalDate(2022, 2, 14)) -> Seq(TournamentRound(EnglandChamp, "тур 14")),
        CalendarDay(4774, LocalDate(2022, 2, 16)) -> Seq(TournamentRound(EnglandChamp, "тур 15")),
        CalendarDay(4776, LocalDate(2022, 2, 18)) -> Seq(TournamentRound(EnglandChamp, "тур 16")),
        CalendarDay(4778, LocalDate(2022, 2, 21)) -> Seq(TournamentRound(EnglandChamp, "тур 17")),
        CalendarDay(4780, LocalDate(2022, 2, 23)) -> Seq(TournamentRound(EnglandChamp, "тур 18")),
        CalendarDay(4782, LocalDate(2022, 2, 25)) -> Seq(TournamentRound(EnglandChamp, "тур 19")),
        CalendarDay(4784, LocalDate(2022, 2, 28)) -> Seq(TournamentRound(EnglandChamp, "тур 20")),
        CalendarDay(4786, LocalDate(2022, 3, 2)) -> Seq(TournamentRound(EnglandChamp, "тур 21")),
        CalendarDay(4788, LocalDate(2022, 3, 4)) -> Seq(TournamentRound(EnglandChamp, "тур 22")),
        CalendarDay(4790, LocalDate(2022, 3, 7)) -> Seq(TournamentRound(EnglandChamp, "тур 23")),
        CalendarDay(4792, LocalDate(2022, 3, 9)) -> Seq(TournamentRound(EnglandChamp, "тур 24")),
        CalendarDay(4794, LocalDate(2022, 3, 11)) -> Seq(TournamentRound(EnglandChamp, "тур 25")),
        CalendarDay(4796, LocalDate(2022, 3, 14)) -> Seq(TournamentRound(EnglandChamp, "тур 26")),
      )
  }

}
