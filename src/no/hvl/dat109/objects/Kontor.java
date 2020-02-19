package no.hvl.dat109.objects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
	private String navn;
	private Adresse adresse;
	private Selskap selskap;
	private List<Bil> biler;
	
	public Kontor(int id, String navn, Adresse adresse, Selskap selskap) {
		super();
		this.id = count.incrementAndGet();
		this.navn = navn;
		this.adresse = adresse;
		this.selskap = selskap;
		this.biler = new ArrayList<Bil>();
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
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
	public Reservasjon lagReservasjon(Bil bil, LocalDate startDato, int antDager, Kontor utleieKontor, Kontor returKontor, Kunde kunde) {
		Reservasjon res = new Reservasjon(bil, startDato, antDager, utleieKontor, returKontor, kunde);
		
		return res;
	}
	
	/**
	 * Metode for å lagre en reservasjon
	 */
	public void lagreReservasjon(Reservasjon res) {
		selskap.leggTilReservasjon(res);
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public void setSelskap(Selskap selskap) {
		this.selskap = selskap;
	}

	public void leggTilBil(Bil bil) {
		biler.add(bil);
	}

	public void setBiler(List<Bil> biler) {
		this.biler = biler;
	}
	
	public List<Bil> getBiler() {
		return biler;
	}
}
