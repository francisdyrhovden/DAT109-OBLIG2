/**
 * 
 */
package no.hvl.dat109.objects;

import java.util.Date;

/**
 * @author Francis, Marius, Charlie, Glenn
 *
 */
public class Reservasjon {

	private Bil bil;
	private Date startDato;
	private int antallDager;
	private Kontor utleiested;
	private Kontor retursted;
	private Kunde kunde;
	
	
	public Reservasjon(Bil bil, Date startDato, int antallDager, Kontor utleiested, Kontor retursted, Kunde kunde) {
		super();
		this.bil = bil;
		this.startDato = startDato;
		this.antallDager = antallDager;
		this.utleiested = utleiested;
		this.retursted = retursted;
		this.kunde = kunde;
	}
	
	public void reserver(Bil bil) {
		bil.setLedig(false);
	}

	public Bil getBil() {
		return bil;
	}

	public Date getStartDato() {
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
