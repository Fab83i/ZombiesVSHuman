package interface_graphique;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard {
	
	 public void keyPressed(KeyEvent e)
     {  
          
         switch (e.getKeyCode())
         {
             case KeyEvent.VK_RIGHT:
                 System.out.println("ça marche");
                 break;
             case KeyEvent.VK_LEFT:
                 // action fleche gauche
                 break;
             case KeyEvent.VK_UP:
                 // action fleche haut
                 break;
             case KeyEvent.VK_DOWN:
                 // action fleche bas
                 break;
         }
     }

}
