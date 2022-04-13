package com.example.responses

import com.example.models.Clothing
import kotlinx.serialization.Serializable


@Serializable
data class AccessoryResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val accessories: List<Clothing> = emptyList(),
    val lastUpdated: Long? = null
)