package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Gaulois obelix = new Gaulois("Ob�lix", 20);
		Romain brutus = new Romain("Brutus",6);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller pr�parer une potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour � tous !");
		brutus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(brutus);
		asterix.frapper(brutus);
		asterix.frapper(brutus);
	}
}
