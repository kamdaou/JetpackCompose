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
import com.example.jetpackcompose.presentation.partEighteen.PartEighteenScreen
import com.example.jetpackcompose.presentation.part_eight.PartEightScreen
import com.example.jetpackcompose.presentation.part_eleven.PartElevenScreen
import com.example.jetpackcompose.presentation.part_fifteen.PartFifteenScreen
import com.example.jetpackcompose.presentation.part_five.PartFiveScreen
import com.example.jetpackcompose.presentation.part_four.PartFourScreen
import com.example.jetpackcompose.presentation.part_nine.PartNineScreen
import com.example.jetpackcompose.presentation.part_nineteen.PartNineteenScreen
import com.example.jetpackcompose.presentation.part_one.PartOne
import com.example.jetpackcompose.presentation.part_seven.PartSevenScreen
import com.example.jetpackcompose.presentation.part_seventeen.PartSeventeenScreen
import com.example.jetpackcompose.presentation.part_six.PartSixScreen
import com.example.jetpackcompose.presentation.part_sixteen.PartSixteenScreen
import com.example.jetpackcompose.presentation.part_thirteen.PartThirteenScreen
import com.example.jetpackcompose.presentation.part_thirty_five.PartThirtyFiveScreen
import com.example.jetpackcompose.presentation.part_thirty_one.PartThirtyOneScreen
import com.example.jetpackcompose.presentation.part_thirty_three.PartThirtyThreeScreen
import com.example.jetpackcompose.presentation.part_thirty_two.PartThirtyTwoScreen
import com.example.jetpackcompose.presentation.part_three.PartThreeScreen
import com.example.jetpackcompose.presentation.part_twelve.PartTwelveScreen
import com.example.jetpackcompose.presentation.part_twenty.PartTwentyScreen
import com.example.jetpackcompose.presentation.part_twenty_eight.PartTwentyEightScreen
import com.example.jetpackcompose.presentation.part_twenty_five.PartTwentyFiveScreen
import com.example.jetpackcompose.presentation.part_twenty_nine.PartTwentyNineScreen
import com.example.jetpackcompose.presentation.part_twenty_one.PartTwentyOneScreen
import com.example.jetpackcompose.presentation.part_twenty_seven.PartTwentySevenScreen
import com.example.jetpackcompose.presentation.part_twenty_three.PartTwentyThreeScreen
import com.example.jetpackcompose.presentation.part_twenty_two.PartTwentyTwoScreen
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
                        composable(Screens.Screen.PartFive.route) {
                            PartFiveScreen()
                        }
                        composable(Screens.Screen.PartSix.route) {
                            PartSixScreen()
                        }
                        composable(Screens.Screen.PartSeven.route) {
                            PartSevenScreen()
                        }
                        composable(Screens.Screen.PartEight.route) {
                            PartEightScreen()
                        }
                        composable(Screens.Screen.PartEleven.route) {
                            PartElevenScreen()
                        }
                        composable(Screens.Screen.PartTwelve.route) {
                            PartTwelveScreen()
                        }
                        composable(Screens.Screen.PartThirteen.route) {
                            PartThirteenScreen()
                        }
                        composable(Screens.Screen.PartFifteen.route) {
                            PartFifteenScreen()
                        }
                        composable(Screens.Screen.PartSixteen.route) {
                            PartSixteenScreen()
                        }
                        composable(Screens.Screen.PartSeventeen.route) {
                            PartSeventeenScreen()
                        }
                        composable(Screens.Screen.PartEighteen.route) {
                            PartEighteenScreen()
                        }
                        composable(Screens.Screen.PartNineteen.route) {
                            PartNineteenScreen()
                        }
                        composable(Screens.Screen.PartTwenty.route) {
                            PartTwentyScreen()
                        }
                        composable(Screens.Screen.PartTwentyOne.route) {
                            PartTwentyOneScreen()
                        }
                        composable(Screens.Screen.PartTwentyTwo.route) {
                            PartTwentyTwoScreen()
                        }
                        composable(Screens.Screen.PartTwentyThree.route) {
                            PartTwentyThreeScreen()
                        }
                        composable(Screens.Screen.PartTwentyFive.route) {
                            PartTwentyFiveScreen()
                        }
                        composable(Screens.Screen.PartTwentySeven.route) {
                            PartTwentySevenScreen()
                        }
                        composable(Screens.Screen.PartTwentyEight.route) {
                            PartTwentyEightScreen()
                        }
                        composable(Screens.Screen.PartTwentyNine.route) {
                            PartTwentyNineScreen()
                        }
                        composable(Screens.Screen.PartThirtyOne.route) {
                            PartThirtyOneScreen()
                        }
                        composable(Screens.Screen.PartThirtyTwo.route) {
                            PartThirtyTwoScreen()
                        }
                        composable(Screens.Screen.PartThirtyThree.route) {
                            PartThirtyThreeScreen()
                        }
                        composable(Screens.Screen.PartThirtyFive.route) {
                            PartThirtyFiveScreen()
                        }
                        composable(Screens.Screen.PartNine.route) {
                            PartNineScreen()
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
