package personnages;

import java.util.Iterator;

public class Gaulois {
	private String nom ;
	private int force ; 
	private int effetPotion;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = 1 ;
	}
	

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+ "<" + texte + ">");
		
	}
	
	private String prendreParole() {
		return "Le gaulois" + nom + ":";

		
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3 * effetPotion );
		
		
	}


	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		//TODO créer un main permettant de tester la classe Gaulois 
		Gaulois asterix = new Gaulois("Astérix",8) ; 
		System.out.println(asterix);
		Romain romain = new Romain("César",5);
		asterix.prendreParole();
		asterix.parler(" hey");
		asterix.frapper(romain);
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion ;
		System.out.println("Merci Druide,je sens que ma force est " + effetPotion + " fois décuplée");
		
	}
	

}


	




