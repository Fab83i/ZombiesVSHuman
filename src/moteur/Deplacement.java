package moteur;

import java.util.Random;

import interface_graphique.MaJFrame;

public class Deplacement {

	int positionX;
	int positionY;
	private MaJFrame mjf;

	public Deplacement(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}


	public int getPositionX() {
		return this.positionX;
	}

	public int getPositionY() {
		return this.positionY;
	}
	


	public boolean moveLeft() {
		if (this.positionX >= 1) {
			this.positionX = this.positionX - 1;
			return true;
		} else {
			return false;
		}
	}

	public boolean moveRight() {
		if (this.positionX < 19) {
			this.positionX = this.positionX + 1;
			return true;
		} else {
			return false;
		}
	}

	public boolean moveUp() {
		if (this.positionY >= 1) {
			this.positionY = this.positionY - 1;
			return true;
		} else {
			return false;
		}
	}

	public boolean moveDown() {
		if (this.positionY < 19) {
			this.positionY = this.positionY + 1;
			return true;
		} else {
			return false;
		}
	}

	public void moveRandom() {
		int random = (int) Math.ceil(Math.random() * 4);
		if (random == 1)
			moveRight();
		if (random == 2)
			moveLeft();
		if (random == 3)
			moveUp();
		if (random == 4)
			moveDown();
	}



	
public void moveZomb(Zombie zombie1, Humain heros, int nbMov) {
		
		System.out.println(zombie1.isHumain(heros, nbMov));
		
		if (zombie1.isHumain(heros,nbMov) == false) {
			zombie1.moveRandom();
		}
		
		if (zombie1.isHumain(heros,nbMov)==true) {
			
			if (zombie1.getPositionX() == heros.getPositionX()) {
				if ((zombie1.getPositionY() - heros.getPositionY()) <-1) {
					zombie1.moveDown();
					zombie1.moveDown();
				}
				if ((zombie1.getPositionY() - heros.getPositionY()) >1) {
					
					zombie1.moveUp();
					zombie1.moveUp();
				}
				if((zombie1.getPositionY() - heros.getPositionY()) ==- 1) {
					zombie1.moveDown();
					}
				if((zombie1.getPositionY() - heros.getPositionY()) == 1) {
					zombie1.moveUp();
					}
			}
			if (zombie1.getPositionY() == heros.getPositionY()) {
				if ((zombie1.getPositionX() - heros.getPositionX()) <-1) {
					zombie1.moveRight();
					zombie1.moveRight();
				}
				if ((zombie1.getPositionX() - heros.getPositionX()) >1) {
					zombie1.moveLeft();
					zombie1.moveLeft();
				}
				if((zombie1.getPositionX() - heros.getPositionX()) ==- 1) {
					zombie1.moveRight();
					}
				if((zombie1.getPositionX() - heros.getPositionX()) == 1) {
					zombie1.moveLeft();
					}
			}
			if ((zombie1.getPositionX() - heros.getPositionX()) >= 1 && (zombie1.getPositionY() - heros.getPositionY()) >=1)   {
				zombie1.moveLeft();
				zombie1.moveUp();
			}
			if ((zombie1.getPositionX() - heros.getPositionX()) <=-1 && (zombie1.getPositionY() - heros.getPositionY()) <=-1) {
				zombie1.moveRight();
				zombie1.moveDown();
			}
			if ((zombie1.getPositionX() - heros.getPositionX()) <= -1 && (zombie1.getPositionY() - heros.getPositionY()) >=1) {
				zombie1.moveRight();
				zombie1.moveUp();
			}
			if ((zombie1.getPositionX() - heros.getPositionX()) >=1 && (zombie1.getPositionY() - heros.getPositionY()) <=-1) {
				zombie1.moveLeft();
				zombie1.moveDown();
			}
			
		}
		
	}
	
}





