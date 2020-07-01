package com.dewdrop.kram.model

object Data {
  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }
  import Tournaments._
  object SeasonData extends Season {
    override val name = "КРАМ: 36-й сезон"
    override val version = "10.0.0"
    override val participantsOnly: Boolean = true
    private object TeamsWithMinutes {
      val Arsenal = Team(14, "Арсенал", 0)
      val AstonVilla = Team(809, "Астон Вилла", 90)
      val Birmingham = Team(23, "Бирмингем Сити", 0)
      val Blackburn = Team(862, "Блэкберн Роверс", 90)
      val Bolton = Team(40, "Болтон Уондерерс", 210)
      val WestHam = Team(195, "Вест Хэм Юнайтед", 45)
      val Liverpool = Team(143, "Ливерпуль", 210)
      val Leeds = Team(198, "Лидс Юнайтед", 0)
      val ManCity = Team(38, "Манчестер Сити", 210)
      val ManUnited = Team(88, "Манчестер Юнайтед", 120)
      val Boro = Team(432, "Мидлсбро", 0)
      val Newcastle = Team(20, "Ньюкасл Юнайтед", 0)
      val Sunderland = Team(995, "Сандерленд", 0)
      val Southampton = Team(74, "Саутгемптон", 0)
      val Tottenham = Team(19, "Тоттенхэм Хотспур", 90)
      val Fulham = Team(192, "Фулхэм", 90)
      val Chelsea = Team(70, "Челси", 210)
      val Everton = Team(803, "Эвертон", 180)
    }
    import TeamsWithMinutes._
    protected override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Liverpool, Tottenham),
        Fixture(AstonVilla, Chelsea),
        Fixture(Bolton, WestHam),
        Fixture(Sunderland, Birmingham),
        Fixture(Everton, Blackburn),
        Fixture(Fulham, ManUnited),
        Fixture(Boro, ManCity),
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Liverpool, AstonVilla),
        Fixture(Tottenham, Chelsea),
        Fixture(Bolton, Everton),
        Fixture(Blackburn, Sunderland),
        Fixture(Birmingham, Fulham),
        Fixture(ManUnited, ManCity),
        Fixture(WestHam, Boro),
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Tottenham, Sunderland),
        Fixture(AstonVilla, Bolton),
        Fixture(Chelsea, Liverpool),
        Fixture(Everton, ManCity),
        Fixture(Fulham, Blackburn),
        Fixture(WestHam, Birmingham),
        Fixture(Boro, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Liverpool, Bolton),
        Fixture(Chelsea, Everton),
        Fixture(Sunderland, AstonVilla),
        Fixture(Fulham, Tottenham),
        Fixture(Birmingham, Boro),
        Fixture(ManUnited, Blackburn),
        Fixture(ManCity, WestHam),
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Tottenham, ManCity),
        Fixture(AstonVilla, Birmingham),
        Fixture(Bolton, Chelsea),
        Fixture(Blackburn, Liverpool),
        Fixture(Sunderland, Everton),
        Fixture(WestHam, ManUnited),
        Fixture(Boro, Fulham),
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Liverpool, Sunderland),
        Fixture(AstonVilla, Tottenham),
        Fixture(Chelsea, Fulham),
        Fixture(Blackburn, WestHam),
        Fixture(Everton, Boro),
        Fixture(Birmingham, ManUnited),
        Fixture(ManCity, Bolton),
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Tottenham, Blackburn),
        Fixture(Everton, Liverpool),
        Fixture(Fulham, ManCity),
        Fixture(Birmingham, Bolton),
        Fixture(ManUnited, AstonVilla),
        Fixture(WestHam, Chelsea),
        Fixture(Boro, Sunderland),
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Liverpool, Birmingham),
        Fixture(Tottenham, ManUnited),
        Fixture(Bolton, Boro),
        Fixture(Blackburn, AstonVilla),
        Fixture(Sunderland, Fulham),
        Fixture(WestHam, Everton),
        Fixture(ManCity, Chelsea),
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(AstonVilla, WestHam),
        Fixture(Chelsea, Birmingham),
        Fixture(Everton, Tottenham),
        Fixture(Fulham, Liverpool),
        Fixture(ManUnited, Bolton),
        Fixture(ManCity, Sunderland),
        Fixture(Boro, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Liverpool, WestHam),
        Fixture(Bolton, Tottenham),
        Fixture(Blackburn, Chelsea),
        Fixture(Sunderland, ManUnited),
        Fixture(Fulham, Everton),
        Fixture(Birmingham, ManCity),
        Fixture(Boro, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Tottenham, Birmingham),
        Fixture(AstonVilla, Everton),
        Fixture(Chelsea, Boro),
        Fixture(Sunderland, Bolton),
        Fixture(ManUnited, Liverpool),
        Fixture(WestHam, Fulham),
        Fixture(ManCity, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(Chelsea, ManUnited),
        Fixture(Blackburn, Bolton),
        Fixture(Everton, Birmingham),
        Fixture(Fulham, AstonVilla),
        Fixture(WestHam, Sunderland),
        Fixture(ManCity, Liverpool),
        Fixture(Boro, Tottenham),
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Liverpool, Boro),
        Fixture(Tottenham, WestHam),
        Fixture(AstonVilla, ManCity),
        Fixture(Bolton, Fulham),
        Fixture(Sunderland, Chelsea),
        Fixture(Everton, ManUnited),
        Fixture(Birmingham, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        ReverseFixture(Liverpool, Tottenham),
        ReverseFixture(AstonVilla, Chelsea),
        ReverseFixture(Bolton, WestHam),
        ReverseFixture(Sunderland, Birmingham),
        ReverseFixture(Everton, Blackburn),
        ReverseFixture(Fulham, ManUnited),
        ReverseFixture(Boro, ManCity),
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        ReverseFixture(Liverpool, AstonVilla),
        ReverseFixture(Tottenham, Chelsea),
        ReverseFixture(Bolton, Everton),
        ReverseFixture(Blackburn, Sunderland),
        ReverseFixture(Birmingham, Fulham),
        ReverseFixture(ManUnited, ManCity),
        ReverseFixture(WestHam, Boro),
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        ReverseFixture(Tottenham, Sunderland),
        ReverseFixture(AstonVilla, Bolton),
        ReverseFixture(Chelsea, Liverpool),
        ReverseFixture(Everton, ManCity),
        ReverseFixture(Fulham, Blackburn),
        ReverseFixture(WestHam, Birmingham),
        ReverseFixture(Boro, ManUnited),
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        ReverseFixture(Liverpool, Bolton),
        ReverseFixture(Chelsea, Everton),
        ReverseFixture(Sunderland, AstonVilla),
        ReverseFixture(Fulham, Tottenham),
        ReverseFixture(Birmingham, Boro),
        ReverseFixture(ManUnited, Blackburn),
        ReverseFixture(ManCity, WestHam),
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        ReverseFixture(Tottenham, ManCity),
        ReverseFixture(AstonVilla, Birmingham),
        ReverseFixture(Bolton, Chelsea),
        ReverseFixture(Blackburn, Liverpool),
        ReverseFixture(Sunderland, Everton),
        ReverseFixture(WestHam, ManUnited),
        ReverseFixture(Boro, Fulham),
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        ReverseFixture(Liverpool, Sunderland),
        ReverseFixture(AstonVilla, Tottenham),
        ReverseFixture(Chelsea, Fulham),
        ReverseFixture(Blackburn, WestHam),
        ReverseFixture(Everton, Boro),
        ReverseFixture(Birmingham, ManUnited),
        ReverseFixture(ManCity, Bolton),
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        ReverseFixture(Tottenham, Blackburn),
        ReverseFixture(Everton, Liverpool),
        ReverseFixture(Fulham, ManCity),
        ReverseFixture(Birmingham, Bolton),
        ReverseFixture(ManUnited, AstonVilla),
        ReverseFixture(WestHam, Chelsea),
        ReverseFixture(Boro, Sunderland),
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        ReverseFixture(Liverpool, Birmingham),
        ReverseFixture(Tottenham, ManUnited),
        ReverseFixture(Bolton, Boro),
        ReverseFixture(Blackburn, AstonVilla),
        ReverseFixture(Sunderland, Fulham),
        ReverseFixture(WestHam, Everton),
        ReverseFixture(ManCity, Chelsea),
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        ReverseFixture(AstonVilla, WestHam),
        ReverseFixture(Chelsea, Birmingham),
        ReverseFixture(Everton, Tottenham),
        ReverseFixture(Fulham, Liverpool),
        ReverseFixture(ManUnited, Bolton),
        ReverseFixture(ManCity, Sunderland),
        ReverseFixture(Boro, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        ReverseFixture(Liverpool, WestHam),
        ReverseFixture(Bolton, Tottenham),
        ReverseFixture(Blackburn, Chelsea),
        ReverseFixture(Sunderland, ManUnited),
        ReverseFixture(Fulham, Everton),
        ReverseFixture(Birmingham, ManCity),
        ReverseFixture(Boro, AstonVilla),
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        ReverseFixture(Tottenham, Birmingham),
        ReverseFixture(AstonVilla, Everton),
        ReverseFixture(Chelsea, Boro),
        ReverseFixture(Sunderland, Bolton),
        ReverseFixture(ManUnited, Liverpool),
        ReverseFixture(WestHam, Fulham),
        ReverseFixture(ManCity, Blackburn),
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        ReverseFixture(Chelsea, ManUnited),
        ReverseFixture(Blackburn, Bolton),
        ReverseFixture(Everton, Birmingham),
        ReverseFixture(Fulham, AstonVilla),
        ReverseFixture(WestHam, Sunderland),
        ReverseFixture(ManCity, Liverpool),
        ReverseFixture(Boro, Tottenham),
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        ReverseFixture(Liverpool, Boro),
        ReverseFixture(Tottenham, WestHam),
        ReverseFixture(AstonVilla, ManCity),
        ReverseFixture(Bolton, Fulham),
        ReverseFixture(Sunderland, Chelsea),
        ReverseFixture(Everton, ManUnited),
        ReverseFixture(Birmingham, Blackburn),
      )
    )
    protected override val calendar: Map[CalendarDay, Seq[TournamentRound]] =
      Map(
        CalendarDay(4389, LocalDate(2020, 7, 3)) -> Seq(
          TournamentRound(EnglandChamp, "тур 1")
        ),
        CalendarDay(4391, LocalDate(2020, 7, 6)) -> Seq(
          TournamentRound(EnglandChamp, "тур 2")
        ),
        CalendarDay(4393, LocalDate(2020, 7, 9)) -> Seq(
          TournamentRound(EnglandChamp, "тур 3")
        ),
        CalendarDay(4395, LocalDate(2020, 7, 13)) -> Seq(
          TournamentRound(EnglandChamp, "тур 4")
        ),
        CalendarDay(4397, LocalDate(2020, 7, 16)) -> Seq(
          TournamentRound(EnglandChamp, "тур 5")
        ),
        CalendarDay(4400, LocalDate(2020, 7, 20)) -> Seq(
          TournamentRound(EnglandChamp, "тур 6")
        ),
        CalendarDay(4402, LocalDate(2020, 7, 23)) -> Seq(
          TournamentRound(EnglandChamp, "тур 7")
        ),
        CalendarDay(4404, LocalDate(2020, 7, 27)) -> Seq(
          TournamentRound(EnglandChamp, "тур 8")
        ),
        CalendarDay(4406, LocalDate(2020, 7, 30)) -> Seq(
          TournamentRound(EnglandChamp, "тур 9")
        ),
        CalendarDay(4408, LocalDate(2020, 8, 3)) -> Seq(
          TournamentRound(EnglandChamp, "тур 10")
        ),
        CalendarDay(4410, LocalDate(2020, 8, 6)) -> Seq(
          TournamentRound(EnglandChamp, "тур 11")
        ),
        CalendarDay(4412, LocalDate(2020, 8, 10)) -> Seq(
          TournamentRound(EnglandChamp, "тур 12")
        ),
        CalendarDay(4414, LocalDate(2020, 8, 12)) -> Seq(
          TournamentRound(EnglandChamp, "тур 13")
        ),
        CalendarDay(4419, LocalDate(2020, 8, 17)) -> Seq(
          TournamentRound(EnglandChamp, "тур 14")
        ),
        CalendarDay(4421, LocalDate(2020, 8, 19)) -> Seq(
          TournamentRound(EnglandChamp, "тур 15")
        ),
        CalendarDay(4423, LocalDate(2020, 8, 21)) -> Seq(
          TournamentRound(EnglandChamp, "тур 16")
        ),
        CalendarDay(4425, LocalDate(2020, 8, 24)) -> Seq(
          TournamentRound(EnglandChamp, "тур 17")
        ),
        CalendarDay(4427, LocalDate(2020, 8, 26)) -> Seq(
          TournamentRound(EnglandChamp, "тур 18")
        ),
        CalendarDay(4429, LocalDate(2020, 8, 28)) -> Seq(
          TournamentRound(EnglandChamp, "тур 19")
        ),
        CalendarDay(4431, LocalDate(2020, 8, 31)) -> Seq(
          TournamentRound(EnglandChamp, "тур 20")
        ),
        CalendarDay(4433, LocalDate(2020, 9, 2)) -> Seq(
          TournamentRound(EnglandChamp, "тур 21")
        ),
        CalendarDay(4435, LocalDate(2020, 9, 4)) -> Seq(
          TournamentRound(EnglandChamp, "тур 22")
        ),
        CalendarDay(4437, LocalDate(2020, 9, 7)) -> Seq(
          TournamentRound(EnglandChamp, "тур 23")
        ),
        CalendarDay(4439, LocalDate(2020, 9, 9)) -> Seq(
          TournamentRound(EnglandChamp, "тур 24")
        ),
        CalendarDay(4441, LocalDate(2020, 9, 11)) -> Seq(
          TournamentRound(EnglandChamp, "тур 25")
        ),
        CalendarDay(4443, LocalDate(2020, 9, 14)) -> Seq(
          TournamentRound(EnglandChamp, "тур 26")
        ),
      )
  }
}
