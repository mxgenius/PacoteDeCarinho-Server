package com.example.repository

import com.example.models.Clothing
import com.example.responses.PajamasResponse

/**
class PajamasRepositoryImpl : PajamasRepository{

    override val pajamas = listOf(

        Clothing(
            clothingId = 1,
            category = "pajamas",
            subtitle = "Pajamas Subtitle 1",
            name = "pajamas1",
            image = "/images/pajamas/pajamas1.jpg",
            about = "pajamas for bedtime",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 2,
            category = "pajamas",
            subtitle = "Pajamas Subtitle 2",
            name = "pajamas2",
            image = "/images/pajamas/pajamas2.jpg",
            about = "pajamas for bedtime",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 3,
            category = "pajamas",
            subtitle = "Pajamas Subtitle 3",
            name = "pajamas3",
            image = "/images/pajamas/pajamas3.jpg",
            about = "pajamas for bedtime",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 4,
            category = "pajamas",
            subtitle = "Pajamas Subtitle 4",
            name = "pajamas4",
            image = "/images/pajamas/pajamas4.jpg",
            about = "pajamas for bedtime",
            price = getRandomPrice()
        ),
    )

    override suspend fun getAllPajamas(page: Int, limit: Int): PajamasResponse {
        return PajamasResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                pajamas = pajamas,
                page = page,
                limit = limit,
            )["prevPage"],
            nextPage = calculatePage(
                pajamas = pajamas,
                page = page,
                limit = limit
            )["nextPage"],
            pajamas = providePajamas(
                pajamas = pajamas,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        pajamas: List<Clothing>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allPajamas = pajamas.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allPajamas.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allPajamas.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun providePajamas(
        pajamas: List<Clothing>,
        page: Int,
        limit: Int
    ): List<Clothing> {
        val allPajamas = pajamas.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allPajamas.size)
        return allPajamas[page - 1]
    }
}
        **/