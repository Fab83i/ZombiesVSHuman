package interface_graphique;

import javax.swing.*;
import java.awt.*;


public class JPanelDessin extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelDessin() {
		
		super();
		

	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		// Couleur du fond = blanc
		this.setBackground(Color.white);

				// Affiche une ligne bleue en diagonale
		g.setColor(Color.blue);
		g.drawLine(0, 0, this.getWidth(), this.getHeight());

				// Affiche un cercle noir au centre
		g.setColor(Color.black);
		g.drawOval( this.getWidth() / 2, this.getHeight() / 2, 10, 10);

				// Affiche un rectangle vide rouge
		g.setColor(Color.red);
		g.drawRect(100, 100, 20, 20);

				// Affiche un rectangle plein vert
		g.setColor(Color.green);
		g.fillRect(200, 50, 20, 20);

	}
}
