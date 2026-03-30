package ReizenOpAnoniemOV;

public class Paal {

	private Double instapTarief = 20.00;

	// Sla de instapTarief gegevens op.
	
	public Paal() {
	}

	public Paal(Double instapTarief) {
		this.instapTarief = instapTarief;
	}

	public void inchecken(OVKaart kaart) {

		if (kaart.getGeldigheid() == true) {
			if (kaart.getSaldo() >= instapTarief) {
				kaart.aftrekken(instapTarief);
				kaart.inchecken();
				System.out.println("Je bent ingechekt");

			} else {
				System.out.println("Je bent niet ingechekckt");
			}

		}

	}
	
	public void uitchecken(OVKaart kaart) {
		
	}
}
