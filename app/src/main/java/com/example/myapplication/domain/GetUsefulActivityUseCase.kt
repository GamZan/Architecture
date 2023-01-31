package com.example.myapplication.domain

import com.example.myapplication.data.UsefulActivitiesRepository
import com.example.myapplication.entity.UsefulActivity
import dagger.Module
import dagger.Provides
import javax.inject.Inject

class GetUsefulActivityUseCase @Inject constructor (private val usefulActivitiesRepository: UsefulActivitiesRepository) {

    suspend fun execute() : UsefulActivity {
       return usefulActivitiesRepository.getUsefulActivity()
    }
}