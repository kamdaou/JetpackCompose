package com.example.jetpackcompose.presentation.part_nine

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.constraintlayout.widget.ConstraintLayout

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun PartNineScreen() {
    val (redBox, greenBox) = createRefs()
/*
    ConstraintLayout {
        Box(
            modifier = Modifier
                .background(Color.Red)
                .constrainAs(redBox) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
        )
        Box(
            modifier = Modifier
                .background(Color.Green)
                .constrainAs(redBox) {
                    top.linkTo(parent.top)
                    start.linkTo(redBox.end)
                }
        )
    }

 */
}
