package com.movimentomanual.negocio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movimentomanual.entity.MovimentoManual;
import com.movimentomanual.entity.Produto;
import com.movimentomanual.entity.ProdutoCosif;
import com.movimentomanual.repositorio.MovimentoRepository;
import com.movimentomanual.repositorio.ProdudoCosifRepository;

@Service
public class MasaDeTeste extends RouteBuilder {

	@Autowired
	private MovimentoRepository movimentoRepository;
	@Autowired
    private ProdudoCosifRepository produdoCosifRepository;
    
	public void	criarProduto(){

		
	}
	

	@Override
	public void configure() throws Exception {
		
		from("timer://foo?repeatCount=1")
		.process(new inclusaoDadosProcess())
		.to("log: masa de dados incluida");
		
	}
	public class inclusaoDadosProcess implements Processor{

		@Override
		public void process(Exchange exchange) throws Exception {
			Produto produto1 = new Produto();
			produto1.setDescricao("PROD 001");
			produto1.setStaStatus(true);
			
			Produto produto2 = new Produto();
			produto2.setDescricao("PROD 002");
			produto2.setStaStatus(true);
			
			ArrayList<Produto> listaDeProdutos = new ArrayList<>();
			listaDeProdutos.add(produto2);
			listaDeProdutos.add(produto1);
			
			ProdutoCosif produtoCosif = new ProdutoCosif();
			produtoCosif.setCodClassificacao(3304L);
			produtoCosif.setCodProduto(listaDeProdutos);
			produtoCosif.setStaStatus(true);
			
			
			
			MovimentoManual movimento = new MovimentoManual();
			movimento.setCodCosif(produtoCosif);
			movimento.setCodProduto("PROD 001");
			movimento.setDataMovimento(new Date());
			movimento.setDatAno(2019);
			movimento.setDatMes(02);
			movimento.setValor(new BigDecimal(2200));
			movimento.setDescricao("DESC 001");
			
			movimentoRepository.save(movimento);			
		}

	}
	
}

