package com.example.responses

import com.example.models.Clothing


@kotlinx.serialization.Serializable
data class TopsResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val tops: List<Clothing> = emptyList(),
    val lastUpdated: Long? = null
)