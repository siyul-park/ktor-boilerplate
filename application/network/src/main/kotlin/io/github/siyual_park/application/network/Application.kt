package io.github.siyual_park.application.network

import io.github.siyual_park.application.network.routes.getRootRoutes
import io.github.siyual_park.application.network.routes.pingRoutes
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.routing.Routing
import io.ktor.server.netty.EngineMain

fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module(testing: Boolean = false) {
    install(Routing) {
        getRootRoutes()
        pingRoutes()
    }
}
