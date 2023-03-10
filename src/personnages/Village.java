package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMax];
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gogo) {
		villageois[nbVillageois++] = gogo;
	}
	
	public Gaulois trouverHabitant(int num) {
		return villageois[num];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for(int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + trouverHabitant(i).getNom());
		}
	}
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//On a une erreur que 30 > 29 donc il n'y a pas de case
		//Gaulois abra = new Gaulois("Abraracourcix",6);
		Chef abra2 = new Chef("Abraracourcix",6,1,village);
		
		//village.ajouterHabitant(abra);
		village.setChef(abra2);
		
		Gaulois as = new Gaulois("Astérix",8);
		village.ajouterHabitant(as);
		
		Gaulois gogo = village.trouverHabitant(1);
		System.out.println(gogo);
		
		Gaulois obelix = new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois();
		
	}

}
