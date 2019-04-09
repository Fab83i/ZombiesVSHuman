package interface_graphique;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import moteur.Case;
import moteur.Humain;
import moteur.Zombie;

public class JPanelDessin extends JPanel {

	private BufferedImage image;
	private BufferedImage homer;
	private BufferedImage arrive;
	private BufferedImage marge;
	private BufferedImage victoire;
	private BufferedImage defaite;
	private int difficulte;
	private int sexeP;
	private ArrayList<Zombie> zombies;
	private Humain humain;
	private Case caseArrivee;

	/**
	 * Create the panel.
	 * 
	 * @param selectedLevel
	 * @param sexe
	 * @param zombies
	 */

	public JPanelDessin(int sexe, int selectedLevel, ArrayList<Zombie> zombies, Humain humain,
			Case caseArriveeP) {

		super();

		this.sexeP = sexe;
		this.difficulte = selectedLevel;
		this.zombies = zombies;
		this.humain = humain;
		this.caseArrivee = caseArriveeP;

// Importation des images zombies et humains et arrive spoon aléatoire

		try {
			image = ImageIO.read(new File("images/burns.jpg"));
		} catch (IOException ex) {
			System.out.println(ex);
			image = null;
		}
		
		try {
			defaite = ImageIO.read(new File("images/homertriste.jpg"));
		} catch (IOException ex) {
			System.out.println(ex);
			defaite = null;
		}

		try {
			homer = ImageIO.read(new File("images/homer.jpg"));
		} catch (IOException bu) {
			System.out.println(bu);
			homer = null;
		}
		try {
			arrive = ImageIO.read(new File("images/617yFjlJXiL._SY355_.jpg"));
		} catch (IOException bu) {
			System.out.println(bu);
			arrive = null;
		}

		try {
			marge = ImageIO.read(new File("images/hqdefault.jpg"));
		} catch (IOException ex) {
			System.out.println(ex);
			marge = null;
		}
		
		try {
			victoire = ImageIO.read(new File("images/Homer-Simpson.jpg"));
		} catch (IOException ex) {
			System.out.println(ex);
			victoire = null;
		}
	}

	public LinkedList<Integer> coordonneeZombie() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int x = (int) Math.ceil(Math.random() * 20);
		int y = (int) Math.ceil(Math.random() * 20);
		while (x <= 5 + 4 || x >= 5 - 4 || y <= 5 + 4 || y >= 5 - 4) {
			x = (int) Math.ceil(Math.random() * 20);
			y = (int) Math.ceil(Math.random() * 20);
		}
		list.add(x);
		list.add(y);
		return list;
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// Couleur du fond = blanc
		this.setBackground(Color.white);

		// Création d'un quadrillage

		g.setColor(Color.blue);
		for (int i = 0; i < 20; i++) {
			g.drawLine(0, ((this.getHeight()) * i) / 20, this.getWidth(), ((this.getHeight()) * i) / 20);
		}
		for (int i = 0; i < 20; i++) {
			g.drawLine(((this.getWidth()) * i) / 20, 0, ((this.getWidth()) * i) / 20, this.getHeight());
		}

		
		//On parcourt l'ArrayList des zombies pour tous les placer sur le terrain de jeu en fonction de leurs coordonnées.
		Iterator<Zombie> itr = zombies.iterator();
		while (itr.hasNext()) {
			Zombie z = itr.next();
			g.drawImage(image, (this.getWidth() * z.getPositionX()) / 20, (this.getHeight() * z.getPositionY()) / 20, this.getWidth() / 20,
					this.getHeight() / 20, null);
		}

//Affichage d'un humain		
		
		if (homer != null && sexeP == 0) {
			g.drawImage(homer, (this.getWidth() * humain.getPositionX()) / 20, (this.getHeight() * humain.getPositionY()) / 20, this.getWidth() / 20,
					this.getHeight() / 20, null);
		}
		if (marge != null && sexeP == 1) {
			g.drawImage(marge, (this.getWidth() * humain.getPositionX()) / 20, (this.getHeight() * humain.getPositionY()) / 20, this.getWidth() / 20,
					this.getHeight() / 20, null);

		}

/// Affichage aléatoire de la case d'arrivée
		
		if (arrive != null) {
			System.out.println("arrive "  + caseArrivee.getPositionX() + caseArrivee.getPositionY());
			g.drawImage(arrive, (this.getWidth() * this.caseArrivee.getPositionX()) / 20, (this.getHeight() * this.caseArrivee.getPositionY()) / 20, this.getWidth() / 20,
					this.getHeight() / 20, null);
			
		} 
		
// Fin du jeu si l'humain arrive sur la case finale
		
		if ( this.caseArrivee.getPositionX() == this.humain.getPositionX() && this.caseArrivee.getPositionY() == this.humain.getPositionY() ) {
			if (victoire != null) {
				g.drawImage(victoire, 0 , 0 ,this.getWidth(), this.getHeight(), null);	
			}
			
		}
		
// Fin du jeu si l'humain rencontre un zombie	
		
		int a;
		for ( a= 0 ; a < zombies.size(); a++) {
			if (this.zombies.get(a).getPositionX() == this.humain.getPositionX() && this.zombies.get(a).getPositionY() == this.humain.getPositionY()) {
				if (defaite != null) {
					g.drawImage(defaite, 0 , 0 ,this.getWidth(), this.getHeight(), null);	
				}
			}
			
		}
	}


}

		

		
		
	
	


