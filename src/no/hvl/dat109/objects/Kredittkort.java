package no.hvl.dat109.objects;

public class Kredittkort {
	private int kortNummer;
	
	public Kredittkort(int nummer) {
		this.kortNummer = nummer;
	}

	public int getKortNummer() {
		return kortNummer;
	}

	public void setKortNummer(int kortNummer) {
		this.kortNummer = kortNummer;
	}
	
	public void validerKort() {
		/**
		 * Lag validering her.
		 */
	}
}
