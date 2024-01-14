package com.example.factura.Repository

import com.example.factura.Model.Invoice
import jakarta.persistence.NamedNativeQuery
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface InvoiceRepository  : JpaRepository<Invoice, Long?> {
    fun findById (id: Long?): Invoice?
    @Query(nativeQuery = true)
    fun filterTotal(total: Float): List<Invoice>

}