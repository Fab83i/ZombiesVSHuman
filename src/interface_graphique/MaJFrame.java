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



public class MaJFrame extends JFrame implements KeyListener {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaJFrame frame = new MaJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

// Construction de la JFrame 
	
	public MaJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel view = new JPanel();
		contentPane.add(view, BorderLayout.CENTER);
		view.setLayout(new BorderLayout(0, 0));
		
		JPanel Menu = new JPanel();
		view.add(Menu, BorderLayout.EAST);
		Menu.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel play = new JPanel();
		Menu.add(play);
		play.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btn_play = new JButton("Jouer");
		play.add(btn_play);
		
		JPanel stop = new JPanel();
		Menu.add(stop);
		
		JButton btn_stop = new JButton("Pause");
		btn_stop.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			}
		});
		stop.add(btn_stop);
		
		JPanel retour = new JPanel();
		Menu.add(retour);
		
		JButton btnRetour = new JButton("Retour");
		retour.add(btnRetour);
		
		JPanelDessin Dessin = new JPanelDessin();
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
		 int direction;
		 if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
			 direction = 1 ;
	        	
	        }
		 if (e.getKeyCode()== KeyEvent.VK_LEFT) {
			 direction = 2 ;
	        	
	        }
		 if(e.getKeyCode()== KeyEvent.VK_DOWN) {
			 direction = 3 ;
	        }
		 if(e.getKeyCode()== KeyEvent.VK_UP) {
			 direction = 4 ;
	        }  
	        
	            
	    }

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	

		

}
