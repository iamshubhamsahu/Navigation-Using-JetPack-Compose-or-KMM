package com.example.navigationusedinjetpackcompose.android.screen

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.navigationusedinjetpackcompose.android.view.DetailScreen
import com.example.navigationusedinjetpackcompose.android.view.FieldScreen
import com.example.navigationusedinjetpackcompose.android.view.HomeScreen

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController, startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route, arguments = listOf(navArgument(DETAIL_ARGUMENT_KEY) {
                type = NavType.IntType
            }, navArgument(DETAIL_ARGUMENT_KEY2) {
                type = NavType.StringType
            })
        ) {
            Log.d("Args", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("Args", it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
            DetailScreen(navController = navController)
        }
        composable(
            route = Screen.Field.route
        ) {
            FieldScreen(navController = navController)
        }
    }
}