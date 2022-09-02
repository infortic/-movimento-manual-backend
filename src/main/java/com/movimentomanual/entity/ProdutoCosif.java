package com.movimentomanual.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Table(name="PRODUTO_COSIF")
@Data
@Entity
public class ProdutoCosif {
	@Column(name="COD_COSIF")
	@Id @GeneratedValue(strategy = GenerationType.AUTO) private Long codigo;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Produto> codProduto;
	@Column(name="COD_CLASSIFICACAO")
	private Long codClassificacao;
	@Column(name="STA_STATUS")
	private Boolean staStatus;
	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the codProduto
	 */
	public List<Produto> getCodProduto() {
		return codProduto;
	}
	/**
	 * @param codProduto the codProduto to set
	 */
	public void setCodProduto(List<Produto> codProduto) {
		this.codProduto = codProduto;
	}
	/**
	 * @return the codClassificacao
	 */
	public Long getCodClassificacao() {
		return codClassificacao;
	}
	/**
	 * @param codClassificacao the codClassificacao to set
	 */
	public void setCodClassificacao(Long codClassificacao) {
		this.codClassificacao = codClassificacao;
	}
	/**
	 * @return the staStatus
	 */
	public Boolean getStaStatus() {
		return staStatus;
	}
	/**
	 * @param staStatus the staStatus to set
	 */
	public void setStaStatus(Boolean staStatus) {
		this.staStatus = staStatus;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codClassificacao, codProduto, codigo, staStatus);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoCosif other = (ProdutoCosif) obj;
		return Objects.equals(codClassificacao, other.codClassificacao) && Objects.equals(codProduto, other.codProduto)
				&& Objects.equals(codigo, other.codigo) && Objects.equals(staStatus, other.staStatus);
	}
	@Override
	public String toString() {
		return "ProdutoCosif [codigo=" + codigo + ", codProduto=" + codProduto + ", codClassificacao="
				+ codClassificacao + ", staStatus=" + staStatus + "]";
	}
	public ProdutoCosif(Long codigo, List<Produto> codProduto, Long codClassificacao, Boolean staStatus) {
		super();
		this.codigo = codigo;
		this.codProduto = codProduto;
		this.codClassificacao = codClassificacao;
		this.staStatus = staStatus;
	}
	public ProdutoCosif() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
