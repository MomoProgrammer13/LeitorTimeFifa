package br.com.leitorTimeFifa.util;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import br.com.leitorTimeFifa.modelo.ConstroiSBCGeral;
import br.com.leitorTimeFifa.modelo.Jogador;
import br.com.leitorTimeFifa.modelo.OpenCSV;
import br.com.leitorTimeFifa.modelo.SBC;

public class Leitor {
	
	int valor;
	public Leitor(int valor) throws FileNotFoundException {
		this.valor = valor;
	}
//		for(Jogador jogador : lista) {
//			if(jogador.vender()) {
//				System.out.println(jogador);
//			}
//		}
//		for(Jogador jogador : lista) {
//			if(jogador.cartaParaTroca()) {
//				System.out.println(jogador);
//			}
//		}
	public List<SBC> Constroi() {	
		ConstroiSBCGeral sbc = new ConstroiSBCGeral(valor);
		List<SBC> listaSbc = sbc.Constroi();
		
//		for(SBC sb : listaSbc) {
//			if(sb != null) {
//				System.out.println("\nSolucao-----------------------------------//----------------------\n");
//				sb.getLista().forEach(System.out::println);
//			}
//		}
		return listaSbc;
	}
}
