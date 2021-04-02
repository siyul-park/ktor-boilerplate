package io.github.siyual_park.routes

import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get

fun Route.pingRoutes() {
    get("/ping") {
        call.respondText("pong")
    }
}
