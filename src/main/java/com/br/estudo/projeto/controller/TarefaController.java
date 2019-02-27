package com.br.estudo.projeto.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.estudo.projeto.entity.Tarefa;
import com.br.estudo.projeto.service.TarefaService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

	@Autowired
	private TarefaService tarefaService;

	@PostMapping(value = "/adicionaTarefa", consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String postFormulario(@RequestBody String json)
			throws JsonParseException, JsonMappingException, IOException, JsonProcessingException {

		Tarefa tarefa = new Tarefa();
		ObjectMapper mapper = new ObjectMapper();
		tarefa = mapper.readValue(json, Tarefa.class);

		tarefaService.save(tarefa);
		return mapper.writeValueAsString(tarefa);
	}

	@GetMapping("/formulario")
	public String getFormulario() {
		return "formulario";
	}

	@GetMapping("/")
	public @ResponseBody Iterable<Tarefa> getTarefas() {
		return tarefaService.findAll();
	}

}
