package com.example.navigationusedinjetpackcompose.android.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationusedinjetpackcompose.android.screen.Screen

@Composable
fun LogInScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
                 navController.navigate(Screen.SignUp.route)
            },
            text = "Login",
            color = Color.Cyan,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier
                .padding(top = 150.dp)
                .clickable {navController.navigate(Screen.SignUp.route)},
            text = "Sign-Up",
            color = Color.Blue,
            fontWeight = FontWeight.Medium
        )
        Text(
            modifier = Modifier
                .padding(top = 150.dp)
                .clickable {navController.navigate(Screen.Home.route)},
            text = "Go Back",
            color = Color.Blue,
            fontWeight = FontWeight.Medium
        )

    }
}

@Composable
@Preview(showBackground = true)
fun LogInScreenPreview() {
    LogInScreen(navController = rememberNavController())
}