package com.example.jetpackcompose.presentation.part_four

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R

@Composable
fun PartFourScreen() {
    val painter = painterResource(id = R.drawable.rings)
    val description = "African rings"
    val title = "African rings"
    Box(modifier = Modifier.fillMaxWidth(0.5f)) {
        ImageCard(painter = painter, description = description, title = title)
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    description: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier
        .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp)
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
        ) {
            Image(painter = painter, contentDescription = description)

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black,
                            ),
                            startY = 500f
                        )
                    )
            )

            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    text = title,
                    style = TextStyle(Color.White, fontSize = 16.sp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
