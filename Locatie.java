package ReizenOpAnoniemOV;

public class Locatie {

	private Double X;
	private Double Y;
	private String naam;
	
	// maak een constrectuer aan locatie
	public Locatie(Double X, Double Y) {
		this.X = X;
		this.Y = Y;
		
	}
	
	//functie
	public Double afstand(Locatie bestemming) {
		
		double positieX = this.X - bestemming.Y;
		double positieY = this.Y - bestemming.X;
		return Math.sqrt(positieX * positieX + positieY * positieY);
		
	}
	
	public Double setpositieX() {
		return X;
		
	}
	
	public Double setpositieY() {
		return Y;
		
	}
	
}
