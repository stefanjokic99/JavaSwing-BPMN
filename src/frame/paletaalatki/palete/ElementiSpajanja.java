package frame.paletaalatki.palete;

import java.awt.GridLayout;

import javax.swing.JPanel;

import frame.paletaalatki.Element;

public class ElementiSpajanja extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Element asocijacija = null;
	Element sekvencijalniTok = null;
	Element tok = null;
	Element tokPoruke = null;
	Element uslovniTok = null;
	
	public ElementiSpajanja() {
		
		setLayout(new GridLayout(0, 2));
		
		asocijacija = new Element("elementi spajanja/asocijacija (association)");
		asocijacija.setToolTipText("<html><i>asocijacija</i></html>");
		
		sekvencijalniTok = new Element("elementi spajanja/sekvencijalni tok (sequence flow)");
		sekvencijalniTok.setToolTipText("<html><i>sekvencijalni tok</i></html>");
		
		tok = new Element("elementi spajanja/tok (default flow)");
		tok.setToolTipText("<html><i>tok</i></html>");
		
		tokPoruke = new Element("elementi spajanja/tok poruke (message flow)");
		tokPoruke.setToolTipText("<html><i>tok poruke</i></html>");
		
		uslovniTok = new Element("elementi spajanja/uslovni tok (condition flow)");
		uslovniTok.setToolTipText("<html><i>uslovni tok</i></html>");
		
		add(asocijacija);
		add(sekvencijalniTok);
		add(tok);
		add(tokPoruke);
		add(uslovniTok);
	}

}
