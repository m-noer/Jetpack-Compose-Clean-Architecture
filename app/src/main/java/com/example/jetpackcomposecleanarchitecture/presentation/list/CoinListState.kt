package com.example.jetpackcomposecleanarchitecture.presentation.list

import com.example.jetpackcomposecleanarchitecture.domain.model.CoinItem

data class CoinListState(
    val isLoading: Boolean = false,
    val data: List<CoinItem> = emptyList(),
    val errorMessage: String = ""
)