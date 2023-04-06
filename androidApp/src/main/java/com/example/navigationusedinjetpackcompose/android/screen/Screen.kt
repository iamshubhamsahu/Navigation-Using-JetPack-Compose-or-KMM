package com.example.navigationusedinjetpackcompose.android.screen

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen?id={id}") {
        fun passId(id:Int = 0):String{
            return "detail_screen?id=$id"
        }

    }

    object Field : Screen(route = "field_screen")
}