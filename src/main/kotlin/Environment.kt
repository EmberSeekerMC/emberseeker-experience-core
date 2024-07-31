package cz.lukynka

import io.github.cdimascio.dotenv.Dotenv

object Environment {

    private val dotenv = Dotenv.load()!!

    val EC_TYPE: String = dotenv.get("EC_TYPE")
    val EC_TOKEN: String = dotenv.get("EC_TOKEN")
    val EC_WEB_PORT: Int = dotenv.get("EC_WEB_PORT").toInt()
    val EC_TCP_PORT: Int = dotenv.get("EC_TCP_PORT").toInt()
    val DB_USER: String = dotenv.get("DB_USER")
    val DB_PASSWORD: String = dotenv.get("DB_PASSWORD")
    val DB_URL: String = dotenv.get("DB_URL")
}