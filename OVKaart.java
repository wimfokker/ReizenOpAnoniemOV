package ReizenOpAnoniemOV;

public class OVKaart {

	private Double saldo;
	private Boolean geldigheid;
	private Boolean ingecheckt;

	// constructeur
	public OVKaart(Double saldo, Boolean geldigheid, Boolean ingecheckt) {

		this.saldo = saldo;
		this.geldigheid = geldigheid;
		this.ingecheckt = ingecheckt;

	}

	public Double getSaldo() {
		return saldo;
	}

	public Boolean getGeldigheid() {
		return geldigheid;
	}

	public Boolean getIngecheckt() {
		return ingecheckt;
	}

}
