package com.example.repository

import com.example.models.Clothing
import com.example.responses.PopularResponse


class PopularClothingRepositoryImpl : PopularClothingRepository {

    override val popularClothing = listOf(
        Clothing(
            id = 1,
            category = "popular",
            name = "accessories1",
            image = "/images/popular/accessories1.jpg",
            about = "all clothing",
            price = getRandomPrice()
        ),
        Clothing(
            id = 2,
            category = "popular",
            name = "bottom1",
            image = "/images/popular/bottom1.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 3,
            category = "popular",
            name = "dress1",
            image = "/images/popular/dress1.jpeg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 4,
            category = "popular",
            name = "dress4",
            image = "/images/popular/dress4.jpeg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 5,
            category = "popular",
            name = "outerwear2",
            image = "/images/popular/outerwear2.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 6,
            category = "popular",
            name = "outerwear3",
            image = "/images/popular/outerwear3.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 7,
            category = "popular",
            name = "pajamas4",
            image = "/images/popular/pajamas4.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 8,
            category = "popular",
            name = "shoe1",
            image = "/images/popular/shoe1.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 9,
            category = "popular",
            name = "swimwear2",
            image = "/images/popular/swimwear2.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 10,
            category = "popular",
            name = "swimwear3",
            image = "/images/popular/swimwear3.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 11,
            category = "popular",
            name = "swimwear4",
            image = "/images/popular/swimwear4.jpeg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 12,
            category = "popular",
            name = "tops4",
            image = "/images/popular/tops4.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        )
    )


    override suspend fun getPopularClothing(page: Int, limit: Int): PopularResponse {
        return PopularResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                popularClothing = popularClothing,
                page = page,
                limit = limit,
            )["prevPage"],
            nextPage = calculatePage(
                popularClothing = popularClothing,
                page = page,
                limit = limit
            )["nextPage"],
            popularClothing = provideClothing(
                popularClothing = popularClothing,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        popularClothing: List<Clothing>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val clothing = popularClothing.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= clothing.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == clothing.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideClothing(
        popularClothing: List<Clothing>,
        page: Int,
        limit: Int
    ): List<Clothing> {
        val allPopularClothing = popularClothing.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allPopularClothing.size)
        return allPopularClothing[page - 1]
    }
}