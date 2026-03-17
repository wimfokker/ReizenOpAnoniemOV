package ReizenOpAnoniemOV;

public class Paal {

	private Double instapTarief;
	

	public void inChecken(OVKaart kaart) {

		if (kaart.getSaldo() >= instapTarief) {
		} else {
			System.out.println("Je hebt te weinig saldo");
		}

	}

}
