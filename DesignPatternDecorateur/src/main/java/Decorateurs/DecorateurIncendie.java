package Decorateurs;

import ConcreteComposants.Voiture;

public class DecorateurIncendie extends DecorateurAbstrait {

	public DecorateurIncendie(Voiture voiture) {
		super(voiture);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void garantie() {
		System.out.println("Décorateur Incendie est appliqué");
		
	}
}
