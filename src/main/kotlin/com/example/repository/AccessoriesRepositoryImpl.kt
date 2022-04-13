package com.example.repository

import com.example.models.Clothing
import com.example.responses.AccessoryResponse
/**
class AccessoriesRepositoryImpl: AccessoriesRepository {

    override val accessories = listOf(

        Clothing(
            id = 1,
//            category = "accessory",
//            subtitle = "accessory subtitle 1",
            name = "sunglasses",
            image = "/images/accessories/accessories1.jpg",
            about = "Sunglasses are great for outdoors to block the sun from your eyes",
            price = getRandomPrice()
        ),
        Clothing(
            id = 2,
//            category = "accessory",
//            subtitle = "accessory subtitle 2",
            name = "bibs",
            image = "/images/accessories/accessories2.jpg",
            about = "bibs are great",
            price = getRandomPrice()
        ),
        Clothing(
            id = 3,
//            category = "accessory",
//            subtitle = "accessory subtitle 3",
            name = "socks",
            image = "/images/accessories/accessories3.jpg",
            about = "we have socks too, they are great",
            price = getRandomPrice()
        ),
        Clothing(
            id = 4,
//            category = "accessory",
//            subtitle = "accessory subtitle 4",
            name = "bows",
            image = "/images/accessories/accessories4.jpeg",
            about = "bows for the hair",
            price = getRandomPrice()
        ),
        Clothing(
            id = 5,
//            category = "accessory",
//            subtitle = "accessory subtitle 5",
            name = "backpacks",
            image = "/images/accessories/accessories5.jpg",
            about = "great for school or to carry things",
            price = getRandomPrice()
        ),
        Clothing(
            id = 6,
//            category = "accessory",
//            subtitle = "accessory subtitle 6",
            name = "purse",
            image = "/images/accessories/accessories6.jpg",
            about = "purse and jewelry",
            price = getRandomPrice()
        )
    )

    override suspend fun getAllAccessories(page: Int, limit: Int): AccessoryResponse {
        return AccessoryResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                accessories = accessories,
                page = page,
                limit = limit,
            )["prevPage"],
            nextPage = calculatePage(
                accessories = accessories,
                page = page,
                limit = limit
            )["nextPage"],
            accessories = provideAccessories(
                accessories = accessories,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        accessories: List<Clothing>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allAccessories = accessories.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allAccessories.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allAccessories.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideAccessories(
        accessories: List<Clothing>,
        page: Int,
        limit: Int
    ): List<Clothing> {
        val allAccessories = accessories.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allAccessories.size)
        return allAccessories[page - 1]
    }**/