package com.cibertec.daw.CL3;

import com.cibertec.daw.CL3.entity.Clientes;
import com.cibertec.daw.CL3.entity.Productos;
import com.cibertec.daw.CL3.service.ClientesService;
import com.cibertec.daw.CL3.service.ProductosService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Cl3Application {

	public static void main(String[] args) {
		SpringApplication.run(Cl3Application.class, args);
	}

	// Inicializamos datos en la BD
	/*
		TODO: Realize un nuevo Proyecto debido a que mi API (BackEnd Proyecto) cuenta con autenticación JWT,
		 	y no se solicita un login en este examen.
		    La siguiente base de datos contiene algunas tablas creadas de nuestro proyecto original.
	*/

	//TODO: Debe crearse un SCHEMA en MYSQL con el nombre cl3_examen
	@Bean
	public CommandLineRunner clr(ClientesService userService, ProductosService productosService){
		return args -> {
			String[] clientName = {"Daniel","Pedro","Santiago","Jorge","Juan","Kiara","Gerardo"};
			String[] clientLastname = {"Orosco","Gonzales","Osorio","Aguilar","Gabriel","Gutierrez","Lopez"};
			for(int i = 0; i<7; i++) {
				var client = Clientes.builder()
						.nombres(clientName[i])
						.apellidos(clientLastname[i])
						.edad(20 + (i*2))
						.dni("12345678")
						.telefono("123456789")
						.build();
				userService.guardarCliente(client);
			}

			var producto = Productos.builder()
					.producto("Coca Cola")
					.precio(5.20)
					.descripcion("Bebida refrescante")
					.stock(50)
					.build();

			productosService.guardar(producto);
		};
	}
}
