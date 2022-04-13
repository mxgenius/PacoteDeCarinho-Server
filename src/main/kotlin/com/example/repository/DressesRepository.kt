package com.example.repository

import com.example.models.Clothing
import com.example.responses.DressResponse

interface DressesRepository {

    val dresses: List<Clothing>

    suspend fun getAllDresses(page: Int = 1, limit: Int = 3): DressResponse
}