package com.example.travelapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.travelapp.Destination.AuthenticationOption
import com.example.travelapp.Destination.Home
import com.example.travelapp.Destination.Login
import com.example.travelapp.Destination.Register
import com.example.travelapp.ui.theme.TravelAppTheme
import com.google.firebase.auth.FirebaseAuth


@Composable
fun NavComposeApp() {
    val navController = rememberNavController()
    val actions = remember(navController) { Action(navController) }
    val context = LocalContext.current
    var databaseHelper: UserDatabaseHelper = UserDatabaseHelper(context)

    TravelAppTheme {
        NavHost(
            navController = navController,
            startDestination = AuthenticationOption

        ) {
            composable(AuthenticationOption) {
                AuthenticationView(
                    register = actions.register,
                    login = actions.login
                )
            }
            composable(Register) {
                RegistrationScreen(context, databaseHelper)
            }

            composable(Login) {
                LoginScreen(
                    context, databaseHelper
                )
            }
            composable(Home) {
                Home(context)
            }
        }
    }
}

