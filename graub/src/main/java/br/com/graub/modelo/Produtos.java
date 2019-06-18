package br.com.graub.modelo;

public class Produtos extends GenericDomain{
	
	 
	private String descricao;
	private double valor;
	private int quantidade;
	private Marca marca;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	
	

}
