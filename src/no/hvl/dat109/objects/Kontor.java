package no.hvl.dat109.objects;

public class Kontor {
	
	private int id;
	private Adresse adresse;
	
	public Kontor(int id, Adresse adresse) {
		super();
		this.id = id;
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public Adresse getAdresse() {
		return adresse;
	}
	
	
	
	

}
