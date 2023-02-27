package com.example.jetpackcompose.presentation.part_twenty

sealed class Navigation(val route: String) {
    object Home: Navigation("home")
    object Chat: Navigation("chat")
    object Settings: Navigation("settings")
}
