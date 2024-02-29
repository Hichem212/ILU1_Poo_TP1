package histoire;
import java.util.*;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain; 

public class Scenario {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Astérix",8);
		Romain minus = new Romain("Minus",6);
		Gaulois obelix = new Gaulois("Obélix",25);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10.");
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(forcePotion);
		asterix.parler("Bonjour");
		minus.parler("UN GAU..UN GAUGAU...");
		asterix.frapper(minus);
		minus.parler("J'abandonne...");
		
		

	}

}
