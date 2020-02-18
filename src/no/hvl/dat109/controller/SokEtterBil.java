package no.hvl.dat109.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import no.hvl.dat109.objects.Bil;
import no.hvl.dat109.objects.Kontor;
import no.hvl.dat109.objects.Selskap;

public class SokEtterBil {
	
	public List<Bil> sokBil(Selskap selskap) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skriv inn utleiekontor: ");
		String utleiekontor = sc.nextLine();
		
		System.out.println("Skriv inn ønsket returkontor: ");
		String returkontor = sc.nextLine();
		
		System.out.println("Skriv inn dato du ønsker å leie fra. (dd/MM/yyyy)");
		String dato = sc.nextLine();
		int dag = sc.nextInt();
		int maaned = sc.nextInt();
		int aar = sc.nextInt();
		
		System.out.println("Skriv inn ønsket klokkeslett for utleie. Trykk enter mellom time og minutt: ");
		int time = sc.nextInt();
		int minutt = sc.nextInt();
		
		System.out.println("Skriv inn hvor mange dager du vil leie bilen: ");
		int dager = sc.nextInt();
		
		List<Kontor> alleKontorer = selskap.getKontorer();
		
		Kontor utleieplass = alleKontorer.stream()
				.filter(k -> utleiekontor.equals(k.getNavn()))
				.findAny()
				.orElse(null);
		
		List<Bil> alleBiler = utleieplass.getBiler();
		
		List<Bil> bilListe =  alleBiler.stream()
				.filter(b -> b.getLedig() == true)
				.collect(Collectors.toList());
		
		sc.close();
		
		return bilListe;
		
	}

}
