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
	
	
	public Reservasjon(Bil bil, Date startDato, int antallDager, Kontor utleiested, Kontor retursted) {
		super();
		this.bil = bil;
		this.startDato = startDato;
		this.antallDager = antallDager;
		this.utleiested = utleiested;
		this.retursted = retursted;
		
		reserver(bil);
	}
	
	public void reserver(Bil bil) {
		bil.setLedig(false);
	}
	
}
