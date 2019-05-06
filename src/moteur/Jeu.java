package moteur;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

import interface_graphique.MaJFrame;
import interface_graphique.MenuInit;


public class Jeu {
	private int difficulte;
	private boolean marche;
	private ArrayList<Zombie> zombies;
	private Humain heros;
	private Case caseArrivee;
	private MaJFrame mjf;
	private boolean music;

	public boolean isMusic() {
		return music;
	}

	public void setMusic(boolean music) {
		this.music = music;
	}
	
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
						zombies.add(new Zombie(randomX, randomY, false));
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
						zombies.add(new Zombie(randomX, randomY, false));
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
						zombies.add(new Zombie(randomX, randomY, false));
						System.out.println("Zombie généré en : " + randomX + "," + randomY);
					}
				}
			}
		}
		if (selectedLevel == 3) {
			for (int i = 0; i < 20; i++) {
				boolean dejaPris = true;
				while (dejaPris == true) {
					int randomX = (int) Math.ceil(Math.random() * 20) - 1;
					int randomY = (int) Math.ceil(Math.random() * 17) - 1;
					dejaPris = false;
					Iterator<Zombie> itr = zombies.iterator();
					while (itr.hasNext()) {
						Zombie z = itr.next();
						if (randomX == z.getPositionX() && randomY == z.getPositionY() || randomX == heros.getPositionX() && randomY == heros.getPositionY() || randomX == caseArrivee.getPositionX() && randomY == caseArrivee.getPositionY()) {
							dejaPris = true;
						}
					}
					if (dejaPris == false)
						zombies.add(new Zombie(randomX, randomY, false));
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
	

// Il faut modifiert l'arret automatique du jeu. Ne s'arrete pas lorsque l'humain est mangé

	public void entree() {

		if(this.getMarche() == false) {
			MenuInit retour = new MenuInit();
			retour.setVisible(true);
			mjf.setVisible(false);
		}
		else {
			Iterator<Zombie> itr = zombies.iterator();
			while (itr.hasNext()) {
				Zombie z = itr.next();
				z.moveZomb(z, heros, mjf.getNbMove());
			}
			mjf.repaint();
			mjf.resetNbMove();
			
			this.finDuJeu();
		}
		
	}
	
	
	//A REVOIR 
	
	public void finDuJeu() {
		Iterator<Zombie> itr = zombies.iterator();
		while (itr.hasNext()) {
			Zombie z = itr.next();
			if (heros.getPositionX() == z.getPositionX() && heros.getPositionY() == z.getPositionY()) {
				this.marche = false;
				try {
					mjf.lectureMort();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if (heros.getPositionX() == caseArrivee.getPositionX() && heros.getPositionY() == caseArrivee.getPositionY()) {
				this.marche = false;
				try {
					mjf.lectureVict();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	




	}
	
	
	}
