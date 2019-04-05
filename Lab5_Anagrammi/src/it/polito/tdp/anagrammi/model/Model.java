package it.polito.tdp.anagrammi.model;

import java.util.List;

import it.polito.tdp.anagrammi.DAO.ParolaDAO;

public class Model {
	
	private List<Parola> anagrammi ;

	public void calcolaTuttiAnagrammi(String text) {
		// mi viene passata una stringa creo una parola
		
		Parola p = new Parola(text);
		
		anagrammi.addAll(p.calcolaAnagrammi());
		
		
	}

	
	
		 
	

	}


