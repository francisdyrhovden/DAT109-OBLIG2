package no.hvl.dat109.controller;

import java.util.Scanner;

import no.hvl.dat109.objects.Bil;
import no.hvl.dat109.objects.Kredittkort;
import no.hvl.dat109.objects.Kunde;
import no.hvl.dat109.objects.Reservasjon;

/**
 * Klasse som definerer utleie for en bil
 * 
 * @author Marius, Charlie, Glenn, Francis 
 *
 */
public class UtleieBil {
	
	/**
	 * Metode for å leie ut en bil.
	 * 
	 * @param bil
	 */
	public void leiUt(Bil bil, Kunde kunde) {
		/**
		 * TODO: 
		 * 	- Få inn kredittkortnummer, valider.
		 * 		- Feilmelding om ikke gyldig
		 * 		- Ellers send videre.
		 * 
		 * 	- Få inn bil som skal leies ut.
		 * 		- Registreringnummer
		 * 		- Kilometerstand
		 * 		- Dato og klokkeslett for utleie
		 * 		- Dato og klokkeslett for forventet innlevering
		 * 		- Trenger kontor bilen er på slik vi kan fjærne bilen fra dette kontoret
		 * 		- Sett som opptatt
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skriv inn kredittkortnummer: ");
		int kortNummer = sc.nextInt();
		
		Kredittkort kort = new Kredittkort(kortNummer);
		Boolean gyldigKort = kort.validerKort();
		
		while (!gyldigKort) {
			System.out.println("Kortnummer ikke gyldig, må ha en lengde på 16 siffer. Prøv igjen: ");
			int nyttKortNummer = sc.nextInt();
			
			kort.setKortNummer(nyttKortNummer);
			gyldigKort = kort.validerKort();
		}
		
		kunde.setKredittKort(kort);
		
		String regNr = bil.getRegnr();
		
		//Skal reservasjon lages her for så legges til i selskap attributten reservasjoner?
		
		
		sc.close();
	}
}
