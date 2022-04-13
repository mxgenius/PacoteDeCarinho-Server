package com.example.repository

import com.example.models.Clothing
import com.example.responses.BodysuitsResponse

/**
class BodysuitsRepositoryImpl: BodysuitsRepository {

    override val bodysuits = listOf(
        Clothing(
            clothingId = 1,
            category = "bodysuit",
            subtitle = "Bodysuit subtitle 1",
            name = "bodysuit1",
            image = "/images/bodysuits/bodysuit1.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 2,
            category = "bodysuit",
            subtitle = "Bodysuit subtitle 2",
            name = "bodysuit2",
            image = "/images/bodysuits/bodysuit2.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 3,
            category = "bodysuit",
            subtitle = "Bodysuit subtitle 3",
            name = "bodysuit3",
            image = "/images/bodysuits/bodysuit3.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 4,
            category = "bodysuit",
            subtitle = "Bodysuit subtitle 4",
            name = "bodysuit4",
            image = "/images/bodysuits/bodysuit4.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 5,
            category = "bodysuit",
            subtitle = "Bodysuit subtitle 5",
            name = "bodysuit5",
            image = "/images/bodysuits/bodysuit5.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 6,
            category = "bodysuit",
            subtitle = "Bodysuit subtitle 6",
            name = "bodysuit6",
            image = "/images/bodysuits/bodysuit6.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        )
    )

    override suspend fun getAllBodysuits(page: Int, limit: Int): BodysuitsResponse {
        return BodysuitsResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                bodysuits = bodysuits,
                page = page,
                limit = limit
            )["prevPage"],
            nextPage = calculatePage(
                bodysuits = bodysuits,
                page = page,
                limit = limit
            )["nextPage"],
            bodysuits = provideBodysuits(
                bodysuits = bodysuits,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        bodysuits: List<Clothing>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allBodysuits = bodysuits.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allBodysuits.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allBodysuits.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideBodysuits(
        bodysuits: List<Clothing>,
        page: Int,
        limit: Int
    ): List<Clothing> {
        val allBodysuits = bodysuits.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allBodysuits.size)
        return allBodysuits[page - 1]
    }
}**/