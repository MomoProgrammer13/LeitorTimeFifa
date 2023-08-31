package br.com.leitorTimeFifa.modelo;

import java.util.ArrayList;
import java.util.List;

public class SBC {
	private List<Jogador> jogadores;
	
	public SBC(){
	}
	
	public SBC(List<Jogador> jogador) {
		jogadores = jogador;
	}
	
	public List<Jogador> getLista(){
		return jogadores;
	}
	void setLista(Jogador j) {
		jogadores.add(j);
	}
	@Override
	public String toString() {
		String retorno = "";
		jogadores.forEach( c -> retorno.concat(c.toString()));
		return super.toString();
	}
}
