package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<" + texte + ">");

	}

//	private String prendreParole() {
//		return "Le gaulois" + nom + ":";
//
//		
//	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup(force / 3 * effetPotion );
//		
//		
//	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		// TODO créer un main permettant de tester la classe Gaulois
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
		Romain romain = new Romain("César", 5);
		asterix.prendreParole();
		asterix.parler(" hey");
		asterix.frapper(romain);
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		System.out.println("Merci Druide,je sens que ma force est " + effetPotion + " fois décuplée");

	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];

		}

	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";

	}

}
