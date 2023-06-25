package com.cibertec.daw.CL3.service;

import com.cibertec.daw.CL3.entity.Productos;
import com.cibertec.daw.CL3.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {
    @Autowired
    private ProductosRepository productosRepository;

    public List<Productos> listar(){
        return productosRepository.findAll();
    }

    public void guardar(Productos p){
        productosRepository.save(p);
    }
}
