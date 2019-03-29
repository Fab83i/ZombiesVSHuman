import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		
		
		Jeu game = new Jeu(true);
		ArrayList<Zombie> list = new ArrayList<>();
		for (int i=0;i<7;i++) {
			list.add(new Zombie());
		
		}
		
		Entite test = new Entite();
		Case caseArrivee = new Case();
		
		Zombie zombie1 = new Zombie();
		
		caseArrivee.PositionCaseArrive();
		 // System.out.println(caseArrivee.getPositionX()); Vérification
		
		// test.moveRandom();
		
		

	}

}
