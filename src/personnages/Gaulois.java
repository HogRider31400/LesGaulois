package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		effetPotion = 1;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force * effetPotion / 3);
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		this.parler("Merci Druide, je sens que ma force est 3 fois décuplée");
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	
	
	public static void main(String[] args) {
//TODO créer un main permettant de tester la classe Gaulois
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("coucou");
		Romain ro = new Romain("aaa",1);
		asterix.frapper(ro);
		asterix.boirePotion(10);
	}
}
