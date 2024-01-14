package com.example.factura.mapper

import com.example.factura.Model.Product
import com.example.factura.dto.ProductDto

object ProductMapper{
    fun mapToDto(product: Product): ProductDto{
        return ProductDto(product.id, "${product.descripction} ${product.brand}")
    }
}