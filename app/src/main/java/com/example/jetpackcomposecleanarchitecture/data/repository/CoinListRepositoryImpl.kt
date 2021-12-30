package com.example.jetpackcomposecleanarchitecture.data.repository

import com.example.jetpackcomposecleanarchitecture.data.remote.response.CoinItemResponse
import com.example.jetpackcomposecleanarchitecture.data.remote.service.CoinListApi
import com.example.jetpackcomposecleanarchitecture.domain.repository.CoinListRepository
import javax.inject.Inject

class CoinListRepositoryImpl @Inject constructor(
    private val api: CoinListApi
) : CoinListRepository{
    override suspend fun getCoinList(): List<CoinItemResponse> {
        return api.getCoinList()
    }
}