package com.cibertec.daw.CL3.controller;

import com.cibertec.daw.CL3.entity.Clientes;
import com.cibertec.daw.CL3.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    @Autowired
    private ClientesService clientesService;

    @GetMapping("/listarClientes")
    public ResponseEntity<List<Clientes>> listarClientes(){
        try {
            return ResponseEntity.ok(clientesService.listarClientes());
        } catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
}
