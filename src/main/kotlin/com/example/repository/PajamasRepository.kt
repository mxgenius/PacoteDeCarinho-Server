package com.example.repository

import com.example.models.Clothing
import com.example.responses.PajamasResponse

interface PajamasRepository {
    val pajamas: List<Clothing>

    suspend fun getAllPajamas(page: Int = 1, limit: Int = 3): PajamasResponse
}