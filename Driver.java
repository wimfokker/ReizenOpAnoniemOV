package ReizenOpAnoniemOV;

public class Driver {
	public static void main(String[] args) {
		
		// To do:
		//Maak een OVkaart met een string voor een test.
		// paal aanmaken en geef de instaptarief 4.00 mee aan de paal.
		// en ook inchecken aanmaken.
		// geef de instaptarief een waarde
		
		OVKaart Anoniemkaart = new OVKaart (20.00, true, false);
		
		Paal paal = new Paal(4.00);
		
		paal.inChecken(Anoniemkaart);
		
	}
}
