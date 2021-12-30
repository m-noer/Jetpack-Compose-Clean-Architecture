package com.example.jetpackcomposecleanarchitecture.di

import com.example.jetpackcomposecleanarchitecture.common.Constants
import com.example.jetpackcomposecleanarchitecture.data.remote.service.CoinListApi
import com.example.jetpackcomposecleanarchitecture.data.repository.CoinListRepositoryImpl
import com.example.jetpackcomposecleanarchitecture.domain.repository.CoinListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCoinListApi(): CoinListApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinListApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinListRepository(api: CoinListApi) : CoinListRepository {
        return CoinListRepositoryImpl(api)
    }
}