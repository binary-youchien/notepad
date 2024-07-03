package io.github.binaryyouchien.notpad

import io.github.binaryyouchien.notpad.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureDatabases()
    configureHTTP()
    configureSecurity()
    configureRouting()
}
