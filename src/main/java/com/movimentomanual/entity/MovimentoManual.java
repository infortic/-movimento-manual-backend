package com.movimentomanual.entity;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Table(name="MOVIMENTO_MANUAL")
@Entity
public class MovimentoManual {
	
	@Column(name="COD_MOVIMENTO_MANUAL")
	@Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
	
	@Column(name="DAT_MES")
	private Integer datMes;
	
	@Column(name="DAT_ANO")
	private Integer datAno;
	
	@Column(name="NUMERO_LACAMENTO")
	private Integer numeroLacamento;
	
	@Column(name="COD_PRODUTO")
	private String codProduto;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "COD_COSIF")
	private ProdutoCosif codCosif;
	
	@Column(name="DES_DESCRICAO")
	private String Descricao;

	@Column(name="DATA_MOVIMENTO")
	private Date dataMovimento;
	
	@Column(name="COD_USUARIO")
	private String codUsuario = "TESTE";
	
	@Column(name="VAL_VALOR")
	private BigDecimal Valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDatMes() {
		return datMes;
	}

	public void setDatMes(Integer datMes) {
		this.datMes = datMes;
	}

	public Integer getDatAno() {
		return datAno;
	}

	public void setDatAno(Integer datAno) {
		this.datAno = datAno;
	}

	public Integer getNumeroLacamento() {
		return numeroLacamento;
	}

	public void setNumeroLacamento(Integer numeroLacamento) {
		this.numeroLacamento = numeroLacamento;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public ProdutoCosif getCodCosif() {
		return codCosif;
	}

	public void setCodCosif(ProdutoCosif codCosif) {
		this.codCosif = codCosif;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Date getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	public BigDecimal getValor() {
		return Valor;
	}

	public void setValor(BigDecimal valor) {
		Valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Descricao, Valor, codCosif, codProduto, codUsuario, datAno, datMes, dataMovimento, id,
				numeroLacamento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovimentoManual other = (MovimentoManual) obj;
		return Objects.equals(Descricao, other.Descricao) && Objects.equals(Valor, other.Valor)
				&& Objects.equals(codCosif, other.codCosif) && Objects.equals(codProduto, other.codProduto)
				&& Objects.equals(codUsuario, other.codUsuario) && Objects.equals(datAno, other.datAno)
				&& Objects.equals(datMes, other.datMes) && Objects.equals(dataMovimento, other.dataMovimento)
				&& Objects.equals(id, other.id) && Objects.equals(numeroLacamento, other.numeroLacamento);
	}

	@Override
	public String toString() {
		return "MovimentoManual [id=" + id + ", datMes=" + datMes + ", datAno=" + datAno + ", numeroLacamento="
				+ numeroLacamento + ", codProduto=" + codProduto + ", codCosif=" + codCosif + ", Descricao=" + Descricao
				+ ", dataMovimento=" + dataMovimento + ", codUsuario=" + codUsuario + ", Valor=" + Valor + "]";
	}

	public MovimentoManual(Long id, Integer datMes, Integer datAno, Integer numeroLacamento, String codProduto,
			ProdutoCosif codCosif, String descricao, Date dataMovimento, String codUsuario, BigDecimal valor) {
		super();
		this.id = id;
		this.datMes = datMes;
		this.datAno = datAno;
		this.numeroLacamento = numeroLacamento;
		this.codProduto = codProduto;
		this.codCosif = codCosif;
		Descricao = descricao;
		this.dataMovimento = dataMovimento;
		this.codUsuario = codUsuario;
		Valor = valor;
	}

	public MovimentoManual() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
