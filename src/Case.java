
public class Case extends Entite {
	int couleur,typeCase;
	Position casePosition;
	boolean libre;
	
	// Positionne la case finale
	
	public void PositionCaseArrive() {
		this.positionX = (int) Math.ceil(Math.random()*20);
		this.positionY = (int) Math.ceil(Math.random()*20);
	}
	
	
	
	
	

}
