package frame.radnapovrsina;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class RadnaPovrsina extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	PanelTab pnlTab1 = null;
	PanelTab pnlTab2 = null;
	JScrollPane sp1 = null;
	JScrollPane sp2 = null;
	
	public RadnaPovrsina() {
				
		pnlTab1 = new PanelTab("Dijagram 1");
		pnlTab2 = new PanelTab("Dijagram 2");
		
		sp1 = new JScrollPane(new PovrsinaZaCrtanje());
	    sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);  
        sp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
        sp2 = new JScrollPane(new PovrsinaZaCrtanje());
	    sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);  
        sp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
		addTab("", sp1);
		setTabComponentAt(0, pnlTab1);
		addTab("", sp2);
		setTabComponentAt(1, pnlTab2);
	}
}
