package com.movimentomanual.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movimentomanual.entity.MovimentoManual;
import com.movimentomanual.entity.Produto;
import com.movimentomanual.entity.ProdutoCosif;
import com.movimentomanual.repositorio.MovimentoRepository;
import com.movimentomanual.repositorio.ProdudoCosifRepository;
import com.movimentomanual.repositorio.ProdutoRepository;

@Service
public class Servicos {

	@Autowired
	private MovimentoRepository movimentoRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private ProdudoCosifRepository produtoCosifRepository;

	public MovimentoManual incluirMovimento(MovimentoManual movimentoManual) {
		return movimentoRepository.save(movimentoManual);
	}
	
	public Iterable<MovimentoManual> carregarTodosMovimentos() {
		return movimentoRepository.findAll();
	}
	
	public Iterable<Produto> carregarTodosProdutos() {
		return produtoRepository.findAll();
	}
	
	public Iterable<ProdutoCosif> getCosifPorProduto(Long id){
		return produtoCosifRepository.getProdutoCosif(id);
	}
	public Iterable<MovimentoManual> getMovimentoPorMesAno(Integer mes, Integer ano) {
		return movimentoRepository.findByDatMesAndDatAno(mes, ano);
	}
	
	
	
	
}
