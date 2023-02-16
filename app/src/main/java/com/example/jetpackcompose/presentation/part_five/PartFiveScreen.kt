package com.example.jetpackcompose.presentation.part_five

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R

@Composable
fun PartFiveScreen() {
    val fontFamily = FontFamily(fonts = listOf(
        Font(R.font.lexend_back),
        Font(R.font.lexend_bold),
        Font(R.font.lexend_extra_bold),
        Font(R.font.lexend_semi_bold),
        Font(R.font.lexend_light),
        Font(R.font.lexend_extra_light),
        Font(R.font.lexend_medium),
        Font(R.font.lexend_thin),
        Font(R.font.lexend_regular),
    ))
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ) {
                    append("J")
                }
                append("etpack ")
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ) {
                    append("C")
                }
                append("ompose")
            },
            color = Color(0XFF101010),
            fontFamily = fontFamily,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline
        )
    }
}
