package com.example.jetpackcompose.presentation

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import com.example.jetpackcompose.R

class Screens {
    sealed class Screen(val route: String, val title: String) {
        object Home : Screen(route = "home", "Home")
        object PartOne : Screen("part_one", "Part one")
        object PartTwo : Screen("part_two", "Part two")
        object PartThree : Screen("part_three", "Part three")
        object PartFour : Screen("part_four", "Part four")
    }

    val screenList = listOf(Screen.PartOne, Screen.PartTwo, Screen.PartThree, Screen.PartFour)
}
