package Decorateurs;

import ConcreteComposants.Voiture;

public class DecorateurInondation extends DecorateurAbstrait {

	public DecorateurInondation(Voiture voiture) {
		super(voiture);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void garantie() {
		System.out.println("D�corateur Inondation est appliqu�");
		
	}
}
