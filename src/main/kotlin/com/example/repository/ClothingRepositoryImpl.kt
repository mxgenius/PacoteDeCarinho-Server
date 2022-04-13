package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Clothing

class ClothingRepositoryImpl : ClothingRepository {

    override val clothing = listOf(
        Clothing(
            id = 1,
            category = "accessory",
            name = "accessories1",
            image = "/images/clothing/accessories1.jpg",
            about = "all clothing",
            price = getRandomPrice()
        ),
        Clothing(
            id = 2,
            category = "accessory",
            name = "accessories2",
            image = "/images/clothing/accessories2.jpg",
            about = "all clothing",
            price = getRandomPrice()
        ),
        Clothing(
            id = 3,
            category = "accessory",
            name = "accessories3",
            image = "/images/clothing/accessories3.jpg",
            about = "all clothing",
            price = getRandomPrice()
        ),
        Clothing(
            id = 4,
            category = "accessory",
            name = "accessories4",
            image = "/images/clothing/accessories4.jpeg",
            about = "all clothing",
            price = getRandomPrice()
        ),
        Clothing(
            id = 5,
            category = "accessory",
            name = "accessories5",
            image = "/images/clothing/accessories5.jpg",
            about = "all clothing",
            price = getRandomPrice()
        ),
        Clothing(
            id = 6,
            category = "accessory",
            name = "accessories6",
            image = "/images/clothing/accessories6.jpg",
            about = "all clothing",
            price = getRandomPrice()
        ),
        Clothing(
            id = 7,
            category = "bodysuit",
            name = "bodysuit1",
            image = "/images/clothing/bodysuit1.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 8,
            category = "bodysuit",
            name = "bodysuit2",
            image = "/images/clothing/bodysuit2.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 9,
            category = "bodysuit",
            name = "bodysuit3",
            image = "/images/clothing/bodysuit3.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 10,
            category = "bodysuit",
            name = "bodysuit4",
            image = "/images/clothing/bodysuit4.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 11,
            category = "bodysuit",
            name = "bodysuit5",
            image = "/images/clothing/bodysuit5.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 12,
            category = "bodysuit",
            name = "bodysuit6",
            image = "/images/clothing/bodysuit6.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 13,
            category = "bottom",
            name = "bottom1",
            image = "/images/clothing/bottom1.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 14,
            category = "bottom",
            name = "bottom2",
            image = "/images/clothing/bottom2.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 15,
            category = "bottom",
            name = "bottom3",
            image = "/images/clothing/bottom3.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 16,
            category = "bottom",
            name = "bottom4",
            image = "/images/clothing/bottom4.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 17,
            category = "bundle",
            name = "bundle1",
            image = "/images/clothing/bundle1.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 18,
            category = "bundle",
            name = "bundle2",
            image = "/images/clothing/bundle2.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 19,
            category = "bundle",
            name = "bundle3",
            image = "/images/clothing/bundle3.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 20,
            category = "bundle",
            name = "bundle4",
            image = "/images/clothing/bundle4.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 21,
            category = "bundle",
            name = "bundle5",
            image = "/images/clothing/bundle5.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 22,
            category = "dress",
            name = "dress1",
            image = "/images/clothing/dress1.jpeg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 23,
            category = "dress",
            name = "dress2",
            image = "/images/clothing/dress2.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 24,
            category = "dress",
            name = "dress3",
            image = "/images/clothing/dress3.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 25,
            category = "dress",
            name = "dress4",
            image = "/images/clothing/dress4.jpeg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 26,
            category = "dress",
            name = "dress5",
            image = "/images/clothing/dress5.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 27,
            category = "outerwear",
            name = "outerwear1",
            image = "/images/clothing/outerwear1.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 28,
            category = "outerwear",
            name = "outerwear2",
            image = "/images/clothing/outerwear2.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 29,
            category = "outerwear",
            name = "outerwear3",
            image = "/images/clothing/outerwear3.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 30,
            category = "outerwear",
            name = "outerwear4",
            image = "/images/clothing/outerwear4.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 31,
            category = "pajamas",
            name = "pajamas1",
            image = "/images/clothing/pajamas1.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 32,
            category = "pajamas",
            name = "pajamas2",
            image = "/images/clothing/pajamas2.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 33,
            category = "pajamas",
            name = "pajamas3",
            image = "/images/clothing/pajamas3.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 34,
            category = "pajamas",
            name = "pajamas4",
            image = "/images/clothing/pajamas4.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 35,
            category = "shoes",
            name = "shoe1",
            image = "/images/clothing/shoe1.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 36,
            category = "shoes",
            name = "shoe2",
            image = "/images/clothing/shoe2.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 37,
            category = "shoes",
            name = "shoe3",
            image = "/images/clothing/shoe3.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 38,
            category = "shoes",
            name = "shoe4",
            image = "/images/clothing/shoe4.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 39,
            category = "shoes",
            name = "shoe5",
            image = "/images/clothing/shoe5.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 40,
            category = "swimwear",
            name = "swimwear1",
            image = "/images/clothing/swimwear1.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 41,
            category = "swimwear",
            name = "swimwear2",
            image = "/images/clothing/swimwear2.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 42,
            category = "swimwear",
            name = "swimwear3",
            image = "/images/clothing/swimwear3.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 43,
            category = "swimwear",
            name = "swimwear4",
            image = "/images/clothing/swimwear4.jpeg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 44,
            category = "tops",
            name = "tops1",
            image = "/images/clothing/tops1.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 45,
            category = "tops",
            name = "tops2",
            image = "/images/clothing/tops2.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 46,
            category = "tops",
            name = "tops3",
            image = "/images/clothing/tops3.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        ),
        Clothing(
            id = 47,
            category = "tops",
            name = "tops4",
            image = "/images/clothing/tops4.jpg",
            about = "bodysuit are very useful",
            price = getRandomPrice()
        )
    )

    override suspend fun getClothing(page: Int, limit: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                clothing = clothing,
                page = page,
                limit = limit,
            )["prevPage"],
            nextPage = calculatePage(
                clothing = clothing,
                page = page,
                limit = limit
            )["nextPage"],
            clothing = provideClothing(
                clothing = clothing,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    override suspend fun searchClothing(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            clothing = findClothing(query = name)
        )
    }

    fun calculatePage(
        clothing: List<Clothing>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allClothing = clothing.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allClothing.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allClothing.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideClothing(
        clothing: List<Clothing>,
        page: Int,
        limit: Int
    ): List<Clothing> {
        val allClothing = clothing.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allClothing.size)
        return allClothing[page - 1]
    }

    private fun findClothing(query: String?): List<Clothing> {
        val founded = mutableListOf<Clothing>()
        return if (!query.isNullOrEmpty()) {
            clothing.forEach { clothing ->
                if (clothing.name.lowercase().contains(query.lowercase())) {
                    founded.add(clothing)
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}