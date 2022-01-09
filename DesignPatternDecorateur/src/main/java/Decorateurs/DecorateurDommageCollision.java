package Decorateurs;

import ConcreteComposants.Voiture;

public class DecorateurDommageCollision extends DecorateurAbstrait {

	public DecorateurDommageCollision(Voiture voiture) {
		super(voiture);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void garantie() {
		System.out.println("Décorateur Dommage et collision est appliqué");
		
	}
	

}
