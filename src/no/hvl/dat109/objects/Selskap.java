package no.hvl.dat109.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse for å definere ett selskap
 * 
 * @author Marius, Charlie, Glenn, Francis
 *
 */
public class Selskap {
	private String navn;
	private String firmaAdr;
	private int tlfNr;
	private List<Reservasjon> reservasjoner;
	
	public Selskap(String navn, String firmaAdr, int tlfNr) {
		this.navn = navn;
		this.firmaAdr = firmaAdr;
		this.tlfNr = tlfNr;
		this.reservasjoner = new ArrayList<Reservasjon>();
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getFirmaAdr() {
		return firmaAdr;
	}

	public void setFirmaAdr(String firmaAdr) {
		this.firmaAdr = firmaAdr;
	}

	public int getTlfNr() {
		return tlfNr;
	}

	public void setTlfNr(int tlfNr) {
		this.tlfNr = tlfNr;
	}
	
	public List<Reservasjon> getReservasjoner(){
		return this.reservasjoner;
	}
	
	
}
