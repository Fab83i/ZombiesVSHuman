
public class Jeu {
	int nbTours,difficulté;
	boolean marche;
	
	
	public int getNbTours() {
		return nbTours;
	}
	public void setNbTours(int nbTours) {
		this.nbTours = nbTours;
	}
	public int getDifficulté() {
		return difficulté;
	}
	public void setDifficulté(int difficulté) {
		this.difficulté = difficulté;
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
		this.difficulté = 0;
		this.marche = marche;
	}

	

}
