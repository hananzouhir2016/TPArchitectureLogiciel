import ConcreteComposants.ConcreteAssurance;
import ConcreteComposants.Voiture;
import Decorateurs.DecorateurBrisDeGlace;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture v1 = new ConcreteAssurance(); 
		v1 = new DecorateurBrisDeGlace(v1); 
		v1.garantie();
	}

}
