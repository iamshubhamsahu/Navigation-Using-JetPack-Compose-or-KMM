package com.example.navigationusedinjetpackcompose.android.screen.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigationusedinjetpackcompose.android.screen.HOME_ROUTE
import com.example.navigationusedinjetpackcompose.android.screen.Screen
import com.example.navigationusedinjetpackcompose.android.view.*

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(startDestination = Screen.Home.route, route = HOME_ROUTE) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route
        ) {
            DetailScreen(navController = navController)
        }
        composable(
            route = Screen.Field.route
        ) {
            FieldScreen(navController = navController)
        }
    }
}