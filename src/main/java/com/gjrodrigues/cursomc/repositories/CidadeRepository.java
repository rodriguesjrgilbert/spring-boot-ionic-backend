package com.gjrodrigues.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjrodrigues.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
