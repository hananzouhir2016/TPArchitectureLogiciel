package Decorateurs;

import ConcreteComposants.Voiture;

public class DecorateurVol extends DecorateurAbstrait {

	public DecorateurVol(Voiture voiture) {
		super(voiture);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void garantie() {
		System.out.println("Décorateur Vol est appliqué");
		
	}
}