
public class Case extends Deplacement {
	int positionX , positionY;
	int couleur,typeCase;
	//Position casePosition;
	boolean libre;
	
	
	
	
	
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

	public void PositionCaseArrive() {
		this.positionX = (int) Math.ceil(Math.random()*20);
		this.positionY = (int) Math.ceil(Math.random()*20);
	}
	
	
	
	
	

}
