package io.github.siyual_park.application.network.routes

import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get

fun Route.getRootRoutes() {
    get("/") {
        call.respondText("Hello, world!")
    }
}
