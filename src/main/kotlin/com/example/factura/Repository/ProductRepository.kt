package com.example.factura.Repository

import com.example.factura.Model.Client
import com.example.factura.Model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface ProductRepository  : JpaRepository<Product, Long?> {
    fun findById (id: Long?): Product?

}