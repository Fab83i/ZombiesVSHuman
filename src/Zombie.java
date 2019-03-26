import java.io.RandomAccessFile;
import java.util.Random;

public class Zombie extends Entite{
	Position zposition;
	boolean voirHumain;
	boolean tourZomb;
	


public Zombie(Position zposition, boolean voirHumain, boolean tourZomb) {
		super();
		this.zposition = zposition;
		this.voirHumain = voirHumain;
		this.tourZomb = tourZomb;
	}

public Zombie() {
	super();
}

public Position getZposition() {
		return zposition;
	}


	public void setZposition(Position zposition) {
		this.zposition = zposition;
	}


	public boolean isVoirHumain() {
		return voirHumain;
	}


	public void setVoirHumain(boolean voirHumain) {
		this.voirHumain = voirHumain;
	}


	public boolean isTourZomb() {
		return tourZomb;
	}


	public void setTourZomb(boolean tourZomb) {
		this.tourZomb = tourZomb;
	}

	
public boolean isHumain(Humain heros , Jeu game){ //detecte la presence de l'humain
	int i,j;
	boolean result;
	result = false;
	for (i=-2;i<3;i++) {
		for (j=-2;j<3;j++) {
			if (heros.hPosition.getCoordonneex()==zposition.getCoordonneex() + i && heros.hPosition.getCoordonneey()==zposition.getCoordonneey() + j && game.getNbTours()!=0){
				result = true;
			}
			
		}
	}
	return result;
}
	
	

	
public void manger(Humain heros, Jeu game){
	if (heros.hPosition.getCoordonneex()==zposition.getCoordonneex() && heros.hPosition.getCoordonneey()==zposition.getCoordonneey()) {
		game.setMarche(false);
		
	}
}
		
//public Position deplacement(Humain heros, Jeu game) {
//	int dx,dy;
//	boolean ybool;
//	ybool=true;
//	Random rd = new Random();
//	if (isHumain(heros, game)==false) {
//		if (zposition.getCoordonneex()==20 && zposition.getCoordonneey()!=20 && zposition.getCoordonneey()!=0) {
//			zposition.setCoordonneex(zposition.getCoordonneex()-1);
//		}
//		if (zposition.getCoordonneex()==0 && zposition.getCoordonneey()!=20 && zposition.getCoordonneey()!=0) {
//			zposition.setCoordonneex(zposition.getCoordonneex()+1);
//		}
//		if (zposition.getCoordonneey()==20 && zposition.getCoordonneex()!=20 && zposition.getCoordonneex()!=0) {
//			zposition.setCoordonneey(zposition.getCoordonneey()-1);
//		}
//		if (zposition.getCoordonneey()==0 && zposition.getCoordonneex()!=20 && zposition.getCoordonneex()!=0) {
//			zposition.setCoordonneey(zposition.getCoordonneey()+1);
//		}
//		if (zposition.getCoordonneex()==20 && (zposition.getCoordonneey()==0 || zposition.getCoordonneey()==20)) {
//			zposition.setCoordonneex(zposition.getCoordonneex()-1);
//		}
//		if (zposition.getCoordonneex()==0 && (zposition.getCoordonneey()==0 || zposition.getCoordonneey()==20)) {
//			zposition.setCoordonneex(zposition.getCoordonneex()+1);
//		}
//		dx =rd.nextInt(2)-1;
//		if (dx==0) {
//			ybool= rd.nextBoolean();
//		}
//		if (dx==1 || dx==-1) {
//				dy=0;	
//			}
//		if (ybool==false) {
//			dy=-1;
//		}
//		if (ybool==true) {
//			dy=1;
//		}
//	}		
//}		
		//rd.nextB
		 //dx= (int)(Math.random()*(max-min))+min;
		
	}

	

	


	

	
