package personnages;
import java.nio.file.spi.FileSystemProvider;
import java.util.Random;


public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	int forcePotion ; 
	private int effetPotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom+ " et ma potion peut aller d'une force " + effetPotionMin + " à "+ effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void  preparerPotion() {
		Random random = new Random();
		int forcePotion = effetPotionMin + random.nextInt(effetPotionMax - effetPotionMin + 1);
	      if (forcePotion > 7) {
	          System.out.println("J'ai préparé une super potion de force " + forcePotion);
	      } else {
	          System.out.println("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
	       }
		
	}
	
	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix",5, 10);
		druide.preparerPotion() ; 
	}
	
	public void  booster(Gaulois gaulois) { 
		if ((gaulois.getNom().equals("Obélix"))) {
			parler("Non,Obélix !... Tu n'auras pas de potion magique !");
		}else {
			gaulois.boirePotion(forcePotion);			
			
			
		}
	}
	
}

