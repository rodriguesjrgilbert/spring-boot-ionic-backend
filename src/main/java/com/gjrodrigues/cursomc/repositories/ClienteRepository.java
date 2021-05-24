package com.gjrodrigues.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjrodrigues.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
