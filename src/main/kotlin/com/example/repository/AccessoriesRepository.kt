package com.example.repository

import com.example.models.Clothing
import com.example.responses.AccessoryResponse

interface AccessoriesRepository {

    val accessories: List<Clothing>

    suspend fun getAllAccessories(page: Int = 1, limit: Int = 3): AccessoryResponse
}