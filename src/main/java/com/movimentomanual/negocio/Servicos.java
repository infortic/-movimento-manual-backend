package com.movimentomanual.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movimentomanual.entity.MovimentoManual;
import com.movimentomanual.repositorio.MovimentoRepository;

@Service
public class Servicos {

	@Autowired
	private MovimentoRepository movimentoRepository;

	public MovimentoManual incluirMovimento(MovimentoManual movimentoManual) {
		return movimentoRepository.save(movimentoManual);
	}
	
	public Iterable<MovimentoManual> carregarTodosMovimentos() {
		return movimentoRepository.findAll();
	}
}
