package com.example.repository

import com.example.models.Clothing
import com.example.responses.DressResponse
/**
class DressesRepositoryImpl: DressesRepository {

    override val dresses = listOf(
        Clothing(
            clothingId = 1,
            category = "dress",
            subtitle = "Dress Subtitle 1",
            name = "dress1",
            image = "/images/dresses/dress1.jpeg",
            about = "dresses are for girls only",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 2,
            category = "dress",
            subtitle = "Dress Subtitle 2",
            name = "dress2",
            image = "/images/dresses/dress2.jpg",
            about = "dresses are for girls only",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 3,
            category = "dress",
            subtitle = "Dress Subtitle 3",
            name = "dress3",
            image = "/images/dresses/dress3.jpg",
            about = "dresses are for girls only",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 4,
            category = "dress",
            subtitle = "Dress Subtitle 4",
            name = "dress4",
            image = "/images/dresses/dress4.jpeg",
            about = "dresses are for girls only",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 5,
            category = "dress",
            subtitle = "Dress Subtitle 5",
            name = "dress5",
            image = "/images/dresses/dress5.jpg",
            about = "dresses are for girls only",
            price = getRandomPrice()
        )
    )

    override suspend fun getAllDresses(page: Int, limit: Int): DressResponse {
        return DressResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                dresses = dresses,
                page = page,
                limit = limit,
            )["prevPage"],
            nextPage = calculatePage(
                dresses = dresses,
                page = page,
                limit = limit
            )["nextPage"],
            dresses = provideDresses(
                dresses = dresses,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        dresses: List<Clothing>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allDresses = dresses.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allDresses.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allDresses.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideDresses(
        dresses: List<Clothing>,
        page: Int,
        limit: Int
    ): List<Clothing> {
        val allDresses = dresses.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allDresses.size)
        return allDresses[page - 1]
    }

}

 **/