package com.lihan.data

import kotlinx.serialization.Serializable

@Serializable
data class Friend(
    val id: Int,
    val name: String
)