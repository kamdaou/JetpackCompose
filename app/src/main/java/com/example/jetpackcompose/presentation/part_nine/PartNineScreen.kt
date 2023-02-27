package com.example.jetpackcompose.presentation.part_nine

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun PartNineScreen() {

    ConstraintLayout {
        val (redBox, greenBox) = createRefs()

        Box(
            modifier = Modifier
                .background(Color.Red)
                .constrainAs(redBox) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    width = Dimension.value(200.dp)
                    height = Dimension.value(200.dp)
                }
        )
        Box(
            modifier = Modifier
                .background(Color.Green)
                .constrainAs(greenBox) {
                    top.linkTo(redBox.top)
                    start.linkTo(redBox.end)
                    end.linkTo(parent.end)
                    bottom.linkTo(redBox.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
    }

}
