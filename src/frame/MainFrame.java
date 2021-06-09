package frame;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JFrame;

import listeners.CustomWindowListener;

/**
 * Glavni prozor
 * @author Grupa1
 */
public class MainFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Konstruktor glavnog prozora
	 */
	public MainFrame()
	{
		Dimension screenSize = null;
		Dimension frameSize = null;
		Point location = null;
		
		//Postavljanje naslova i nacina iskljucivanja glavnog prozora
		setTitle("Empresa BPMN");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		//Podesavanje minimalne, pocetne i granicnih velicina
		screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		frameSize = new Dimension(800, 600);
		
		location = new Point((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		
		setBounds(location.x, location.y, frameSize.width, frameSize.height);
		setMinimumSize(frameSize);
		setExtendedState(MAXIMIZED_BOTH);
		
		//Postavljanje ikonice 
		setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("images/logo/logo_no_background.png").getScaledInstance(500, 500, Image.SCALE_SMOOTH));
		
		//Dodavanje glavnog panela
		getContentPane().add(new MainPanel());
		
		addWindowListener(new CustomWindowListener());
		
		//Podesavanje vidljivosti
		setVisible(true);
	}

}
