package interface_graphique;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class JPanelDessin extends JPanel {

	private BufferedImage image;
	private BufferedImage humain;
	private BufferedImage arrive ;



	/**
	 * Create the panel.
	 */
	

	
	public JPanelDessin() {
		
// Importation des images zombies et humains et arrive spoon aléatoire
		
		super();
		try {
			image = ImageIO.read(new File("images/burns.jpg"));
		       } 
		catch (IOException ex) {
			System.out.println(ex);
			image=null;
		       }
		
		try {
			humain = ImageIO.read(new File("images/homer.jpg"));
		       } 
		catch (IOException bu) {
			System.out.println(bu);
			humain=null;
		       }
		try {
			arrive = ImageIO.read(new File("images/617yFjlJXiL._SY355_.jpg"));
		       } 
		catch (IOException bu) {
			System.out.println(bu);
			arrive=null;
		       }

	}



	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		// Couleur du fond = blanc
		this.setBackground(Color.white);

// Création d'un quadrillage
		
		g.setColor(Color.blue);
		for ( int i=0 ; i < 20 ; i++) {
			g.drawLine(0,((this.getHeight())*i)/20,this.getWidth(),((this.getHeight())*i)/20);
		}
		for ( int i=0 ; i < 20 ; i++) {
			g.drawLine(((this.getWidth())*i)/20,0,((this.getWidth())*i)/20,this.getHeight());
		}
	
//Affichage d'un zombie
		
		if(image!=null) {
			g.drawImage(image, (this.getWidth()*1)/20, (this.getHeight()*1)/20 , this.getWidth()/20, this.getHeight()/20 , null);
			}
		
//Affichage d'un zombie
		
		if(image!=null) {
			g.drawImage(image, (this.getWidth()*10)/20, (this.getHeight()*18)/20 , this.getWidth()/20, this.getHeight()/20 , null);
			}

//Affichage d'un humain		
		
		if(humain!=null) {
			g.drawImage(humain, (this.getWidth()*6)/20, (this.getHeight()*18)/20 , this.getWidth()/20, this.getHeight()/20 , null);
			}
		
// Affichage aléatoire de la case d'arrivée
		if(arrive!=null) {
			g.drawImage(arrive, (this.getWidth()* )/20, (this.getHeight()* )/20 , this.getWidth()/20, this.getHeight()/20 , null);
			}
	}
	
}
