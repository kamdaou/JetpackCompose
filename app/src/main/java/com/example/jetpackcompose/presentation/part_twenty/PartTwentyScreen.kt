package com.example.jetpackcompose.presentation.part_twenty

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PartTwentyScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavBar(
                navController = navController, items = listOf(
                    BottomNavItem(
                        name = "Home",
                        route = "home",
                        icon = Icons.Default.Home
                    ),
                    BottomNavItem(
                        name = "Chat",
                        route = "chat",
                        icon = Icons.Default.Notifications,
                        badge = 23
                    ),
                    BottomNavItem(
                        name = "Settings",
                        route = "settings",
                        icon = Icons.Default.Settings,
                        badge = 214
                    ),
                ), onItemClicked = {
                    navController.navigate(it.route)
                }
            )
        }
    ) { padding ->
        Navigation(navController = navController, modifier = Modifier.padding(padding))
    }
}

@Composable
private fun Navigation(navController: NavHostController, modifier: Modifier) {
    NavHost(navController = navController, startDestination = Navigation.Home.route) {
        composable(route = Navigation.Home.route) {
            HomeScreen(modifier)
        }
        composable(route = Navigation.Chat.route) {
            ChatScreen(modifier)
        }
        composable(route = Navigation.Settings.route) {
            SettingsScreen(modifier)
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text("Home screen")
    }
}

@Composable
fun ChatScreen(modifier: Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text("Chat screen")
    }
}

@Composable
fun SettingsScreen(modifier: Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text("Settings screen")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavBar(
    navController: NavController,
    items: List<BottomNavItem>,
    modifier: Modifier = Modifier,
    onItemClicked: (item: BottomNavItem) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()

    NavigationBar(
        modifier = modifier,
        containerColor = Color.DarkGray,
        tonalElevation = 5.dp
    ) {
        items.forEach {
            val selected = it.route == backStackEntry.value?.destination?.route

            NavigationBarItem(
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Green,
                    selectedTextColor = Color.Green,
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray
                ),
                selected = selected,
                onClick = {
                    onItemClicked(it)
                },
                icon = {
                    Column() {
                        if (it.badge > 0) {
                            BadgedBox(
                                badge = {
                                    Badge {
                                        Text(
                                            it.badge.toString(),
                                            Modifier.semantics {
                                                contentDescription = "${it.badge} new notifications"
                                            }
                                        )
                                    }
                                }
                            ) {
                                Icon(imageVector = it.icon, contentDescription = it.name)
                            }
                        }
                        else {
                            Icon(imageVector = it.icon, contentDescription = it.name)
                        }
                    }
                },
                label = {
                    Text(
                        text = it.name,
                        textAlign = TextAlign.Center,
                        fontSize = 10.sp
                    )
                },
                alwaysShowLabel = false,
            )
        }
    }
}
