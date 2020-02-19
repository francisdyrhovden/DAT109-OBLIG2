package no.hvl.dat109.controller;

import java.time.LocalDate;
import java.util.Scanner;

import no.hvl.dat109.objects.Bil;

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
	public void leverInn(Bil bil) {
		//Dato for innlevering
		LocalDate currDate = LocalDate.now();
		
		/**
		 * Hvor skal vi registrere innleveringsdato?
		 * Forslag: I reservasjonen? men kan bli litt feil mtp at en reservasjon gjøres i forkant? Eller?
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//kmStand ved innlevering
		System.out.println("Hvor mange km viser km-teller i bilen? ");
		int kmStand = sc.nextInt();
		
		//Setter ny kmStand på bil og setter bil som ledig.
		bil.setKmStand(kmStand);
		bil.setLedig(true);
		
		/**
		 * Trenger vi å ta med en "Regning" klasse? 
		 * Står i oppgaven: "og regning kan utsendes", men er vell litt overflødig?
		 * Kan eventuelt bare skrive i konsoll noe slikt: "Regningen er nå sendt."?
		 */
		
		//Se kommentar over.
		System.out.println("Regningen er nå sendt.");
		
		sc.close();
		
	}
}
