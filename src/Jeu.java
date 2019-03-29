
public class Jeu {
	int nbTours,difficulte;
	boolean marche;
	Humain heros1;
	Humain heros2;
	Zombie zombie1;
	Zombie zombie2;
	Zombie zombie3;
	Zombie zombie4;
	Zombie zombie5;
	Zombie zombie6;
	Zombie zombie7;
	int positionX ;
	int positionY ;
	
	
	
	
	public boolean moveLeft() {
		if (this.positionX >= 1) {
			this.positionX = this.positionX - 1 ;
			return true ;
		}
		else {
			
			return false ;
		}
		
		
	}
	
	public boolean moveRight() {
		if (this.positionX <= 20) {
			this.positionX = this.positionX + 1 ;
			return true ;
		}
		else {
			
			return false ;
		}
		
		
	}
	
	public boolean moveUp() {
		if (this.positionY >= 1) {
			this.positionY = this.positionY - 1 ;
			return true ;
		}
		else {
			
			return false ;
		}
		
		
	}
	
	public boolean moveDown() {
		if (this.positionY <= 20) {
			this.positionY = this.positionY + 1 ;
			return true ;
		}
		else {
			
			return false ;
		}
		
		
	}
	
	public void moveRandom() {
		
		int random = (int) Math.ceil(Math.random()*4);
		
		if (random == 1) {
			moveRight();
			//System.out.println(Math.ceil(Math.random()*4));
		}
		if (random == 2) {
			moveLeft();
			//System.out.println(Math.ceil(Math.random()*4));
		}
		if (random == 3) {
			moveUp();
			//System.out.println(Math.ceil(Math.random()*4));
		}
		if (random == 4) {
			moveDown();
			//System.out.println(Math.ceil(Math.random()*4));
		}
		
	}

	
	
	
	
	public int getNbTours() {
		return nbTours;
	}
	public void setNbTours(int nbTours) {
		this.nbTours = nbTours;
	}
	public int getDifficulte() {
		return difficulte;
	}
	public void setDifficulte(int difficulte) {
		this.difficulte = difficulte;
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
		this.difficulte = 0;
		this.marche = marche;
	}

	

}
