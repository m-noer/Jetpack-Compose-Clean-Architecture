package com.example.jetpackcomposecleanarchitecture.domain.repository

import com.example.jetpackcomposecleanarchitecture.data.remote.response.CoinDetailsResponse
import com.example.jetpackcomposecleanarchitecture.data.remote.response.CoinItemResponse

interface CoinListRepository {
    suspend fun getCoinList(): List<CoinItemResponse>

//    suspend fun getCoinDetailsById(id: String): CoinDetailsResponse
}