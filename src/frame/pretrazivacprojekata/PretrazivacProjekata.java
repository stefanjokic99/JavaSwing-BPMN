package frame.pretrazivacprojekata;

import java.awt.Dimension;

import javax.swing.JTabbedPane;

public class PretrazivacProjekata extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PretrazivacProjekata()
	{
		addTab("Projekat", new PanelProjekat());
		addTab("Repozitorijum", new PanelRepozitorijum());
		setPreferredSize(new Dimension(200, 0));
		setTabPlacement(JTabbedPane.BOTTOM);
	}
}
