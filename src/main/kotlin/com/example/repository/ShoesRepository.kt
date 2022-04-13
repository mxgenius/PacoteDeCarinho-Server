package com.example.repository

import com.example.models.Clothing
import com.example.responses.ShoesResponse

interface ShoesRepository {

    val shoes: List<Clothing>

    suspend fun getAllShoes(page: Int = 1, limit: Int = 3): ShoesResponse
}