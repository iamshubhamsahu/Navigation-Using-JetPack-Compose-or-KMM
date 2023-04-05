package com.example.navigationusedinjetpackcompose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform