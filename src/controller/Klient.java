package controller;

import no.hvl.dat109.objects.*;

public class Klient {

	public static void main(String[] args) {
		
		//Test om enum funker :))))
		Bil b1 = new Bil("EV92354", "Tesla", "Model 3", "Svart", UtleiegruppeEnum.STOR_BIL);
		System.out.println(b1.toString());

	}

}
