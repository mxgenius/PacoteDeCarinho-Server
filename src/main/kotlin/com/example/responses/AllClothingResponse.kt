package com.example.responses

import com.example.models.Clothing


@kotlinx.serialization.Serializable
data class AllClothingResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val allClothing: List<Clothing> = emptyList(),
    val lastUpdated: Long? = null
)