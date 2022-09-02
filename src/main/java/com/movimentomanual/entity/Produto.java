package com.movimentomanual.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Table(name= "PRODUTO")
@Data
@Entity
public class Produto {
	@Column(name="COD_PRODUTO")
	@Id  @GeneratedValue(strategy = GenerationType.AUTO) private Long codigo;
	@Column(name="DES_PRODUTO")
	private String descricao;
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
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		return Objects.hash(codigo, descricao, staStatus);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(staStatus, other.staStatus);
	}
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", staStatus=" + staStatus + "]";
	}
	public Produto(Long codigo, String descricao, Boolean staStatus) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.staStatus = staStatus;
	}
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
