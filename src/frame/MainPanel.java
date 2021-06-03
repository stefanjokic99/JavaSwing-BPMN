package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * Glavni panel
 * @author Grupa1
 * @see MainFrame 
 */
public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Konstruktor glavnog panela
	 */
	public MainPanel()
	{
		setBackground(Color.WHITE);
		
		setLayout(new BorderLayout(5,5));
		
		//Samo raspored - privremeni kod
		
		//Meni
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setPreferredSize(new Dimension(0,50));
		add(redPanel,BorderLayout.NORTH);
		
		//Statusna linija
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		add(bluePanel,BorderLayout.SOUTH);
		
		//Pretrazivac projekata
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setPreferredSize(new Dimension(200,0));
		add(greenPanel,BorderLayout.WEST);
		
		//Paleta alatki
		JPanel yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.YELLOW);
		yellowPanel.setPreferredSize(new Dimension(200,0));
		add(yellowPanel,BorderLayout.EAST);
		
		//Radna povrsina
		JPanel maliPanel = new JPanel();
		maliPanel.setLocation(250,250);
		maliPanel.setSize(200,200);
		maliPanel.setBackground(Color.MAGENTA);
		add(maliPanel, BorderLayout.CENTER);
	}
}
