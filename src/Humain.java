
public class Humain {
	Position hPosition;
	String sexe;
	boolean tourHumain, estBruyant;
	public Position gethPosition() {
		return hPosition;
	}
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
	public Humain(Position hPosition, String sexe, boolean tourHumain, boolean estBruyant) {
		super();
		this.hPosition = hPosition;
		this.sexe = sexe;
		this.tourHumain = tourHumain;
		this.estBruyant = estBruyant;
	}
	

}
