package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import frame.pretrazivacprojekata.PretrazivacProjekata;
import frame.radnapovrsina.RadnaPovrsina;

/**
 * Glavni panel
 * @author Grupa1
 * @see MainFrame 
 */
public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	JTabbedPane tabPretrazivacProjekata = null;
	
	/**
	 * Konstruktor glavnog panela
	 */
	public MainPanel()
	{
		setBackground(Color.WHITE);
		
		setLayout(new BorderLayout(5,5));
		
		//Samo raspored - privremeni kod
		

		//Statusna linija
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		add(bluePanel,BorderLayout.SOUTH);
		
		//Pretrazivac projekata
		add(new PretrazivacProjekata(),BorderLayout.WEST);
		
		//Paleta alatki
		JPanel yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.YELLOW);
		yellowPanel.setPreferredSize(new Dimension(200,0));
		add(yellowPanel,BorderLayout.EAST);
		
		//Radna povrsina
		add(new RadnaPovrsina(), BorderLayout.CENTER);
	}
}
