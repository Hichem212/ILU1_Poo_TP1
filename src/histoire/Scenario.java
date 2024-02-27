package histoire;
import java.util.*;

import personnages.Gaulois;
import personnages.Romain; 

public class Scenario {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Astérix",8);
		Romain minus = new Romain("Minus",6);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU..UN GAUGAU...");
		asterix.frapper(minus);
		minus.parler("Aie");
		asterix.frapper(minus);
		minus.parler("Aie");
		asterix.frapper(minus);
		minus.parler("J'abandonne...");
		
		

	}

}
