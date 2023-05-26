package com.kcode.core

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class GreetingService(
    @Autowired val greetingRepository: GreetingRepository
) {
    fun getAll() = greetingRepository.findAll()
    fun save(greeting: String): UUID {
        val g = Greeting(text = greeting)
        return greetingRepository.save(g).id
    }
}
