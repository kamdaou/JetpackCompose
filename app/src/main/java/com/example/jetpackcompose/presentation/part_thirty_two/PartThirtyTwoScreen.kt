package com.example.jetpackcompose.presentation.part_thirty_two

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun PartThirtyTwoScreen() {
    val state = rememberLazyGridState(
        initialFirstVisibleItemIndex = 99
    )
    LazyVerticalGrid(
        columns = GridCells.Adaptive(100.dp),
        state = state
    ) {
        items(100) {
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .aspectRatio(1f)
                    .clip(RectangleShape)
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text("item $it")
            }
        }
    }
}
