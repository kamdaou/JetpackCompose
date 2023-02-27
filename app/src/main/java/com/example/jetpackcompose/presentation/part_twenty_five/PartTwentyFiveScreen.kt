package com.example.jetpackcompose.presentation.part_twenty_five

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun PartTwentyFiveScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(MaterialTheme.spacingScheme.medium)
            .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {
    }
}
