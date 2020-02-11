package no.hvl.dat109.objects;

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
	
	public Selskap(String navn, Adresse firmaAdr, int tlfNr) {
		this.navn = navn;
		this.firmaAdr = firmaAdr;
		this.tlfNr = tlfNr;
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
	
	
}
