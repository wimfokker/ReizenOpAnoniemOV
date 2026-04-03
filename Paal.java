package ReizenOpAnoniemOV;

public class Paal {

	private Double instapTarief = 4.00;
	private Double tariefTrein = 0.15;
	private Locatie locatie;
	
	public Paal() {
	}
	
	public Paal(Locatie locatie) {
		this.locatie = locatie;
	}

	// Sla de instapTarief gegevens op.
	public Paal(Double instapTarief, Double tariefTrijn, String locatie) {
		this.instapTarief = instapTarief;
		this.tariefTrein = tariefTrijn;
	}

	public void inchecken(OVKaart kaart) {

		if (kaart.getGeldigheid() == true) {
			if (kaart.getSaldo() >= instapTarief) {
				kaart.aftrekken(instapTarief);
				kaart.inchecken(this.locatie);
				System.out.println("Je bent ingecheckt");

			} else {
				System.out.println("Je bent niet ingecheckt");
			}
		} else {
			System.out.println("Chipkaart niet geldig.");

		}

	}
	
	public void uitchecken(OVKaart kaart) {
		
		if (!kaart.getIngecheckt()) {
			System.out.println("Je bent niet ingecheckt");
			return;
		}
		
		Locatie instapLocatie = kaart.getInstapLocatie();
		
		
		double afstandKm = instapLocatie.afstand(this.locatie);
		
		if (afstandKm == 0) {
			kaart.toevoegen(instapTarief);
			kaart.uitchecken();
			System.out.println("Reis geannuleert");
			
		} else {
			//normaal uitchecken
			double reiskosten = afstandKm * tariefTrein;
			kaart.aftrekken(reiskosten);
			kaart.uitchecken();
			System.out.println("uitgecheckt");
			System.out.println("Saldo na het reis:" + kaart.getSaldo());
		}
	}		
}
