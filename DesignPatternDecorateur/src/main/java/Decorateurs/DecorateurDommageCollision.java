package Decorateurs;

import ConcreteComposants.Voiture;

public class DecorateurDommageCollision extends DecorateurAbstrait {

	public DecorateurDommageCollision(Voiture voiture) {
		super(voiture);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void garantie() {
		System.out.println("D�corateur Dommage et collision est appliqu�");
		
	}
	

}
