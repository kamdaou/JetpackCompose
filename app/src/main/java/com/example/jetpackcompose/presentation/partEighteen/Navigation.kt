package com.example.jetpackcompose.presentation.partEighteen

sealed class Navigation(val route: String) {
    object MainScreen: Navigation("main_screen")

    object DetailScreen: Navigation("detail_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach {
                append("?name=$it")
            }
        }
    }
}

