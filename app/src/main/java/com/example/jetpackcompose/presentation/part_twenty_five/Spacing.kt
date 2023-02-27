package com.example.jetpackcompose.presentation.part_twenty_five

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Spacing (
    val default: Dp = 0.dp,
    val estraSmall: Dp = 4.dp,
    val small: Dp = 8.dp,
    val medium: Dp = 16.dp,
    val large: Dp = 32.dp,
    val extraLage: Dp = 64.dp,
)

val LocalSpacing = compositionLocalOf {
    Spacing()
}

val MaterialTheme.spacingScheme: Spacing
    @Composable
    @ReadOnlyComposable
    get() = LocalSpacing.current

