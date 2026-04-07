package ReizenOpAnoniemOV;

public class Driver {
	public static void main(String[] args) {
		
		// To do:
		// Maak een OVkaart met een string voor een test.
		// Paal aanmaken en geef de instaptarief 4.00 mee aan de paal.
		// En ook inchecken aanmaken.
		// Geef de instaptarief een waarde
		
		// locaties
		Locatie nijmegen = new Locatie(5.40, 6.00, "Nijmegen");
		Locatie maastricht = new Locatie(4.00, 1.0, "Maastricht");
		
		Paal paalNijmegen = new Paal(nijmegen);
		Paal paalMaastricht = new Paal(maastricht);
		
		OVKaart Anoniemkaart = new OVKaart (40.00, true, false);
		
		System.out.println("saldo voor het reis: €" + Anoniemkaart.getSaldo());
		paalNijmegen.inchecken(Anoniemkaart);
		paalMaastricht.uitchecken(Anoniemkaart);
		
		
		 System.out.println();

	        //Reis annuleren (zelfde paal in- en uitchecken) ===
	        OVKaart Anoniemkaart2 = new OVKaart(50.00, true, false);
	        System.out.println("Scenario 2: Reis annuleren");
	        System.out.println("Saldo voor reis: €" + Anoniemkaart2.getSaldo());
	        paalNijmegen.inchecken(Anoniemkaart2);
	        paalNijmegen.uitchecken(Anoniemkaart2);
	}
}
