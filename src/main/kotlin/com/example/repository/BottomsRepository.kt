package com.example.repository

import com.example.models.Clothing
import com.example.responses.BottomResponse

interface BottomsRepository {

    val bottoms: List<Clothing>

    suspend fun getAllBottoms(page: Int = 1, limit: Int = 3): BottomResponse
}