package cz.lukynka

import cz.lukynka.prettylog.LogType
import cz.lukynka.prettylog.LoggerSettings
import cz.lukynka.prettylog.LoggerStyle
import cz.lukynka.prettylog.log

fun main() {
    LoggerSettings.saveToFile = true
    LoggerSettings.loggerStyle = LoggerStyle.BRACKET_PREFIX_WHITE_TEXT

    log("Loading Ember Seeker Experience Core...", LogType.DEBUG)
}