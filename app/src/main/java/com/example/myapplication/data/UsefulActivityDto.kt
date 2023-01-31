package com.example.myapplication.data

import com.example.myapplication.entity.UsefulActivity
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import javax.inject.Inject

class UsefulActivityDto @Inject constructor(
    @SerializedName("activity")
    override var activity: String,
    @SerializedName("type")
    override var type: String,
    @SerializedName("participants")
    override var participants: Int,
    @SerializedName("price")
    override var price: Double,
    @SerializedName("link")
    override var link: String,
    @SerializedName("key")
    override var key: String,
    @SerializedName("accessibility")
    override var accessibility: Double
) : UsefulActivity, Serializable
