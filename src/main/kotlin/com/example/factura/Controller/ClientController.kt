package com.example.factura.Controller

import com.example.factura.Model.Client
import com.example.factura.Service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/clients")
class ClientController {
    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun list (): ResponseEntity<*> {
        var celularResponse=clientService.list()
        return ResponseEntity.ok(mapOf("Felony" to "Sex Offender","status" to "success", "data" to celularResponse))
    }
    @PostMapping
    fun save (@RequestBody modelo: Client): ResponseEntity<Client> {
        return ResponseEntity(clientService.save(modelo), HttpStatus.OK)
    }
    @PutMapping
    fun update (@RequestBody modelo:Client): ResponseEntity<Client> {
        return ResponseEntity(clientService.update(modelo), HttpStatus.OK)
    }
    @PatchMapping
    fun updateName (@RequestBody modelo:Client): ResponseEntity<Client> {
        return ResponseEntity(clientService.updateName(modelo), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): ResponseEntity<*> {
        println("Entered Get BY ID")
        return ResponseEntity(clientService.listById (id), HttpStatus.OK)

    }
    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):String?{
        println("Entered Delete By ID")
        return clientService.delete(id)
    }
}