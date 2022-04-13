package com.example.repository

import com.example.models.Clothing
import com.example.responses.BundlesResponse

interface BundlesRepository {

    val bundles: List<Clothing>

    suspend fun getAllBundles(page: Int = 1, limit: Int = 3): BundlesResponse
}