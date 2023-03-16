package com.maverick.mavelog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maverick.mavelog.domain.model.Cliente;


@RestController
public class ClienteController {


	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Yondaime HOKAGE ");
		cliente1.setEmail("yondaime@gmail.com");
		cliente1.setTelefone("11 97977-5050");
		
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Sakura");
		cliente2.setEmail("sakurinha@gmail.com");
		cliente2.setTelefone("15 94910-1050");
		
		
		Cliente cliente3 = new Cliente();
		cliente3.setId(3L);
		cliente3.setNome("Jiraya ");
		cliente3.setEmail("jiraya@gmail.com");
		cliente3.setTelefone("16 98977-5050");
		
		Cliente cliente4 = new Cliente();
		cliente4.setId(4L);
		cliente4.setNome("Goku ");
		cliente4.setEmail("kakarto@gmail.com");
		cliente4.setTelefone("17 98977-5050");
		
		return Arrays.asList(cliente1,cliente2,cliente3, cliente4);
		
	}
}
