package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipements[];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		assert force>=0; 
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2]; 
	}
	public String getNom() {
		return nom;
		}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert force>=0;
		int forced = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} 
		else {
			parler("J'abandonne...");
		}
		assert force < forced;
	}
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 0:
			equipements[0] = equipement;
			nbEquipement+=1;
			System.out.println("Le soldat "+nom+" s'équipe avec un "+equipement+".");
			break;
		case 1:
			if (equipements[0]==equipement) {
				System.out.println("Le soldat "+nom+" possède déjà un "+equipement+".");
			}
			else{
				equipements[1] = equipement;
				nbEquipement+=1;
				System.out.println("Le soldat "+nom+" s'équipe avec un "+equipement+".");
			}
			break;
		default:
			System.out.println("Le soldat "+nom+" est déjà bien protégé !");
			break;
		}
	}
	
	public static void main(String[] args) {
		Romain cesar = new Romain("César", 6);
		System.out.println(cesar.prendreParole()); 
		cesar.parler("A mort ces gaulois !");
		cesar.recevoirCoup(1);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		cesar.sEquiper(Equipement.CASQUE);
		cesar.sEquiper(Equipement.CASQUE);
		cesar.sEquiper(Equipement.BOUCLIER);
		cesar.sEquiper(Equipement.CASQUE);
	}
}

