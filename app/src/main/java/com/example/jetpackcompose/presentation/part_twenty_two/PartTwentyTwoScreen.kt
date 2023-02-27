package com.example.jetpackcompose.presentation.part_twenty_two

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun PartTwentyTwoScreen() {
    var items by remember {
        mutableStateOf(
            (0..20).map {
                ListItem("item $it")
            }
        )
    }
    
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(items.size) { i ->
            Row(modifier = Modifier.fillMaxWidth()
                .clickable {
                    items = items.mapIndexed { index, item ->
                        if (index == i) {
                            item.copy(isSelected = !item.isSelected)
                        } else {
                            item
                        }
                    }
                }
                .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(items[i].title)
                if (items[i].isSelected) {
                    Icon(
                        Icons.Default.Check,
                        tint = Color.Green,
                        contentDescription = "selected",
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}
