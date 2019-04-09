package moteur;

public class Zombie extends Deplacement{
	//boolean voirHumain;
	boolean tourZomb;
	



public Zombie(int positionX, int positionY, boolean voirHumain, boolean tourZomb) {
		super(positionX, positionY);
		this.tourZomb = tourZomb;
	}



	public Zombie(int positionX, int positionY) {
	super(positionX, positionY);
}






	public boolean isTourZomb() {
		return tourZomb;
	}


	public void setTourZomb(boolean tourZomb) {
		this.tourZomb = tourZomb;
	}

	
public boolean isHumain(Humain heros){ //detecte la presence de l'humain
	int i,j;
	boolean result;
	result = false;
	for (i=-2;i<3;i++) {
		for (j=-2;j<3;j++) {
			if (heros.getPositionX()==getPositionX() + i && heros.getPositionY()==getPositionY() + j && heros.getNbTours()!=0){
				result = true;
			}
			
		}
	}
	if (heros.estBruyant == true) {
		result = true;
	}
	return result;
}
	
	

	
public int getPositionX() {
	return positionX;
}

public void setPositionX(int positionX) {
	this.positionX = positionX;
}

public int getPositionY() {
	return positionY;
}

public void setPositionY(int positionY) {
	this.positionY = positionY;
}

//public void manger(Humain heros, Jeu game){
//	if (heros.getPositionX()==getPositionX() && heros.getPositionY()==getPositionY()) {
//		game.setMarche(false);
//		
//	}
//}



		
	}

	

	


	

	
