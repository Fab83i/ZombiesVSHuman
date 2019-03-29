import java.awt.event.KeyEvent;
import java.util.Random;

public class Deplacement {
	
	// Classe "abstraite" qui contient les méthodes nécessaires à zombie et humain. Notamment les méthodes
	// se deplacer et se deplacer random pour le zombie et la case d'arrivée. 
	// Pour modifier la position, implementer directement dans les classes humains et zombies. 
	
	int positionX ;
	int positionY ;
	int nbDeplacHum ; 
	
	
	
	public int getNbDeplacHum() {
		return nbDeplacHum;
	}

	public void setNbDeplacHum(int nbDeplacHum) {
		this.nbDeplacHum = nbDeplacHum;
	}

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

	public void moveHum(Humain heros) { //compte le nb de d�placement de l'humain par tour en modifiant la variable nbDeplacHum
		int k;
		k=0;
		if (heros.moveRight()==true) {
			k=k+1;
		}
		if (heros.moveDown()==true) {
			k=k+1;
		}
		if (heros.moveLeft()==true) {
			k=k+1;
		}
		if (heros.moveUp()==true) {
			k=k+1;
		}
		setNbDeplacHum(k);
	}
	

	public void moveZomb (Zombie zombie1, Humain heros) {
		Random rd = new Random();
		boolean k,m;
		k= rd.nextBoolean();
		m= rd.nextBoolean();
		if (zombie1.isHumain(heros)==false) {
			zombie1.moveRandom();
		}
		else {
			if (zombie1.getPositionX() == heros.getPositionX()) {
				if (zombie1.getPositionY() > heros.getPositionY()) {
					zombie1.moveDown();
					zombie1.moveDown();
				}
				else {
					zombie1.moveUp();
					zombie1.moveUp();
				}
			}
			if (zombie1.getPositionY() == heros.getPositionY()) {
				if (zombie1.getPositionX() > heros.getPositionX()) {
					zombie1.moveLeft();
					zombie1.moveLeft();
				}
				else {
					zombie1.moveRight();
					zombie1.moveRight();
				}
			}
			if(zombie1.getPositionX() != heros.getPositionX() && zombie1.getPositionY() != heros.getPositionY()) {
				if (k== true) {
					if (zombie1.getPositionX() > heros.getPositionX()) {
						zombie1.moveLeft();
					}
					else {
						zombie1.moveRight();
					}
					
				}
				if (k== false) {
					if (zombie1.getPositionY() > heros.getPositionY()) {
						zombie1.moveDown();
					}
					else {
						zombie1.moveUp();
					}
				}
				if (m== true) {
					if (zombie1.getPositionX() > heros.getPositionX()) {
						zombie1.moveLeft();
					}
					else {
						zombie1.moveRight();
					}
					
				}
				if (m== false) {
					if (zombie1.getPositionY() > heros.getPositionY()) {
						zombie1.moveDown();
					}
					else {
						zombie1.moveUp();
					}
				}
			}
		}
	}
}
	
	
	
	
	