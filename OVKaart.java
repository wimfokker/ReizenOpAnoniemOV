package ReizenOpAnoniemOV;

public class OVKaart {

	private Double saldo;
	private Boolean geldigheid;
	private Boolean ingecheckt;
	private Locatie instapLocatie;
	// to do:
	// bedrag aftrekken van het saldo.
	// meegeven van een double

	// functie maken die noemen we inchecken en die moet igecheckt van dat
	// variabelen naar false en true.

	// constructeur
	public OVKaart(Double saldo, Boolean geldigheid, Boolean ingecheckt) {

		this.saldo = saldo;
		this.geldigheid = geldigheid;
		this.ingecheckt = ingecheckt;

	}

	// Maak een methode inchecken voor de true en false.

	public void inchecken(Locatie locatie) {
		this.ingecheckt = true;
		this.instapLocatie = locatie;
	}
	
	// maak een methode uitchecken voor true false.
	public void uitchecken() {
		this.ingecheckt = false;
		this.instapLocatie = null;
	}

	// meegeven van een double
	public void aftrekken(Double bedrag) {
		this.saldo = this.saldo - bedrag;
	}
	
	//terug storten van anuleren
	public void toevoegen(Double bedrag) {
		this.saldo = this.saldo + bedrag;
	}

	// return waarde opvragen
	public Double getSaldo() {
		return saldo;
	}

	public Boolean getGeldigheid() {
		return geldigheid;
	}

	public Boolean getIngecheckt() {
		return ingecheckt;
	}
	
	public Locatie getInstapLocatie() {
		return instapLocatie;
	}

}
