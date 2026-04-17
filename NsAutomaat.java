package ReizenOpAnoniemOV;

public class NsAutomaat {
	
	private OVKaart ovKaart;
	
	public boolean scan(OVKaart ovKaart) {
		
		this.ovKaart = ovKaart;
		return ovKaart.getGeldigheid();
	}
	
	public void opwaaderenMet(Double bedrag) {
		
		OVKaart kaart = ovKaart;
		if  (kaart != null) {
			kaart.toevoegen(bedrag);
			System.out.println("Saldo opwaaderen met:" + bedrag);
			System.out.println("Nieuwe saldo: " + kaart.getSaldo());
	} else {
		System.out.println("geen kaart");
	}
}
	
	public void aanvullenTot() {
		
	}
	
	public void stop() {
		
	}

}