package com.movimentomanual.repositorio;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.movimentomanual.entity.MovimentoManual;

public interface MovimentoRepository extends PagingAndSortingRepository<MovimentoManual, Long> {

}
