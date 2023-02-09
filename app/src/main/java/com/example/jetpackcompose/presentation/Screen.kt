package com.example.jetpackcompose.presentation

sealed class Screen(val route: String) {
    object PartOne: Screen("part_one")
    object PartTwo: Screen("part_two")
}
