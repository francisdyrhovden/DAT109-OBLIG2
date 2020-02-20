package no.hvl.dat109.controller;

import no.hvl.dat109.objects.*;

public class Klient {

	public static void main(String[] args) {
		
		Selskap easyCar = new Selskap("EasyCar", new Adresse("tulleveien 1", 4308, "Sandnes"), "92822779");
		
		Bilpark bilpark = new Bilpark();
		
		Kontor sandnes = new Kontor("Sandnes", new Adresse("Tulleveien 1", 4308, "Sandnes"), easyCar);
		Kontor bergen = new Kontor("Bergen", new Adresse("Tulleveien 2", 5063, "Bergen"), easyCar);
		
		bergen.setBiler(bilpark.leggTilBiler1());
		sandnes.setBiler(bilpark.leggTilBiler2());
		
		SokEtterBil bilSok = new SokEtterBil();
		bilSok.sokBil(easyCar);

	}

}
