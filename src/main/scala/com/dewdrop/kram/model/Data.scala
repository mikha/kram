package com.dewdrop.kram.model

object Data {
  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }
  import Tournaments._
  object Season29 extends Season {
    override val name = "КРАМ: 29-й сезон"
    override val version = "4.0.2"
    override val participantsOnly: Boolean = true
    private object TeamsWithMinutes {
      val Arsenal = Team(14, "Арсенал", 90)
      val AstonVilla = Team(809, "Астон Вилла", 0)
      val Birmingham = Team(23, "Бирмингем Сити", 0)
      val Blackburn = Team(862, "Блэкберн Роверс", 0)
      val Bolton = Team(40, "Болтон Уондерерс", 0)
      val WestHam = Team(195, "Вест Хэм Юнайтед", 0)
      val Liverpool = Team(143, "Ливерпуль", 180)
      val Leeds = Team(198, "Лидс Юнайтед", 90)
      val ManCity = Team(38, "Манчестер Сити", 180)
      val ManUnited = Team(88, "Манчестер Юнайтед", 0)
      val Boro = Team(432, "Мидлсбро", 90)
      val Newcastle = Team(20, "Ньюкасл Юнайтед", 0)
      val Sunderland = Team(995, "Сандерленд", 0)
      val Southampton = Team(74, "Саутгемптон", 360)
      val Tottenham = Team(19, "Тоттенхэм Хотспур", 360)
      val Fulham = Team(192, "Фулхэм", 270)
      val Chelsea = Team(70, "Челси", 0)
      val Everton = Team(803, "Эвертон", 180)
    }
    import TeamsWithMinutes._
    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Chelsea, Liverpool),
        Fixture(Fulham, Bolton),
        Fixture(Arsenal, Birmingham),
        Fixture(Southampton, ManUnited),
        Fixture(Everton, ManCity),
        Fixture(Boro, Tottenham),
        Fixture(Leeds, Sunderland)
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Chelsea, Fulham),
        Fixture(Liverpool, Bolton),
        Fixture(Arsenal, Everton),
        Fixture(ManCity, Southampton),
        Fixture(ManUnited, Boro),
        Fixture(Tottenham, Sunderland),
        Fixture(Birmingham, Leeds)
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Liverpool, Southampton),
        Fixture(Fulham, Arsenal),
        Fixture(Bolton, Chelsea),
        Fixture(Everton, Sunderland),
        Fixture(Boro, ManCity),
        Fixture(Birmingham, ManUnited),
        Fixture(Leeds, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Chelsea, Arsenal),
        Fixture(Bolton, Everton),
        Fixture(Southampton, Fulham),
        Fixture(Boro, Liverpool),
        Fixture(ManUnited, Leeds),
        Fixture(Tottenham, ManCity),
        Fixture(Sunderland, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Liverpool, Sunderland),
        Fixture(Fulham, ManUnited),
        Fixture(Arsenal, Bolton),
        Fixture(ManCity, Chelsea),
        Fixture(Southampton, Everton),
        Fixture(Birmingham, Tottenham),
        Fixture(Leeds, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Chelsea, Southampton),
        Fixture(Fulham, Liverpool),
        Fixture(Bolton, Boro),
        Fixture(ManCity, Birmingham),
        Fixture(Everton, Leeds),
        Fixture(ManUnited, Tottenham),
        Fixture(Sunderland, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Liverpool, ManCity),
        Fixture(Everton, Chelsea),
        Fixture(Boro, Sunderland),
        Fixture(ManUnited, Arsenal),
        Fixture(Tottenham, Fulham),
        Fixture(Birmingham, Bolton),
        Fixture(Leeds, Southampton)
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Chelsea, ManUnited),
        Fixture(Liverpool, Tottenham),
        Fixture(Arsenal, Leeds),
        Fixture(ManCity, Fulham),
        Fixture(Southampton, Boro),
        Fixture(Birmingham, Everton),
        Fixture(Sunderland, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(Fulham, Birmingham),
        Fixture(Bolton, ManUnited),
        Fixture(Everton, Liverpool),
        Fixture(Boro, Chelsea),
        Fixture(Tottenham, Arsenal),
        Fixture(Sunderland, Southampton),
        Fixture(Leeds, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Chelsea, Birmingham),
        Fixture(Arsenal, Liverpool),
        Fixture(ManCity, Bolton),
        Fixture(Southampton, Tottenham),
        Fixture(Boro, Everton),
        Fixture(ManUnited, Sunderland),
        Fixture(Leeds, Fulham)
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Liverpool, ManUnited),
        Fixture(Fulham, Everton),
        Fixture(Bolton, Leeds),
        Fixture(Southampton, Arsenal),
        Fixture(Tottenham, Chelsea),
        Fixture(Birmingham, Boro),
        Fixture(Sunderland, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(Bolton, Tottenham),
        Fixture(ManCity, Arsenal),
        Fixture(Everton, ManUnited),
        Fixture(Boro, Fulham),
        Fixture(Birmingham, Southampton),
        Fixture(Sunderland, Chelsea),
        Fixture(Leeds, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Chelsea, Leeds),
        Fixture(Liverpool, Birmingham),
        Fixture(Fulham, Sunderland),
        Fixture(Arsenal, Boro),
        Fixture(Southampton, Bolton),
        Fixture(Everton, Tottenham),
        Fixture(ManUnited, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Chelsea, Liverpool),
        ReverseFixture(Fulham, Bolton),
        ReverseFixture(Arsenal, Birmingham),
        ReverseFixture(Southampton, ManUnited),
        ReverseFixture(Everton, ManCity),
        ReverseFixture(Boro, Tottenham),
        ReverseFixture(Leeds, Sunderland)
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Chelsea, Fulham),
        ReverseFixture(Liverpool, Bolton),
        ReverseFixture(Arsenal, Everton),
        ReverseFixture(ManCity, Southampton),
        ReverseFixture(ManUnited, Boro),
        ReverseFixture(Tottenham, Sunderland),
        ReverseFixture(Birmingham, Leeds)
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(Liverpool, Southampton),
        ReverseFixture(Fulham, Arsenal),
        ReverseFixture(Bolton, Chelsea),
        ReverseFixture(Everton, Sunderland),
        ReverseFixture(Boro, ManCity),
        ReverseFixture(Birmingham, ManUnited),
        ReverseFixture(Leeds, Tottenham)
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Chelsea, Arsenal),
        ReverseFixture(Bolton, Everton),
        ReverseFixture(Southampton, Fulham),
        ReverseFixture(Boro, Liverpool),
        ReverseFixture(ManUnited, Leeds),
        ReverseFixture(Tottenham, ManCity),
        ReverseFixture(Sunderland, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(Liverpool, Sunderland),
        ReverseFixture(Fulham, ManUnited),
        ReverseFixture(Arsenal, Bolton),
        ReverseFixture(ManCity, Chelsea),
        ReverseFixture(Southampton, Everton),
        ReverseFixture(Birmingham, Tottenham),
        ReverseFixture(Leeds, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Chelsea, Southampton),
        ReverseFixture(Fulham, Liverpool),
        ReverseFixture(Bolton, Boro),
        ReverseFixture(ManCity, Birmingham),
        ReverseFixture(Everton, Leeds),
        ReverseFixture(ManUnited, Tottenham),
        ReverseFixture(Sunderland, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(Liverpool, ManCity),
        ReverseFixture(Everton, Chelsea),
        ReverseFixture(Boro, Sunderland),
        ReverseFixture(ManUnited, Arsenal),
        ReverseFixture(Tottenham, Fulham),
        ReverseFixture(Birmingham, Bolton),
        ReverseFixture(Leeds, Southampton)
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Chelsea, ManUnited),
        ReverseFixture(Liverpool, Tottenham),
        ReverseFixture(Arsenal, Leeds),
        ReverseFixture(ManCity, Fulham),
        ReverseFixture(Southampton, Boro),
        ReverseFixture(Birmingham, Everton),
        ReverseFixture(Sunderland, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(Fulham, Birmingham),
        ReverseFixture(Bolton, ManUnited),
        ReverseFixture(Everton, Liverpool),
        ReverseFixture(Boro, Chelsea),
        ReverseFixture(Tottenham, Arsenal),
        ReverseFixture(Sunderland, Southampton),
        ReverseFixture(Leeds, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Chelsea, Birmingham),
        ReverseFixture(Arsenal, Liverpool),
        ReverseFixture(ManCity, Bolton),
        ReverseFixture(Southampton, Tottenham),
        ReverseFixture(Boro, Everton),
        ReverseFixture(ManUnited, Sunderland),
        ReverseFixture(Leeds, Fulham)
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(Liverpool, ManUnited),
        ReverseFixture(Fulham, Everton),
        ReverseFixture(Bolton, Leeds),
        ReverseFixture(Southampton, Arsenal),
        ReverseFixture(Tottenham, Chelsea),
        ReverseFixture(Birmingham, Boro),
        ReverseFixture(Sunderland, ManCity)
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(Bolton, Tottenham),
        ReverseFixture(ManCity, Arsenal),
        ReverseFixture(Everton, ManUnited),
        ReverseFixture(Boro, Fulham),
        ReverseFixture(Birmingham, Southampton),
        ReverseFixture(Sunderland, Chelsea),
        ReverseFixture(Leeds, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Chelsea, Leeds),
        ReverseFixture(Liverpool, Birmingham),
        ReverseFixture(Fulham, Sunderland),
        ReverseFixture(Arsenal, Boro),
        ReverseFixture(Southampton, Bolton),
        ReverseFixture(Everton, Tottenham),
        ReverseFixture(ManUnited, ManCity)
      )
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] = Map(
      CalendarDay(3721, LocalDate(2017, 9, 12)) -> Seq(TournamentRound(EnglandChamp, "тур 1")),
      CalendarDay(3723, LocalDate(2017, 9, 15)) -> Seq(TournamentRound(EnglandChamp, "тур 2")),
      CalendarDay(3725, LocalDate(2017, 9, 19)) -> Seq(TournamentRound(EnglandChamp, "тур 3")),
      CalendarDay(3727, LocalDate(2017, 9, 22)) -> Seq(TournamentRound(EnglandChamp, "тур 4")),
      CalendarDay(3729, LocalDate(2017, 9, 26)) -> Seq(TournamentRound(EnglandChamp, "тур 5")),
      CalendarDay(3731, LocalDate(2017, 9, 29)) -> Seq(TournamentRound(EnglandChamp, "тур 6")),
      CalendarDay(3733, LocalDate(2017, 10, 3)) -> Seq(TournamentRound(EnglandChamp, "тур 7")),
      CalendarDay(3735, LocalDate(2017, 10, 6)) -> Seq(TournamentRound(EnglandChamp, "тур 8")),
      CalendarDay(3737, LocalDate(2017, 10, 10)) -> Seq(TournamentRound(EnglandChamp, "тур 9")),
      CalendarDay(3739, LocalDate(2017, 10, 13)) -> Seq(TournamentRound(EnglandChamp, "тур 10")),
      CalendarDay(3741, LocalDate(2017, 10, 17)) -> Seq(TournamentRound(EnglandChamp, "тур 11")),
      CalendarDay(3743, LocalDate(2017, 10, 20)) -> Seq(TournamentRound(EnglandChamp, "тур 12")),
      CalendarDay(3745, LocalDate(2017, 10, 24)) -> Seq(TournamentRound(EnglandChamp, "тур 13")),
      CalendarDay(3751, LocalDate(2017, 10, 30)) -> Seq(TournamentRound(EnglandChamp, "тур 14")),
      CalendarDay(3753, LocalDate(2017, 11, 1)) -> Seq(TournamentRound(EnglandChamp, "тур 15")),
      CalendarDay(3755, LocalDate(2017, 11, 3)) -> Seq(TournamentRound(EnglandChamp, "тур 16")),
      CalendarDay(3757, LocalDate(2017, 11, 6)) -> Seq(TournamentRound(EnglandChamp, "тур 17")),
      CalendarDay(3759, LocalDate(2017, 11, 8)) -> Seq(TournamentRound(EnglandChamp, "тур 18")),
      CalendarDay(3761, LocalDate(2017, 11, 10)) -> Seq(TournamentRound(EnglandChamp, "тур 19")),
      CalendarDay(3763, LocalDate(2017, 11, 13)) -> Seq(TournamentRound(EnglandChamp, "тур 20")),
      CalendarDay(3765, LocalDate(2017, 11, 15)) -> Seq(TournamentRound(EnglandChamp, "тур 21")),
      CalendarDay(3767, LocalDate(2017, 11, 17)) -> Seq(TournamentRound(EnglandChamp, "тур 22")),
      CalendarDay(3769, LocalDate(2017, 11, 20)) -> Seq(TournamentRound(EnglandChamp, "тур 23")),
      CalendarDay(3771, LocalDate(2017, 11, 22)) -> Seq(TournamentRound(EnglandChamp, "тур 24")),
      CalendarDay(3773, LocalDate(2017, 11, 24)) -> Seq(TournamentRound(EnglandChamp, "тур 25")),
      CalendarDay(3775, LocalDate(2017, 11, 27)) -> Seq(TournamentRound(EnglandChamp, "тур 26"))
    )
  }
}
