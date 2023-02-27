package com.example.jetpackcompose.presentation

class Screens {
    sealed class Screen(val route: String, val title: String) {
        object Home : Screen(route = "home", "Home")
        object PartOne : Screen("part_one", "Part one")
        object PartTwo : Screen("part_two", "Part two")
        object PartThree : Screen("part_three", "Part three")
        object PartFour : Screen("part_four", "Part four")
        object PartFive : Screen("part_five", "Part five")
        object PartSix : Screen("part_six", "Part six")
        object PartSeven : Screen("part_seven", "Part seven")
        object PartEight : Screen("part_eight", "Part eight")
        object PartNine : Screen("part_nine", "Part nine")
        object PartEleven : Screen("part_eleven", "Part eleven")
        object PartTwelve : Screen("part_twelve", "Part twelve")
        object PartThirteen : Screen("part_thirteen", "Part thirteen")
        object PartFifteen : Screen("part_fifteen", "Part fifteen")
        object PartSixteen : Screen("part_sixteen", "Part sixteen")
        object PartSeventeen : Screen("part_seventeen", "Part seventeen")
        object PartEighteen : Screen("part_eighteen", "Part eighteen")
        object PartNineteen : Screen("part_nineteen", "Part nineteen")
        object PartTwenty : Screen("part_twenty", "Part twenty")
        object PartTwentyThree : Screen("part_twenty_three", "Part twenty three")
        object PartTwentyTwo : Screen("part_twenty_two", "Part twenty two")
        object PartTwentyOne : Screen("part_twenty_one", "Part twenty one")
        object PartTwentyFive: Screen("part_twenty_five", "Part twenty five")
        object PartTwentySeven: Screen("part_twenty_seven", "Part twenty seven")
        object PartTwentyEight: Screen("part_twenty_eight", "Part twenty eight")
        object PartTwentyNine: Screen("part_twenty_nine", "Part twenty nine")
        object PartThirtyOne: Screen("part_thirty_one", "Part thirty one")
        object PartThirtyTwo: Screen("part_thirty_two", "Part thirty two")
        object PartThirtyThree: Screen("part_thirty_three", "Part thirty three")
        object PartThirtyFive: Screen("part_thirty_five", "Part thirty five")
    }

    val screenList = listOf(
        Screen.PartOne,
        Screen.PartTwo,
        Screen.PartThree,
        Screen.PartFour,
        Screen.PartFive,
        Screen.PartSix,
        Screen.PartSeven,
        Screen.PartEight,
        Screen.PartNine,
        Screen.PartEleven,
        Screen.PartTwelve,
        Screen.PartThirteen,
        Screen.PartFifteen,
        Screen.PartSixteen,
        Screen.PartSeventeen,
        Screen.PartEighteen,
        Screen.PartNineteen,
        Screen.PartTwenty,
        Screen.PartTwentyOne,
        Screen.PartTwentyTwo,
        Screen.PartTwentyThree,
        Screen.PartTwentyFive,
        Screen.PartTwentySeven,
        Screen.PartTwentyEight,
        Screen.PartTwentyNine,
        Screen.PartThirtyOne,
        Screen.PartThirtyTwo,
        Screen.PartThirtyThree,
        Screen.PartThirtyFive
    )
}
