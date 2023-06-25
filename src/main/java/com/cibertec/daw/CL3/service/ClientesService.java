package com.cibertec.daw.CL3.service;

import com.cibertec.daw.CL3.entity.Clientes;
import com.cibertec.daw.CL3.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {
    @Autowired
    private ClientesRepository repo;

    public List<Clientes> listarClientes(){
        return repo.findAll();
    }

    public void guardarCliente(Clientes bean){
        repo.save(bean);
    }
}
