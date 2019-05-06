package moteur;

import interface_graphique.MaJFrame;

public class Zombie extends Deplacement{
	
	



public Zombie(int positionX, int positionY, boolean voirHumain) {
		super(positionX, positionY);
		
	}

	public Zombie(int positionX, int positionY) {
	super(positionX, positionY);
}


	
public boolean isHumain(Humain heros, int nbMove){ //detecte la presence de l'humain
	
	boolean result;
	result = false;
	if ((getPositionX() - heros.getPositionX() <= 2 && (getPositionX() - heros.getPositionX()) >= -2 && (getPositionY() -  heros.getPositionY()) <=  2 && (getPositionY() -  heros.getPositionY()) >= -2 )) {
		result =true;
	}
	
	if (nbMove>=2) {
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




		
	}

	

	


	

	
