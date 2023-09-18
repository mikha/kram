package com.dewdrop.kram.model

object Data {

  object Tournaments {
    val EnglandChamp: Tournament = Tournament(6, "Чемпионат Англии")
    val GreatBritain: Tournament = Tournament(70, "2D.Великобритания")
  }

  import Tournaments._

  object SeasonData extends Season {
    override val name = "КРАМ: 44-й сезон"
    override val version = "16.0.1"
    override val participantsOnly: Boolean = true

    private object TeamsWithMinutes {
      // @formatter:off
      val Arsenal: Team =     Team(14,  "Арсенал",           0)
      val AstonVilla: Team =  Team(809, "Астон Вилла",       3 -> 90)
      val Birmingham: Team =  Team(23,  "Бирмингем Сити",    0)
      val Blackburn: Team =   Team(862, "Блэкберн Роверс",   3 -> 180)
      val Bolton: Team =      Team(40,  "Болтон Уондерерс",  3 -> 120)
      val WestHam: Team =     Team(195, "Вест Хэм Юнайтед",  0)
      val Liverpool: Team =   Team(143, "Ливерпуль",         3 -> 180)
      val Leeds: Team =       Team(198, "Лидс Юнайтед",      0)
      val ManCity: Team =     Team(38,  "Манчестер Сити",    3 -> 90)
      val ManUnited: Team =   Team(88,  "Манчестер Юнайтед", 3 -> 360)
      val Boro: Team =        Team(432, "Мидлсбро",          0)
      val Newcastle: Team =   Team(20,  "Ньюкасл Юнайтед",   0)
      val Sunderland: Team =  Team(995, "Сандерленд",        0)
      val Southampton: Team = Team(74,  "Саутгемптон",       3 -> 360)
      val Tottenham: Team =   Team(19,  "Тоттенхэм Хотспур", 3 -> 180)
      val Fulham: Team =      Team(192, "Фулхэм",            3 -> 270)
      val Chelsea: Team =     Team(70,  "Челси",             3 -> 120)
      val Everton: Team =     Team(803, "Эвертон",           3 -> 360)
      // @formatter:on
    }

    import TeamsWithMinutes._

    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, 1) -> Seq(
        Fixture(Newcastle, Blackburn),
        Fixture(Sunderland, Chelsea),
        Fixture(Bolton, Tottenham),
        Fixture(Southampton, Everton),
        Fixture(ManUnited, Leeds),
        Fixture(AstonVilla, ManCity),
        Fixture(Fulham, Liverpool),
      ),
      TournamentRound(EnglandChamp, 2) -> Seq(
        Fixture(Newcastle, Sunderland),
        Fixture(Blackburn, Chelsea),
        Fixture(Bolton, ManUnited),
        Fixture(Leeds, Southampton),
        Fixture(Everton, AstonVilla),
        Fixture(ManCity, Liverpool),
        Fixture(Tottenham, Fulham),
      ),
      TournamentRound(EnglandChamp, 3) -> Seq(
        Fixture(Blackburn, Southampton),
        Fixture(Sunderland, Bolton),
        Fixture(Chelsea, Newcastle),
        Fixture(ManUnited, Liverpool),
        Fixture(AstonVilla, Leeds),
        Fixture(Tottenham, Everton),
        Fixture(Fulham, ManCity),
      ),
      TournamentRound(EnglandChamp, 4) -> Seq(
        Fixture(Newcastle, Bolton),
        Fixture(Chelsea, ManUnited),
        Fixture(Southampton, Sunderland),
        Fixture(AstonVilla, Blackburn),
        Fixture(Everton, Fulham),
        Fixture(ManCity, Leeds),
        Fixture(Liverpool, Tottenham),
      ),
      TournamentRound(EnglandChamp, 5) -> Seq(
        Fixture(Blackburn, Liverpool),
        Fixture(Sunderland, Everton),
        Fixture(Bolton, Chelsea),
        Fixture(Leeds, Newcastle),
        Fixture(Southampton, ManUnited),
        Fixture(Tottenham, ManCity),
        Fixture(Fulham, AstonVilla),
      ),
      TournamentRound(EnglandChamp, 6) -> Seq(
        Fixture(Newcastle, Southampton),
        Fixture(Sunderland, Blackburn),
        Fixture(Chelsea, AstonVilla),
        Fixture(Leeds, Tottenham),
        Fixture(ManUnited, Fulham),
        Fixture(Everton, ManCity),
        Fixture(Liverpool, Bolton),
      ),
      TournamentRound(EnglandChamp, 7) -> Seq(
        Fixture(Blackburn, Leeds),
        Fixture(ManUnited, Newcastle),
        Fixture(AstonVilla, Liverpool),
        Fixture(Everton, Bolton),
        Fixture(ManCity, Sunderland),
        Fixture(Tottenham, Chelsea),
        Fixture(Fulham, Southampton),
      ),
      TournamentRound(EnglandChamp, 8) -> Seq(
        Fixture(Newcastle, Everton),
        Fixture(Blackburn, ManCity),
        Fixture(Bolton, Fulham),
        Fixture(Leeds, Sunderland),
        Fixture(Southampton, AstonVilla),
        Fixture(Tottenham, ManUnited),
        Fixture(Liverpool, Chelsea),
      ),
      TournamentRound(EnglandChamp, 9) -> Seq(
        Fixture(Sunderland, Tottenham),
        Fixture(Chelsea, Everton),
        Fixture(ManUnited, Blackburn),
        Fixture(AstonVilla, Newcastle),
        Fixture(ManCity, Bolton),
        Fixture(Liverpool, Southampton),
        Fixture(Fulham, Leeds),
      ),
      TournamentRound(EnglandChamp, 10) -> Seq(
        Fixture(Newcastle, Tottenham),
        Fixture(Bolton, Blackburn),
        Fixture(Leeds, Chelsea),
        Fixture(Southampton, ManCity),
        Fixture(AstonVilla, ManUnited),
        Fixture(Everton, Liverpool),
        Fixture(Fulham, Sunderland),
      ),
      TournamentRound(EnglandChamp, 11) -> Seq(
        Fixture(Blackburn, Everton),
        Fixture(Sunderland, ManUnited),
        Fixture(Chelsea, Fulham),
        Fixture(Southampton, Bolton),
        Fixture(ManCity, Newcastle),
        Fixture(Tottenham, AstonVilla),
        Fixture(Liverpool, Leeds),
      ),
      TournamentRound(EnglandChamp, 12) -> Seq(
        Fixture(Chelsea, ManCity),
        Fixture(Leeds, Bolton),
        Fixture(ManUnited, Everton),
        Fixture(AstonVilla, Sunderland),
        Fixture(Tottenham, Southampton),
        Fixture(Liverpool, Newcastle),
        Fixture(Fulham, Blackburn),
      ),
      TournamentRound(EnglandChamp, 13) -> Seq(
        Fixture(Newcastle, Fulham),
        Fixture(Blackburn, Tottenham),
        Fixture(Sunderland, Liverpool),
        Fixture(Bolton, AstonVilla),
        Fixture(Southampton, Chelsea),
        Fixture(ManUnited, ManCity),
        Fixture(Everton, Leeds),
      ),
      TournamentRound(EnglandChamp, 14) -> Seq(
        ReverseFixture(Newcastle, Blackburn),
        ReverseFixture(Sunderland, Chelsea),
        ReverseFixture(Bolton, Tottenham),
        ReverseFixture(Southampton, Everton),
        ReverseFixture(ManUnited, Leeds),
        ReverseFixture(AstonVilla, ManCity),
        ReverseFixture(Fulham, Liverpool),
      ),
      TournamentRound(EnglandChamp, 15) -> Seq(
        ReverseFixture(Newcastle, Sunderland),
        ReverseFixture(Blackburn, Chelsea),
        ReverseFixture(Bolton, ManUnited),
        ReverseFixture(Leeds, Southampton),
        ReverseFixture(Everton, AstonVilla),
        ReverseFixture(ManCity, Liverpool),
        ReverseFixture(Tottenham, Fulham),
      ),
      TournamentRound(EnglandChamp, 16) -> Seq(
        ReverseFixture(Blackburn, Southampton),
        ReverseFixture(Sunderland, Bolton),
        ReverseFixture(Chelsea, Newcastle),
        ReverseFixture(ManUnited, Liverpool),
        ReverseFixture(AstonVilla, Leeds),
        ReverseFixture(Tottenham, Everton),
        ReverseFixture(Fulham, ManCity),
      ),
      TournamentRound(EnglandChamp, 17) -> Seq(
        ReverseFixture(Newcastle, Bolton),
        ReverseFixture(Chelsea, ManUnited),
        ReverseFixture(Southampton, Sunderland),
        ReverseFixture(AstonVilla, Blackburn),
        ReverseFixture(Everton, Fulham),
        ReverseFixture(ManCity, Leeds),
        ReverseFixture(Liverpool, Tottenham),
      ),
      TournamentRound(EnglandChamp, 18) -> Seq(
        ReverseFixture(Blackburn, Liverpool),
        ReverseFixture(Sunderland, Everton),
        ReverseFixture(Bolton, Chelsea),
        ReverseFixture(Leeds, Newcastle),
        ReverseFixture(Southampton, ManUnited),
        ReverseFixture(Tottenham, ManCity),
        ReverseFixture(Fulham, AstonVilla),
      ),
      TournamentRound(EnglandChamp, 19) -> Seq(
        ReverseFixture(Newcastle, Southampton),
        ReverseFixture(Sunderland, Blackburn),
        ReverseFixture(Chelsea, AstonVilla),
        ReverseFixture(Leeds, Tottenham),
        ReverseFixture(ManUnited, Fulham),
        ReverseFixture(Everton, ManCity),
        ReverseFixture(Liverpool, Bolton),
      ),
      TournamentRound(EnglandChamp, 20) -> Seq(
        ReverseFixture(Blackburn, Leeds),
        ReverseFixture(ManUnited, Newcastle),
        ReverseFixture(AstonVilla, Liverpool),
        ReverseFixture(Everton, Bolton),
        ReverseFixture(ManCity, Sunderland),
        ReverseFixture(Tottenham, Chelsea),
        ReverseFixture(Fulham, Southampton),
      ),
      TournamentRound(EnglandChamp, 21) -> Seq(
        ReverseFixture(Newcastle, Everton),
        ReverseFixture(Blackburn, ManCity),
        ReverseFixture(Bolton, Fulham),
        ReverseFixture(Leeds, Sunderland),
        ReverseFixture(Southampton, AstonVilla),
        ReverseFixture(Tottenham, ManUnited),
        ReverseFixture(Liverpool, Chelsea),
      ),
      TournamentRound(EnglandChamp, 22) -> Seq(
        ReverseFixture(Sunderland, Tottenham),
        ReverseFixture(Chelsea, Everton),
        ReverseFixture(ManUnited, Blackburn),
        ReverseFixture(AstonVilla, Newcastle),
        ReverseFixture(ManCity, Bolton),
        ReverseFixture(Liverpool, Southampton),
        ReverseFixture(Fulham, Leeds),
      ),
      TournamentRound(EnglandChamp, 23) -> Seq(
        ReverseFixture(Newcastle, Tottenham),
        ReverseFixture(Bolton, Blackburn),
        ReverseFixture(Leeds, Chelsea),
        ReverseFixture(Southampton, ManCity),
        ReverseFixture(AstonVilla, ManUnited),
        ReverseFixture(Everton, Liverpool),
        ReverseFixture(Fulham, Sunderland),
      ),
      TournamentRound(EnglandChamp, 24) -> Seq(
        ReverseFixture(Blackburn, Everton),
        ReverseFixture(Sunderland, ManUnited),
        ReverseFixture(Chelsea, Fulham),
        ReverseFixture(Southampton, Bolton),
        ReverseFixture(ManCity, Newcastle),
        ReverseFixture(Tottenham, AstonVilla),
        ReverseFixture(Liverpool, Leeds),
      ),
      TournamentRound(EnglandChamp, 25) -> Seq(
        ReverseFixture(Chelsea, ManCity),
        ReverseFixture(Leeds, Bolton),
        ReverseFixture(ManUnited, Everton),
        ReverseFixture(AstonVilla, Sunderland),
        ReverseFixture(Tottenham, Southampton),
        ReverseFixture(Liverpool, Newcastle),
        ReverseFixture(Fulham, Blackburn),
      ),
      TournamentRound(EnglandChamp, 26) -> Seq(
        ReverseFixture(Newcastle, Fulham),
        ReverseFixture(Blackburn, Tottenham),
        ReverseFixture(Sunderland, Liverpool),
        ReverseFixture(Bolton, AstonVilla),
        ReverseFixture(Southampton, Chelsea),
        ReverseFixture(ManUnited, ManCity),
        ReverseFixture(Everton, Leeds),
      ),
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] =
      Map(
        CalendarDay(5121, LocalDate(2023, 9, 14)) -> Seq(TournamentRound(EnglandChamp, 1)),
        CalendarDay(5123, LocalDate(2023, 9, 18)) -> Seq(TournamentRound(EnglandChamp, 2)),
        CalendarDay(5125, LocalDate(2023, 9, 21)) -> Seq(TournamentRound(EnglandChamp, 3)),
        CalendarDay(5127, LocalDate(2023, 9, 25)) -> Seq(TournamentRound(EnglandChamp, 4)),
        CalendarDay(5129, LocalDate(2023, 9, 28)) -> Seq(TournamentRound(EnglandChamp, 5)),
        CalendarDay(5131, LocalDate(2023, 10, 2)) -> Seq(TournamentRound(EnglandChamp, 6)),
        CalendarDay(5133, LocalDate(2023, 10, 5)) -> Seq(TournamentRound(EnglandChamp, 7)),
        CalendarDay(5135, LocalDate(2023, 10, 9)) -> Seq(TournamentRound(EnglandChamp, 8)),
        CalendarDay(5137, LocalDate(2023, 10, 12)) -> Seq(TournamentRound(EnglandChamp, 9)),
        CalendarDay(5139, LocalDate(2023, 10, 16)) -> Seq(TournamentRound(EnglandChamp, 10)),
        CalendarDay(5141, LocalDate(2023, 10, 19)) -> Seq(TournamentRound(EnglandChamp, 11)),
        CalendarDay(5143, LocalDate(2023, 10, 23)) -> Seq(TournamentRound(EnglandChamp, 12)),
        CalendarDay(5145, LocalDate(2023, 10, 25)) -> Seq(TournamentRound(EnglandChamp, 13)),
        CalendarDay(5149, LocalDate(2023, 10, 30)) -> Seq(TournamentRound(EnglandChamp, 14)),
        CalendarDay(5151, LocalDate(2023, 11, 1)) -> Seq(TournamentRound(EnglandChamp, 15)),
        CalendarDay(5153, LocalDate(2023, 11, 3)) -> Seq(TournamentRound(EnglandChamp, 16)),
        CalendarDay(5155, LocalDate(2023, 11, 6)) -> Seq(TournamentRound(EnglandChamp, 17)),
        CalendarDay(5157, LocalDate(2023, 11, 8)) -> Seq(TournamentRound(EnglandChamp, 18)),
        CalendarDay(5159, LocalDate(2023, 11, 10)) -> Seq(TournamentRound(EnglandChamp, 19)),
        CalendarDay(5161, LocalDate(2023, 11, 13)) -> Seq(TournamentRound(EnglandChamp, 20)),
        CalendarDay(5163, LocalDate(2023, 11, 15)) -> Seq(TournamentRound(EnglandChamp, 21)),
        CalendarDay(5165, LocalDate(2023, 11, 17)) -> Seq(TournamentRound(EnglandChamp, 22)),
        CalendarDay(5167, LocalDate(2023, 11, 20)) -> Seq(TournamentRound(EnglandChamp, 23)),
        CalendarDay(5169, LocalDate(2023, 11, 22)) -> Seq(TournamentRound(EnglandChamp, 24)),
        CalendarDay(5171, LocalDate(2023, 11, 24)) -> Seq(TournamentRound(EnglandChamp, 25)),
        CalendarDay(5173, LocalDate(2023, 11, 27)) -> Seq(TournamentRound(EnglandChamp, 26)),
      )
  }

}
