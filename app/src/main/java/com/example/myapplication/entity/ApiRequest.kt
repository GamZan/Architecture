package com.example.myapplication.entity

import com.example.myapplication.data.UsefulActivityDto
import retrofit2.http.GET

interface ApiRequest {
    @GET("activity/")
    suspend fun getActivity(): UsefulActivityDto

}