package interface_graphique;

import java.awt.BorderLayout;




import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class MaJFrame extends JFrame  implements KeyListener {
	private JPanel contentPane;
	private int sexe;
	private int selectedLevel;

	
	
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
		
		System.out.println("sel " + selectedLevel + " sexe " +sexe );
		
		
		
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
		
		JPanelDessin Dessin = new JPanelDessin(sexe , selectedLevel);
		view.add(Dessin, BorderLayout.CENTER);
		

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    
       
		
	}
	

    
	
	
	
	
	
// Commande clavier
	
	
	
	 
	@Override
	public void keyPressed(KeyEvent e) {
	        System.out.println("keyPressed");
	    }
		
	 @Override
	public void keyReleased(KeyEvent e) {
		 
		 if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
			  //moveRight();
	        	
	        }
		 if (e.getKeyCode()== KeyEvent.VK_LEFT) {
			 // Appel à la méthode déplacementGauche ;
	        	
	        }
		 if(e.getKeyCode()== KeyEvent.VK_DOWN) {
			 // Appel à la méthode déplacementBas ;
	        }
		 if(e.getKeyCode()== KeyEvent.VK_UP) {
			 // Appel à la méthode déplacementHaut ;
	        }  
	        
	            
	    }

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	

		

}
