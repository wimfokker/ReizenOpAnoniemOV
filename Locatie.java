package ReizenOpAnoniemOV;

public class Locatie {

	private Double x;
	private Double y;
	private String naam;
	
	// maak een constructor aan locatie
	public Locatie(Double x, Double y, String naam) {
		this.x = x;
		this.y = y;
		this.naam = naam;
		
	}
	
	//functie
	public Double afstand(Locatie bestemming) {
		
		double positieX = this.x - bestemming.x;
		double positieY = this.y - bestemming.y;
		return Math.sqrt(positieX * positieX + positieY * positieY);
		
	}
	
	public Double getpositieX() {
		return x;
		
	}
	
	public Double getpositieY() {
		return y;
		
	}
	
	public String getNaam() {
		return naam;
	}
	
}
