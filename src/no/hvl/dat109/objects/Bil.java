package no.hvl.dat109.objects;


/**
 * Klasse for å definere en bil.
 * 
 * @author Marius, Charlie, Glenn, Francis
 *
 */
public class Bil {
	private String regnr;
	private String merke;
	private String modell;
	private String farge;
	private String utleiegruppe;
	private Boolean ledig;
	
	public Bil(String regnr, String merke, String modell, String farge, String utleiegruppe) {
		this.regnr = regnr;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.utleiegruppe = utleiegruppe;
		this.ledig = false;
	}

	public String getRegnr() {
		return regnr;
	}

	public void setRegnr(String regnr) {
		this.regnr = regnr;
	}

	public String getMerke() {
		return merke;
	}

	public void setMerke(String merke) {
		this.merke = merke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public String getUtleiegruppe() {
		return utleiegruppe;
	}

	public void setUtleiegruppe(String utleiegruppe) {
		this.utleiegruppe = utleiegruppe;
	}

	public Boolean getLedig() {
		return ledig;
	}

	public void setLedig(Boolean ledig) {
		this.ledig = ledig;
	}
}
