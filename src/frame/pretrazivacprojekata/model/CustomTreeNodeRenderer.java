package frame.pretrazivacprojekata.model;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.TreeCellRenderer;

import frame.popupmenu.PopupMenuProjekat;
import helpers.GeneralHelper;

public class CustomTreeNodeRenderer implements TreeCellRenderer {

	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded,
			boolean leaf, int row, boolean hasFocus) {

		JLabel lbl = null;
		PopupMenuProjekat popup = new PopupMenuProjekat();
		
		lbl = new JLabel(value.toString());
		lbl.setOpaque(true);
		
		if(leaf)
		{
			lbl.setIcon(GeneralHelper.getMyIconFromName("create_diagram"));
		}
		else
		{
			lbl.setIcon(GeneralHelper.getIconFromName("package"));
		}
		
		if(selected)
		{
			lbl.setBackground(new Color(238, 238, 238));
			
				tree.addMouseListener(new MouseAdapter() {
					
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
		else
		{
			lbl.setBackground(Color.WHITE);
		}
		
		lbl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		tree.setRowHeight(20);
		
		return lbl;
	}

}
