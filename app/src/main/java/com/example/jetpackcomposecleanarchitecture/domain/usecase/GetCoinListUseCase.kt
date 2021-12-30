package com.example.jetpackcomposecleanarchitecture.domain.usecase

import com.example.jetpackcomposecleanarchitecture.common.Resource
import com.example.jetpackcomposecleanarchitecture.data.remote.response.toCoinItem
import com.example.jetpackcomposecleanarchitecture.domain.model.CoinItem
import com.example.jetpackcomposecleanarchitecture.domain.repository.CoinListRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinListUseCase @Inject constructor(
    private val repository: CoinListRepository
) {
    operator fun invoke(): Flow<Resource<List<CoinItem>>> = flow {
        try {
            emit(Resource.Loading<List<CoinItem>>())
            val coins = repository.getCoinList().map { it.toCoinItem() }
            emit(Resource.Success<List<CoinItem>>(coins))
        } catch (e: HttpException) {
            emit(Resource.Error<List<CoinItem>>(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error<List<CoinItem>>("Couldn`t reach server!"))
        }
    }
}