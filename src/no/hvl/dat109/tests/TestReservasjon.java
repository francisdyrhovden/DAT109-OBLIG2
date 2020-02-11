package no.hvl.dat109.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Date;


import org.junit.jupiter.api.Test;

import no.hvl.dat109.objects.Adresse;
import no.hvl.dat109.objects.Bil;
import no.hvl.dat109.objects.Kontor;
import no.hvl.dat109.objects.Kunde;
import no.hvl.dat109.objects.Reservasjon;
import no.hvl.dat109.objects.Selskap;
import no.hvl.dat109.objects.UtleiegruppeEnum;

class TestReservasjon {
	
	Adresse adresse1 = new Adresse("Ryfylkeveien 1251", 4308, "SANDNES");
	Adresse adresse2 = new Adresse("Ryfylkeveien 1252", 4308, "SANDNES");
	Kunde k1 = new Kunde("Per", "Persen", 92346473, new Adresse("heiveien 4", 4554, "Bergen"));
	Selskap selskap = new Selskap("AUTORENT", adresse1, "92822779");
	
	Bil bil = new Bil("EV93845", "Tesla", "Model 3", "Blå", UtleiegruppeEnum.MELLOMSTOR_BIL);
	Kontor Bergen = new Kontor(0, adresse1, selskap);
	Kontor Oslo = new Kontor(0, adresse2, selskap);
	Reservasjon reservasjon = new Reservasjon(bil, LocalDate.of(2020, 01, 01), 3, Bergen, Oslo, k1);
	@Test
	void test() {
		
		fail("Not yet implemented");
	}

}
