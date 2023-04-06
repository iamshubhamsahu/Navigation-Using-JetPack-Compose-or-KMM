package com.example.navigationusedinjetpackcompose.android.screen.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigationusedinjetpackcompose.android.screen.AUTHENTICATION_ROUTE
import com.example.navigationusedinjetpackcompose.android.screen.Screen
import com.example.navigationusedinjetpackcompose.android.view.LogInScreen
import com.example.navigationusedinjetpackcompose.android.view.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(startDestination = Screen.LogIn.route, route = AUTHENTICATION_ROUTE) {
        composable(
            route = Screen.LogIn.route
        ) {
            LogInScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }
    }
}