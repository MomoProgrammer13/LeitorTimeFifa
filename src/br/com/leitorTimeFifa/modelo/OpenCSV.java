package br.com.leitorTimeFifa.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class OpenCSV {
	
	private Scanner scanner;
	
	public OpenCSV(){
	}
	
	
    public List<Jogador> readCSV() throws FileNotFoundException{
    	
    	scanner = new Scanner(new File("Aleixo.csv"));
    	List<Jogador> lista = new ArrayList<Jogador>();
    	while(scanner.hasNextLine()) {
    		String linha = scanner.nextLine();
    		
    		Scanner linhaScanner = new Scanner(linha);
    		linhaScanner.useLocale(Locale.US);
    		linhaScanner.useDelimiter(",");
    		
    		Jogador temp = new Jogador();
    		
    		temp.setNome(linhaScanner.next());
    		temp.setRating(linhaScanner.nextInt());
    		temp.setQualidade(linhaScanner.next());
    		temp.setRaridade(linhaScanner.next());
    		temp.setPosicao(linhaScanner.next());
    		temp.setNacao(linhaScanner.next());
    		temp.setLiga(linhaScanner.next());
    		temp.setClube(linhaScanner.next());
    		temp.setFaixaPreco(linhaScanner.next());
    		temp.setPreco(linhaScanner.nextInt());
    		temp.setPrecoComprado(linhaScanner.nextInt());
    		temp.setValorDescarte(linhaScanner.nextInt());
    		temp.setContratos(linhaScanner.nextInt());
    		temp.setNegociavel(linhaScanner.nextBoolean());
    		temp.setEmprestimo(linhaScanner.nextBoolean());
    		lista.add(temp);
    		
    		linhaScanner.close();
    	}
    	
    	scanner.close();
    	
    	return lista;
    	
    	
    	
    }
	
}
