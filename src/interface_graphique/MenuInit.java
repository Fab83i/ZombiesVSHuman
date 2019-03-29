package interface_graphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class MenuInit extends JFrame {

	private JPanel contentPane;
	private ButtonGroup group;
	private JList list;
	private AbstractButton rdbtnHomme;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuInit frame = new MenuInit();
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
	public MenuInit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Menu = new JPanel();
		contentPane.add(Menu, BorderLayout.CENTER);
		Menu.setLayout(new BorderLayout(0, 0));
		
		JPanel choix_categories = new JPanel();
		Menu.add(choix_categories, BorderLayout.EAST);
		choix_categories.setLayout(new GridLayout(1, 3, 0, 0));
		
		
		// Afficher MaJFrame grace au button jouer
		
		JButton Jouer = new JButton("Jouer");
		Jouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedLevel = list.getSelectedIndex();
				int sexe = -1;
				if (rdbtnHomme.isSelected()) sexe =0;
				else sexe = 1;
				
				
				MaJFrame mJF = new MaJFrame(selectedLevel, sexe);
				mJF.setVisible(true);
				MenuInit.this.setVisible(false);
			}
		});
		
		
		choix_categories.add(Jouer);
		
		JPanel parametres = new JPanel();
		Menu.add(parametres, BorderLayout.CENTER);
		parametres.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel difficulte = new JPanel();
		parametres.add(difficulte);
		difficulte.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Chosis ta difficulté : ");
		difficulte.add(lblNewLabel);
		
	 list = new JList();
		difficulte.add(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndices(new int[] {3});
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Facile", "Moyen", "Difficile"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(3);
		
		JPanel sexe = new JPanel();
		parametres.add(sexe);
		sexe.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblChoisisTonSexe = new JLabel("Choisis ton sexe :");
		sexe.add(lblChoisisTonSexe);
		
		
	 rdbtnHomme = new JRadioButton("Homme");
		rdbtnHomme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		sexe.add(rdbtnHomme);
		

		
		 JRadioButton rdbtnFemme = new JRadioButton("Femme");
		sexe.add(rdbtnFemme);
		
	 group = new ButtonGroup();
		group.add(rdbtnHomme);
		group.add(rdbtnFemme);
	}
	
	
}