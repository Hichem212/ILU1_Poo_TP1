package personnages;


public enum Equipement {
	CASQUE("casque"), BOUCLIER("bouclier");
	
	private String nom;


	Equipement(String nom) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
	}

	
	public String toString() {
        return nom;
    }
}
