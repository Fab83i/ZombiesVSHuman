package moteur;

import java.util.Random;

public class Deplacement {

	int positionX;
	int positionY;
	int nbDeplacHum;

	public Deplacement(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public int getNbDeplacHum() {
		return nbDeplacHum;
	}

	public void setNbDeplacHum(int nbDeplacHum) {
		this.nbDeplacHum = nbDeplacHum;
	}

	public int getPositionX() {
		return this.positionX;
	}

	public int getPositionY() {
		return this.positionY;
	}
	
//	public int getDistanceBetween(Deplacement e1, Deplacement e2) {
//		int a = (e2.getPositionX() - e1.getPositionX()) * (e2.getPositionX() - e1.getPositionX());
//		int b = (e2.getPositionY() - e1.getPositionY()) * (e2.getPositionY() - e1.getPositionY());
//		int aplusb = a + b;
//		return (int) Math.ceil(Math.sqrt(aplusb));
//	}

	public boolean moveLeft() {
		if (this.positionX >= 1) {
			this.positionX = this.positionX - 1;
			setNbDeplacHum(getNbDeplacHum()+1);
			return true;
		} else {
			return false;
		}
	}

	public boolean moveRight() {
		if (this.positionX < 19) {
			this.positionX = this.positionX + 1;
			setNbDeplacHum(getNbDeplacHum()+1);
			return true;
		} else {
			return false;
		}
	}

	public boolean moveUp() {
		if (this.positionY >= 1) {
			this.positionY = this.positionY - 1;
			setNbDeplacHum(getNbDeplacHum()+1);
			return true;
		} else {
			return false;
		}
	}

	public boolean moveDown() {
		if (this.positionY < 19) {
			this.positionY = this.positionY + 1;
			setNbDeplacHum(getNbDeplacHum()+1);
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

	/*public void coumptDepHum(Humain heros) { // compte le nb de d�placement de l'humain par tour en modifiant la variable
										// nbDeplacHum
		int k;
		k = 0;
		if(k<3) {
			if (heros.moveRight() == true) {
			k = k + 1;
			}
			if (heros.moveDown() == true) {
			k = k + 1;
			}
			if (heros.moveLeft() == true) {
			k = k + 1;
			}
			if (heros.moveUp() == true) {
			k = k + 1;
			}
		}
		setNbDeplacHum(k);
		heros.setTourHumain(false);
	}
*/
	public void moveZomb(Zombie zombie1, Humain heros) {
		Random rd = new Random();
		boolean k, m;
		k = rd.nextBoolean();
		m = rd.nextBoolean();
		if (zombie1.isHumain(heros) == false) {
			zombie1.moveRandom();
		} else {
			if (zombie1.getPositionX() == heros.getPositionX()) {
				if (zombie1.getPositionY() > heros.getPositionY()) {
					zombie1.moveUp();
					zombie1.moveUp();
				} else {
					zombie1.moveDown();
					zombie1.moveDown();
				}
			}
			if (zombie1.getPositionY() == heros.getPositionY()) {
				if (zombie1.getPositionX() > heros.getPositionX()) {
					zombie1.moveLeft();
					zombie1.moveLeft();
				} else {
					zombie1.moveRight();
					zombie1.moveRight();
				}
			}
			if (zombie1.getPositionX() != heros.getPositionX() && zombie1.getPositionY() != heros.getPositionY()) {
				if (k == true) {
					if (zombie1.getPositionX() > heros.getPositionX()) {
						zombie1.moveLeft();
					} else {
						zombie1.moveRight();
					}

				}
				if (k == false) {
					if (zombie1.getPositionY() > heros.getPositionY()) {
						zombie1.moveDown();
					} else {
						zombie1.moveUp();
					}
				}
				if (m == true) {
					if (zombie1.getPositionX() > heros.getPositionX()) {
						zombie1.moveLeft();
					} else {
						zombie1.moveRight();
					}

				}
				if (m == false) {
					if (zombie1.getPositionY() > heros.getPositionY()) {
						zombie1.moveDown();
					} else {
						zombie1.moveUp();
					}
				}
			}
			heros.setTourHumain(true);
		}
	}
	
	
	
	
	
	
}





