package com.example.routes

import com.example.repository.ClothingRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.searchClothing(){
    val clothingRepository : ClothingRepository by inject()

    get("/pdc/clothing/search"){
        val name = call.request.queryParameters["name"]

        val apiResponse = clothingRepository.searchClothing(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}