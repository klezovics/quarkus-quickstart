package com.kcode.core;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface GreetingRepository : JpaRepository<Greeting, UUID> {
}