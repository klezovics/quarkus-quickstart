package com.kcode.core

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "greetings")
data class Greeting(
    @Id
    val id: UUID = UUID.randomUUID(),
    val text: String
) {
    constructor() : this(UUID.randomUUID(), "")
}