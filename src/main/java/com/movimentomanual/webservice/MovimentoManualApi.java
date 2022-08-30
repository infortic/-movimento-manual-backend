package com.movimentomanual.webservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movimentomanual.entity.MovimentoManual;
import com.movimentomanual.negocio.Servicos;

@RestController
@RequestMapping("/mivimento-manual")
public class MovimentoManualApi {

	@Autowired
	private Servicos servicos;
	
	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody MovimentoManual movimento){
		return new ResponseEntity<>(servicos.incluirMovimento(movimento),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?> CarregarTodos(){
		return new ResponseEntity<>(servicos.carregarTodosMovimentos(),HttpStatus.OK);
	}
	
}
