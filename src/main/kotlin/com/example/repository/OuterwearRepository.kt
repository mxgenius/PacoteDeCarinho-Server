package com.example.repository

import com.example.models.Clothing
import com.example.responses.OuterwearResponse

interface OuterwearRepository {
    val outerwear: List<Clothing>

    suspend fun getAllOuterwear(page: Int = 1, limit: Int = 3): OuterwearResponse
}