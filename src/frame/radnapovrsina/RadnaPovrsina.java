package frame.radnapovrsina;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import frame.MainFrame;
import helpers.GeneralHelper;

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
	    sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        sp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
        sp2 = new JScrollPane(new PovrsinaZaCrtanje());
	    sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        sp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
        
		addTab("", sp1);
		setTabComponentAt(0, pnlTab1);
		addTab("", sp2);
		setTabComponentAt(1, pnlTab2);
	}
}
