package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.BodysuitsRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllBodysuits(){
    val bodysuitsRepository: BodysuitsRepository by inject()

    get("/pdc/clothing/bodysuits"){
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            val limit = call.request.queryParameters["limit"]?.toInt() ?: 3

            val apiResponse = bodysuitsRepository.getAllBodysuits(
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