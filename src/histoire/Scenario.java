package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain ro = new Romain("Minus",6);
		Gaulois as = new Gaulois("Ast�rix",8);
		Gaulois ob = new Gaulois("Ob�lix",10);
		Druide pano = new Druide("Panoramix",5,10);
		
		//pano.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force de 5 � 10.");
		pano.parler("Je vais aller pr�parer une petite potion...");
		pano.preparerPotion();
		pano.booster(ob);
		ob.parler("Par B�l�nos , ce n'est pas juste !");
		pano.booster(as);
		as.parler("Bonjour");
		ro.parler("UN GAU... UN GAUGAU...");
		as.frapper(ro);
		as.frapper(ro);
		as.frapper(ro);
		
		
	}

}
