package com.dewdrop.kram.model

object Data {
  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }
  import Tournaments._
  object SeasonData extends Season {
    override val name = "КРАМ: 33-й сезон"
    override val version = "7.0.0"
    override val participantsOnly: Boolean = true
    private object TeamsWithMinutes {
      val Arsenal = Team(14, "Арсенал", 180)
      val AstonVilla = Team(809, "Астон Вилла", 0)
      val Birmingham = Team(23, "Бирмингем Сити", 0)
      val Blackburn = Team(862, "Блэкберн Роверс", 0)
      val Bolton = Team(40, "Болтон Уондерерс", 150)
      val WestHam = Team(195, "Вест Хэм Юнайтед", 0)
      val Liverpool = Team(143, "Ливерпуль", 0)
      val Leeds = Team(198, "Лидс Юнайтед", 240)
      val ManCity = Team(38, "Манчестер Сити", 240)
      val ManUnited = Team(88, "Манчестер Юнайтед", 120)
      val Boro = Team(432, "Мидлсбро", 0)
      val Newcastle = Team(20, "Ньюкасл Юнайтед", 0)
      val Sunderland = Team(995, "Сандерленд", 0)
      val Southampton = Team(74, "Саутгемптон", 240)
      val Tottenham = Team(19, "Тоттенхэм Хотспур", 240)
      val Fulham = Team(192, "Фулхэм", 120)
      val Chelsea = Team(70, "Челси", 0)
      val Everton = Team(803, "Эвертон", 180)
    }
    import TeamsWithMinutes._
    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Boro, Tottenham),
        Fixture(Fulham, Everton),
        Fixture(Arsenal, AstonVilla),
        Fixture(Blackburn, Southampton),
        Fixture(WestHam, Leeds),
        Fixture(ManUnited, Sunderland),
        Fixture(Bolton, ManCity),
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Boro, Fulham),
        Fixture(Tottenham, Everton),
        Fixture(Arsenal, WestHam),
        Fixture(Leeds, Blackburn),
        Fixture(Southampton, ManUnited),
        Fixture(Sunderland, ManCity),
        Fixture(AstonVilla, Bolton),
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Tottenham, Blackburn),
        Fixture(Fulham, Arsenal),
        Fixture(Everton, Boro),
        Fixture(WestHam, ManCity),
        Fixture(ManUnited, Leeds),
        Fixture(AstonVilla, Southampton),
        Fixture(Bolton, Sunderland),
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Boro, Arsenal),
        Fixture(Everton, WestHam),
        Fixture(Blackburn, Fulham),
        Fixture(ManUnited, Tottenham),
        Fixture(Southampton, Bolton),
        Fixture(Sunderland, Leeds),
        Fixture(ManCity, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Tottenham, ManCity),
        Fixture(Fulham, Southampton),
        Fixture(Arsenal, Everton),
        Fixture(Leeds, Boro),
        Fixture(Blackburn, WestHam),
        Fixture(AstonVilla, Sunderland),
        Fixture(Bolton, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Boro, Blackburn),
        Fixture(Fulham, Tottenham),
        Fixture(Everton, ManUnited),
        Fixture(Leeds, AstonVilla),
        Fixture(WestHam, Bolton),
        Fixture(Southampton, Sunderland),
        Fixture(ManCity, Arsenal),
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Tottenham, Leeds),
        Fixture(WestHam, Boro),
        Fixture(ManUnited, ManCity),
        Fixture(Southampton, Arsenal),
        Fixture(Sunderland, Fulham),
        Fixture(AstonVilla, Everton),
        Fixture(Bolton, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Boro, Southampton),
        Fixture(Tottenham, Sunderland),
        Fixture(Arsenal, Bolton),
        Fixture(Leeds, Fulham),
        Fixture(Blackburn, ManUnited),
        Fixture(AstonVilla, WestHam),
        Fixture(ManCity, Everton),
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(Fulham, AstonVilla),
        Fixture(Everton, Southampton),
        Fixture(WestHam, Tottenham),
        Fixture(ManUnited, Boro),
        Fixture(Sunderland, Arsenal),
        Fixture(ManCity, Blackburn),
        Fixture(Bolton, Leeds),
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Boro, AstonVilla),
        Fixture(Arsenal, Tottenham),
        Fixture(Leeds, Everton),
        Fixture(Blackburn, Sunderland),
        Fixture(ManUnited, WestHam),
        Fixture(Southampton, ManCity),
        Fixture(Bolton, Fulham),
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Tottenham, Southampton),
        Fixture(Fulham, WestHam),
        Fixture(Everton, Bolton),
        Fixture(Blackburn, Arsenal),
        Fixture(Sunderland, Boro),
        Fixture(AstonVilla, ManUnited),
        Fixture(ManCity, Leeds),
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(Everton, Sunderland),
        Fixture(Leeds, Arsenal),
        Fixture(WestHam, Southampton),
        Fixture(ManUnited, Fulham),
        Fixture(AstonVilla, Blackburn),
        Fixture(ManCity, Boro),
        Fixture(Bolton, Tottenham),
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Boro, Bolton),
        Fixture(Tottenham, AstonVilla),
        Fixture(Fulham, ManCity),
        Fixture(Arsenal, ManUnited),
        Fixture(Blackburn, Everton),
        Fixture(WestHam, Sunderland),
        Fixture(Southampton, Leeds),
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Boro, Tottenham),
        ReverseFixture(Fulham, Everton),
        ReverseFixture(Arsenal, AstonVilla),
        ReverseFixture(Blackburn, Southampton),
        ReverseFixture(WestHam, Leeds),
        ReverseFixture(ManUnited, Sunderland),
        ReverseFixture(Bolton, ManCity),
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Boro, Fulham),
        ReverseFixture(Tottenham, Everton),
        ReverseFixture(Arsenal, WestHam),
        ReverseFixture(Leeds, Blackburn),
        ReverseFixture(Southampton, ManUnited),
        ReverseFixture(Sunderland, ManCity),
        ReverseFixture(AstonVilla, Bolton),
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(Tottenham, Blackburn),
        ReverseFixture(Fulham, Arsenal),
        ReverseFixture(Everton, Boro),
        ReverseFixture(WestHam, ManCity),
        ReverseFixture(ManUnited, Leeds),
        ReverseFixture(AstonVilla, Southampton),
        ReverseFixture(Bolton, Sunderland),
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Boro, Arsenal),
        ReverseFixture(Everton, WestHam),
        ReverseFixture(Blackburn, Fulham),
        ReverseFixture(ManUnited, Tottenham),
        ReverseFixture(Southampton, Bolton),
        ReverseFixture(Sunderland, Leeds),
        ReverseFixture(ManCity, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(Tottenham, ManCity),
        ReverseFixture(Fulham, Southampton),
        ReverseFixture(Arsenal, Everton),
        ReverseFixture(Leeds, Boro),
        ReverseFixture(Blackburn, WestHam),
        ReverseFixture(AstonVilla, Sunderland),
        ReverseFixture(Bolton, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Boro, Blackburn),
        ReverseFixture(Fulham, Tottenham),
        ReverseFixture(Everton, ManUnited),
        ReverseFixture(Leeds, AstonVilla),
        ReverseFixture(WestHam, Bolton),
        ReverseFixture(Southampton, Sunderland),
        ReverseFixture(ManCity, Arsenal),
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(Tottenham, Leeds),
        ReverseFixture(WestHam, Boro),
        ReverseFixture(ManUnited, ManCity),
        ReverseFixture(Southampton, Arsenal),
        ReverseFixture(Sunderland, Fulham),
        ReverseFixture(AstonVilla, Everton),
        ReverseFixture(Bolton, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Boro, Southampton),
        ReverseFixture(Tottenham, Sunderland),
        ReverseFixture(Arsenal, Bolton),
        ReverseFixture(Leeds, Fulham),
        ReverseFixture(Blackburn, ManUnited),
        ReverseFixture(AstonVilla, WestHam),
        ReverseFixture(ManCity, Everton),
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(Fulham, AstonVilla),
        ReverseFixture(Everton, Southampton),
        ReverseFixture(WestHam, Tottenham),
        ReverseFixture(ManUnited, Boro),
        ReverseFixture(Sunderland, Arsenal),
        ReverseFixture(ManCity, Blackburn),
        ReverseFixture(Bolton, Leeds),
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Boro, AstonVilla),
        ReverseFixture(Arsenal, Tottenham),
        ReverseFixture(Leeds, Everton),
        ReverseFixture(Blackburn, Sunderland),
        ReverseFixture(ManUnited, WestHam),
        ReverseFixture(Southampton, ManCity),
        ReverseFixture(Bolton, Fulham),
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(Tottenham, Southampton),
        ReverseFixture(Fulham, WestHam),
        ReverseFixture(Everton, Bolton),
        ReverseFixture(Blackburn, Arsenal),
        ReverseFixture(Sunderland, Boro),
        ReverseFixture(AstonVilla, ManUnited),
        ReverseFixture(ManCity, Leeds),
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(Everton, Sunderland),
        ReverseFixture(Leeds, Arsenal),
        ReverseFixture(WestHam, Southampton),
        ReverseFixture(ManUnited, Fulham),
        ReverseFixture(AstonVilla, Blackburn),
        ReverseFixture(ManCity, Boro),
        ReverseFixture(Bolton, Tottenham),
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Boro, Bolton),
        ReverseFixture(Tottenham, AstonVilla),
        ReverseFixture(Fulham, ManCity),
        ReverseFixture(Arsenal, ManUnited),
        ReverseFixture(Blackburn, Everton),
        ReverseFixture(WestHam, Sunderland),
        ReverseFixture(Southampton, Leeds),
      ),
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] = Map(
      CalendarDay(4117, LocalDate(2019, 5, 16)) -> Seq(TournamentRound(EnglandChamp, "тур 1")),
      CalendarDay(4119, LocalDate(2019, 5, 20)) -> Seq(TournamentRound(EnglandChamp, "тур 2")),
      CalendarDay(4121, LocalDate(2019, 5, 23)) -> Seq(TournamentRound(EnglandChamp, "тур 3")),
      CalendarDay(4123, LocalDate(2019, 5, 27)) -> Seq(TournamentRound(EnglandChamp, "тур 4")),
      CalendarDay(4125, LocalDate(2019, 5, 30)) -> Seq(TournamentRound(EnglandChamp, "тур 5")),
      CalendarDay(4128, LocalDate(2019, 6, 3)) -> Seq(TournamentRound(EnglandChamp, "тур 6")),
      CalendarDay(4130, LocalDate(2019, 6, 6)) -> Seq(TournamentRound(EnglandChamp, "тур 7")),
      CalendarDay(4132, LocalDate(2019, 6, 10)) -> Seq(TournamentRound(EnglandChamp, "тур 8")),
      CalendarDay(4134, LocalDate(2019, 6, 13)) -> Seq(TournamentRound(EnglandChamp, "тур 9")),
      CalendarDay(4136, LocalDate(2019, 6, 17)) -> Seq(TournamentRound(EnglandChamp, "тур 10")),
      CalendarDay(4138, LocalDate(2019, 6, 20)) -> Seq(TournamentRound(EnglandChamp, "тур 11")),
      CalendarDay(4140, LocalDate(2019, 6, 24)) -> Seq(TournamentRound(EnglandChamp, "тур 12")),
      CalendarDay(4142, LocalDate(2019, 6, 26)) -> Seq(TournamentRound(EnglandChamp, "тур 13")),
      CalendarDay(4147, LocalDate(2019, 7, 1)) -> Seq(TournamentRound(EnglandChamp, "тур 14")),
      CalendarDay(4149, LocalDate(2019, 7, 3)) -> Seq(TournamentRound(EnglandChamp, "тур 15")),
      CalendarDay(4151, LocalDate(2019, 7, 5)) -> Seq(TournamentRound(EnglandChamp, "тур 16")),
      CalendarDay(4153, LocalDate(2019, 7, 8)) -> Seq(TournamentRound(EnglandChamp, "тур 17")),
      CalendarDay(4155, LocalDate(2019, 7, 10)) -> Seq(TournamentRound(EnglandChamp, "тур 18")),
      CalendarDay(4157, LocalDate(2019, 7, 12)) -> Seq(TournamentRound(EnglandChamp, "тур 19")),
      CalendarDay(4159, LocalDate(2019, 7, 15)) -> Seq(TournamentRound(EnglandChamp, "тур 20")),
      CalendarDay(4161, LocalDate(2019, 7, 17)) -> Seq(TournamentRound(EnglandChamp, "тур 21")),
      CalendarDay(4163, LocalDate(2019, 7, 19)) -> Seq(TournamentRound(EnglandChamp, "тур 22")),
      CalendarDay(4165, LocalDate(2019, 7, 22)) -> Seq(TournamentRound(EnglandChamp, "тур 23")),
      CalendarDay(4167, LocalDate(2019, 7, 24)) -> Seq(TournamentRound(EnglandChamp, "тур 24")),
      CalendarDay(4169, LocalDate(2019, 7, 26)) -> Seq(TournamentRound(EnglandChamp, "тур 25")),
      CalendarDay(4171, LocalDate(2019, 7, 29)) -> Seq(TournamentRound(EnglandChamp, "тур 26")),
    )
  }
}
