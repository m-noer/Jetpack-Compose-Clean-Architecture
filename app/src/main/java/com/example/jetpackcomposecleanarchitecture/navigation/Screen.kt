package com.example.jetpackcomposecleanarchitecture.navigation

sealed class Screen(val route: String) {
    object CoinListScreen : Screen("main_screen")
}
