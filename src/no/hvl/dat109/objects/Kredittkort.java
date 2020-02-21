package no.hvl.dat109.objects;

/**
 * 
 * @author Charlie, Marius, Francis, Glenn
 *
 */

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
	
	public boolean validerKort() {
		boolean ok = false;
		
		if (String.valueOf(kortNummer).length() == 16) {
			ok = true;
		}
		
		return ok;
	}
}
