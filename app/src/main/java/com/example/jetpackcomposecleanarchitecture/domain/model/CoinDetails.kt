package com.example.jetpackcomposecleanarchitecture.domain.model

data class CoinDetails(
    val id: String,
    val name: String,
    val description: String,
    val firstDataAt: String,
    val lastDataAt: String,
    val symbol: String,
    val type: String
)