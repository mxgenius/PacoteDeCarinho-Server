package com.example.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.root(){
    get("/"){
        call.respond(
            message = "Welcome to Pacote De Carinho API",
            status = HttpStatusCode.OK
        )
    }
}