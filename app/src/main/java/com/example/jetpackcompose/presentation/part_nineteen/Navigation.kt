package com.example.jetpackcompose.presentation.part_nineteen

sealed class Navigation(val route: String) {
    object SplashScreen: Navigation(route = "splash_screen")

    object MainScreen: Navigation(route = "main_screen")
}
