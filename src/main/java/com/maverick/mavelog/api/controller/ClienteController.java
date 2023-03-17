package com.maverick.mavelog.api.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.maverick.mavelog.domain.model.Cliente;
import com.maverick.mavelog.domain.repository.ClienteRepository;


@AllArgsConstructor
@RestController
public class ClienteController {

    //e uma interface do jacarta pertisisten	que e usado para fazer as operaçoes com as entidades e
//exclusões atualizaçoes entre outros
    @PersistenceContext
    private EntityManager manager;

    //	Queremos injetar uma instancia
    @Autowired
    private ClienteRepository clienteRepository;


    @GetMapping("/clientes")
    public List<Cliente> listar() {
//		jpql e uma consulta
//		like do sql procura por alumas palavras ou letras
//		return clienteRepository.findByNomeContaining("Sa");
        return clienteRepository.findAll();
    }

    //	Buscar por um cliente
    @GetMapping("/clientes/{clienteId}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId) {
        return clienteRepository.findById(clienteId)
            .map(cliente -> ResponseEntity.ok(cliente))
                .orElse(ResponseEntity.notFound().build());
    }

//>>>>>>>>>    O mesmo resultado que o de cima<<<<<<<<<<<<<<<
//        Optional<Cliente> cliente = clienteRepository.findById(clienteId);
//        if(cliente.isPresent()){
//            return ResponseEntity.ok(cliente.get());
//        }
//        return ResponseEntity.notFound().build();
//    }

//    Vincula o corpo da requisção com o metodo




//    HttpStatus.CREATED status do codigo 201
    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

}
