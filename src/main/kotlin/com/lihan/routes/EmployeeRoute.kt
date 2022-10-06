package com.lihan.routes

import com.lihan.data.Employee
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.randomEmployee(){
    val employees = listOf<Employee>(
        Employee("Eddie"),
        Employee("Lee"),
        Employee("Leo"),
        Employee("Bob"),
    )

    get("/employee") {
        call.respond(
            HttpStatusCode.OK,
            employees.random()
        )

    }
}