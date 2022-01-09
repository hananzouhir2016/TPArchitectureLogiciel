package Decorateurs;

import ConcreteComposants.Voiture;

public  abstract class DecorateurAbstrait implements Voiture {
	protected Voiture voiture ; 
	public DecorateurAbstrait(Voiture voiture)
	{
		this.voiture=voiture;
	}

}
