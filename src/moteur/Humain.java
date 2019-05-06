package moteur;

import interface_graphique.MaJFrame;

public class Humain extends Deplacement{
	
	String sexe;
	private MaJFrame mjf;
	
	

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


	public String getSexe() {
		return sexe;
	}
	
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	
	public Humain(int positionX, int positionY) {
		super(positionX, positionY);
	}
	
	

}
