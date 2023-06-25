package com.cibertec.daw.CL3.controller;

import com.cibertec.daw.CL3.entity.Productos;
import com.cibertec.daw.CL3.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductosController {
    @Autowired
    private ProductosService productosService;

    @GetMapping("/listarProductos")
    public ResponseEntity<List<Productos>> listar(){
        return ResponseEntity.ok(productosService.listar());
    }
}
