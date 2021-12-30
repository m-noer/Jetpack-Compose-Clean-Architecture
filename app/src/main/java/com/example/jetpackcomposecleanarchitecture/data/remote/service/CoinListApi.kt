package com.example.jetpackcomposecleanarchitecture.data.remote.service

import com.example.jetpackcomposecleanarchitecture.data.remote.response.CoinItemResponse
import retrofit2.http.GET

interface CoinListApi {

    @GET("/v1/coins")
    suspend fun getCoinList(): List<CoinItemResponse>
}