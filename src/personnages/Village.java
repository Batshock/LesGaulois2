package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum;
	private Gaulois villageois[];
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
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
	public Gaulois trouverHabitant(int num�ro) {
		return villageois[num�ro];
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irr�ductibles",30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		On obtient cette erreur car on d�passe la taille du village/tableau
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Ast�rix",8);
		village.ajouterHabitant(asterix);
		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
//		Cela affiche "null" car on cherche dans un emplacement o� il n'y a pas de gaulois, donc la variable gaulois ne vaut rien donc "null"
		
	}

}
