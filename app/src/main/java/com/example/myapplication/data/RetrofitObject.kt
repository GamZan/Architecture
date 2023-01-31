package com.example.myapplication.data

import android.app.Application
import com.example.myapplication.entity.ApiRequest
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object RetrofitObject {
    @Provides
    fun providesBaseUrl(): String{
        return "https://www.boredapi.com/api/"
    }
    @Provides
    fun providesConverterFactory(): Converter.Factory{
        return GsonConverterFactory.create()
    }
    @Provides
    fun providesRetrofitClient(baseUrl: String, converterFactory: Converter.Factory): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(converterFactory)
            .build()
    }
    @Provides
    fun providesRestApiServices(retrofit: Retrofit): ApiRequest {
        return retrofit.create(ApiRequest::class.java)
    }
}