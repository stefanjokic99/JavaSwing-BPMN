package frame.radnapovrsina;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import frame.popupmenu.PopupMenuPovrsinaZaCrtanje;
import helpers.GeneralHelper;

public class PovrsinaZaCrtanje extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	PopupMenuPovrsinaZaCrtanje popup = null;
		
	public PovrsinaZaCrtanje() {
		
		setPreferredSize(new Dimension(10000, 10000));
		popup = new PopupMenuPovrsinaZaCrtanje();
		
		setBackground(Color.WHITE);
		setComponentPopupMenu(popup);
	}

	public void paint(Graphics g )	{  
		
		super.paintComponent(g);
		 
         Graphics2D g2d = (Graphics2D) g.create();
         
         for(int i = -10; i < getWidth(); i+=100)
         {
        	 for(int j = -10; j < getHeight(); j+=100)
        	 {
        		 g.drawRect(i, j, 1, 1);
        	 }
         }
         
         //Iscrtavanje testnog Dijagrama
	       g2d.drawImage(GeneralHelper.getTestDiagram("images/testDiagrams/BPMN dijagram - prikaz.png"), 
	        		5010, 5010, 800, 500, this);
	            
	       g2d.dispose();
	 }
	
}