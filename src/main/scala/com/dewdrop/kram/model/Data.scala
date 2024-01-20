package com.dewdrop.kram.model

object Data {

  object Tournaments {
    val EnglandChamp: Tournament = Tournament(6, "Чемпионат Англии")
    val GreatBritain: Tournament = Tournament(70, "2D.Великобритания")
  }

  import Tournaments._

  object SeasonData extends Season {
    override val name = "КРАМ: 45-й сезон"
    override val version = "17.0.0"
    override val participantsOnly: Boolean = true

    private object TeamsWithMinutes {
      // @formatter:off
      val Arsenal: Team =     Team(14,  "Арсенал",           360)
      val AstonVilla: Team =  Team(809, "Астон Вилла",       270)
      val Birmingham: Team =  Team(23,  "Бирмингем Сити",    360)
      val Blackburn: Team =   Team(862, "Блэкберн Роверс",   180)
      val Bolton: Team =      Team(40,  "Болтон Уондерерс",  180)
      val WestHam: Team =     Team(195, "Вест Хэм Юнайтед",  0)
      val Liverpool: Team =   Team(143, "Ливерпуль",         180)
      val Leeds: Team =       Team(198, "Лидс Юнайтед",      90)
      val ManCity: Team =     Team(38,  "Манчестер Сити",    90)
      val ManUnited: Team =   Team(88,  "Манчестер Юнайтед", 360)
      val Boro: Team =        Team(432, "Мидлсбро",          360)
      val Newcastle: Team =   Team(20,  "Ньюкасл Юнайтед",   0)
      val Sunderland: Team =  Team(995, "Сандерленд",        0)
      val Southampton: Team = Team(74,  "Саутгемптон",       180)
      val Tottenham: Team =   Team(19,  "Тоттенхэм Хотспур", 180)
      val Fulham: Team =      Team(192, "Фулхэм",            180)
      val Chelsea: Team =     Team(70,  "Челси",             90)
      val Everton: Team =     Team(803, "Эвертон",           360)
      // @formatter:on
    }

    import TeamsWithMinutes._

    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, 1) -> Seq(
        Fixture(Boro, Blackburn),
        Fixture(Liverpool, Fulham),
        Fixture(ManCity, Bolton),
        Fixture(ManUnited, Newcastle),
        Fixture(Sunderland, Southampton),
        Fixture(AstonVilla, Tottenham),
        Fixture(Chelsea, Leeds),
      ),
      TournamentRound(EnglandChamp, 2) -> Seq(
        Fixture(Boro, Liverpool),
        Fixture(Blackburn, Fulham),
        Fixture(ManCity, Sunderland),
        Fixture(Southampton, ManUnited),
        Fixture(Newcastle, AstonVilla),
        Fixture(Tottenham, Leeds),
        Fixture(Bolton, Chelsea),
      ),
      TournamentRound(EnglandChamp, 3) -> Seq(
        Fixture(Blackburn, ManUnited),
        Fixture(Liverpool, ManCity),
        Fixture(Fulham, Boro),
        Fixture(Sunderland, Leeds),
        Fixture(AstonVilla, Southampton),
        Fixture(Bolton, Newcastle),
        Fixture(Chelsea, Tottenham),
      ),
      TournamentRound(EnglandChamp, 4) -> Seq(
        Fixture(Boro, ManCity),
        Fixture(Fulham, Sunderland),
        Fixture(ManUnited, Liverpool),
        Fixture(AstonVilla, Blackburn),
        Fixture(Newcastle, Chelsea),
        Fixture(Tottenham, Southampton),
        Fixture(Leeds, Bolton),
      ),
      TournamentRound(EnglandChamp, 5) -> Seq(
        Fixture(Blackburn, Leeds),
        Fixture(Liverpool, Newcastle),
        Fixture(ManCity, Fulham),
        Fixture(Southampton, Boro),
        Fixture(ManUnited, Sunderland),
        Fixture(Bolton, Tottenham),
        Fixture(Chelsea, AstonVilla),
      ),
      TournamentRound(EnglandChamp, 6) -> Seq(
        Fixture(Boro, ManUnited),
        Fixture(Liverpool, Blackburn),
        Fixture(Fulham, AstonVilla),
        Fixture(Southampton, Bolton),
        Fixture(Sunderland, Chelsea),
        Fixture(Newcastle, Tottenham),
        Fixture(Leeds, ManCity),
      ),
      TournamentRound(EnglandChamp, 7) -> Seq(
        Fixture(Blackburn, Southampton),
        Fixture(Sunderland, Boro),
        Fixture(AstonVilla, Leeds),
        Fixture(Newcastle, ManCity),
        Fixture(Tottenham, Liverpool),
        Fixture(Bolton, Fulham),
        Fixture(Chelsea, ManUnited),
      ),
      TournamentRound(EnglandChamp, 8) -> Seq(
        Fixture(Boro, Newcastle),
        Fixture(Blackburn, Tottenham),
        Fixture(ManCity, Chelsea),
        Fixture(Southampton, Liverpool),
        Fixture(ManUnited, AstonVilla),
        Fixture(Bolton, Sunderland),
        Fixture(Leeds, Fulham),
      ),
      TournamentRound(EnglandChamp, 9) -> Seq(
        Fixture(Liverpool, Bolton),
        Fixture(Fulham, Newcastle),
        Fixture(Sunderland, Blackburn),
        Fixture(AstonVilla, Boro),
        Fixture(Tottenham, ManCity),
        Fixture(Leeds, ManUnited),
        Fixture(Chelsea, Southampton),
      ),
      TournamentRound(EnglandChamp, 10) -> Seq(
        Fixture(Boro, Bolton),
        Fixture(ManCity, Blackburn),
        Fixture(Southampton, Fulham),
        Fixture(ManUnited, Tottenham),
        Fixture(AstonVilla, Sunderland),
        Fixture(Newcastle, Leeds),
        Fixture(Chelsea, Liverpool),
      ),
      TournamentRound(EnglandChamp, 11) -> Seq(
        Fixture(Blackburn, Newcastle),
        Fixture(Liverpool, Sunderland),
        Fixture(Fulham, Chelsea),
        Fixture(ManUnited, ManCity),
        Fixture(Tottenham, Boro),
        Fixture(Bolton, AstonVilla),
        Fixture(Leeds, Southampton),
      ),
      TournamentRound(EnglandChamp, 12) -> Seq(
        Fixture(Fulham, Tottenham),
        Fixture(Southampton, ManCity),
        Fixture(Sunderland, Newcastle),
        Fixture(AstonVilla, Liverpool),
        Fixture(Bolton, ManUnited),
        Fixture(Leeds, Boro),
        Fixture(Chelsea, Blackburn),
      ),
      TournamentRound(EnglandChamp, 13) -> Seq(
        Fixture(Boro, Chelsea),
        Fixture(Blackburn, Bolton),
        Fixture(Liverpool, Leeds),
        Fixture(ManCity, AstonVilla),
        Fixture(ManUnited, Fulham),
        Fixture(Sunderland, Tottenham),
        Fixture(Newcastle, Southampton),
      ),
      TournamentRound(EnglandChamp, 14) -> Seq(
        ReverseFixture(Boro, Blackburn),
        ReverseFixture(Liverpool, Fulham),
        ReverseFixture(ManCity, Bolton),
        ReverseFixture(ManUnited, Newcastle),
        ReverseFixture(Sunderland, Southampton),
        ReverseFixture(AstonVilla, Tottenham),
        ReverseFixture(Chelsea, Leeds),
      ),
      TournamentRound(EnglandChamp, 15) -> Seq(
        ReverseFixture(Boro, Liverpool),
        ReverseFixture(Blackburn, Fulham),
        ReverseFixture(ManCity, Sunderland),
        ReverseFixture(Southampton, ManUnited),
        ReverseFixture(Newcastle, AstonVilla),
        ReverseFixture(Tottenham, Leeds),
        ReverseFixture(Bolton, Chelsea),
      ),
      TournamentRound(EnglandChamp, 16) -> Seq(
        ReverseFixture(Blackburn, ManUnited),
        ReverseFixture(Liverpool, ManCity),
        ReverseFixture(Fulham, Boro),
        ReverseFixture(Sunderland, Leeds),
        ReverseFixture(AstonVilla, Southampton),
        ReverseFixture(Bolton, Newcastle),
        ReverseFixture(Chelsea, Tottenham),
      ),
      TournamentRound(EnglandChamp, 17) -> Seq(
        ReverseFixture(Boro, ManCity),
        ReverseFixture(Fulham, Sunderland),
        ReverseFixture(ManUnited, Liverpool),
        ReverseFixture(AstonVilla, Blackburn),
        ReverseFixture(Newcastle, Chelsea),
        ReverseFixture(Tottenham, Southampton),
        ReverseFixture(Leeds, Bolton),
      ),
      TournamentRound(EnglandChamp, 18) -> Seq(
        ReverseFixture(Blackburn, Leeds),
        ReverseFixture(Liverpool, Newcastle),
        ReverseFixture(ManCity, Fulham),
        ReverseFixture(Southampton, Boro),
        ReverseFixture(ManUnited, Sunderland),
        ReverseFixture(Bolton, Tottenham),
        ReverseFixture(Chelsea, AstonVilla),
      ),
      TournamentRound(EnglandChamp, 19) -> Seq(
        ReverseFixture(Boro, ManUnited),
        ReverseFixture(Liverpool, Blackburn),
        ReverseFixture(Fulham, AstonVilla),
        ReverseFixture(Southampton, Bolton),
        ReverseFixture(Sunderland, Chelsea),
        ReverseFixture(Newcastle, Tottenham),
        ReverseFixture(Leeds, ManCity),
      ),
      TournamentRound(EnglandChamp, 20) -> Seq(
        ReverseFixture(Blackburn, Southampton),
        ReverseFixture(Sunderland, Boro),
        ReverseFixture(AstonVilla, Leeds),
        ReverseFixture(Newcastle, ManCity),
        ReverseFixture(Tottenham, Liverpool),
        ReverseFixture(Bolton, Fulham),
        ReverseFixture(Chelsea, ManUnited),
      ),
      TournamentRound(EnglandChamp, 21) -> Seq(
        ReverseFixture(Boro, Newcastle),
        ReverseFixture(Blackburn, Tottenham),
        ReverseFixture(ManCity, Chelsea),
        ReverseFixture(Southampton, Liverpool),
        ReverseFixture(ManUnited, AstonVilla),
        ReverseFixture(Bolton, Sunderland),
        ReverseFixture(Leeds, Fulham),
      ),
      TournamentRound(EnglandChamp, 22) -> Seq(
        ReverseFixture(Liverpool, Bolton),
        ReverseFixture(Fulham, Newcastle),
        ReverseFixture(Sunderland, Blackburn),
        ReverseFixture(AstonVilla, Boro),
        ReverseFixture(Tottenham, ManCity),
        ReverseFixture(Leeds, ManUnited),
        ReverseFixture(Chelsea, Southampton),
      ),
      TournamentRound(EnglandChamp, 23) -> Seq(
        ReverseFixture(Boro, Bolton),
        ReverseFixture(ManCity, Blackburn),
        ReverseFixture(Southampton, Fulham),
        ReverseFixture(ManUnited, Tottenham),
        ReverseFixture(AstonVilla, Sunderland),
        ReverseFixture(Newcastle, Leeds),
        ReverseFixture(Chelsea, Liverpool),
      ),
      TournamentRound(EnglandChamp, 24) -> Seq(
        ReverseFixture(Blackburn, Newcastle),
        ReverseFixture(Liverpool, Sunderland),
        ReverseFixture(Fulham, Chelsea),
        ReverseFixture(ManUnited, ManCity),
        ReverseFixture(Tottenham, Boro),
        ReverseFixture(Bolton, AstonVilla),
        ReverseFixture(Leeds, Southampton),
      ),
      TournamentRound(EnglandChamp, 25) -> Seq(
        ReverseFixture(Fulham, Tottenham),
        ReverseFixture(Southampton, ManCity),
        ReverseFixture(Sunderland, Newcastle),
        ReverseFixture(AstonVilla, Liverpool),
        ReverseFixture(Bolton, ManUnited),
        ReverseFixture(Leeds, Boro),
        ReverseFixture(Chelsea, Blackburn),
      ),
      TournamentRound(EnglandChamp, 26) -> Seq(
        ReverseFixture(Boro, Chelsea),
        ReverseFixture(Blackburn, Bolton),
        ReverseFixture(Liverpool, Leeds),
        ReverseFixture(ManCity, AstonVilla),
        ReverseFixture(ManUnited, Fulham),
        ReverseFixture(Sunderland, Tottenham),
        ReverseFixture(Newcastle, Southampton),
      ),
      TournamentRound(GreatBritain, 2) -> Seq(
        Fixture(Arsenal, Birmingham),
      ),
      TournamentRound(GreatBritain, 8) -> Seq(
        Fixture(Birmingham, Everton),
      ),
      TournamentRound(GreatBritain, 10) -> Seq(
        Fixture(Everton, Arsenal),
      ),
      TournamentRound(GreatBritain, 17) -> Seq(
        ReverseFixture(Arsenal, Birmingham),
      ),
      TournamentRound(GreatBritain, 23) -> Seq(
        ReverseFixture(Birmingham, Everton),
      ),
      TournamentRound(GreatBritain, 25) -> Seq(
        ReverseFixture(Everton, Arsenal),
      ),
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] =
      Map(
        CalendarDay(5206, LocalDate(2024, 1, 25)) -> Seq(TournamentRound(EnglandChamp, 1), TournamentRound(GreatBritain, 2)),
        CalendarDay(5208, LocalDate(2024, 1, 29)) -> Seq(TournamentRound(EnglandChamp, 2)),
        CalendarDay(5210, LocalDate(2024, 2, 1)) -> Seq(TournamentRound(EnglandChamp, 3)),
        CalendarDay(5212, LocalDate(2024, 2, 5)) -> Seq(TournamentRound(EnglandChamp, 4)),
        CalendarDay(5214, LocalDate(2024, 2, 8)) -> Seq(TournamentRound(EnglandChamp, 5)),
        CalendarDay(5216, LocalDate(2024, 2, 12)) -> Seq(TournamentRound(EnglandChamp, 6), TournamentRound(GreatBritain, 8)),
        CalendarDay(5218, LocalDate(2024, 2, 15)) -> Seq(TournamentRound(EnglandChamp, 7)),
        CalendarDay(5220, LocalDate(2024, 2, 19)) -> Seq(TournamentRound(EnglandChamp, 8), TournamentRound(GreatBritain, 10)),
        CalendarDay(5222, LocalDate(2024, 2, 22)) -> Seq(TournamentRound(EnglandChamp, 9)),
        CalendarDay(5224, LocalDate(2024, 2, 26)) -> Seq(TournamentRound(EnglandChamp, 10)),
        CalendarDay(5226, LocalDate(2024, 2, 29)) -> Seq(TournamentRound(EnglandChamp, 11)),
        CalendarDay(5228, LocalDate(2024, 3, 4)) -> Seq(TournamentRound(EnglandChamp, 12)),
        CalendarDay(5230, LocalDate(2024, 3, 6)) -> Seq(TournamentRound(EnglandChamp, 13)),
        CalendarDay(5234, LocalDate(2024, 3, 11)) -> Seq(TournamentRound(EnglandChamp, 14)),
        CalendarDay(5236, LocalDate(2024, 3, 13)) -> Seq(TournamentRound(EnglandChamp, 15), TournamentRound(GreatBritain, 17)),
        CalendarDay(5238, LocalDate(2024, 3, 15)) -> Seq(TournamentRound(EnglandChamp, 16)),
        CalendarDay(5240, LocalDate(2024, 3, 18)) -> Seq(TournamentRound(EnglandChamp, 17)),
        CalendarDay(5242, LocalDate(2024, 3, 20)) -> Seq(TournamentRound(EnglandChamp, 18)),
        CalendarDay(5244, LocalDate(2024, 3, 22)) -> Seq(TournamentRound(EnglandChamp, 19)),
        CalendarDay(5246, LocalDate(2024, 3, 25)) -> Seq(TournamentRound(EnglandChamp, 20)),
        CalendarDay(5248, LocalDate(2024, 3, 27)) -> Seq(TournamentRound(EnglandChamp, 21), TournamentRound(GreatBritain, 23)),
        CalendarDay(5250, LocalDate(2024, 3, 29)) -> Seq(TournamentRound(EnglandChamp, 22), TournamentRound(GreatBritain, 25)),
        CalendarDay(5252, LocalDate(2024, 4, 1)) -> Seq(TournamentRound(EnglandChamp, 23)),
        CalendarDay(5254, LocalDate(2024, 4, 3)) -> Seq(TournamentRound(EnglandChamp, 24)),
        CalendarDay(5256, LocalDate(2024, 4, 5)) -> Seq(TournamentRound(EnglandChamp, 25)),
        CalendarDay(5258, LocalDate(2024, 4, 8)) -> Seq(TournamentRound(EnglandChamp, 26)),
      )
  }

}
