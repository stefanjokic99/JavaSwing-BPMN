package frame.radnapovrsina;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		
		addMouseListener(new MouseAdapter() {
			
			 public void mousePressed(MouseEvent e) {
			        maybeShowPopup(e);
			    }

			    public void mouseReleased(MouseEvent e) {
			        maybeShowPopup(e);
			    }

			    private void maybeShowPopup(MouseEvent e) {
			        if (e.isPopupTrigger()) {
			            popup.show(e.getComponent(),
			                       e.getX(), e.getY());
			        }
			    }
		}
		);
		
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
        g2d.drawImage(GeneralHelper.getTestDiagram("images/testDiagrams/Modelovanje procesa - kandidat i poslodavac.png"), 
        		5100, 5100, 700, 400, this);
       
         g2d.dispose();
	 }

}