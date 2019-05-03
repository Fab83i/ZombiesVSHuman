package moteur;

import interface_graphique.MaJFrame;

public class Humain extends Deplacement{
	
	int nbTours;
	String sexe;
	boolean tourHumain, estBruyant;
	private MaJFrame mjf;
	
	

	
//	public void setPositionX( int positionX) {
//		this.positionX = positionX;
//		}
//	
//	public void setPositionY( int positionY) {
//		this.positionY = positionY;
//	}
	
//	public Humain(int positionX, int positionY, String sexe, boolean tourHumain) {
//		super();
//		this.positionX = positionX;
//		this.positionY = positionY;
//		this.sexe = sexe;
//		this.tourHumain = tourHumain;
//		this.estBruyant = false;
//	}
	
	
	
	
	public int getNbTours() {
		return nbTours;
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

	public void setNbTours(int nbTours) {
		this.nbTours = nbTours;
	}

	public String getSexe() {
		return sexe;
	}
	
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public boolean getTourHumain() {
		return tourHumain;
	}
	
	public void setTourHumain(boolean tourHumain) {
		this.tourHumain = tourHumain;
	}
	
	public boolean isEstBruyant() {
		return estBruyant;
	}
	
	public void setEstBruyant(boolean estBruyant) {
		this.estBruyant = estBruyant;
	}
	
	
	
	
	public Humain(int positionX, int positionY) {
		super(positionX, positionY);
	}
	
//	

}
