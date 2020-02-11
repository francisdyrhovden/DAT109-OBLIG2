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
	private Adresse firmaAdr;
	private int tlfNr;
	private List<Reservasjon> reservasjoner;
	private List<Kontor> kontorer;
	
	public Selskap(String navn, Adresse firmaAdr, int tlfNr) {
		this.navn = navn;
		this.firmaAdr = firmaAdr;
		this.tlfNr = tlfNr;
		this.reservasjoner = new ArrayList<Reservasjon>();
		this.kontorer = new ArrayList<Kontor>();
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Adresse getFirmaAdr() {
		return firmaAdr;
	}

	public void setFirmaAdr(Adresse firmaAdr) {
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
	
	public void leggTilReservasjon(Reservasjon res) {
		reservasjoner.add(res);
	}
	
	
}
