package com.movimentomanual.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.movimentomanual.entity.MovimentoManual;
import com.movimentomanual.entity.Produto;
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Long> {

	
	
}
