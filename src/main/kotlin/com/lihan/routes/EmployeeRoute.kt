package com.lihan.routes

import com.lihan.data.Employee
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.net.URL


fun Route.randomEmployee(){

    get("/employees") {
        call.respond(
            HttpStatusCode.OK,
            URL("https://run.mocky.io/v3/7e83c8ed-ba75-4036-91b2-05bae5fb4cdb").readText()
        )

    }

}