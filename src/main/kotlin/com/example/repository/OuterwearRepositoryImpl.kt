package com.example.repository

import com.example.models.Clothing
import com.example.responses.OuterwearResponse

/**
class OuterwearRepositoryImpl: OuterwearRepository {

    override val outerwear = listOf(
        Clothing(
            clothingId = 1,
            category = "outerwear",
            subtitle = "Outwear Subtitle 1",
            name = "outerwear1",
            image = "/images/outerwear/outerwear1.jpg",
            about = "outerwear good for cold weather",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 2,
            category = "outerwear",
            subtitle = "Outwear Subtitle 2",
            name = "outerwear2",
            image = "/images/outerwear/outerwear2.jpg",
            about = "outerwear good for cold weather",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 3,
            category = "outerwear",
            subtitle = "Outwear Subtitle 3",
            name = "outerwear3",
            image = "/images/outerwear/outerwear3.jpg",
            about = "outerwear good for cold weather",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 4,
            category = "outerwear",
            subtitle = "Outwear Subtitle 4",
            name = "outerwear4",
            image = "/images/outerwear/outerwear4.jpg",
            about = "outerwear good for cold weather",
            price = getRandomPrice()
        )
    )

    override suspend fun getAllOuterwear(page: Int, limit: Int): OuterwearResponse {
        return OuterwearResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                outerwear = outerwear,
                page = page,
                limit = limit,
            )["prevPage"],
            nextPage = calculatePage(
                outerwear = outerwear,
                page = page,
                limit = limit
            )["nextPage"],
            outerwear = provideOuterwear(
                outerwear = outerwear,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        outerwear: List<Clothing>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allOuterwear = outerwear.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allOuterwear.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allOuterwear.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideOuterwear(
        outerwear: List<Clothing>,
        page: Int,
        limit: Int
    ): List<Clothing> {
        val allOuterwear = outerwear.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allOuterwear.size)
        return allOuterwear[page - 1]
    }
}
        **/