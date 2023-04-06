package com.example.navigationusedinjetpackcompose.android.screen

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"
const val AUTHENTICATION_ROUTE = "authentication"
const val ROOT_ROUTE = "root"
const val HOME_ROUTE = "home"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen")
    object Field : Screen(route = "field_screen")
    object LogIn : Screen(route = "login_screen")
    object SignUp : Screen(route = "signup_screen")
}