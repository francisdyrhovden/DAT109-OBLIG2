package no.hvl.dat109.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat109.objects.Adresse;
import no.hvl.dat109.objects.Bil;
import no.hvl.dat109.objects.Kontor;
import no.hvl.dat109.objects.Reservasjon;
import no.hvl.dat109.objects.Selskap;
import no.hvl.dat109.objects.UtleiegruppeEnum;

class TestReservasjon {
	


	Adresse adresse1 = new Adresse("Ryfylkeveien 1251", 4308, "SANDNES");
	Adresse adresse2 = new Adresse("Ryfylkeveien 1252", 4308, "SANDNES");
	Bil bil = new Bil("EV93845", "Tesla", "Model 3", "Blå", UtleiegruppeEnum.MELLOMSTOR_BIL);
	Kontor Bergen = new Kontor(0, adresse1);
	Kontor Oslo = new Kontor(0, adresse2);
	Reservasjon reservasjon = new Reservasjon(bil, LocalDate.of(2020, 01, 01), 3, Bergen, Oslo);
	@Test
	void test() {
		
		fail("Not yet implemented");
	}

}
