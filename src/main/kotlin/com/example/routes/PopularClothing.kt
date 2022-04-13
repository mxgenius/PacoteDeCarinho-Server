package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.PopularClothingRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.getPopularClothing(){
    val popularClothingRepository: PopularClothingRepository by inject()

    get("/pdc/clothing/popular"){
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            val limit = call.request.queryParameters["limit"]?.toInt() ?: 4

            val apiResponse = popularClothingRepository.getPopularClothing(
                page = page, limit = limit
            )
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException){
            call.respond(
                message = ApiResponse(success = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        }catch (e: IllegalArgumentException){
            call.respond(
                message = ApiResponse(success = false, message = "Clothing not Found"),
                status = HttpStatusCode.NotFound
            )
        }
    }
}