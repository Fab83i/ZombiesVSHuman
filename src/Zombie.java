import java.io.RandomAccessFile;
import java.util.Random;

public class Zombie extends Deplacement{
	int positionX, positionY;
	boolean voirHumain;
	boolean tourZomb;
	



public Zombie(int positionX, int positionY, boolean voirHumain, boolean tourZomb) {
		super();
		this.positionX = positionX;
		this.positionY = positionY;
		this.voirHumain = voirHumain;
		this.tourZomb = tourZomb;
	}



public Zombie() {
	super();
}



	public boolean isVoirHumain() {
		return voirHumain;
	}


	public void setVoirHumain(boolean voirHumain) {
		this.voirHumain = voirHumain;
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

public void manger(Humain heros, Jeu game){
	if (heros.getPositionX()==getPositionX() && heros.getPositionY()==getPositionY()) {
		game.setMarche(false);
		
	}
}



		
	}

	

	


	

	
