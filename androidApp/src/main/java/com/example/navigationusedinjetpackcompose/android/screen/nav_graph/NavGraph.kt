package com.example.navigationusedinjetpackcompose.android.screen.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import com.example.navigationusedinjetpackcompose.android.screen.HOME_ROUTE
import com.example.navigationusedinjetpackcompose.android.screen.ROOT_ROUTE
import com.example.navigationusedinjetpackcompose.android.screen.Screen

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController, startDestination = HOME_ROUTE, route = ROOT_ROUTE
    ) {

        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}