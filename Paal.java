package ReizenOpAnoniemOV;

public class Paal {

	private Double instapTarief;

	public void inChecken(OVKaart kaart) {

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
}
