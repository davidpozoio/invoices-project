package com.example.factura.Repository

import com.example.factura.Model.Client
import com.example.factura.Model.Invoice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface ClientRepository  : JpaRepository<Client, Long?> {
    fun findById (id: Long?): Client?

}