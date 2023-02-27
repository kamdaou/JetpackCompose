package com.example.jetpackcompose.presentation.partEighteen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun PartEighteenScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Navigation.MainScreen.route) {
        composable(Navigation.MainScreen.route) {
            PartEighteenMainScreen(navController)
        }

        composable(
            route = Navigation.DetailScreen.route + "?name={name}",
            arguments = listOf(
                navArgument(name = "name") {
                    type = NavType.StringType
                    nullable = true
                    defaultValue = "Cadet"
                }
            )
        ) {
            PartEighteenDetailScreen(name = it.arguments?.getString("name"))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PartEighteenMainScreen(navController: NavController) {
    var text by remember {
        mutableStateOf("")
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        TextField(value = text, onValueChange = {
            text = it
        })
        Spacer(Modifier.height(8.dp))
        Button(
            onClick = {
                navController.navigate(Navigation.DetailScreen.withArgs(text))
            },
            modifier = Modifier.align(Alignment.BottomEnd)
        ) {
            Text("To DetailScreen")
        }
    }
}

@Composable
fun PartEighteenDetailScreen(name: String?) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Hello, $name")
    }
}
