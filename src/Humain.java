
public class Humain extends Entite{
	
	//int positionX;
	//int positionY;
	Position hPosition;
	String sexe;
	boolean tourHumain, estBruyant;
	
	
	public Position gethPosition() {
		return hPosition;
	}
	
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
	
	
	public void sethPosition(Position hPosition) {
		this.hPosition = hPosition;
	}
	
	public String getSexe() {
		return sexe;
	}
	
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public boolean isTourHumain() {
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
	
	public Humain(Position hPosition, String sexe, boolean tourHumain) {
		super();
		this.hPosition = hPosition;
		this.sexe = sexe;
		this.tourHumain = tourHumain;
		this.estBruyant = false;
	}
	
	
	public Humain() {
		super();
	}
	
	
	

}
