
public class Jeu {
	int nbTours,difficult�;
	boolean marche;
	
	
	public int getNbTours() {
		return nbTours;
	}
	public void setNbTours(int nbTours) {
		this.nbTours = nbTours;
	}
	public int getDifficult�() {
		return difficult�;
	}
	public void setDifficult�(int difficult�) {
		this.difficult� = difficult�;
	}
	public boolean isMarche() {
		return marche;
	}
	public void setMarche(boolean marche) {
		this.marche = marche;
	}
	public Jeu( boolean marche) {
		super();
		this.nbTours = 0;
		this.difficult� = 0;
		this.marche = marche;
	}

	

}
