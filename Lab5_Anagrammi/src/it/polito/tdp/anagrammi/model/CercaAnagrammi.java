package it.polito.tdp.anagrammi.model;

import java.util.List;

public class CercaAnagrammi {
	
	private List<Parola> soluzioniGiuste;
	private List<Parola> soluzioniErrate;
	
	
	
	public void cercaAnagramma(Parola parziale,int L) {
		
		
		if(L==parziale.getNome().length()) {
			if(parziale.esiste()) {
				soluzioniGiuste.add(parziale);
			}else {
				soluzioniErrate.add(parziale);
			}
			
			
		}
		
		

	}
}
