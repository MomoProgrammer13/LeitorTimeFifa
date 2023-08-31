package br.com.leitorTimeFifa.modelo;

import java.util.Formatter;

public class Jogador {
	
	private String nome;
	private int rating;
	private String qualidade;
	private String raridade;
	private String posicao;
	private String nacao;
	private String liga;
	private String clube;
	private String faixaPreco;
	private int preco;
	private int precoComprado;
	private int valorDescarte;
	private int contratos;
	private boolean negociavel;
	private boolean emprestimo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getQualidade() {
		return qualidade;
	}
	public void setQualidade(String qualidade) {
		this.qualidade = qualidade;
	}
	public String getRaridade() {
		return raridade;
	}
	public void setRaridade(String raridade) {
		this.raridade = raridade;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getNacao() {
		return nacao;
	}
	public void setNacao(String nacao) {
		this.nacao = nacao;
	}
	public String getLiga() {
		return liga;
	}
	public void setLiga(String liga) {
		this.liga = liga;
	}
	public String getClube() {
		return clube;
	}
	public void setClube(String clube) {
		this.clube = clube;
	}
	public String getFaixaPreco() {
		return faixaPreco;
	}
	public void setFaixaPreco(String faixaPreco) {
		this.faixaPreco = faixaPreco;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getPrecoComprado() {
		return precoComprado;
	}
	public void setPrecoComprado(int precoComprado) {
		this.precoComprado = precoComprado;
	}
	public int getValorDescarte() {
		return valorDescarte;
	}
	public void setValorDescarte(int valorDescarte) {
		this.valorDescarte = valorDescarte;
	}
	public int getContratos() {
		return contratos;
	}
	public void setContratos(int contratos) {
		this.contratos = contratos;
	}
	public boolean isNegociavel() {
		return negociavel;
	}
	public void setNegociavel(boolean negociavel) {
		this.negociavel = negociavel;
	}
	public boolean isEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	@Override
	public String toString() {
		String valorFormatado = String.format("%-30s %-12s %-20s %-20s %-20s", this.nome,this.rating, this.liga, this.clube,this.preco);
		return valorFormatado;
	}
	
	public boolean vender() {
		if(this.negociavel == false && this.preco >=1000) {
			return true;
		}
		return false;
	
	}
	
	public boolean cartaParaTroca() {
		if(this.rating >= 88 && this.emprestimo == false) {
			return true;
		}
		return false;
	}
	
}
