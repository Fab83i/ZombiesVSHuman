package moteur;
import java.util.ArrayList;
import java.util.Iterator;

import interface_graphique.MaJFrame;


public class Jeu {
	private int difficulte;
	private boolean marche;
	private ArrayList<Zombie> zombies;
	private Humain heros;
	private Case caseArrivee;
	private MaJFrame mjf;
	
	public Jeu(MaJFrame mjf, int selectedLevel) {
		this.difficulte = 0;
		this.marche = true;
		int ran = (int) Math.ceil(Math.random() * 20) - 1;
		caseArrivee = new Case(ran , 0);
		this.mjf=mjf;
		
		
		System.out.println(caseArrivee.getPositionX() + " " + caseArrivee.getPositionY());

		// Création de l'humain
		
		int random = (int) Math.ceil(Math.random() * 20) - 1;
		heros = new Humain(random, 19);
		
		
		difficulte = selectedLevel;
		zombies = new ArrayList<Zombie>();
		if (selectedLevel == 0) {
			for (int i = 0; i < 3; i++) {
				boolean dejaPris = true;
				while (dejaPris == true) {
					int randomX = (int) Math.ceil(Math.random() * 20) - 1;
					int randomY = (int) Math.ceil(Math.random() * 18) - 1;
					dejaPris = false;
					Iterator<Zombie> itr = zombies.iterator();
					while (itr.hasNext()) {
						Zombie z = itr.next();
						if (randomX == z.getPositionX() && randomY == z.getPositionY() || randomX == heros.getPositionX() && randomY == heros.getPositionY() || randomX == caseArrivee.getPositionX() && randomY == caseArrivee.getPositionY()) {
							dejaPris = true;
						}
					}
					if (dejaPris == false)
						zombies.add(new Zombie(randomX, randomY, false, false));
				}
			}
		}
		
		if (selectedLevel == 1) {
			for (int i = 0; i < 5; i++) {
				boolean dejaPris = true;
				while (dejaPris == true) {
					int randomX = (int) Math.ceil(Math.random() * 20) - 1;
					int randomY = (int) Math.ceil(Math.random() * 18) - 1;
					dejaPris = false;
					Iterator<Zombie> itr = zombies.iterator();
					while (itr.hasNext()) {
						Zombie z = itr.next();
						if (randomX == z.getPositionX() && randomY == z.getPositionY() || randomX == heros.getPositionX() && randomY == heros.getPositionY() || randomX == caseArrivee.getPositionX() && randomY == caseArrivee.getPositionY()) {
							dejaPris = true;
						}
					}
					if (dejaPris == false)
						zombies.add(new Zombie(randomX, randomY, false, false));
				}
			}
		}

		if (selectedLevel == 2) {
			for (int i = 0; i < 7; i++) {
				boolean dejaPris = true;
				while (dejaPris == true) {
					int randomX = (int) Math.ceil(Math.random() * 20) - 1;
					int randomY = (int) Math.ceil(Math.random() * 18) - 1;
					dejaPris = false;
					Iterator<Zombie> itr = zombies.iterator();
					while (itr.hasNext()) {
						Zombie z = itr.next();
						if (randomX == z.getPositionX() && randomY == z.getPositionY() || randomX == heros.getPositionX() && randomY == heros.getPositionY() || randomX == caseArrivee.getPositionX() && randomY == caseArrivee.getPositionY()) {
							dejaPris = true;
						}
					}
					if (dejaPris == false) {
						zombies.add(new Zombie(randomX, randomY, false, false));
						System.out.println("Zombie généré en : " + randomX + "," + randomY);
					}
				}
			}
		}
		if (selectedLevel == 3) {
			for (int i = 0; i < 100; i++) {
				boolean dejaPris = true;
				while (dejaPris == true) {
					int randomX = (int) Math.ceil(Math.random() * 20) - 1;
					int randomY = (int) Math.ceil(Math.random() * 18) - 1;
					dejaPris = false;
					Iterator<Zombie> itr = zombies.iterator();
					while (itr.hasNext()) {
						Zombie z = itr.next();
						if (randomX == z.getPositionX() && randomY == z.getPositionY() || randomX == heros.getPositionX() && randomY == heros.getPositionY() || randomX == caseArrivee.getPositionX() && randomY == caseArrivee.getPositionY()) {
							dejaPris = true;
						}
					}
					if (dejaPris == false)
						zombies.add(new Zombie(randomX, randomY, false, false));
				}
			}
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

	public ArrayList<Zombie> getZombies() {
		return zombies;
	}

	public Humain getHeros() {
		return heros;
	}

	public Case getCaseArrivee() {
		return caseArrivee;
	}




	public void moveLeft() {
		heros.moveLeft();
		/*
		Iterator<Zombie> itr = zombies.iterator();
		while (itr.hasNext()) {
			Zombie z = itr.next();
			z.moveZomb(z, heros);
		}
		*/
		mjf.repaint();
		System.out.println("L'humain se trouve en " + heros.getPositionX() + "," + heros.getPositionY());
	}
	
	public void moveRight() {
		heros.moveRight();
		
		mjf.repaint();
		System.out.println("L'humain se trouve en " + heros.getPositionX() + "," + heros.getPositionY());
	}
	
	public void moveUp() {
		heros.moveUp();
		
		mjf.repaint();
		System.out.println("L'humain se trouve en " + heros.getPositionX() + "," + heros.getPositionY());
	}
	
	public void moveDown() {
		heros.moveDown();
		
		mjf.repaint();
		System.out.println("L'humain se trouve en " + heros.getPositionX() + "," + heros.getPositionY());
	}
	
	public void faireUnTour () {
		int i;
		if (marche==true) {
			System.out.println("A vous de jouer");
			if (heros.getTourHumain()==true) {
				heros.coumptDepHum(heros);
	
			}
			if (heros.getPositionX()==caseArrivee.getPositionX() && heros.getPositionY()==caseArrivee.getPositionY()) {
				marche=false;
			}
			if (heros.getTourHumain()==false) {
				for (i=0;i<zombies.size();i++){
					zombies.get(i).moveZomb(zombies.get(i), heros, mjf.getNbMove());
					if (heros.getPositionX()==zombies.get(i).getPositionX() && heros.getPositionY()==zombies.get(i).getPositionY()) {
						marche=false;
					}
				}
			}
		}
	}
	
	
	


	public void entree() {
		
		Iterator<Zombie> itr = zombies.iterator();
		while (itr.hasNext()) {
			Zombie z = itr.next();
			z.moveZomb(z, heros, mjf.getNbMove());
		}
		mjf.repaint();
		mjf.resetNbMove();
	}
	
	
	//A REVOIR 
	public void finDuJeu() {
		Iterator<Zombie> itr = zombies.iterator();
		while (itr.hasNext()) {
			Zombie z = itr.next();
			if (heros.getPositionX() == z.getPositionX() && heros.getPositionY() == z.getPositionY()) {
				this.marche = false;
			}
		}
		if (heros.getPositionX() == caseArrivee.getPositionX() && heros.getPositionY() == caseArrivee.getPositionY()) {
				this.marche = false;
			}
	




	}}
