package interface_graphique;

import java.awt.BorderLayout;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.*;
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
				jeu.setMusic(true);                                // La musique ne s'arrete pas
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
			if(jeu.getMarche() == true) {
				jeu.moveRight();
				try {
					lectureDep();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				this.nbMove++;
				if(this.nbMove >= 3) {
					jeu.entree();
				}
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {

			if(jeu.getMarche() == true) {
				try {
					lectureDep();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				jeu.moveLeft();
				this.nbMove++;
				if(this.nbMove >= 3) {
					jeu.entree();
				}
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			if(jeu.getMarche() == true) {
				try {
					lectureDep();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				jeu.moveDown();
				this.nbMove++;
				if(this.nbMove >= 3) {
					jeu.entree();
				}
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			if(jeu.getMarche() == true) {
				try {
					lectureDep();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				jeu.moveUp();
				this.nbMove++;
				if(this.nbMove >= 3) {
					jeu.entree();
				}
			}
			
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			jeu.entree();
		}
		

	}
	
	
	public void LectureMidi() throws Exception {
        Sequencer player;
        player = MidiSystem.getSequencer();

        File monFichierMidi = new File("images/pacman_beginning.mid");
        Sequence maSequence = MidiSystem.getSequence(monFichierMidi);

        player.open();                           //ouverture du sequencer
        player.setSequence(maSequence);
      player.start();                            // lecture du morceau
      System.out.println("La musique est maintenant "+jeu.isMusic());

      if (jeu.isMusic() == true) {
    	  player.stop();
    	  
      }
      
}
	
	public void lectureDep() throws Exception {
        Sequencer player;
        player = MidiSystem.getSequencer();

        File monFichierMidi = new File("images/smb_saut.wav.mid");
        Sequence maSequence = MidiSystem.getSequence(monFichierMidi);

        player.open();                           //ouverture du sequencer
        player.setSequence(maSequence);
      player.start();                            // lecture du morceau
      System.out.println("La musique est maintenant "+jeu.isMusic());

      if (jeu.isMusic() == true) {
    	  player.stop();
    	  
      }
      
}
	
	public void lectureMort() throws Exception {
        Sequencer player;
        player = MidiSystem.getSequencer();

        File monFichierMidi = new File("images/pacman_death.mid");
        Sequence maSequence = MidiSystem.getSequence(monFichierMidi);

        player.open();                           //ouverture du sequencer
        player.setSequence(maSequence);
      player.start();                            // lecture du morceau

      if (jeu.isMusic() == true) {
    	  player.stop();
    	  
      }
      
}
	public void lectureVict() throws Exception {
        Sequencer player;
        player = MidiSystem.getSequencer();

        File monFichierMidi = new File("images/smb3_1-up.wav.mid");
        Sequence maSequence = MidiSystem.getSequence(monFichierMidi);

        player.open();                           //ouverture du sequencer
        player.setSequence(maSequence);
      player.start();                            // lecture du morceau

      if (jeu.isMusic() == true) {
    	  player.stop();
    	  
      }
      
}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
