package moteur;

public class Case extends Deplacement {
	int couleur,typeCase;
	boolean libre;
	
	
	
	
	
	public Case(int positionX, int positionY) {
		super(positionX, positionY);
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

	// Positionne la case finale

//	public void PositionCaseArrive() {
//		this.positionX = (int) Math.ceil(Math.random()*20);
//		this.positionY = (int) Math.ceil(Math.random()*20);
//	}
	
	
	
	
	

}
