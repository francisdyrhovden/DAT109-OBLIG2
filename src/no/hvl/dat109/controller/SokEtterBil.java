package no.hvl.dat109.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import no.hvl.dat109.objects.Bil;
import no.hvl.dat109.objects.Kontor;
import no.hvl.dat109.objects.Selskap;

/**
 * 
 * @author Charlie, Marius, Glenn, Francis
 *
 */

public class SokEtterBil {
	
	public static void sokBil(Selskap selskap) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skriv inn utleiekontor: ");
		String utleiekontor = sc.nextLine();
		
		System.out.println("Skriv inn ønsket returkontor: ");
		String returkontor = sc.nextLine();
		
		System.out.println("Skriv inn dato du ønsker å leie fra. (dd/MM/yyyy)");
		String dato = sc.nextLine();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyy");
		try {
			Date date = dateFormatter.parse(dato);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Skriv inn ønsket klokkeslett for utleie. (HH:mm)");
		String klokke = sc.nextLine();
		SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
		try {
			Date time = timeFormatter.parse(klokke);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Skriv inn hvor mange dager du vil leie bilen: ");
		int dager = sc.nextInt();
		
		sc.close();
		
		List<Kontor> alleKontorer = selskap.getKontorer();
		
		Kontor utleieplass = alleKontorer.stream()
				.filter(k -> utleiekontor.equals(k.getNavn()))
				.findAny()
				.orElse(null);
		
		List<Bil> alleBiler = utleieplass.getBiler();
		
		List<Bil> bilListe =  alleBiler.stream()
				.filter(b -> b.getLedig() == true)
				.collect(Collectors.toList());
		
		
	}

}
