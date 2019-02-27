package com.br.estudo.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/projeto")
public class HelloWorldController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String teste() {
		return "teste";
	}
}
