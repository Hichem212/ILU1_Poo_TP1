package personnages;

public class Romain {
	private String nom ; 
	private int force ; 
	
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
		Romain romain = new Romain("LER",-2);
		Romain romain = new Romain("Minus",6);
		
		
	}
}
