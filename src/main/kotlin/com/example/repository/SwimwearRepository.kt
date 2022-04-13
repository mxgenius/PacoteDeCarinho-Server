package com.example.repository

import com.example.models.Clothing
import com.example.responses.SwimwearResponse

interface SwimwearRepository {

    val swimwear: List<Clothing>

    suspend fun getAllSwimwear(page: Int = 1, limit: Int = 3): SwimwearResponse
}