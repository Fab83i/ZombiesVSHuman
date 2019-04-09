import java.util.ArrayList;

import interface_graphique.MaJFrame;

package moteur;

public class Jeu {
	int difficulte;
	boolean marche;
	Humain heros=new Humain(5, 5);
/*	Zombie zombie1 = new Zombie();
	Zombie zombie2= new Zombie();
	Zombie zombie3= new Zombie();
	Zombie zombie4= new Zombie();
	Zombie zombie5= new Zombie();
	Zombie zombie6= new Zombie();
	Zombie zombie7= new Zombie();*/
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

	
	
	
	
	public int getDifficulte() {
		return difficulte;
	}
	public void setDifficulte(int difficulte) {
		this.difficulte = difficulte;
	}
	public boolean getMarche() {
		return marche;
	}
	public void setMarche(boolean marche) {
		this.marche = marche;
	}
	public Jeu( boolean marche) {
		super();
		this.difficulte = 0;
		this.marche = marche;
	}

	public Jeu() {
		super();
	}

	



	public void faireUnTour (ArrayList<Zombie> zombies,Jeu game) {
		int i;
		if (game.getMarche()==true) {
			System.out.println("A vous de jouer");
			if (heros.getTourHumain()==true) {
				heros.coumptDepHum(heros);
				heros.humBruyant();
			}
			if (heros.getPositionX()==caseArrivee.getPositionX() && heros.getPositionY()==caseArrivee.getPositionY()) {
				game.setMarche(false);
			}
			if (heros.getTourHumain()==false) {
				for (i=0;i<zombies.size();i++){
					zombies.get(i).moveZomb(zombies.get(i), heros);
					if (heros.getPositionX()==zombies.get(i).getPositionX() && heros.getPositionY()==zombies.get(i).getPositionY()) {
						game.setMarche(false);
					}
				}
			}
		}
	}
	










}
