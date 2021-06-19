package frame.paletaalatki.palete;

import java.awt.GridLayout;

import javax.swing.JPanel;

import frame.paletaalatki.Element;

public class Particije extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Element bazen = null;
	Element prolaz = null;
	
	public Particije() {
		
		setLayout(new GridLayout(0, 2));
		
		bazen = new Element("particije/bazen (pool)");
		bazen.setToolTipText("<html><i>bazen</i></html>");
		
		prolaz = new Element("particije/prolaz (lane)");
		prolaz.setToolTipText("<html><i>prolaz</i></html>");
		
		add(bazen);
		add(prolaz);
	}
}
