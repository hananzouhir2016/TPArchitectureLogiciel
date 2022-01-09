package Decorateurs;

import ConcreteComposants.Voiture;

public class DecorateurBrisDeGlace extends DecorateurAbstrait {

	public DecorateurBrisDeGlace(Voiture voiture) {
		super(voiture);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void garantie() {
		System.out.println("D�corateur Brise de glace est appliqu�");
		
	}
}
