package com.example.repository

import com.example.models.Clothing
import com.example.responses.BodysuitsResponse

interface BodysuitsRepository {

    val bodysuits: List<Clothing>

    suspend fun getAllBodysuits(page: Int = 1, limit: Int = 3): BodysuitsResponse


}