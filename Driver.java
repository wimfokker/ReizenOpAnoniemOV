package ReizenOpAnoniemOV;

public class Driver {
	public static void main(String[] args) {
		
		// To do:
		// Maak een OVkaart met een string voor een test.
		// Paal aanmaken en geef de instaptarief 4.00 mee aan de paal.
		// En ook inchecken aanmaken.
		// Geef de instaptarief een waarde
		
		OVKaart Anoniemkaart = new OVKaart (20.00, true, false);
		
		Paal paal = new Paal();
		
		paal.inchecken(Anoniemkaart);
		
		// De locaties zet je in het driver class.
		
	}
}
