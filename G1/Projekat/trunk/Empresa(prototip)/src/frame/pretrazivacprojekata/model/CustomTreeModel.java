package frame.pretrazivacprojekata.model;

import javax.swing.tree.DefaultMutableTreeNode;

public class CustomTreeModel extends DefaultMutableTreeNode {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CustomTreeModel()
	{
		super("root");
		
		DefaultMutableTreeNode projekat1 = new DefaultMutableTreeNode("Projekat 1");
		
		DefaultMutableTreeNode dijagram1 = new DefaultMutableTreeNode("Dijagram 1.dgr");
		DefaultMutableTreeNode dijagram2 = new DefaultMutableTreeNode("Dijagram 2.dgr");
		
		projekat1.add(dijagram1);
		projekat1.add(dijagram2);
		
		add(projekat1);
		
		DefaultMutableTreeNode projekat2 = new DefaultMutableTreeNode("Projekat 2");
		
		DefaultMutableTreeNode dijagram21 = new DefaultMutableTreeNode("Dijagram 1.dgr");
		DefaultMutableTreeNode dijagram22 = new DefaultMutableTreeNode("Dijagram 2.dgr");
		
		projekat2.add(dijagram21);
		projekat2.add(dijagram22);
		
		add(projekat2);
	}

}
