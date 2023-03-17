package com.maverick.mavelog.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maverick.mavelog.domain.model.Cliente;

import java.util.List;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,  Long>{

    List<Cliente> findByNome(String nome);

//    like do sql procura por alumas palavras ou letras
    List<Cliente> findByNomeContaining(String nome);
}
