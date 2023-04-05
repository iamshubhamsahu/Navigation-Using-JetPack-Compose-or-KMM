package com.example.navigationusedinjetpackcompose.android.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigationusedinjetpackcompose.android.view.DetailScreen
import com.example.navigationusedinjetpackcompose.android.view.FieldScreen
import com.example.navigationusedinjetpackcompose.android.view.HomeScreen

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
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
        ){
            FieldScreen(navController = navController)
        }
    }
}