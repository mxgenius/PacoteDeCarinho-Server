package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Clothing(
    val id: Int,
    val category: String,
    val name: String,
    val image: String,
    val about: String,
    val price: Double
)