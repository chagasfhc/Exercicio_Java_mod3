package br.com.fuctura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JogadorController {
	
	@GetMapping("/atualizar")
	public String getAtualizar() {
		return "atualizar";		
	}
	
	@GetMapping("/cadastrar")
	public String getCadastrar() {
		return "cadastrar";		
	}
	
	@GetMapping("/listar")
	public String getListar() {
		return "listar";		
	}
	
	@GetMapping("/excluir")
	public String getExcluir() {
		return "excluir";		
	}
	
}
