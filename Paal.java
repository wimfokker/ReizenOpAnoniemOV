package ReizenOpAnoniemOV;

public class Paal {

	private Double instapTarief = 20.00;
	
	public Paal() {
	}

	// Sla de instapTarief gegevens op.
	public Paal(Double instapTarief) {
		this.instapTarief = instapTarief;
	}

	public void inchecken(OVKaart kaart) {

		if (kaart.getGeldigheid() == true) {
			if (kaart.getSaldo() >= instapTarief) {
				kaart.aftrekken(instapTarief);
				kaart.inchecken();
				System.out.println("Je bent ingecheckt");

			} else {
				System.out.println("Je bent niet ingecheckt");
			}

		}

	}
	
	public void uitchecken(OVKaart kaart) {
		
		
		
	}
}
