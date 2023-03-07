package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		assert force > 0;
		this.force = force;
		equipements = new Equipement[2];
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2:
		{
			System.out.println("Le solat " + nom + " est déjà bien protégé");
			break;
		}
		case 1:
		{
			if(equipements[0].toString() == equipement.toString()) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement.toString());
			}
			else {
				equipements[1] = equipement;
				nbEquipement++;
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement.toString());
		
			}
			break;
		}
		default:
		{
			nbEquipement++;
			equipements[0] = equipement;
			
			System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement.toString());
			break;
		}
		
	}
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
	}
	public static void main(String[] args) {
		Romain ro = new Romain("ro",6);
		System.out.println(ro.prendreParole());
		ro.parler("salut");
		ro.recevoirCoup(10000);
		System.out.println(Equipement.CASQUE + " " + Equipement.BOUCLIER);
		
		ro.sEquiper(Equipement.CASQUE);
		ro.sEquiper(Equipement.CASQUE);
		ro.sEquiper(Equipement.BOUCLIER);
		ro.sEquiper(Equipement.CASQUE);
		
	}
}
