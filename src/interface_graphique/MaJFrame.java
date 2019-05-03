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
import moteur.Jeu;
import moteur.Zombie;
import moteur.Case;
import moteur.Deplacement;

public class MaJFrame extends JFrame implements KeyListener {
	private JPanel contentPane;
	private int sexe;
	private int selectedLevel;
	private JPanelDessin dessin;
	private Jeu jeu;
	private Integer nbMove = 0;

	public int getSexe() {
		return sexe;
	}

	public int getSelectedLevel() {
		return selectedLevel;
	}
	
	public int getNbMove() {
		return nbMove;
	}
	
	public void resetNbMove() {
		this.nbMove = 0;
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

		
	
		jeu = new Jeu(this,selectedLevel);
		


		dessin = new JPanelDessin(sexe, jeu);
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
			jeu.moveRight();
			this.nbMove++;
			if(this.nbMove >= 3) {
				jeu.entree();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			jeu.moveLeft();
			this.nbMove++;
			if(this.nbMove >= 3) {
				jeu.entree();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			jeu.moveDown();
			this.nbMove++;
			if(this.nbMove >= 3) {
				jeu.entree();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			

			//Variable si la partie est terminée à remplacer dans false
			if(false) {
				
			}
			
			jeu.moveUp();
			this.nbMove++;
			if(this.nbMove >= 3) {
				jeu.entree();
			}
			
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			jeu.entree();
			

			//Variable si la partie est terminée à remplacer dans false A REVOIR
			if(jeu.getMarche() == false) {
				MenuInit retour = new MenuInit();
				retour.setVisible(true);
				MaJFrame.this.setVisible(false);
			}
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
