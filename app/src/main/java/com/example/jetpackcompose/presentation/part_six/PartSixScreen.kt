package com.example.jetpackcompose.presentation.part_six

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

@Composable
fun PartSixScreen() {
    val color = remember {
        mutableStateOf(Color.Green)
    }
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .background(color.value)
            .weight(1f)
            .fillMaxSize())
        ColorBox(modifier = Modifier.weight(1f).fillMaxSize()) {
            color.value = it
        }
    }
}

@Composable
fun ColorBox(modifier: Modifier = Modifier, UpdateColor: (Color) -> Unit) {
    Box(
        modifier = modifier
            .background(Color.Red)
            .clickable {
                UpdateColor(
                    Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        1f
                    )
                )
            }
    )

}
