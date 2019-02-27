package com.br.estudo.projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.estudo.projeto.entity.Tarefa;

@Repository
public interface TarefaRepository extends CrudRepository<Tarefa, Integer> {

}
