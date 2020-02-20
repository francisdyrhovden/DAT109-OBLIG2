package no.hvl.dat109.controller;

import java.util.List;
import java.util.Scanner;

import no.hvl.dat109.objects.Adresse;
import no.hvl.dat109.objects.Bil;
import no.hvl.dat109.objects.Bilpark;
import no.hvl.dat109.objects.Kontor;
import no.hvl.dat109.objects.Reservasjon;
import no.hvl.dat109.objects.Selskap;

public class Klient {

	public static void main(String[] args) {
		
		Selskap easyCar = new Selskap("EasyCar", new Adresse("tulleveien 1", 4308, "Sandnes"), "92822779");
		
		Bilpark bilpark = new Bilpark();
		
		Kontor sandnes = new Kontor("Sandnes", new Adresse("Tulleveien 1", 4308, "Sandnes"), easyCar);
		Kontor bergen = new Kontor("Bergen", new Adresse("Tulleveien 2", 5063, "Bergen"), easyCar);
		
		bergen.setBiler(bilpark.leggTilBiler1());
		sandnes.setBiler(bilpark.leggTilBiler2());
		
		SokEtterBil bilSok = new SokEtterBil();
		
		//Kopier herfra
		List<Bil> tilgjBiler = bilSok.sokBil(easyCar);
		
		System.out.println("Tilgjengelige biler: ");
		tilgjBiler.stream().forEach(System.out :: println);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv inn regnr for ønsket bil: ");
		String regnr = sc.nextLine();
		
		Bil bil = tilgjBiler.stream()
				.filter(b -> regnr.equals(b.getRegnr()))
				.findAny()
				.orElse(null);
		
		if(bil == null) {
			System.out.println("Finnes ikke en bil med dette registreringsnummeret");
			sc.close();
			return;
		}
		
		
		
		sc.close();

	}

}
