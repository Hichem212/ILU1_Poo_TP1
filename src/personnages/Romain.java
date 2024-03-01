package personnages;

public class Romain {
	private String nom ; 
	private int force ; 
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0 ;
	
	public Romain(String nom , int force) {
		this.nom = nom; 
		this.force = force;
		
	}	
	
	public String getNom() {
		return nom;
		
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<" + texte + ">");
		
	}
	
	private String prendreParole() {
		return "Le romain" + nom + " : ";
		
		
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup ;
		
		if (force <= 0) {
	        throw new IllegalArgumentException("La force d'un Romain doit être positive");
		}
	    int forceInitiale = force;
		if (force > 0 ) {
			parler("Aie");
		} else {
			parler("J'abandonne ...") ; 
			
		}
		if (force >= forceInitiale) {
	        throw new IllegalStateException("La force d'un Romain n'a pas diminué après avoir reçu un coup");
		}
		
	}
	public static void main(String[] args) {
		Equipement equipement = Equipement.CASQUE;
		Equipement equipement1 = Equipement.BOUCLIER;
		System.out.println( equipement);
		System.out.println(equipement1);
		Romain minus = new Romain("minus",7);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		
		
		
	}
	
	public void sEquiper(Equipement equipement) {
		
		switch (nbEquipement) {
		case 2: {
			System.out.println("Le soldat " + getNom() + " est déja bien protégé !");
			break ;
		}
		case 1:{
			if(this.equipement[0].equals(equipement)) {
				System.out.println(" Le soldat " + getNom() + " posséde déja " + equipement);
				break;
		
			}
		
		}
		default:
			this.equipement[nbEquipement] = equipement;
			nbEquipement++;
			System.out.println("Le soldat " + getNom()+ " s'equipe avec un " + equipement);
		
		
	
		}}
	
}
