package com.br.estudo.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.estudo.projeto.entity.Tarefa;
import com.br.estudo.projeto.repository.TarefaRepository;

@Service
public class TarefaService {
	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	public Iterable<Tarefa> findAll() {
		return tarefaRepository.findAll();
	}
	
	public void save(Tarefa tarefa) {
		tarefaRepository.save(tarefa);
	}
}
