package com.example.myapplication.entity

import com.example.myapplication.data.UsefulActivityDto
import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET

interface UsefulActivity {
    var activity: String
    var type: String
    var participants: Int
    var price: Double
    var link: String
    var key: String
    var accessibility: Double
}




//@GET("activity/")
//fun getActivity(): Call<UsefulActivityDto>