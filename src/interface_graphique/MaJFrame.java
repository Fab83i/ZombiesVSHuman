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

public class MaJFrame extends JFrame {

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

	/**
	 * Create the frame.
	 */
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
		
		JButton btn_play = new JButton("Play");
		play.add(btn_play);
		
		JPanel stop = new JPanel();
		Menu.add(stop);
		
		JButton btn_stop = new JButton("Stop");
		stop.add(btn_stop);
		
		JPanel retour = new JPanel();
		Menu.add(retour);
		
		JButton btnRetour = new JButton("Retour");
		retour.add(btnRetour);
		
		JPanel Dessin = new JPanel();
		view.add(Dessin, BorderLayout.CENTER);
		
		JPanel damier = new JPanel();
		damier.setBorder(new LineBorder(new Color(0, 0, 0)));
		damier.setBackground(Color.WHITE);
		Dessin.add(damier);
		damier.setLayout(new GridLayout(30, 30, 0, 0));
	}

}
