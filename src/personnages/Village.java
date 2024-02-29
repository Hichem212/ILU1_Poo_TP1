package personnages;

import java.util.Iterator;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois;
	private Gaulois [] villageois; 
	int nbVillageoisMaximum;
	
	public Village(String nom ,int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageois = 0;
		this.villageois = new Gaulois[nbVillageoisMaximum]; 
		
	}
	
		
	
	public Chef getChef() {
		return chef;
	}



	public void setChef(Chef chef) {
		this.chef = chef;
	}



	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
		}
    }
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
		
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductible",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		// Il y'a cette erreur The method trouverHabitant(int) is undefined for the type Village at personnages.Village.main(Village.java:48)
		Gaulois abraracourcix = new Gaulois("abraracourcix",6);
		//village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//Cela renvoie null car Astérix arrive au rang 0 est non au rang 1
		Gaulois obelix = new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();

	}
	public void afficherVillageois() {
		System.out.println("Dans le village du chef Abracourcix vivent les légendaires gaulois : ");
		
		for(int i = 0; i< nbVillageois ;i++ ) {
			System.out.println("-" + villageois[i].getNom() + "\n");
		}

	}
	
	
}
