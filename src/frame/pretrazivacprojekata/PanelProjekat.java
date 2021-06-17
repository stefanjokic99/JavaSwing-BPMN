package frame.pretrazivacprojekata;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JTree;

import frame.popupmenu.PopupMenuPanelProjekat;
import frame.pretrazivacprojekata.model.CustomTreeModel;
import frame.pretrazivacprojekata.model.CustomTreeNodeRenderer;

public class PanelProjekat extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTree stabloProjekata = null;
	
	PopupMenuPanelProjekat popup = null;
	
	public PanelProjekat() {
		
		popup = new PopupMenuPanelProjekat();
		
		setBackground(Color.WHITE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		stabloProjekata = new JTree(new CustomTreeModel());
		stabloProjekata.setRootVisible(false);
		stabloProjekata.setShowsRootHandles(true);
		stabloProjekata.setCellRenderer(new CustomTreeNodeRenderer());
		add(stabloProjekata);
		
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
