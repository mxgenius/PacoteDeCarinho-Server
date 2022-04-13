package com.example.repository

import com.example.models.Clothing
import com.example.responses.BundlesResponse
/**
class BundlesRepositoryImpl : BundlesRepository {

    override val bundles = listOf(
        Clothing(
            clothingId = 1,
            category = "bundle",
            subtitle = "Bundle Subtitle 1",
            name = "bundle1",
            image = "/images/bundles/bundle1.jpg",
            about = "You can even bundle all clothes",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 2,
            category = "bundle",
            subtitle = "Bundle Subtitle 2",
            name = "bundle2",
            image = "/images/bundles/bundle2.jpg",
            about = "You can even bundle all clothes",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 3,
            category = "bundle",
            subtitle = "Bundle Subtitle 3",
            name = "bundle3",
            image = "/images/bundles/bundle3.jpg",
            about = "You can even bundle all clothes",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 4,
            category = "bundle",
            subtitle = "Bundle Subtitle 4",
            name = "bundle4",
            image = "/images/bundles/bundle4.jpg",
            about = "You can even bundle all clothes",
            price = getRandomPrice()
        ),
        Clothing(
            clothingId = 5,
            category = "bundle",
            subtitle = "Bundle Subtitle 5",
            name = "bundle5",
            image = "/images/bundles/bundle5.jpg",
            about = "You can even bundle all clothes",
            price = getRandomPrice()
        )
    )

    override suspend fun getAllBundles(page: Int, limit: Int): BundlesResponse {
        return BundlesResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                bundles = bundles,
                page = page,
                limit = limit,
            )["prevPage"],
            nextPage = calculatePage(
                bundles = bundles,
                page = page,
                limit = limit
            )["nextPage"],
            bundles = provideBundles(
                bundles = bundles,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }
    private fun calculatePage(
        bundles: List<Clothing>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allBundles = bundles.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allBundles.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allBundles.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideBundles(
        bundles: List<Clothing>,
        page: Int,
        limit: Int
    ): List<Clothing> {
        val allBundles = bundles.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allBundles.size)
        return allBundles[page - 1]
    }
}
        **/