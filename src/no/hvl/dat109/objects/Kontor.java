package no.hvl.dat109.objects;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasse for å definere ett kontor.
 * 
 * @author Marius, Charlie, Glenn, Francis
 *
 */
public class Kontor {
	
	private static final AtomicInteger count = new AtomicInteger(0);
	private final int id;
	private Adresse adresse;
	
	public Kontor(int id, Adresse adresse) {
		super();
		this.id = count.incrementAndGet();
		this.adresse = adresse;
	}
	
	public void leggTilBiler() {
	
	List<Bil> biler =new ArrayList<Bil>();
	biler.add(SU 12345, Fiat, Panda);
	
	
	
	}

	public int getId() {
		return id;
	}

	public Adresse getAdresse() {
		return adresse;
	}
	
	
}
