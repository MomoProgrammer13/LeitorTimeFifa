package br.com.leitorTimeFifa.modelo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ConstroiSBCGeral {
	
	private int ovr1;
	private int ovr2;
	private int ovr3;
	private int ovr4;
	private int ovr5;
	private int ovr6;
	private int ovr7;
	private int ovr8;
	private int ovr9;
	
	public ConstroiSBCGeral(int ovrGeral) {
		ovr1 = ovrGeral -5;
		ovr2 = ovrGeral -4;
		ovr3 = ovrGeral -3;
		ovr4 = ovrGeral -2;
		ovr5 = ovrGeral -1;
		ovr6 = ovrGeral;
		ovr7 = ovrGeral +1;
		ovr8 = ovrGeral +2;
		ovr9 = ovrGeral +3;
		
		
	}
	
	public List<SBC> Constroi(){
		
		List<Jogador> lista = new ArrayList<Jogador>();
		OpenCSV leitor = new OpenCSV();
		
		try {
			lista = leitor.readCSV();
		}
		catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
		
		List<SBC> arrayLista = new ArrayList<SBC>();
		
		arrayLista.add(caso1(lista));
		arrayLista.add(caso2(lista));
		arrayLista.add(caso3(lista));
		arrayLista.add(caso4(lista));
		arrayLista.add(caso5(lista));
		arrayLista.add(caso6(lista));
		arrayLista.add(caso7(lista));
		arrayLista.add(caso8(lista));
		arrayLista.add(caso9(lista));
		arrayLista.add(caso10(lista));
		arrayLista.add(caso11(lista));
		arrayLista.add(caso12(lista));
		arrayLista.add(caso13(lista));
		arrayLista.add(caso14(lista));
		arrayLista.add(caso15(lista));
		arrayLista.add(caso16(lista));
		arrayLista.add(caso17(lista));
		arrayLista.add(caso18(lista));
		arrayLista.add(caso19(lista));
		arrayLista.add(caso20(lista));
		arrayLista.add(caso21(lista));
		
		return arrayLista;
		
		
	}
	private SBC caso1(List<Jogador> lista){
	
	int uso1 = 0;
	int uso2 = 0;
	int uso3 = 0;
	int uso4 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr7 && jogador.isEmprestimo() == false && uso1 < 1) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso2 < 6) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso3 < 3) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr4 && jogador.isEmprestimo() == false && uso4 < 1) {
				testa.add(jogador);
				uso4++;
			}
			
		}
		
		if(uso4 == 1 && uso3 == 3 && uso2 == 6 && uso1 == 1) {
			SBC temp = new SBC(testa);
			return temp;
		}
		else {
			return null;
		}
		
	}
	
	private SBC caso2(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso1 < 9) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso2 < 2) {
				testa.add(jogador);
				uso2++;
			}
			
		}
		
		if(uso2 == 2 && uso1 ==9) {
			SBC temp = new SBC(testa);
			return temp;
		}
		
		return null;
	}
	
	private SBC caso3(List<Jogador> lista){

		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr7 && jogador.isEmprestimo() == false && uso1 < 2) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso2 < 3) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso3 < 6) {
				testa.add(jogador);
				uso3++;
			}
			
		}
		
		if(uso3 == 6 && uso2 == 3 && uso1 ==2) {
			SBC temp = new SBC(testa);
			return temp;
		}
		
		return null;
	}
	
	private SBC caso4(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr1 && jogador.isEmprestimo() == false && uso1 < 1) {
				testa.add(jogador);
				uso1++;
			}
	
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso2 < 10) {
				testa.add(jogador);
				uso2++;
			}
		}
		
		if(uso1 == 1 && uso2 == 10) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso5(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		int uso4 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr4 && jogador.isEmprestimo() == false && uso1 < 1) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso2 < 6) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso3 < 1) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr7 && jogador.isEmprestimo() == false && uso4 < 1) {
				testa.add(jogador);
				uso4++;
			}
		}
		
		
		if(uso1 ==1 && uso2 == 6 && uso3 == 1 && uso4 == 4) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso6(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		int uso4 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr4 && jogador.isEmprestimo() == false && uso1 < 3) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso2 < 3) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso3 < 2) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr7 && jogador.isEmprestimo() == false && uso4 < 3) {
				testa.add(jogador);
				uso4++;
			}
		}
		
		if(uso1 == 3 && uso2 == 3 && uso3 == 2 && uso4 == 3) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso7(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		int uso4 = 0;
		int uso5 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr4 && jogador.isEmprestimo() == false && uso1 < 1) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso2 < 6) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso3 < 2) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr7 && jogador.isEmprestimo() == false && uso4 < 1) {
				testa.add(jogador);
				uso4++;
			}
			else if(jogador.getRating() == ovr8 && jogador.isEmprestimo() == false && uso5 < 1) {
				testa.add(jogador);
				uso5++;
			}
		}
		if(uso1 == 1 && uso2 == 6 && uso3 == 2 && uso4 == 1 && uso5 == 1) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso8(List<Jogador> lista){

		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso1 < 6) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso2 < 4) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr8 && jogador.isEmprestimo() == false && uso3 < 1){
				testa.add(jogador);
				uso3++;
			}
		}
		
		if(uso1 == 6 && uso2 == 4 && uso3 == 1) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	private SBC caso9(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso1 < 9) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr8 && jogador.isEmprestimo() == false && uso2 < 2){
				testa.add(jogador);
				uso2++;
			}
		}
		
		if(uso1 == 9  && uso2 == 2) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso10(List<Jogador> lista){

		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr4 && jogador.isEmprestimo() == false && uso1 < 6) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso2 < 1) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr8 && jogador.isEmprestimo() == false && uso3 < 4){
				testa.add(jogador);
				uso3++;
			}
		}
		
		if(uso1 == 6 && uso2 == 1 && uso3 == 4) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso11(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		int uso4 = 0;
		int uso5 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : new ArrayList<Jogador>(lista)) {
			if(jogador.getRating() == ovr3 && jogador.isEmprestimo() == false && uso1 < 1) {
				lista.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr4 && jogador.isEmprestimo() == false && uso2 < 4) {
				lista.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso3 < 1) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso4 < 1) {
				testa.add(jogador);
				uso4++;
			}
			else if(jogador.getRating() == ovr7 && jogador.isEmprestimo() == false && uso5 < 4){
				testa.add(jogador);
				uso5++;
			}
		}
		
		if(uso1 == 1 && uso2 == 4 && uso3 == 1 && uso4 == 1 && uso5 == 4) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso12(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		int uso4 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr4 && jogador.isEmprestimo() == false && uso1 < 1) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso2 < 6) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso3 < 3) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr9 && jogador.isEmprestimo() == false && uso4 < 1){
				testa.add(jogador);
				uso4++;
			}
		}
		
		if(uso1 == 1 && uso2 == 6 && uso3 == 3 && uso4 == 1) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso13(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		int uso4 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr4 && jogador.isEmprestimo() == false && uso1 < 3) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso2 < 3) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso3 < 4) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr9 && jogador.isEmprestimo() == false && uso4 < 1){
				testa.add(jogador);
				uso4++;
			}
		}
		
		if(uso1 == 3 && uso2 == 3 && uso3 == 4 && uso4 == 1) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso14(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		int uso4 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr4 && jogador.isEmprestimo() == false && uso1 < 2) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso2 < 7) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr8 && jogador.isEmprestimo() == false && uso3 < 1) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr9 && jogador.isEmprestimo() == false && uso4 < 1){
				testa.add(jogador);
				uso4++;
			}
		}
		
		if(uso1 == 2 && uso2 == 7 && uso3 == 1  && uso4 == 1) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso15(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		int uso4 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr3 && jogador.isEmprestimo() == false && uso1 < 1) {
				testa.add(jogador);
				uso1++;
			}
			if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso2 < 8) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr8 && jogador.isEmprestimo() == false && uso3 < 1) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr8 && jogador.isEmprestimo() == false && uso4 < 1){
				testa.add(jogador);
				uso4++;
			}
		}
		
		if(uso1 == 1 && uso2 == 8 && uso3 == 1 && uso4 == 1) {
			SBC temp = new SBC(testa);
			return temp;
		}
		
		return null;
	}
	
	private SBC caso16(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		int uso4 = 0;
		int uso5 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr2 && jogador.isEmprestimo() == false && uso1 < 4) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr3 && jogador.isEmprestimo() == false && uso2 < 1) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso3 < 1) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr7 && jogador.isEmprestimo() == false && uso4 < 4) {
				testa.add(jogador);
				uso4++;
			}
			else if(jogador.getRating() == ovr9 && jogador.isEmprestimo() == false && uso5 < 1){
				testa.add(jogador);
				uso5++;
			}
		}
		
		if(uso1 == 4 && uso2 == 1 && uso3 == 1 && uso4 == 4 && uso5 == 1) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso17(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr4 && jogador.isEmprestimo() == false && uso1 < 6) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso2 < 3) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr8 && jogador.isEmprestimo() == false && uso3 < 2){
				testa.add(jogador);
				uso3++;
			}
		}
		
		if(uso1 == 6 && uso2 == 3 && uso3 == 2) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso18(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		int uso4 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr3 && jogador.isEmprestimo() == false && uso1 == 2) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr4 && jogador.isEmprestimo() == false && uso2 < 5) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr7 && jogador.isEmprestimo() == false && uso3 < 2) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr8 && jogador.isEmprestimo() == false && uso4 < 2){
				testa.add(jogador);
				uso4++;
			}
		}
		
		if(uso1 == 2 && uso2 == 5 && uso3 == 2 && uso4 == 2) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso19(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr1 && jogador.isEmprestimo() == false && uso1 < 4) {
				testa.add(jogador);
				uso1++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso2 < 2) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr7 && jogador.isEmprestimo() == false && uso3 < 5){
				testa.add(jogador);
				uso3++;
			}
		}
		
		if(uso1 == 4 && uso2 == 2 && uso3 == 5) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso20(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		int uso4 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr1 && jogador.isEmprestimo() == false && uso1 < 3) {
				testa.add(jogador);
				uso1++;
			}
			if(jogador.getRating() == ovr2 && jogador.isEmprestimo() == false && uso2 < 2) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr7 && jogador.isEmprestimo() == false && uso3 < 5) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr8 && jogador.isEmprestimo() == false && uso4 < 1){
				testa.add(jogador);
				uso4++;
			}
		}
		
		if(uso1 == 3 && uso2 == 2 && uso3 == 5 && uso4 == 1) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	private SBC caso21(List<Jogador> lista){
		
		int uso1 = 0;
		int uso2 = 0;
		int uso3 = 0;
		int uso4 = 0;
		
		List<Jogador> testa = new ArrayList<Jogador>();
		
		for(Jogador jogador : lista) {
			if(jogador.getRating() == ovr4 && jogador.isEmprestimo() == false && uso1 < 2) {
				testa.add(jogador);
				uso1++;
			}
			if(jogador.getRating() == ovr5 && jogador.isEmprestimo() == false && uso2 < 6) {
				testa.add(jogador);
				uso2++;
			}
			else if(jogador.getRating() == ovr6 && jogador.isEmprestimo() == false && uso3 < 1) {
				testa.add(jogador);
				uso3++;
			}
			else if(jogador.getRating() == ovr8 && jogador.isEmprestimo() == false && uso4 < 2){
				testa.add(jogador);
				uso4++;
			}
		}
		
		if(uso1 == 2 && uso2 == 6 && uso3 == 1 && uso4 == 2) {
			SBC temp = new SBC(testa);
			return temp;
		}
		return null;
	}
	
	
	private void zerador() {
		this.ovr1 = 0;
		this.ovr2 = 0;
		this.ovr3 = 0;
		this.ovr4 = 0;
		this.ovr5 = 0;
		this.ovr6 = 0;
		this.ovr7 = 0;
		this.ovr8 = 0;
		this.ovr9 = 0;
	}

	
	

}
