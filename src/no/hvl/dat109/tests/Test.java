package no.hvl.dat109.tests;


import static org.junit.jupiter.api.Assertions.*;

import no.hvl.dat109.objects.Adresse;
import no.hvl.dat109.objects.Bil;
import no.hvl.dat109.objects.Kontor;
import no.hvl.dat109.objects.Kunde;
import no.hvl.dat109.objects.Reservasjon;
import no.hvl.dat109.objects.Selskap;
import no.hvl.dat109.objects.UtleiegruppeEnum;

import no.hvl.dat109.objects.UtleiegruppeEnum;

class Test {

	@org.junit.jupiter.api.Test
	void erBilReservert() {
		Bil b1 = new Bil("SU12345", "Fiat", "Panda", "Rød", UtleiegruppeEnum.LITEN_BIL);
		Bil b2 = new Bil("EL34567", "Nissan", "Leaf", "Grå", UtleiegruppeEnum.MELLOMSTOR_BIL);
		
		Reservasjon.reserver(b1);
		
		assertFalse(b1.getLedig());
	}
	
	@Test
	

}
