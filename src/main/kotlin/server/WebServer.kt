package cz.lukynka.server

import cz.lukynka.Environment
import cz.lukynka.lkws.LightweightWebServer
import cz.lukynka.lkws.responses.Response
import cz.lukynka.server.api.ApiUsers

class WebServer {

    val server = LightweightWebServer(Environment.EC_WEB_PORT)

    init {
        server.get("/", ::isAuth) {
            it.respond("Ember Seeker Internal API")
        }

        ApiUsers(this)
    }
}

fun isAuth(response: Response): Boolean {
    return response.requestHeaders["Authorization"] == Environment.EC_TOKEN
}
