package com.movimentomanual.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="PRODUTO_COSIF")
@Data
@Entity
public class ProdutoCosif {
	@Column(name="COD_COSIF")
	@Id @GeneratedValue(strategy = GenerationType.AUTO) private Long codigo;
	@Column(name="COD_PRODUTO")
	private Long codProduto;
	@Column(name="COD_CLASSIFICACAO")
	private Long codClassificacao;
	@Column(name="STA_STATUS")
	private Boolean staStatus;
}
