package com.example.repository

import com.example.models.Clothing
import com.example.responses.BottomResponse
/**
class BottomsRepositoryImpl: BottomsRepository {

    override val bottoms = listOf(
        Clothing(
            clothingId = 1,
            category = "bottom",
            subtitle = "Bottom subtitle 1",
            name = "bottom1",
            image = "/images/bottoms/bottom1.jpg",
            about = "pants for any child",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 2,
            category = "bottom",
            subtitle = "Bottom subtitle 2",
            name = "bottom2",
            image = "/images/bottoms/bottom2.jpg",
            about = "pants for any child",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 3,
            category = "bottom",
            subtitle = "Bottom subtitle 3",
            name = "bottom3",
            image = "/images/bottoms/bottom3.jpg",
            about = "pants for any child",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 4,
            category = "bottom",
            subtitle = "Bottom subtitle 4",
            name = "bottom4",
            image = "/images/bottoms/bottom4.jpg",
            about = "pants for any child",
            price = getRandomPrice()
        )
    )

    override suspend fun getAllBottoms(page: Int, limit: Int): BottomResponse {
        return BottomResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                bottoms = bottoms,
                page = page,
                limit = limit,
            )["prevPage"],
            nextPage = calculatePage(
                bottoms = bottoms,
                page = page,
                limit = limit
            )["nextPage"],
            bottoms = provideBottoms(
                bottoms = bottoms,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        bottoms: List<Clothing>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allBottoms = bottoms.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allBottoms.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allBottoms.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideBottoms(
        bottoms: List<Clothing>,
        page: Int,
        limit: Int
    ): List<Clothing> {
        val allBottoms = bottoms.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allBottoms.size)
        return allBottoms[page - 1]
    }
}
        **/