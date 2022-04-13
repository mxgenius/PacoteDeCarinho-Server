package com.example

import com.example.models.ApiResponse
import com.example.models.Clothing
import com.example.repository.ClothingRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.koin.java.KoinJavaComponent.inject
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {

    private val clothingRepository: ClothingRepository by inject(ClothingRepository::class.java)

    @Test
    fun `access root endpoint, assert correct information`() {
        withTestApplication(moduleFunction = Application::module) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = response.status()
                )
                assertEquals(
                    expected = "Welcome to Pacote De Carinho API",
                    actual = response.content
                )
            }
        }
    }
    @Test
    fun `access all clothing endpoint, query all pages, assert correct information`() {
        withTestApplication(moduleFunction = Application::module) {
            val pages = 1..5
            val clothing = clothingRepository.allClothing

            pages.forEach { page ->
                handleRequest(HttpMethod.Get, "/pdc/clothing?page=$page").apply {
                    println("CURRENT PAGE: $page")
                    assertEquals(
                        expected = HttpStatusCode.OK,
                        actual = response.status()
                    )
                    val actual = Json.decodeFromString<ApiResponse>(response.content.toString())
                    println("PREV PAGE: ${calculatePage(clothing = clothing, page = page, limit = 5)["prevPage"]}")
                    println("NEXT PAGE: ${calculatePage(clothing = clothing, page = page, limit = 5)["nextPage"]}")
                    println("CLOTHING: ${clothing[page -1]}")

                    val expected = ApiResponse(
                        success = true,
                        message = "ok",
                        prevPage = calculatePage(clothing = clothing, page = page, limit = 5)["prevPage"],
                        nextPage = calculatePage(clothing = clothing, page = page, limit = 5)["nextPage"],
                        allClothing = provideClothing(
                            clothing = clothing,
                            page = page,
                            limit = 5
                        ),
                        lastUpdated = actual.lastUpdated
                    )
                    assertEquals(
                        expected = expected,
                        actual = actual
                    )
                }
            }
        }
    }
    @Test
    fun `access popular clothing endpoint, query all pages, assert correct information`() {
        withTestApplication(moduleFunction = Application::module) {
            val pages = 1..5
            val clothing = clothingRepository.allClothing

            pages.forEach { page ->
                handleRequest(HttpMethod.Get, "/pdc/clothing?page=$page").apply {
                    println("CURRENT PAGE: $page")
                    assertEquals(
                        expected = HttpStatusCode.OK,
                        actual = response.status()
                    )
                    val actual = Json.decodeFromString<ApiResponse>(response.content.toString())
                    println("PREV PAGE: ${calculatePage(clothing = clothing, page = page, limit = 5)["prevPage"]}")
                    println("NEXT PAGE: ${calculatePage(clothing = clothing, page = page, limit = 5)["nextPage"]}")
                    println("CLOTHING: ${clothing[page -1]}")

                    val expected = ApiResponse(
                        success = true,
                        message = "ok",
                        prevPage = calculatePage(clothing = clothing, page = page, limit = 5)["prevPage"],
                        nextPage = calculatePage(clothing = clothing, page = page, limit = 5)["nextPage"],
                        allClothing = provideClothing(
                            clothing = clothing,
                            page = page,
                            limit = 5
                        ),
                        lastUpdated = actual.lastUpdated
                    )
                    assertEquals(
                        expected = expected,
                        actual = actual
                    )
                }
            }
        }
    }
    private fun calculatePage(
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
}