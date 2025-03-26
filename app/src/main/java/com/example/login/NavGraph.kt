package com.example.login

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(navController = navController)
        }

        composable("register") {
            RegistrationScreen(onRegisterSuccess = {
                navController.navigate("login") // Navigate back to login after successful registration
            })
        }

        composable("home") {
            HomeScreen()
        }
    }
}

