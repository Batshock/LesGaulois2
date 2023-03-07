package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Romain brutus = new Romain("Brutus",6);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller préparer une potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour à tous !");
		brutus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(brutus);
		asterix.frapper(brutus);
		asterix.frapper(brutus);
	}
}
