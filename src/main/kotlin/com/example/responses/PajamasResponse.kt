package com.example.responses

import com.example.models.Clothing


@kotlinx.serialization.Serializable
data class PajamasResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val pajamas: List<Clothing> = emptyList(),
    val lastUpdated: Long? = null
)