package no.hvl.dat109.objects;

/**
 * Klasse for å definere en kunde.
 * 
 * @author Marius, Charlie, Glenn, Francis
 *
 */
public class Kunde {
	private String fornavn;
	private String etternavn;
	private int tlfNr;
	private Adresse addresse;
	
	public Kunde(String fornavn, String etternavn, int tlfNr, Adresse addresse) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.tlfNr = tlfNr;
		this.addresse = addresse;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public int getTlfNr() {
		return tlfNr;
	}

	public void setTlfNr(int tlfNr) {
		this.tlfNr = tlfNr;
	}

	public Adresse getAddresse() {
		return addresse;
	}

	public void setAddresse(Adresse addresse) {
		this.addresse = addresse;
	}
	
}
