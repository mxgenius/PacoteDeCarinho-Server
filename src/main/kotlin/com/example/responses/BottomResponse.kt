package com.example.responses

import com.example.models.Clothing
import kotlinx.serialization.Serializable


@Serializable
data class BottomResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val bottoms: List<Clothing> = emptyList(),
    val lastUpdated: Long? = null
)