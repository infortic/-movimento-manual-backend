package com.movimentomanual.repositorio;

public  final class Constantes {
	public static final String JOIN_PRODUTOS = "select cod_produto, cod_cosif, des_produto,"
			+ " cod_classificacao from produto p join produto_cosif_cod_produto "
			+ "pccp on p.cod_produto = pccp.cod_produto_cod_produto join produto_cosif "
			+ "pc on pc.cod_cosif = pccp.produto_cosif_cod_cosif";

}
