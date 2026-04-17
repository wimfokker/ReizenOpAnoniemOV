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

		OVKaart Anoniemkaart = new OVKaart(40.00, true, false);

		System.out.println("saldo voor het reis: €" + Anoniemkaart.getSaldo());
		paalNijmegen.inchecken(Anoniemkaart);
		paalMaastricht.uitchecken(Anoniemkaart);

		System.out.println();

		// Reis annuleren (zelfde paal in- en uitchecken) ===
		OVKaart Anoniemkaart2 = new OVKaart(50.00, true, false);
		System.out.println("Scenario 2: Reis annuleren");
		System.out.println("Saldo voor reis: €" + Anoniemkaart2.getSaldo());
		paalNijmegen.inchecken(Anoniemkaart2);
		paalNijmegen.uitchecken(Anoniemkaart2);

		System.out.println();

		// NS-automaat testen opwaaderen met en aanvullen tot.

		NsAutomaat oplaadAutomaat = new NsAutomaat();
		OVKaart Anoniemkaart3 = new OVKaart(5.00, true, false);

		System.out.println("Scenario 3: Opwaaderen Met ");
		System.out.println("Saldo voor opwaaderen met: €" + Anoniemkaart3.getSaldo());

		if (oplaadAutomaat.scan(Anoniemkaart3)) {
			oplaadAutomaat.opwaaderenMet(20.00);
			System.out.println("Saldo na opwaaderen met: €" + Anoniemkaart3.getSaldo());
		} else {
			System.out.println("Ov-chipKaart is niet geldig");
		}
		oplaadAutomaat.stop();

		System.out.println();

		// aanvullen tot
		NsAutomaat oplaadAutomaat2 = new NsAutomaat();
		OVKaart Anoniemkaart4 = new OVKaart(5.00, true, false);

		System.out.println("Scenario 4: Aanvullen tot");
		System.out.println("Saldo Aanvullen tot: €" + Anoniemkaart4.getSaldo());

		if (oplaadAutomaat2.scan(Anoniemkaart4)) {
			oplaadAutomaat2.aanvullenTot(20.00);
			System.out.println("Saldo Aanvullen tot: €" + Anoniemkaart4.getSaldo());
		} else {
			System.out.println("OV-chipkaart is niet geldig");
		}
		oplaadAutomaat2.stop();
	}
}
