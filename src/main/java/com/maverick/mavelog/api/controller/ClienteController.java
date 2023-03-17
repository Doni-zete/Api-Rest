package com.maverick.mavelog.api.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maverick.mavelog.domain.model.Cliente;
import com.maverick.mavelog.domain.repository.ClienteRepository;


@RestController
public class ClienteController {

//e uma interface do jacarta pertisisten	que e usado para fazer as operaçoes com as entidades e
//exclusões atualizaçoes entre outros
	@PersistenceContext
private EntityManager manager;
	
//	Queremos ingetar uma instancia
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
//		jpql e uma consulta 
		return manager.createQuery("from Cliente", Cliente.class)
				.getResultList();
		
	}
}
