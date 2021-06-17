package frame.pretrazivacprojekata.model;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.TreeCellRenderer;

import helpers.GeneralHelper;

public class CustomTreeNodeRenderer implements TreeCellRenderer {

	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded,
			boolean leaf, int row, boolean hasFocus) {

		JLabel lbl = null;
		
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
			lbl.setBackground(Color.BLUE);
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
