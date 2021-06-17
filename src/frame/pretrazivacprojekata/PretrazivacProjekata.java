package frame.pretrazivacprojekata;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class PretrazivacProjekata extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PretrazivacProjekata() {
		
		JScrollPane scrollPane = new JScrollPane(new PanelProjekat());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        
		addTab("Projekat", scrollPane);
		addTab("Repozitorijum", new PanelRepozitorijum());
		setPreferredSize(new Dimension(200, 0));
		setTabPlacement(JTabbedPane.BOTTOM);
	}
}
