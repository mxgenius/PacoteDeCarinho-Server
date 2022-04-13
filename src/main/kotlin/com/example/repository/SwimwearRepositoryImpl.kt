package com.example.repository

import com.example.models.Clothing
import com.example.responses.SwimwearResponse
/**
class SwimwearRepositoryImpl: SwimwearRepository {

    override val swimwear = listOf(

        Clothing(
            clothingId = 1,
            category = "swimwear",
            subtitle = "Swimwear Subtitle 1",
            name = "swimwear1",
            image = "/images/swimwear/swimwear1.jpg",
            about = "Swimwear is great for the beach",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 2,
            category = "swimwear",
            subtitle = "Swimwear Subtitle 2",
            name = "swimwear2",
            image = "/images/swimwear/swimwear2.jpg",
            about = "Swimwear is great for the pool",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 3,
            category = "swimwear",
            subtitle = "Swimwear Subtitle 3",
            name = "swimwear3",
            image = "/images/swimwear/swimwear3.jpg",
            about = "Swimwear is great for the tub",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 4,
            category = "swimwear",
            subtitle = "Swimwear Subtitle 4",
            name = "swimwear4",
            image = "/images/swimwear/swimwear4.jpeg",
            about = "Swimwear is great for the hose",
            price = getRandomPrice()
        )
    )

    override suspend fun getAllSwimwear(page: Int, limit: Int): SwimwearResponse {
        return SwimwearResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                swimwear = swimwear,
                page = page,
                limit = limit,
            )["prevPage"],
            nextPage = calculatePage(
                swimwear = swimwear,
                page = page,
                limit = limit
            )["nextPage"],
            swimwear = provideSwimwear(
                swimwear = swimwear,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        swimwear: List<Clothing>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allSwimwear = swimwear.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allSwimwear.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allSwimwear.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideSwimwear(
        swimwear: List<Clothing>,
        page: Int,
        limit: Int
    ): List<Clothing> {
        val allSwimwear = swimwear.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allSwimwear.size)
        return allSwimwear[page - 1]
    }
}**/