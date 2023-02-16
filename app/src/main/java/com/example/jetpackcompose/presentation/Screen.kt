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
        object PartEleven : Screen("part_eleven", "Part eleven")
        object PartTwelve : Screen("part_twelve", "Part twelve")
        object PartThirteen : Screen("part_thirteen", "Part thirteen")
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
        Screen.PartEleven,
        Screen.PartTwelve,
        Screen.PartThirteen
    )
}
