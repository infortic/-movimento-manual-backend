package com.movimentomanual.entity;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name="MOVIMENTO_MANUAL")
@Data
@Entity
public class MovimentoManual {
	
	@Column(name="COD_MOVIMENTO_MANUAL")
	@Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
	
	@Column(name="DAT_MES")
	private String datMes;
	
	@Column(name="DAT_ANO")
	private String datAno;
	
	@Column(name="NUMERO_LACAMENTO")
	private Integer numeroLacamento;
	
	@Column(name="COD_PRODUTO")
	private Long codProduto;
	
	@Column(name="COD_COSIF")
	private Long codCosif;
	
	@Column(name="DES_DESCRICAO")
	private String Descricao;

	@Column(name="DATA_MOVIMENTO")
	private Calendar dataMovimento;
	
	@Column(name="COD_USUARIO")
	private Long codUsuario;
	
	@Column(name="VAL_VALOR")
	private BigDecimal Valor;
}
