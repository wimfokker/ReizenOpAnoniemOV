package ReizenOpAnoniemOV;

public class NsAutomaat {
	
	private OVKaart ovKaart;
	
	public boolean scan(OVKaart ovKaart) {
		
		if (ovKaart.getGeldigheid()) {
		this.ovKaart = ovKaart;
		System.out.println("Op uw OV-chipkaart");
		return true; 
		} else {
			System.out.println("OV-chipkaart is niet geldig");
			return false;
		}
	}
	
	public void opwaaderenMet() {
		
	}
	
	public void aanvullenTot() {
		
	}
	
	public void stop() {
		
	}

}