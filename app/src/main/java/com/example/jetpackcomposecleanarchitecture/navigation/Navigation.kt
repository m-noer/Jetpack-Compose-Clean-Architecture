package com.example.jetpackcomposecleanarchitecture.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposecleanarchitecture.presentation.list.CoinListScreen

@OptIn(ExperimentalComposeUiApi::class)
@ExperimentalAnimationApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.CoinListScreen.route
    ) {

        composable(
            route = Screen.CoinListScreen.route
        ) {
            CoinListScreen(navController)
        }

    }
}