package com.example.plugins

import com.example.routes.getAllClothing
import com.example.routes.getPopularClothing
import com.example.routes.root
import com.example.routes.searchClothing
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*

fun Application.configureRouting() {

    routing {
        root()
        getAllClothing()
        getPopularClothing()
        searchClothing()
        static("/images"){
            resources("images")
        }
    }
}
