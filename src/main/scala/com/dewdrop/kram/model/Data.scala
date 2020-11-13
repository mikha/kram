package com.dewdrop.kram.model

object Data {

  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }

  import Tournaments._

  object SeasonData extends Season {
    override val name = "КРАМ: 37-й сезон"
    override val version = "11.0.0"
    override val participantsOnly: Boolean = true

    private object TeamsWithMinutes {
      val Arsenal = Team(14, "Арсенал", 0)
      val AstonVilla = Team(809, "Астон Вилла", 0)
      val Birmingham = Team(23, "Бирмингем Сити", 0)
      val Blackburn = Team(862, "Блэкберн Роверс", 90)
      val Bolton = Team(40, "Болтон Уондерерс", 360)
      val WestHam = Team(195, "Вест Хэм Юнайтед", 0)
      val Liverpool = Team(143, "Ливерпуль", 270)
      val Leeds = Team(198, "Лидс Юнайтед", 270)
      val ManCity = Team(38, "Манчестер Сити", 300)
      val ManUnited = Team(88, "Манчестер Юнайтед", 0)
      val Boro = Team(432, "Мидлсбро", 0)
      val Newcastle = Team(20, "Ньюкасл Юнайтед", 0)
      val Sunderland = Team(995, "Сандерленд", 0)
      val Southampton = Team(74, "Саутгемптон", 0)
      val Tottenham = Team(19, "Тоттенхэм Хотспур", 0)
      val Fulham = Team(192, "Фулхэм", 90)
      val Chelsea = Team(70, "Челси", 360)
      val Everton = Team(803, "Эвертон", 0)
    }

    import TeamsWithMinutes._

    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Everton, ManUnited),
        Fixture(Fulham, Leeds),
        Fixture(ManCity, Blackburn),
        Fixture(Boro, Sunderland),
        Fixture(Chelsea, AstonVilla),
        Fixture(Tottenham, WestHam),
        Fixture(Liverpool, Bolton),
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Everton, Fulham),
        Fixture(ManUnited, Leeds),
        Fixture(ManCity, Chelsea),
        Fixture(AstonVilla, Boro),
        Fixture(Sunderland, Tottenham),
        Fixture(WestHam, Bolton),
        Fixture(Blackburn, Liverpool),
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(ManUnited, Boro),
        Fixture(Fulham, ManCity),
        Fixture(Leeds, Everton),
        Fixture(Chelsea, Bolton),
        Fixture(Tottenham, AstonVilla),
        Fixture(Blackburn, Sunderland),
        Fixture(Liverpool, WestHam),
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Everton, ManCity),
        Fixture(Leeds, Chelsea),
        Fixture(Boro, Fulham),
        Fixture(Tottenham, ManUnited),
        Fixture(Sunderland, Liverpool),
        Fixture(WestHam, AstonVilla),
        Fixture(Bolton, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(ManUnited, Bolton),
        Fixture(Fulham, Sunderland),
        Fixture(ManCity, Leeds),
        Fixture(AstonVilla, Everton),
        Fixture(Boro, Chelsea),
        Fixture(Blackburn, WestHam),
        Fixture(Liverpool, Tottenham),
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Everton, Boro),
        Fixture(Fulham, ManUnited),
        Fixture(Leeds, Tottenham),
        Fixture(AstonVilla, Blackburn),
        Fixture(Chelsea, Liverpool),
        Fixture(Sunderland, WestHam),
        Fixture(Bolton, ManCity),
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(ManUnited, AstonVilla),
        Fixture(Chelsea, Everton),
        Fixture(Tottenham, Bolton),
        Fixture(Sunderland, ManCity),
        Fixture(WestHam, Fulham),
        Fixture(Blackburn, Leeds),
        Fixture(Liverpool, Boro),
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Everton, Sunderland),
        Fixture(ManUnited, WestHam),
        Fixture(ManCity, Liverpool),
        Fixture(AstonVilla, Fulham),
        Fixture(Boro, Tottenham),
        Fixture(Blackburn, Chelsea),
        Fixture(Bolton, Leeds),
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(Fulham, Blackburn),
        Fixture(Leeds, Sunderland),
        Fixture(Chelsea, ManUnited),
        Fixture(Tottenham, Everton),
        Fixture(WestHam, ManCity),
        Fixture(Bolton, Boro),
        Fixture(Liverpool, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Everton, Blackburn),
        Fixture(ManCity, ManUnited),
        Fixture(AstonVilla, Leeds),
        Fixture(Boro, WestHam),
        Fixture(Tottenham, Chelsea),
        Fixture(Sunderland, Bolton),
        Fixture(Liverpool, Fulham),
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(ManUnited, Sunderland),
        Fixture(Fulham, Chelsea),
        Fixture(Leeds, Liverpool),
        Fixture(Boro, ManCity),
        Fixture(WestHam, Everton),
        Fixture(Blackburn, Tottenham),
        Fixture(Bolton, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(Leeds, WestHam),
        Fixture(AstonVilla, ManCity),
        Fixture(Chelsea, Sunderland),
        Fixture(Tottenham, Fulham),
        Fixture(Blackburn, Boro),
        Fixture(Bolton, Everton),
        Fixture(Liverpool, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Everton, Liverpool),
        Fixture(ManUnited, Blackburn),
        Fixture(Fulham, Bolton),
        Fixture(ManCity, Tottenham),
        Fixture(Boro, Leeds),
        Fixture(Chelsea, WestHam),
        Fixture(Sunderland, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Everton, ManUnited),
        ReverseFixture(Fulham, Leeds),
        ReverseFixture(ManCity, Blackburn),
        ReverseFixture(Boro, Sunderland),
        ReverseFixture(Chelsea, AstonVilla),
        ReverseFixture(Tottenham, WestHam),
        ReverseFixture(Liverpool, Bolton),
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Everton, Fulham),
        ReverseFixture(ManUnited, Leeds),
        ReverseFixture(ManCity, Chelsea),
        ReverseFixture(AstonVilla, Boro),
        ReverseFixture(Sunderland, Tottenham),
        ReverseFixture(WestHam, Bolton),
        ReverseFixture(Blackburn, Liverpool),
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(ManUnited, Boro),
        ReverseFixture(Fulham, ManCity),
        ReverseFixture(Leeds, Everton),
        ReverseFixture(Chelsea, Bolton),
        ReverseFixture(Tottenham, AstonVilla),
        ReverseFixture(Blackburn, Sunderland),
        ReverseFixture(Liverpool, WestHam),
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Everton, ManCity),
        ReverseFixture(Leeds, Chelsea),
        ReverseFixture(Boro, Fulham),
        ReverseFixture(Tottenham, ManUnited),
        ReverseFixture(Sunderland, Liverpool),
        ReverseFixture(WestHam, AstonVilla),
        ReverseFixture(Bolton, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(ManUnited, Bolton),
        ReverseFixture(Fulham, Sunderland),
        ReverseFixture(ManCity, Leeds),
        ReverseFixture(AstonVilla, Everton),
        ReverseFixture(Boro, Chelsea),
        ReverseFixture(Blackburn, WestHam),
        ReverseFixture(Liverpool, Tottenham),
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Everton, Boro),
        ReverseFixture(Fulham, ManUnited),
        ReverseFixture(Leeds, Tottenham),
        ReverseFixture(AstonVilla, Blackburn),
        ReverseFixture(Chelsea, Liverpool),
        ReverseFixture(Sunderland, WestHam),
        ReverseFixture(Bolton, ManCity),
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(ManUnited, AstonVilla),
        ReverseFixture(Chelsea, Everton),
        ReverseFixture(Tottenham, Bolton),
        ReverseFixture(Sunderland, ManCity),
        ReverseFixture(WestHam, Fulham),
        ReverseFixture(Blackburn, Leeds),
        ReverseFixture(Liverpool, Boro),
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Everton, Sunderland),
        ReverseFixture(ManUnited, WestHam),
        ReverseFixture(ManCity, Liverpool),
        ReverseFixture(AstonVilla, Fulham),
        ReverseFixture(Boro, Tottenham),
        ReverseFixture(Blackburn, Chelsea),
        ReverseFixture(Bolton, Leeds),
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(Fulham, Blackburn),
        ReverseFixture(Leeds, Sunderland),
        ReverseFixture(Chelsea, ManUnited),
        ReverseFixture(Tottenham, Everton),
        ReverseFixture(WestHam, ManCity),
        ReverseFixture(Bolton, Boro),
        ReverseFixture(Liverpool, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Everton, Blackburn),
        ReverseFixture(ManCity, ManUnited),
        ReverseFixture(AstonVilla, Leeds),
        ReverseFixture(Boro, WestHam),
        ReverseFixture(Tottenham, Chelsea),
        ReverseFixture(Sunderland, Bolton),
        ReverseFixture(Liverpool, Fulham),
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(ManUnited, Sunderland),
        ReverseFixture(Fulham, Chelsea),
        ReverseFixture(Leeds, Liverpool),
        ReverseFixture(Boro, ManCity),
        ReverseFixture(WestHam, Everton),
        ReverseFixture(Blackburn, Tottenham),
        ReverseFixture(Bolton, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(Leeds, WestHam),
        ReverseFixture(AstonVilla, ManCity),
        ReverseFixture(Chelsea, Sunderland),
        ReverseFixture(Tottenham, Fulham),
        ReverseFixture(Blackburn, Boro),
        ReverseFixture(Bolton, Everton),
        ReverseFixture(Liverpool, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Everton, Liverpool),
        ReverseFixture(ManUnited, Blackburn),
        ReverseFixture(Fulham, Bolton),
        ReverseFixture(ManCity, Tottenham),
        ReverseFixture(Boro, Leeds),
        ReverseFixture(Chelsea, WestHam),
        ReverseFixture(Sunderland, AstonVilla),
      )
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] =
      Map(
        CalendarDay(4476, LocalDate(2020, 11, 16)) -> Seq(TournamentRound(EnglandChamp, "тур 2")),
        CalendarDay(4478, LocalDate(2020, 11, 19)) -> Seq(TournamentRound(EnglandChamp, "тур 3")),
        CalendarDay(4480, LocalDate(2020, 11, 23)) -> Seq(TournamentRound(EnglandChamp, "тур 4")),
        CalendarDay(4482, LocalDate(2020, 11, 26)) -> Seq(TournamentRound(EnglandChamp, "тур 5")),
        CalendarDay(4485, LocalDate(2020, 11, 30)) -> Seq(TournamentRound(EnglandChamp, "тур 6")),
        CalendarDay(4487, LocalDate(2020, 12, 3)) -> Seq(TournamentRound(EnglandChamp, "тур 7")),
        CalendarDay(4489, LocalDate(2020, 12, 7)) -> Seq(TournamentRound(EnglandChamp, "тур 8")),
        CalendarDay(4491, LocalDate(2020, 12, 10)) -> Seq(TournamentRound(EnglandChamp, "тур 9")),
        CalendarDay(4493, LocalDate(2020, 12, 14)) -> Seq(TournamentRound(EnglandChamp, "тур 10")),
        CalendarDay(4495, LocalDate(2020, 12, 17)) -> Seq(TournamentRound(EnglandChamp, "тур 11")),
        CalendarDay(4497, LocalDate(2020, 12, 21)) -> Seq(TournamentRound(EnglandChamp, "тур 12")),
        CalendarDay(4499, LocalDate(2020, 12, 24)) -> Seq(TournamentRound(EnglandChamp, "тур 13")),
        CalendarDay(4504, LocalDate(2021, 1, 4)) -> Seq(TournamentRound(EnglandChamp, "тур 14")),
        CalendarDay(4506, LocalDate(2021, 1, 6)) -> Seq(TournamentRound(EnglandChamp, "тур 15")),
        CalendarDay(4508, LocalDate(2021, 1, 8)) -> Seq(TournamentRound(EnglandChamp, "тур 16")),
        CalendarDay(4510, LocalDate(2021, 1, 11)) -> Seq(TournamentRound(EnglandChamp, "тур 17")),
        CalendarDay(4512, LocalDate(2021, 1, 13)) -> Seq(TournamentRound(EnglandChamp, "тур 18")),
        CalendarDay(4514, LocalDate(2021, 1, 15)) -> Seq(TournamentRound(EnglandChamp, "тур 19")),
        CalendarDay(4516, LocalDate(2021, 1, 18)) -> Seq(TournamentRound(EnglandChamp, "тур 20")),
        CalendarDay(4518, LocalDate(2021, 1, 20)) -> Seq(TournamentRound(EnglandChamp, "тур 21")),
        CalendarDay(4520, LocalDate(2021, 1, 22)) -> Seq(TournamentRound(EnglandChamp, "тур 22")),
        CalendarDay(4522, LocalDate(2021, 1, 25)) -> Seq(TournamentRound(EnglandChamp, "тур 23")),
        CalendarDay(4524, LocalDate(2021, 1, 27)) -> Seq(TournamentRound(EnglandChamp, "тур 24")),
        CalendarDay(4526, LocalDate(2021, 1, 29)) -> Seq(TournamentRound(EnglandChamp, "тур 25")),
        CalendarDay(4528, LocalDate(2021, 2, 1)) -> Seq(TournamentRound(EnglandChamp, "тур 26")),
      )
  }

}
