package com.example.factura.Repository

import com.example.factura.Model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, String> {
    fun findByUsername(username: String): User?
}