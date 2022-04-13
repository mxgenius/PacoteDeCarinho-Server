package com.example.repository

import com.example.models.Clothing
import com.example.responses.TopsResponse
/**
class TopsRepositoryImpl: TopsRepository {

    override val tops = listOf(

        Clothing(
            clothingId = 1,
            category = "tops",
            subtitle = "Top Subtitle 1",
            name = "tops1",
            image = "/images/tops/tops1.jpg",
            about = "tops are great for summerwear",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 2,
            category = "tops",
            subtitle = "Top Subtitle 2",
            name = "tops2",
            image = "/images/tops/tops2.jpg",
            about = "something something tops",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 3,
            category = "tops",
            subtitle = "Top Subtitle 3",
            name = "tops3",
            image = "/images/tops/tops3.jpg",
            about = "something tos",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 4,
            category = "tops",
            subtitle = "Top Subtitle 4",
            name = "tops4",
            image = "/images/tops/tops4.jpg",
            about = "write something about tops",
            price = getRandomPrice()
        )
    )

    override suspend fun getAllTops(page: Int, limit: Int): TopsResponse {
        return TopsResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                tops = tops,
                page = page,
                limit = limit,
            )["prevPage"],
            nextPage = calculatePage(
                tops = tops,
                page = page,
                limit = limit
            )["nextPage"],
            tops = provideTops(
                tops = tops,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        tops: List<Clothing>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allTops = tops.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allTops.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allTops.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideTops(
        tops: List<Clothing>,
        page: Int,
        limit: Int
    ): List<Clothing> {
        val allTops = tops.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allTops.size)
        return allTops[page - 1]
    }
}**/