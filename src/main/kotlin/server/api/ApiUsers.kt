package cz.lukynka.server.api

import cz.lukynka.server.WebServer
import cz.lukynka.server.isAuth

class ApiUsers(webServer: WebServer) {

    init {
        webServer.server.get("/users/", ::isAuth) {
            it.respond("Getting all users")
        }

        webServer.server.get("/user/{USER}", ::isAuth) {
            val user = it.URLParameters["USER"] ?: throw Exception("User not specified!")
            it.respond(user)
        }
    }

}