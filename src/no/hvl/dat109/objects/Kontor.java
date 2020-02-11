package no.hvl.dat109.objects;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Klasse for å definere ett kontor.
 * 
 * @author Marius, Charlie, Glenn, Francis
 *
 */
public class Kontor {
	
	private static final AtomicInteger count = new AtomicInteger(0);
	private final int id;
	private Adresse adresse;
	private Selskap selskap;
	
	public Kontor(int id, Adresse adresse, Selskap selskap) {
		super();
		this.id = count.incrementAndGet();
		this.adresse = adresse;
		this.selskap = selskap;
	}

	public int getId() {
		return id;
	}

	public Adresse getAdresse() {
		return adresse;
	}
	
	/**
	 * Metode for å lage en reservasjon.
	 */
	public Reservasjon lagReservasjon(Bil bil, Date startDato, int antDager, Kontor utleieKontor, Kontor returKontor) {
		/**
		 * ToDo:
		 * - Måte for å velge bil utifra bilklassen brukeren velger
		 * - Måte for å få start dato for reservasjonen
		 * - Måte for å hente antall dager brukeren vil leige bilen
		 * - Sette utleiested som kontor som lager reservasjon
		 * - Finne ut hvilket kontor som skal ta imot bil etter reservasjonen
		 */

		Reservasjon res = new Reservasjon(bil, startDato, antDager, utleieKontor, returKontor);
		return res;
	}
	
	/**
	 * Metode for å lagre en reservasjon
	 */
	public void lagreReservasjon(Reservasjon res) {
		/**
		 * ToDo:
		 * - Måte for å hente reservasjonen som nettopp er opprettet.
		 * - Måte for å hente selskap.
		 * - Måte for å legge til denne reservasjonen i selskap listen.
		 */
		selskap.leggTilReservasjon(res);
	}

}
