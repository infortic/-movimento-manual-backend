package com.movimentomanual.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name= "PRODUTO")
@Data
@Entity
class Produto {
	@Column(name="COD_PRODUTO")
	@Id  @GeneratedValue(strategy = GenerationType.AUTO) private Long codigo;
	@Column(name="DES_PRODUTO")
	private String descricao;
	@Column(name="STA_STATUS")
	private Boolean staStatus;
}
