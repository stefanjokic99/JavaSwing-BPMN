package frame.pretrazivacprojekata;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

import frame.popupmenu.PopupMenuPanelRepozitorijum;

public class PanelRepozitorijum extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	PopupMenuPanelRepozitorijum popup = null;
	
	public PanelRepozitorijum() {
		
		popup = new PopupMenuPanelRepozitorijum();
		
		add(new JLabel("Problemi sa internet konekcijom."));
		
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
			});
	}
}
