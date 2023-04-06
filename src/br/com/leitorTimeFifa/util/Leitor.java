package br.com.leitorTimeFifa.util;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import br.com.leitorTimeFifa.modelo.Jogador;
import br.com.leitorTimeFifa.modelo.OpenCSV;

public class Leitor {

	public static void main(String[] args) throws FileNotFoundException {
		
		OpenCSV leitor = new OpenCSV();
		List<Jogador> lista = new ArrayList<Jogador>();
		lista = leitor.readCSV();
		
		for(Jogador jogador : lista) {
			if(jogador.vender()) {
				System.out.println(jogador);
			}
		}
	}

}
