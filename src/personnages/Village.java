package personnages;

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
	public Gaulois trouberHabitant(int numero) {
		return villageois[numero];
		
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductible",30);
		
	
	}
}
