package com.example.factura.Repository

import com.example.factura.Model.Detail
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface DetailRepository  : JpaRepository<Detail, Long?> {
    fun findById (id: Long?): Detail?

    @Query("SELECT * FROM detail WHERE invoice_id = :id", nativeQuery = true)
    fun findAllByInvoiceId(@Param("id") id: Long): List<Detail>
}