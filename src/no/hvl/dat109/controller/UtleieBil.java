package no.hvl.dat109.controller;

import java.util.Scanner;

import no.hvl.dat109.objects.Bil;
import no.hvl.dat109.objects.Kredittkort;

public class UtleieBil {
	public void leiUt(Bil bil) {
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
		kort.validerKort();
		
		String regNr = bil.getRegnr();
		
		
		sc.close();
	}
}
