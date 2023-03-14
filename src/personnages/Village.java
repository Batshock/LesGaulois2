package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum;
	private Gaulois villageois[] = new Gaulois[nbVillageoisMaximum];
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	public Gaulois trouverHabitant(int numéro) {
		return villageois[numéro];
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles",30);
//		Gaulois gaulois = village.trouverHabitant(1);
//		On obtient cette erreur car on cherche un habitant dans un emplace où il n'y a pas de gaulois
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(0);
//		System.out.println(gaulois);
//		On ne peut pas afficher un gaulois sans une fonction, sinon ça renvoie une adresse mémoire
		
	}

}
