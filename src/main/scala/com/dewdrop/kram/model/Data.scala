package com.dewdrop.kram.model

object Data {
  object Tournaments {
    val EnglandChamp = Tournament(6, "Чемпионат Англии")
    val GreatBritain = Tournament(70, "2D.Великобритания")
  }
  object Teams {
    val Arsenal = Team(14, "Арсенал")
    val AstonVilla = Team(809, "Астон Вилла")
    val Birmingham = Team(23, "Бирмингем Сити")
    val Blackburn = Team(862, "Блэкберн Роверс")
    val Bolton = Team(40, "Болтон Уондерерс")
    val WestHam = Team(195, "Вест Хэм Юнайтед")
    val Liverpool = Team(143, "Ливерпуль")
    val Leeds = Team(198, "Лидс Юнайтед")
    val ManCity = Team(38, "Манчестер Сити")
    val ManUnited = Team(88, "Манчестер Юнайтед")
    val Boro = Team(432, "Мидлсбро")
    val Newcastle = Team(20, "Ньюкасл Юнайтед")
    val Sunderland = Team(995, "Сандерленд")
    val Southampton = Team(74, "Саутгемптон")
    val Tottenham = Team(19, "Тоттенхэм Хотспур")
    val Fulham = Team(192, "Фулхэм")
    val Chelsea = Team(70, "Челси")
    val Everton = Team(803, "Эвертон")
    val AllEnglish = Seq(Arsenal, AstonVilla, Birmingham, Blackburn, Bolton, WestHam, Liverpool, Leeds, ManCity, ManUnited,
      Boro, Newcastle, Sunderland, Southampton, Tottenham, Fulham, Chelsea, Everton)
  }
  import Tournaments._
  object Season26 extends Season {
    private object TeamsWithMinutes {
      val Arsenal = TeamWithMinutes(Teams.Arsenal, 450)
      val AstonVilla = TeamWithMinutes(Teams.AstonVilla, 270)
      val Birmingham = TeamWithMinutes(Teams.Birmingham, 90)
      val Blackburn = TeamWithMinutes(Teams.Blackburn, 90)
      val Bolton = TeamWithMinutes(Teams.Bolton, 180)
      val WestHam = TeamWithMinutes(Teams.WestHam, 0)
      val Liverpool = TeamWithMinutes(Teams.Liverpool, 180)
      val Leeds = TeamWithMinutes(Teams.Leeds, 270)
      val ManCity = TeamWithMinutes(Teams.ManCity, 360)
      val ManUnited = TeamWithMinutes(Teams.ManUnited, 360)
      val Boro = TeamWithMinutes(Teams.Boro, 90)
      val Newcastle = TeamWithMinutes(Teams.Newcastle, 180)
      val Sunderland = TeamWithMinutes(Teams.Sunderland, 120)
      val Southampton = TeamWithMinutes(Teams.Southampton, 360)
      val Tottenham = TeamWithMinutes(Teams.Tottenham, 270)
      val Fulham = TeamWithMinutes(Teams.Fulham, 180)
      val Chelsea = TeamWithMinutes(Teams.Chelsea, 0)
      val Everton = TeamWithMinutes(Teams.Everton, 270)

    }
    import TeamsWithMinutes._
    override val name = "КРАМ: 26-й сезон"
    override val matchDays: Map[TournamentRound, Seq[Fixture]] = Map(
      TournamentRound(EnglandChamp, "тур 1") -> Seq(
        Fixture(Tottenham, Blackburn),
        Fixture(Southampton, Fulham),
        Fixture(Bolton, Liverpool),
        Fixture(ManUnited, Sunderland),
        Fixture(ManCity, Boro),
        Fixture(Leeds, AstonVilla),
        Fixture(Newcastle, WestHam)
      ),
      TournamentRound(GreatBritain, "тур 2") -> Seq(
        Fixture(Arsenal, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 2") -> Seq(
        Fixture(Tottenham, Southampton),
        Fixture(Blackburn, Fulham),
        Fixture(Bolton, ManCity),
        Fixture(Boro, ManUnited),
        Fixture(Sunderland, Leeds),
        Fixture(AstonVilla, WestHam),
        Fixture(Liverpool, Newcastle)
      ),
      TournamentRound(EnglandChamp, "тур 3") -> Seq(
        Fixture(Blackburn, ManUnited),
        Fixture(Southampton, Bolton),
        Fixture(Fulham, Tottenham),
        Fixture(ManCity, WestHam),
        Fixture(Leeds, Boro),
        Fixture(Liverpool, Sunderland),
        Fixture(Newcastle, AstonVilla)
      ),
      TournamentRound(EnglandChamp, "тур 4") -> Seq(
        Fixture(Tottenham, Bolton),
        Fixture(Fulham, ManCity),
        Fixture(ManUnited, Southampton),
        Fixture(Leeds, Blackburn),
        Fixture(Sunderland, Newcastle),
        Fixture(AstonVilla, Boro),
        Fixture(WestHam, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 5") -> Seq(
        Fixture(Blackburn, WestHam),
        Fixture(Southampton, Sunderland),
        Fixture(Bolton, Fulham),
        Fixture(Boro, Tottenham),
        Fixture(ManUnited, ManCity),
        Fixture(Liverpool, AstonVilla),
        Fixture(Newcastle, Leeds)
      ),
      TournamentRound(GreatBritain, "тур 6") -> Seq(
        Fixture(Chelsea, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 6") -> Seq(
        Fixture(Tottenham, ManUnited),
        Fixture(Southampton, Blackburn),
        Fixture(Fulham, Leeds),
        Fixture(Boro, Liverpool),
        Fixture(ManCity, Newcastle),
        Fixture(Sunderland, AstonVilla),
        Fixture(WestHam, Bolton)
      ),
      TournamentRound(EnglandChamp, "тур 7") -> Seq(
        Fixture(Blackburn, Boro),
        Fixture(ManCity, Tottenham),
        Fixture(Leeds, WestHam),
        Fixture(Sunderland, Bolton),
        Fixture(AstonVilla, Southampton),
        Fixture(Liverpool, Fulham),
        Fixture(Newcastle, ManUnited)
      ),
      TournamentRound(GreatBritain, "тур 8") -> Seq(
        Fixture(Arsenal, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 8") -> Seq(
        Fixture(Tottenham, Sunderland),
        Fixture(Blackburn, AstonVilla),
        Fixture(Bolton, Newcastle),
        Fixture(Boro, Southampton),
        Fixture(ManUnited, Leeds),
        Fixture(Liverpool, ManCity),
        Fixture(WestHam, Fulham)
      ),
      TournamentRound(GreatBritain, "тур 9") -> Seq(
        Fixture(Everton, Birmingham)
      ),
      TournamentRound(EnglandChamp, "тур 9") -> Seq(
        Fixture(Southampton, Liverpool),
        Fixture(Fulham, Sunderland),
        Fixture(ManCity, Blackburn),
        Fixture(Leeds, Tottenham),
        Fixture(AstonVilla, Bolton),
        Fixture(WestHam, ManUnited),
        Fixture(Newcastle, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 10") -> Seq(
        Fixture(Tottenham, Liverpool),
        Fixture(Bolton, Blackburn),
        Fixture(Boro, Fulham),
        Fixture(ManUnited, AstonVilla),
        Fixture(Leeds, ManCity),
        Fixture(Sunderland, WestHam),
        Fixture(Newcastle, Southampton)
      ),
      TournamentRound(GreatBritain, "тур 11") -> Seq(
        Fixture(Arsenal, Chelsea)
      ),
      TournamentRound(EnglandChamp, "тур 11") -> Seq(
        Fixture(Blackburn, Sunderland),
        Fixture(Southampton, ManCity),
        Fixture(Fulham, Newcastle),
        Fixture(ManUnited, Bolton),
        Fixture(AstonVilla, Tottenham),
        Fixture(Liverpool, Leeds),
        Fixture(WestHam, Boro)
      ),
      TournamentRound(EnglandChamp, "тур 12") -> Seq(
        Fixture(Fulham, AstonVilla),
        Fixture(Boro, Bolton),
        Fixture(ManCity, Sunderland),
        Fixture(Leeds, Southampton),
        Fixture(Liverpool, ManUnited),
        Fixture(WestHam, Tottenham),
        Fixture(Newcastle, Blackburn)
      ),
      TournamentRound(EnglandChamp, "тур 13") -> Seq(
        Fixture(Tottenham, Newcastle),
        Fixture(Blackburn, Liverpool),
        Fixture(Southampton, WestHam),
        Fixture(Bolton, Leeds),
        Fixture(ManUnited, Fulham),
        Fixture(ManCity, AstonVilla),
        Fixture(Sunderland, Boro)
      ),
      TournamentRound(GreatBritain, "тур 14") -> Seq(
        Fixture(Everton, Chelsea)
      ),
      TournamentRound(EnglandChamp, "тур 14") -> Seq(
        Fixture(Blackburn, Tottenham),
        Fixture(Fulham, Southampton),
        Fixture(Liverpool, Bolton),
        Fixture(Sunderland, ManUnited),
        Fixture(Boro, ManCity),
        Fixture(AstonVilla, Leeds),
        Fixture(WestHam, Newcastle)
      ),
      TournamentRound(GreatBritain, "тур 17") -> Seq(
        Fixture(Birmingham, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 15") -> Seq(
        Fixture(Southampton, Tottenham),
        Fixture(Fulham, Blackburn),
        Fixture(ManCity, Bolton),
        Fixture(ManUnited, Boro),
        Fixture(Leeds, Sunderland),
        Fixture(WestHam, AstonVilla),
        Fixture(Newcastle, Liverpool)
      ),
      TournamentRound(EnglandChamp, "тур 16") -> Seq(
        Fixture(ManUnited, Blackburn),
        Fixture(Bolton, Southampton),
        Fixture(Tottenham, Fulham),
        Fixture(WestHam, ManCity),
        Fixture(Boro, Leeds),
        Fixture(Sunderland, Liverpool),
        Fixture(AstonVilla, Newcastle)
      ),
      TournamentRound(EnglandChamp, "тур 17") -> Seq(
        Fixture(Bolton, Tottenham),
        Fixture(ManCity, Fulham),
        Fixture(Southampton, ManUnited),
        Fixture(Blackburn, Leeds),
        Fixture(Newcastle, Sunderland),
        Fixture(Boro, AstonVilla),
        Fixture(Liverpool, WestHam)
      ),
      TournamentRound(EnglandChamp, "тур 18") -> Seq(
        Fixture(WestHam, Blackburn),
        Fixture(Sunderland, Southampton),
        Fixture(Fulham, Bolton),
        Fixture(Tottenham, Boro),
        Fixture(ManCity, ManUnited),
        Fixture(AstonVilla, Liverpool),
        Fixture(Leeds, Newcastle)
      ),
      TournamentRound(GreatBritain, "тур 21") -> Seq(
        Fixture(Birmingham, Chelsea)
      ),
      TournamentRound(EnglandChamp, "тур 19") -> Seq(
        Fixture(ManUnited, Tottenham),
        Fixture(Blackburn, Southampton),
        Fixture(Leeds, Fulham),
        Fixture(Liverpool, Boro),
        Fixture(Newcastle, ManCity),
        Fixture(AstonVilla, Sunderland),
        Fixture(Bolton, WestHam)
      ),
      TournamentRound(EnglandChamp, "тур 20") -> Seq(
        Fixture(Boro, Blackburn),
        Fixture(Tottenham, ManCity),
        Fixture(WestHam, Leeds),
        Fixture(Bolton, Sunderland),
        Fixture(Southampton, AstonVilla),
        Fixture(Fulham, Liverpool),
        Fixture(ManUnited, Newcastle)
      ),
      TournamentRound(GreatBritain, "тур 23") -> Seq(
        Fixture(Everton, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 21") -> Seq(
        Fixture(Sunderland, Tottenham),
        Fixture(AstonVilla, Blackburn),
        Fixture(Newcastle, Bolton),
        Fixture(Southampton, Boro),
        Fixture(Leeds, ManUnited),
        Fixture(ManCity, Liverpool),
        Fixture(Fulham, WestHam)
      ),
      TournamentRound(GreatBritain, "тур 24") -> Seq(
        Fixture(Birmingham, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 22") -> Seq(
        Fixture(Liverpool, Southampton),
        Fixture(Sunderland, Fulham),
        Fixture(Blackburn, ManCity),
        Fixture(Tottenham, Leeds),
        Fixture(Bolton, AstonVilla),
        Fixture(ManUnited, WestHam),
        Fixture(Boro, Newcastle)
      ),
      TournamentRound(GreatBritain, "тур 26") -> Seq(
        Fixture(Chelsea, Arsenal)
      ),
      TournamentRound(EnglandChamp, "тур 23") -> Seq(
        Fixture(Liverpool, Tottenham),
        Fixture(Blackburn, Bolton),
        Fixture(Fulham, Boro),
        Fixture(AstonVilla, ManUnited),
        Fixture(ManCity, Leeds),
        Fixture(WestHam, Sunderland),
        Fixture(Southampton, Newcastle)
      ),
      TournamentRound(EnglandChamp, "тур 24") -> Seq(
        Fixture(Sunderland, Blackburn),
        Fixture(ManCity, Southampton),
        Fixture(Newcastle, Fulham),
        Fixture(Bolton, ManUnited),
        Fixture(Tottenham, AstonVilla),
        Fixture(Leeds, Liverpool),
        Fixture(Boro, WestHam)
      ),
      TournamentRound(GreatBritain, "тур 29") -> Seq(
        Fixture(Chelsea, Everton)
      ),
      TournamentRound(EnglandChamp, "тур 25") -> Seq(
        Fixture(AstonVilla, Fulham),
        Fixture(Bolton, Boro),
        Fixture(Sunderland, ManCity),
        Fixture(Southampton, Leeds),
        Fixture(ManUnited, Liverpool),
        Fixture(Tottenham, WestHam),
        Fixture(Blackburn, Newcastle)
      ),
      TournamentRound(EnglandChamp, "тур 26") -> Seq(
        Fixture(Newcastle, Tottenham),
        Fixture(Liverpool, Blackburn),
        Fixture(WestHam, Southampton),
        Fixture(Leeds, Bolton),
        Fixture(Fulham, ManUnited),
        Fixture(AstonVilla, ManCity),
        Fixture(Boro, Sunderland)
      )
    )
    override val calendar: Map[CalendarDay, Seq[TournamentRound]] = Map(
      CalendarDay(3421, LocalDate(2016, 6, 7)) → Seq(TournamentRound(EnglandChamp, "тур 1"), TournamentRound(GreatBritain, "тур 1")),
      CalendarDay(3423, LocalDate(2016, 6, 10)) → Seq(TournamentRound(EnglandChamp, "тур 2"), TournamentRound(GreatBritain, "тур 2")),
      CalendarDay(3425, LocalDate(2016, 6, 14)) → Seq(TournamentRound(EnglandChamp, "тур 3"), TournamentRound(GreatBritain, "тур 3")),
      CalendarDay(3427, LocalDate(2016, 6, 17)) → Seq(TournamentRound(EnglandChamp, "тур 4"), TournamentRound(GreatBritain, "тур 4")),
      CalendarDay(3429, LocalDate(2016, 6, 21)) → Seq(TournamentRound(EnglandChamp, "тур 5"), TournamentRound(GreatBritain, "тур 5")),
      CalendarDay(3431, LocalDate(2016, 6, 24)) → Seq(TournamentRound(EnglandChamp, "тур 6"), TournamentRound(GreatBritain, "тур 6")),
      CalendarDay(3433, LocalDate(2016, 6, 28)) → Seq(TournamentRound(EnglandChamp, "тур 7"), TournamentRound(GreatBritain, "тур 7")),
      CalendarDay(3435, LocalDate(2016, 7, 1)) → Seq(TournamentRound(EnglandChamp, "тур 8"), TournamentRound(GreatBritain, "тур 8")),
      CalendarDay(3437, LocalDate(2016, 7, 5)) → Seq(TournamentRound(EnglandChamp, "тур 9"), TournamentRound(GreatBritain, "тур 9")),
      CalendarDay(3439, LocalDate(2016, 7, 8)) → Seq(TournamentRound(EnglandChamp, "тур 10"), TournamentRound(GreatBritain, "тур 10")),
      CalendarDay(3441, LocalDate(2016, 7, 12)) → Seq(TournamentRound(EnglandChamp, "тур 11"), TournamentRound(GreatBritain, "тур 11")),
      CalendarDay(3443, LocalDate(2016, 7, 15)) → Seq(TournamentRound(EnglandChamp, "тур 12"), TournamentRound(GreatBritain, "тур 12")),
      CalendarDay(3445, LocalDate(2016, 7, 19)) → Seq(TournamentRound(EnglandChamp, "тур 13"), TournamentRound(GreatBritain, "тур 13")),
      CalendarDay(3446, LocalDate(2016, 7, 20)) → Seq(TournamentRound(GreatBritain, "тур 14")),
      CalendarDay(3448, LocalDate(2016, 7, 22)) → Seq(TournamentRound(GreatBritain, "тур 15")),
      CalendarDay(3451, LocalDate(2016, 7, 26)) → Seq(TournamentRound(EnglandChamp, "тур 14"), TournamentRound(GreatBritain, "тур 16")),
      CalendarDay(3453, LocalDate(2016, 7, 29)) → Seq(TournamentRound(EnglandChamp, "тур 15"), TournamentRound(GreatBritain, "тур 17")),
      CalendarDay(3455, LocalDate(2016, 8, 2)) → Seq(TournamentRound(EnglandChamp, "тур 16"), TournamentRound(GreatBritain, "тур 18")),
      CalendarDay(3457, LocalDate(2016, 8, 5)) → Seq(TournamentRound(EnglandChamp, "тур 17"), TournamentRound(GreatBritain, "тур 19")),
      CalendarDay(3459, LocalDate(2016, 8, 9)) → Seq(TournamentRound(EnglandChamp, "тур 18"), TournamentRound(GreatBritain, "тур 20")),
      CalendarDay(3461, LocalDate(2016, 8, 12)) → Seq(TournamentRound(EnglandChamp, "тур 19"), TournamentRound(GreatBritain, "тур 21")),
      CalendarDay(3463, LocalDate(2016, 8, 16)) → Seq(TournamentRound(EnglandChamp, "тур 20"), TournamentRound(GreatBritain, "тур 22")),
      CalendarDay(3465, LocalDate(2016, 8, 19)) → Seq(TournamentRound(EnglandChamp, "тур 21"), TournamentRound(GreatBritain, "тур 23")),
      CalendarDay(3466, LocalDate(2016, 8, 22)) → Seq(TournamentRound(GreatBritain, "тур 24")),
      CalendarDay(3467, LocalDate(2016, 8, 23)) → Seq(TournamentRound(EnglandChamp, "тур 22"), TournamentRound(GreatBritain, "тур 25")),
      CalendarDay(3469, LocalDate(2016, 8, 26)) → Seq(TournamentRound(EnglandChamp, "тур 23"), TournamentRound(GreatBritain, "тур 26")),
      CalendarDay(3470, LocalDate(2016, 8, 29)) → Seq(TournamentRound(GreatBritain, "тур 27")),
      CalendarDay(3471, LocalDate(2016, 8, 30)) → Seq(TournamentRound(EnglandChamp, "тур 24"), TournamentRound(GreatBritain, "тур 28")),
      CalendarDay(3473, LocalDate(2016, 9, 2)) → Seq(TournamentRound(EnglandChamp, "тур 25"), TournamentRound(GreatBritain, "тур 29")),
      CalendarDay(3475, LocalDate(2016, 9, 6)) → Seq(TournamentRound(EnglandChamp, "тур 26"), TournamentRound(GreatBritain, "тур 30"))
    )
  }
}
