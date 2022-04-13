package com.example.repository

import com.example.models.Clothing
import com.example.responses.PopularResponse

interface PopularClothingRepository{

    val popularClothing : List<Clothing>

    suspend fun getPopularClothing(page: Int = 1, limit: Int = 4): PopularResponse
}