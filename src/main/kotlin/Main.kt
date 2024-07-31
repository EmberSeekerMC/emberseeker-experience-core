package cz.lukynka

import cz.lukynka.prettylog.LogType
import cz.lukynka.prettylog.LoggerSettings
import cz.lukynka.prettylog.LoggerStyle
import cz.lukynka.prettylog.log
import cz.lukynka.server.WebServer

lateinit var webServer: WebServer

fun main() {
    LoggerSettings.saveToFile = true
    LoggerSettings.loggerStyle = LoggerStyle.BRACKET_PREFIX_WHITE_TEXT

    val type = Environment.EC_TYPE

    log("Loading Ember Seeker Experience Core... ($type)", LogType.DEBUG)
    if(type.lowercase() == "server") {
        webServer = WebServer()
    }
}