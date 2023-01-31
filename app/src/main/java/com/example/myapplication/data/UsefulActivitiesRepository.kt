package com.example.myapplication.data

import com.example.myapplication.entity.ApiRequest
import com.example.myapplication.entity.UsefulActivity
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class UsefulActivitiesRepository @Inject constructor(private val apiRequest: ApiRequest) {

        suspend fun getUsefulActivity(): UsefulActivity {
            return apiRequest.getActivity()
        }
}
