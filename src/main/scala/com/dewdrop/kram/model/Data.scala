package com.dewdrop.kram.model

object Data {
  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }
  import Tournaments._
  object SeasonData extends Season {
    override val name = "КРАМ: 35-й сезон"
    override val version = "9.0.0"
    override val participantsOnly: Boolean = true
    private object TeamsWithMinutes {
      val Arsenal = Team(14, "Арсенал", 270)
      val AstonVilla = Team(809, "Астон Вилла", 90)
      val Birmingham = Team(23, "Бирмингем Сити", 90)
      val Blackburn = Team(862, "Блэкберн Роверс", 0)
      val Bolton = Team(40, "Болтон Уондерерс", 270)
      val WestHam = Team(195, "Вест Хэм Юнайтед", 90)
      val Liverpool = Team(143, "Ливерпуль", 180)
      val Leeds = Team(198, "Лидс Юнайтед", 0)
      val ManCity = Team(38, "Манчестер Сити", 270)
      val ManUnited = Team(88, "Манчестер Юнайтед", 90)
      val Boro = Team(432, "Мидлсбро", 180)
      val Newcastle = Team(20, "Ньюкасл Юнайтед", 0)
      val Sunderland = Team(995, "Сандерленд", 0)
      val Southampton = Team(74, "Саутгемптон", 0)
      val Tottenham = Team(19, "Тоттенхэм Хотспур", 180)
      val Fulham = Team(192, "Фулхэм", 270)
      val Chelsea = Team(70, "Челси", 0)
      val Everton = Team(803, "Эвертон", 90)
    }
    import TeamsWithMinutes._
    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Bolton, Sunderland),
        Fixture(Liverpool, Fulham),
        Fixture(Arsenal, Tottenham),
        Fixture(Birmingham, Everton),
        Fixture(WestHam, ManCity),
        Fixture(ManUnited, Boro),
        Fixture(Blackburn, AstonVilla)
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Bolton, Liverpool),
        Fixture(Sunderland, Fulham),
        Fixture(Arsenal, WestHam),
        Fixture(ManCity, Birmingham),
        Fixture(Everton, ManUnited),
        Fixture(Boro, AstonVilla),
        Fixture(Tottenham, Blackburn)
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Sunderland, Birmingham),
        Fixture(Liverpool, Arsenal),
        Fixture(Fulham, Bolton),
        Fixture(WestHam, AstonVilla),
        Fixture(ManUnited, ManCity),
        Fixture(Tottenham, Everton),
        Fixture(Blackburn, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Bolton, Arsenal),
        Fixture(Fulham, WestHam),
        Fixture(Birmingham, Liverpool),
        Fixture(ManUnited, Sunderland),
        Fixture(Everton, Blackburn),
        Fixture(Boro, ManCity),
        Fixture(AstonVilla, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Sunderland, AstonVilla),
        Fixture(Liverpool, Everton),
        Fixture(Arsenal, Fulham),
        Fixture(ManCity, Bolton),
        Fixture(Birmingham, WestHam),
        Fixture(Tottenham, Boro),
        Fixture(Blackburn, ManUnited)
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Bolton, Birmingham),
        Fixture(Liverpool, Sunderland),
        Fixture(Fulham, ManUnited),
        Fixture(ManCity, Tottenham),
        Fixture(WestHam, Blackburn),
        Fixture(Everton, Boro),
        Fixture(AstonVilla, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Sunderland, ManCity),
        Fixture(WestHam, Bolton),
        Fixture(ManUnited, AstonVilla),
        Fixture(Everton, Arsenal),
        Fixture(Boro, Liverpool),
        Fixture(Tottenham, Fulham),
        Fixture(Blackburn, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Bolton, Everton),
        Fixture(Sunderland, Boro),
        Fixture(Arsenal, Blackburn),
        Fixture(ManCity, Liverpool),
        Fixture(Birmingham, ManUnited),
        Fixture(Tottenham, WestHam),
        Fixture(AstonVilla, Fulham)
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(Liverpool, Tottenham),
        Fixture(Fulham, Everton),
        Fixture(WestHam, Sunderland),
        Fixture(ManUnited, Bolton),
        Fixture(Boro, Arsenal),
        Fixture(AstonVilla, Birmingham),
        Fixture(Blackburn, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Bolton, Tottenham),
        Fixture(Arsenal, Sunderland),
        Fixture(ManCity, Fulham),
        Fixture(Birmingham, Boro),
        Fixture(ManUnited, WestHam),
        Fixture(Everton, AstonVilla),
        Fixture(Blackburn, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Sunderland, Everton),
        Fixture(Liverpool, WestHam),
        Fixture(Fulham, Blackburn),
        Fixture(Birmingham, Arsenal),
        Fixture(Boro, Bolton),
        Fixture(Tottenham, ManUnited),
        Fixture(AstonVilla, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(Fulham, Boro),
        Fixture(ManCity, Arsenal),
        Fixture(WestHam, Everton),
        Fixture(ManUnited, Liverpool),
        Fixture(Tottenham, Birmingham),
        Fixture(AstonVilla, Bolton),
        Fixture(Blackburn, Sunderland)
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Bolton, Blackburn),
        Fixture(Sunderland, Tottenham),
        Fixture(Liverpool, AstonVilla),
        Fixture(Arsenal, ManUnited),
        Fixture(Birmingham, Fulham),
        Fixture(WestHam, Boro),
        Fixture(Everton, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Bolton, Sunderland),
        ReverseFixture(Liverpool, Fulham),
        ReverseFixture(Arsenal, Tottenham),
        ReverseFixture(Birmingham, Everton),
        ReverseFixture(WestHam, ManCity),
        ReverseFixture(ManUnited, Boro),
        ReverseFixture(Blackburn, AstonVilla)
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Bolton, Liverpool),
        ReverseFixture(Sunderland, Fulham),
        ReverseFixture(Arsenal, WestHam),
        ReverseFixture(ManCity, Birmingham),
        ReverseFixture(Everton, ManUnited),
        ReverseFixture(Boro, AstonVilla),
        ReverseFixture(Tottenham, Blackburn)
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(Sunderland, Birmingham),
        ReverseFixture(Liverpool, Arsenal),
        ReverseFixture(Fulham, Bolton),
        ReverseFixture(WestHam, AstonVilla),
        ReverseFixture(ManUnited, ManCity),
        ReverseFixture(Tottenham, Everton),
        ReverseFixture(Blackburn, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Bolton, Arsenal),
        ReverseFixture(Fulham, WestHam),
        ReverseFixture(Birmingham, Liverpool),
        ReverseFixture(ManUnited, Sunderland),
        ReverseFixture(Everton, Blackburn),
        ReverseFixture(Boro, ManCity),
        ReverseFixture(AstonVilla, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(Sunderland, AstonVilla),
        ReverseFixture(Liverpool, Everton),
        ReverseFixture(Arsenal, Fulham),
        ReverseFixture(ManCity, Bolton),
        ReverseFixture(Birmingham, WestHam),
        ReverseFixture(Tottenham, Boro),
        ReverseFixture(Blackburn, ManUnited)
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Bolton, Birmingham),
        ReverseFixture(Liverpool, Sunderland),
        ReverseFixture(Fulham, ManUnited),
        ReverseFixture(ManCity, Tottenham),
        ReverseFixture(WestHam, Blackburn),
        ReverseFixture(Everton, Boro),
        ReverseFixture(AstonVilla, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(Sunderland, ManCity),
        ReverseFixture(WestHam, Bolton),
        ReverseFixture(ManUnited, AstonVilla),
        ReverseFixture(Everton, Arsenal),
        ReverseFixture(Boro, Liverpool),
        ReverseFixture(Tottenham, Fulham),
        ReverseFixture(Blackburn, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Bolton, Everton),
        ReverseFixture(Sunderland, Boro),
        ReverseFixture(Arsenal, Blackburn),
        ReverseFixture(ManCity, Liverpool),
        ReverseFixture(Birmingham, ManUnited),
        ReverseFixture(Tottenham, WestHam),
        ReverseFixture(AstonVilla, Fulham)
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(Liverpool, Tottenham),
        ReverseFixture(Fulham, Everton),
        ReverseFixture(WestHam, Sunderland),
        ReverseFixture(ManUnited, Bolton),
        ReverseFixture(Boro, Arsenal),
        ReverseFixture(AstonVilla, Birmingham),
        ReverseFixture(Blackburn, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Bolton, Tottenham),
        ReverseFixture(Arsenal, Sunderland),
        ReverseFixture(ManCity, Fulham),
        ReverseFixture(Birmingham, Boro),
        ReverseFixture(ManUnited, WestHam),
        ReverseFixture(Everton, AstonVilla),
        ReverseFixture(Blackburn, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(Sunderland, Everton),
        ReverseFixture(Liverpool, WestHam),
        ReverseFixture(Fulham, Blackburn),
        ReverseFixture(Birmingham, Arsenal),
        ReverseFixture(Boro, Bolton),
        ReverseFixture(Tottenham, ManUnited),
        ReverseFixture(AstonVilla, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(Fulham, Boro),
        ReverseFixture(ManCity, Arsenal),
        ReverseFixture(WestHam, Everton),
        ReverseFixture(ManUnited, Liverpool),
        ReverseFixture(Tottenham, Birmingham),
        ReverseFixture(AstonVilla, Bolton),
        ReverseFixture(Blackburn, Sunderland)
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Bolton, Blackburn),
        ReverseFixture(Sunderland, Tottenham),
        ReverseFixture(Liverpool, AstonVilla),
        ReverseFixture(Arsenal, ManUnited),
        ReverseFixture(Birmingham, Fulham),
        ReverseFixture(WestHam, Boro),
        ReverseFixture(Everton, ManCity)
      )
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] =
      Map(
        CalendarDay(4303, LocalDate(2020, 2, 27)) -> Seq(
          TournamentRound(EnglandChamp, "тур 1")
        ),
        CalendarDay(4305, LocalDate(2020, 3, 2)) -> Seq(
          TournamentRound(EnglandChamp, "тур 2")
        ),
        CalendarDay(4307, LocalDate(2020, 3, 5)) -> Seq(
          TournamentRound(EnglandChamp, "тур 3")
        ),
        CalendarDay(4309, LocalDate(2020, 3, 9)) -> Seq(
          TournamentRound(EnglandChamp, "тур 4")
        ),
        CalendarDay(4311, LocalDate(2020, 3, 12)) -> Seq(
          TournamentRound(EnglandChamp, "тур 5")
        ),
        CalendarDay(4314, LocalDate(2020, 3, 16)) -> Seq(
          TournamentRound(EnglandChamp, "тур 6")
        ),
        CalendarDay(4316, LocalDate(2020, 3, 19)) -> Seq(
          TournamentRound(EnglandChamp, "тур 7")
        ),
        CalendarDay(4318, LocalDate(2020, 3, 23)) -> Seq(
          TournamentRound(EnglandChamp, "тур 8")
        ),
        CalendarDay(4320, LocalDate(2020, 3, 26)) -> Seq(
          TournamentRound(EnglandChamp, "тур 9")
        ),
        CalendarDay(4322, LocalDate(2020, 3, 30)) -> Seq(
          TournamentRound(EnglandChamp, "тур 10")
        ),
        CalendarDay(4324, LocalDate(2020, 4, 2)) -> Seq(
          TournamentRound(EnglandChamp, "тур 11")
        ),
        CalendarDay(4326, LocalDate(2020, 4, 6)) -> Seq(
          TournamentRound(EnglandChamp, "тур 12")
        ),
        CalendarDay(4328, LocalDate(2020, 4, 8)) -> Seq(
          TournamentRound(EnglandChamp, "тур 13")
        ),
        CalendarDay(4333, LocalDate(2020, 4, 13)) -> Seq(
          TournamentRound(EnglandChamp, "тур 14")
        ),
        CalendarDay(4335, LocalDate(2020, 4, 15)) -> Seq(
          TournamentRound(EnglandChamp, "тур 15")
        ),
        CalendarDay(4337, LocalDate(2020, 4, 17)) -> Seq(
          TournamentRound(EnglandChamp, "тур 16")
        ),
        CalendarDay(4339, LocalDate(2020, 4, 20)) -> Seq(
          TournamentRound(EnglandChamp, "тур 17")
        ),
        CalendarDay(4341, LocalDate(2020, 4, 22)) -> Seq(
          TournamentRound(EnglandChamp, "тур 18")
        ),
        CalendarDay(4343, LocalDate(2020, 4, 24)) -> Seq(
          TournamentRound(EnglandChamp, "тур 19")
        ),
        CalendarDay(4345, LocalDate(2020, 4, 27)) -> Seq(
          TournamentRound(EnglandChamp, "тур 20")
        ),
        CalendarDay(4347, LocalDate(2020, 4, 29)) -> Seq(
          TournamentRound(EnglandChamp, "тур 21")
        ),
        CalendarDay(4349, LocalDate(2020, 5, 1)) -> Seq(
          TournamentRound(EnglandChamp, "тур 22")
        ),
        CalendarDay(4351, LocalDate(2020, 5, 4)) -> Seq(
          TournamentRound(EnglandChamp, "тур 23")
        ),
        CalendarDay(4353, LocalDate(2020, 5, 6)) -> Seq(
          TournamentRound(EnglandChamp, "тур 24")
        ),
        CalendarDay(4355, LocalDate(2020, 5, 8)) -> Seq(
          TournamentRound(EnglandChamp, "тур 25")
        ),
        CalendarDay(4357, LocalDate(2020, 5, 11)) -> Seq(
          TournamentRound(EnglandChamp, "тур 26")
        ),
      )
  }
}
