package com.movimentomanual.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.movimentomanual.entity.ProdutoCosif;

@Repository
public interface ProdudoCosifRepository extends PagingAndSortingRepository<ProdutoCosif, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM produto_cosif INNER JOIN produto_cosif_cod_produto p ON p.cod_produto_cod_produto = :id" )
	Iterable<ProdutoCosif> getProdutoCosif(Long id);
	
}
