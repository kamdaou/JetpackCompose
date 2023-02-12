package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.presentation.Screens
import com.example.jetpackcompose.presentation.part_four.PartFourScreen
import com.example.jetpackcompose.presentation.part_one.PartOne
import com.example.jetpackcompose.presentation.part_three.PartThreeScreen
import com.example.jetpackcompose.presentation.part_two.PartTwoScreen
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screens.Screen.Home.route
                    ) {
                        composable(Screens.Screen.PartOne.route) {
                            PartOne().Greeting(name = "Philipp")
                        }

                        composable(Screens.Screen.Home.route) {
                            HomeScreen(navController)
                        }
                        composable(Screens.Screen.PartTwo.route) {
                            PartTwoScreen()
                        }
                        composable(Screens.Screen.PartThree.route) {
                            PartThreeScreen()
                        }
                        composable(Screens.Screen.PartFour.route) {
                            PartFourScreen()
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun HomeScreen(navController: NavHostController) {
    val screens = Screens()
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(screens.screenList) {  screen ->
            Button(onClick = {
                navController.navigate(
                    screen.route
                )
            }) {
                Text(text = screen.title)
            }
        }
    }
}

@Preview
@Composable
fun HomePreview() {
    val navController = rememberNavController()
    HomeScreen(navController)
}
