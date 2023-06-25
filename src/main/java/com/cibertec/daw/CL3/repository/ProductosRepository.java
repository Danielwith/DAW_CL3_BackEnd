package com.cibertec.daw.CL3.repository;

import com.cibertec.daw.CL3.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {
}
