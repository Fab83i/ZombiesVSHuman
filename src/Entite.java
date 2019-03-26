
public class Entite {
	
	// Classe "abstraite" qui contient les méthodes nécessaires à zombie et humain. Notamment les méthodes
	// se deplacer et se deplacer random pour le zombie et la case d'arrivée. 
	// Pour modifier la position, implementer directement dans les classes humains et zombies. 
	
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

}
