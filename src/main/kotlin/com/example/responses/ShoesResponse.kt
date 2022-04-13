package com.example.responses

import com.example.models.Clothing


@kotlinx.serialization.Serializable
data class ShoesResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val shoes: List<Clothing> = emptyList(),
    val lastUpdated: Long? = null
)