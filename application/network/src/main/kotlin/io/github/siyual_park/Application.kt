package io.github.siyual_park

import io.github.siyual_park.routes.getRootRoutes
import io.github.siyual_park.routes.pingRoutes
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
