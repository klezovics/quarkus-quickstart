package com.kcode.core

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
class GreetingController(
    @Autowired val greetingConfig: GreetingConfig,
    @Autowired val greetingService : GreetingService
) {
    @GetMapping
    fun hello() = "Hello ${greetingConfig.message()}"

    @GetMapping("/all")
    fun getAll() = greetingService.getAll()

    @GetMapping("/save/{greeting-text}")
    fun getAll(
        @PathVariable("greeting-text") greeting: String
    ) = greetingService.save(greeting)
}