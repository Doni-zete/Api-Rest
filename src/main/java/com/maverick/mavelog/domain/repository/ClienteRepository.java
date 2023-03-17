package com.maverick.mavelog.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maverick.mavelog.domain.model.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,  Long>{

}
