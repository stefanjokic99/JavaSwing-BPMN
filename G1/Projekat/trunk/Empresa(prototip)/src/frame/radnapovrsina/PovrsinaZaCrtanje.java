package frame.radnapovrsina;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import frame.popupmenu.PopupMenuPovrsinaZaCrtanje;

public class PovrsinaZaCrtanje extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	PopupMenuPovrsinaZaCrtanje popup = null;
	
	public PovrsinaZaCrtanje()
	{
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
}