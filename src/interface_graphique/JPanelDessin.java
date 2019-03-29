package interface_graphique;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class JPanelDessin extends JPanel {

	private BufferedImage image;
	private BufferedImage homer;
	private BufferedImage arrive ;
	private BufferedImage marge;
	private int difficulte;
	private int sexeP;

	
	



	/**
	 * Create the panel.
	 * @param selectedLevel 
	 * @param sexe 
	 */
	

	
	
	public JPanelDessin(int sexe, int selectedLevel) {
		
		super();
		
		this.sexeP = sexe ;
		this.difficulte = selectedLevel;
		
// Importation des images zombies et humains et arrive spoon aléatoire
		
		
		try {
			image = ImageIO.read(new File("images/burns.jpg"));
		       } 
		catch (IOException ex) {
			System.out.println(ex);
			image=null;
		       }
		
		try {
			homer = ImageIO.read(new File("images/homer.jpg"));
		       } 
		catch (IOException bu) {
			System.out.println(bu);
			homer=null;
		       }
		try {
			arrive = ImageIO.read(new File("images/617yFjlJXiL._SY355_.jpg"));
		       } 
		catch (IOException bu) {
			System.out.println(bu);
			arrive=null;
		       }

		try {
			marge = ImageIO.read(new File("images/hqdefault.jpg"));
		       } 
		catch (IOException ex) {
			System.out.println(ex);
			marge=null;
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
		
		if(homer!=null  && sexeP == 0) {
			g.drawImage(homer, (this.getWidth()*9)/20, (this.getHeight()*18)/20 , this.getWidth()/20, this.getHeight()/20 , null);
			}
		if (marge!=null && sexeP == 1 ) {
			g.drawImage(marge, (this.getWidth()*9)/20, (this.getHeight()*18)/20 , this.getWidth()/20, this.getHeight()/20 , null);			
			
		}
		
// Affichage aléatoire de la case d'arrivée
		if(arrive!=null) {
			g.drawImage(arrive, (this.getWidth()* 1)/20, (this.getHeight()* 1)/20 , this.getWidth()/20, this.getHeight()/20 , null);
			} // Rajouter les coordonnées nécessaires
	}
	
}
