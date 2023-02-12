package com.example.jetpackcompose.presentation.part_three

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun PartThreeScreen() {

    val context = LocalContext.current
    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxHeight(0.5f)
            .width(300.dp)
            .border(5.dp, Color.Magenta)
            .padding(top = 50.dp)
            .border(10.dp, Color.Black)
            .padding(20.dp)
//                .requiredWidth(600.dp)
    ) {
        // offset: it pushes the text to the according to x and y coordinates
        Text(text = "Hello", modifier = Modifier.offset(20.dp, 30.dp))
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "World")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Show toast", Modifier.clickable {
            Toast.makeText(context, "Hello World!", Toast.LENGTH_SHORT).show()
        })
    }
}