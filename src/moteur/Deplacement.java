package moteur;

import java.util.Random;

import interface_graphique.MaJFrame;

public class Deplacement {

	int positionX;
	int positionY;
	int nbDeplacHum;
	private MaJFrame mjf;

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

	public void coumptDepHum(Humain heros) { // compte le nb de d�placement de l'humain par tour en modifiant la variable
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

//	public void moveZomb(Zombie zombie1, Humain heros) {
//		Random rd = new Random();
//		boolean k, m;
//		k = rd.nextBoolean();
//		m = rd.nextBoolean();
//		if (zombie1.isHumain(heros) == false) {
//			zombie1.moveRandom();
//		} 
//		
//		else {
//			if (mjf.getNbMove()>=2) {
//				heros.estBruyant=true;
//				
//				if (zombie1.getPositionX() == heros.getPositionX()) {
//					if (zombie1.getPositionY() > heros.getPositionY()) {
//						zombie1.moveUp();
//						zombie1.moveUp();
//					} else {
//						zombie1.moveDown();
//						zombie1.moveDown();
//					}
//				}
//				if (zombie1.getPositionY() == heros.getPositionY()) {
//					if (zombie1.getPositionX() > heros.getPositionX()) {
//						zombie1.moveLeft();
//						zombie1.moveLeft();
//					} else {
//						zombie1.moveRight();
//						zombie1.moveRight();
//					}
//				}
//				if (zombie1.getPositionX() != heros.getPositionX() && zombie1.getPositionY() != heros.getPositionY()) {
//					if (k == true) {
//						if (zombie1.getPositionX() > heros.getPositionX()) {
//							zombie1.moveLeft();
//						} else {
//							zombie1.moveRight();
//						}
//			}
//				
//			}
//		
//			if (zombie1.getPositionX() == heros.getPositionX()) {
//				if (zombie1.getPositionY() > heros.getPositionY()) {
//					zombie1.moveUp();
//					zombie1.moveUp();
//				} else {
//					zombie1.moveDown();
//					zombie1.moveDown();
//				}
//			}
//			if (zombie1.getPositionY() == heros.getPositionY()) {
//				if (zombie1.getPositionX() > heros.getPositionX()) {
//					zombie1.moveLeft();
//					zombie1.moveLeft();
//				} else {
//					zombie1.moveRight();
//					zombie1.moveRight();
//				}
//			}
//			if (zombie1.getPositionX() != heros.getPositionX() && zombie1.getPositionY() != heros.getPositionY()) {
//				if (k == true) {
//					if (zombie1.getPositionX() > heros.getPositionX()) {
//						zombie1.moveLeft();
//					} else {
//						zombie1.moveRight();
//					}
//
//				}
//				if (k == false) {
//					if (zombie1.getPositionY() > heros.getPositionY()) {
//						zombie1.moveDown();
//					} else {
//						zombie1.moveUp();
//					}
//				}
//				if (m == true) {
//					if (zombie1.getPositionX() > heros.getPositionX()) {
//						zombie1.moveLeft();
//					} else {
//						zombie1.moveRight();
//					}
//
//				}
//				if (m == false) {
//					if (zombie1.getPositionY() > heros.getPositionY()) {
//						zombie1.moveDown();
//					} else {
//						zombie1.moveUp();
//					}
//				}
//			}
//			heros.setTourHumain(true);
//		}
//			}
//	}
	
	
	public void moveZomb(Zombie zombie1, Humain heros, int nbMov) {
		
		System.out.println(zombie1.isHumain(heros, nbMov));
		
		
		
		if (zombie1.isHumain(heros,nbMov)==true) {
			
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
				
					if (zombie1.getPositionX() > heros.getPositionX()) {
						zombie1.moveLeft();
					} else {
						zombie1.moveRight();
					}
		}
			
		}
//		if(heros.getPositionX() - zombie1.getPositionX() <= 2) {
//			zombie1.moveRight();
//		}
//		if(heros.getPositionX() - zombie1.getPositionX() <= - 2) {
//			zombie1.moveLeft();
//		}
//		if(heros.getPositionY() - zombie1.getPositionY() <= 2) {
//			zombie1.moveDown();
//		}
//		if(heros.getPositionY() - zombie1.getPositionY() <= - 2) {
//			zombie1.moveUp();
//		}
		if (zombie1.isHumain(heros,nbMov) == false) {
			zombie1.moveRandom();
		}
		
	}
		
	
	
	
	
}





