package com.example.repository

import com.example.models.Clothing
import com.example.responses.ShoesResponse
/**
class ShoesRepositoryImpl: ShoesRepository {

    override val shoes = listOf(
        Clothing(
            clothingId = 1,
            category = "shoes",
            subtitle = "Shoes subtitle 1",
            name = "shoe1",
            image = "/images/shoes/shoe1.jpg",
            about = "shoes to wear on your feet",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 2,
            category = "shoes",
            subtitle = "Shoes subtitle 3",
            name = "shoe2",
            image = "/images/shoes/shoe2.jpg",
            about = "shoes to wear on your feet",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 3,
            category = "shoes",
            subtitle = "Shoes subtitle 3",
            name = "shoe3",
            image = "/images/shoes/shoe3.jpg",
            about = "shoes to wear on your feet",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 4,
            category = "shoes",
            subtitle = "Shoes subtitle 4",
            name = "shoe4",
            image = "/images/shoes/shoe4.jpg",
            about = "shoes to wear on your feet",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 5,
            category = "shoes",
            subtitle = "Shoes subtitle 5",
            name = "shoe5",
            image = "/images/shoes/shoe5.jpg",
            about = "shoes to wear on your feet",
            price = getRandomPrice()
        )
    )


    override suspend fun getAllShoes(page: Int, limit: Int): ShoesResponse {
        return ShoesResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                shoes = shoes,
                page = page,
                limit = limit,
            )["prevPage"],
            nextPage = calculatePage(
                shoes = shoes,
                page = page,
                limit = limit
            )["nextPage"],
            shoes = provideShoes(
                shoes = shoes,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        shoes: List<Clothing>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allShoes = shoes.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allShoes.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allShoes.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideShoes(
        shoes: List<Clothing>,
        page: Int,
        limit: Int
    ): List<Clothing> {
        val allShoes = shoes.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allShoes.size)
        return allShoes[page - 1]
    }
}**/