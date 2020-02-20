package no.hvl.dat109.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import no.hvl.dat109.objects.Bil;
import no.hvl.dat109.objects.Kontor;
import no.hvl.dat109.objects.Kredittkort;
import no.hvl.dat109.objects.Reservasjon;
import no.hvl.dat109.objects.Retur;
import no.hvl.dat109.objects.Selskap;
import no.hvl.dat109.objects.Utlevering;

/**
 * Klasse som definerer innleveringen av en bil.
 * 
 * @author Marius, Charlie, Glenn, Francis 
 *
 */
public class InnleveringBil {
	
	/**
	 * Metode for å levere inn en bil.
	 * 
	 * @param bil
	 */
	public void leverInn(Selskap selskap) {
		//Dato for innlevering
		LocalDate currDate = LocalDate.now();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skriv inn telefonnummer: ");
		int telefonnummer = sc.nextInt();
		
		List<Reservasjon> alleReservasjoner = selskap.getReservasjoner();
		
		Reservasjon res = alleReservasjoner.stream()
				.filter(r -> telefonnummer == r.getKunde().getTlfNr())
				.findAny()
				.orElse(null);
		
		if(res == null) {
			System.out.println("Finnes ikke en reservasjon med dette telefonnummeret");
			sc.close();
			return;
		}
		
		//kmStand ved innlevering
		System.out.println("Hvor mange km viser km-teller i bilen? ");
		int kmStand = sc.nextInt();
		
		//Setter ny kmStand på bil og setter bil som ledig.
		Bil bil = res.getBil();
		bil.setKmStand(kmStand);
		bil.setLedig(true);
		
		//Henter returkontor og legger til bil i deres billiste
		Kontor returKontor = res.getRetursted();
		returKontor.leggTilBil(bil);
	
		//Se kommentar over.
		System.out.println("Regningen er nå sendt.");
		
		List<Utlevering> alleUtleveringer = selskap.getUtleverteBiler();
		Kredittkort kort = res.getKunde().getKredittKort();
		
		Utlevering utlevering = alleUtleveringer.stream()
				.filter(u -> res.getKunde().getKredittKort() == u.getKredittkort())
				.findAny()
				.orElse(null);
		
		
		alleReservasjoner.remove(res);
		alleUtleveringer.remove(utlevering);
		
		Retur retur = new Retur(kort, currDate, bil.getRegnr(), kmStand);
		List<Retur> returListe = selskap.getReturnerteBiler();
		returListe.add(retur);
		
		sc.close();
		
	}
}
