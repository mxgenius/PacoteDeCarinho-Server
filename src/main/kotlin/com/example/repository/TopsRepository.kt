package com.example.repository

import com.example.models.Clothing
import com.example.responses.TopsResponse

interface TopsRepository {

    val tops: List<Clothing>

    suspend fun getAllTops(page: Int = 1, limit: Int = 3): TopsResponse
}