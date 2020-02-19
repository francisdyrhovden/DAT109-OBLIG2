/**
 * 
 */
package no.hvl.dat109.objects;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author Francis, Marius, Charlie, Glenn
 *
 */
public class Reservasjon {

	private Bil bil;
	private LocalDate startDato;
	private int antallDager;
	private Kontor utleiested;
	private Kontor retursted;
	private Kunde kunde;
	
	
	public Reservasjon(Bil bil, LocalDate startDato, int antallDager, Kontor utleiested, Kontor retursted, Kunde kunde) {
		super();
		this.bil = bil;
		this.startDato = startDato;
		this.antallDager = antallDager;
		this.utleiested = utleiested;
		this.retursted = retursted;
		this.kunde = kunde;
		
		reserver(bil);
	}
	
	/**
	 * Metode for å sette en bil som reservert.
	 * 
	 * @param bil
	 */
	public void reserver(Bil bil) {
		LocalDate currDate = LocalDate.now();
		LocalDate sluttDato = startDato.plusDays(antallDager);
		
		while (currDate.isAfter(startDato) && currDate.isBefore(sluttDato)) {
			bil.setLedig(false);
		}
	}

	public Bil getBil() {
		return bil;
	}

	public LocalDate getStartDato() {
		return startDato;
	}

	public int getAntallDager() {
		return antallDager;
	}

	public Kontor getUtleiested() {
		return utleiested;
	}

	public Kontor getRetursted() {
		return retursted;
	}

	public Kunde getKunde() {
		return kunde;
	}
	
}
