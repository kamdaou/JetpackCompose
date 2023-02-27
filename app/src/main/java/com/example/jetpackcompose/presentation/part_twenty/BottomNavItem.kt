package com.example.jetpackcompose.presentation.part_twenty

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val icon: ImageVector,
    val route: String,
    val badge: Int = 0
)
