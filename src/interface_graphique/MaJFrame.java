package interface_graphique;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import moteur.Humain;
import moteur.Zombie;
import moteur.Case;

public class MaJFrame extends JFrame implements KeyListener {
	private JPanel contentPane;
	private int sexe;
	private int selectedLevel;
	private ArrayList<Zombie> zombies;
	private Humain humain;
	private JPanelDessin dessin;
	public Case caseArrivee;

	public int getSexe() {
		return sexe;
	}

	public int getSelectedLevel() {
		return selectedLevel;
	}

	public MaJFrame(int selLevelP, int sexeP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		this.sexe = sexeP;
		this.selectedLevel = selLevelP;

		// System.out.println("sel " + selectedLevel + " sexe " + sexe );

		JPanel view = new JPanel();
		contentPane.add(view, BorderLayout.CENTER);
		view.setLayout(new BorderLayout(0, 0));

		JPanel Menu = new JPanel();
		view.add(Menu, BorderLayout.EAST);
		Menu.setLayout(new GridLayout(3, 1, 0, 0));

		JPanel play = new JPanel();
		Menu.add(play);
		play.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel stop = new JPanel();
		Menu.add(stop);

		JPanel retour = new JPanel();
		Menu.add(retour);

		JButton btnRetour = new JButton("Menu");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInit retour = new MenuInit();
				retour.setVisible(true);
				MaJFrame.this.setVisible(false);

			}
		});
		retour.add(btnRetour);

		// création case arrivee
		
		int ran = (int) Math.ceil(Math.random() * 20) - 1;
		this.caseArrivee = new Case(ran , 0);
		
		System.out.println(caseArrivee.getPositionX() + " " + caseArrivee.getPositionY());

		// Création de l'humain
		
		int random = (int) Math.ceil(Math.random() * 20) - 1;
		this.humain = new Humain(random, 19);

		// Création des zombies
		
		zombies = new ArrayList<Zombie>();
		if (this.selectedLevel == 0) {
			for (int i = 0; i < 3; i++) {
				boolean dejaPris = true;
				while (dejaPris == true) {
					int randomX = (int) Math.ceil(Math.random() * 20) - 1;
					int randomY = (int) Math.ceil(Math.random() * 20) - 1;
					dejaPris = false;
					Iterator<Zombie> itr = zombies.iterator();
					while (itr.hasNext()) {
						Zombie z = itr.next();
						if (randomX == z.getPositionX() && randomY == z.getPositionY() || randomX == humain.getPositionX() && randomY == humain.getPositionY() || randomX == caseArrivee.getPositionX() && randomY == caseArrivee.getPositionY()) {
							dejaPris = true;
						}
					}
					if (dejaPris == false)
						zombies.add(new Zombie(randomX, randomY, false, false));
				}
			}
		}

		if (this.selectedLevel == 1) {
			for (int i = 0; i < 5; i++) {
				boolean dejaPris = true;
				while (dejaPris == true) {
					int randomX = (int) Math.ceil(Math.random() * 20) - 1;
					int randomY = (int) Math.ceil(Math.random() * 20) - 1;
					dejaPris = false;
					Iterator<Zombie> itr = zombies.iterator();
					while (itr.hasNext()) {
						Zombie z = itr.next();
						if (randomX == z.getPositionX() && randomY == z.getPositionY() || randomX == humain.getPositionX() && randomY == humain.getPositionY() || randomX == caseArrivee.getPositionX() && randomY == caseArrivee.getPositionY()) {
							dejaPris = true;
						}
					}
					if (dejaPris == false)
						zombies.add(new Zombie(randomX, randomY, false, false));
				}
			}
		}

		if (this.selectedLevel == 2) {
			for (int i = 0; i < 7; i++) {
				boolean dejaPris = true;
				while (dejaPris == true) {
					int randomX = (int) Math.ceil(Math.random() * 20) - 1;
					int randomY = (int) Math.ceil(Math.random() * 20) - 1;
					dejaPris = false;
					Iterator<Zombie> itr = zombies.iterator();
					while (itr.hasNext()) {
						Zombie z = itr.next();
						if (randomX == z.getPositionX() && randomY == z.getPositionY() || randomX == humain.getPositionX() && randomY == humain.getPositionY() || randomX == caseArrivee.getPositionX() && randomY == caseArrivee.getPositionY()) {
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
		if (this.selectedLevel == 3) {
			for (int i = 0; i < 20; i++) {
				boolean dejaPris = true;
				while (dejaPris == true) {
					int randomX = (int) Math.ceil(Math.random() * 20) - 1;
					int randomY = (int) Math.ceil(Math.random() * 18) - 1;
					dejaPris = false;
					Iterator<Zombie> itr = zombies.iterator();
					while (itr.hasNext()) {
						Zombie z = itr.next();
						if (randomX == z.getPositionX() && randomY == z.getPositionY() || randomX == humain.getPositionX() && randomY == humain.getPositionY() || randomX == caseArrivee.getPositionX() && randomY == caseArrivee.getPositionY()) {
							dejaPris = true;
						}
					}
					if (dejaPris == false)
						zombies.add(new Zombie(randomX, randomY, false, false));
				}
			}
		}


		dessin = new JPanelDessin(sexe, selectedLevel, zombies, humain, caseArrivee);
		view.add(dessin, BorderLayout.CENTER);

		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);


	
	 
	
	
		
	}

// Commande clavier

	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			humain.moveRight();
			dessin.repaint();
			Iterator<Zombie> itr = zombies.iterator();
			while (itr.hasNext()) {
				Zombie z = itr.next();
				z.moveZomb(z, humain);
			}
			dessin.repaint();
			System.out.println("L'humain se trouve en " + humain.getPositionX() + "," + humain.getPositionY());
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			humain.moveLeft();
			dessin.repaint();
			Iterator<Zombie> itr = zombies.iterator();
			while (itr.hasNext()) {
				Zombie z = itr.next();
				z.moveZomb(z, humain);
			}
			dessin.repaint();
			System.out.println("L'humain se trouve en " + humain.getPositionX() + "," + humain.getPositionY());
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			humain.moveDown();
			dessin.repaint();
			Iterator<Zombie> itr = zombies.iterator();
			while (itr.hasNext()) {
				Zombie z = itr.next();
				z.moveZomb(z, humain);
			}
			dessin.repaint();
			System.out.println("L'humain se trouve en " + humain.getPositionX() + "," + humain.getPositionY());
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			humain.moveUp();
			dessin.repaint();
			Iterator<Zombie> itr = zombies.iterator();
			while (itr.hasNext()) {
				Zombie z = itr.next();
				z.moveZomb(z, humain);
			}
			dessin.repaint();
			System.out.println("L'humain se trouve en " + humain.getPositionX() + "," + humain.getPositionY());
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
