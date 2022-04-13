package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Clothing


interface ClothingRepository {

    val clothing: List<Clothing>

    suspend fun getClothing(page: Int = 1, limit: Int = 4): ApiResponse
    suspend fun searchClothing(name: String?) : ApiResponse
}