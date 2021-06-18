package frame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import frame.menubar.CustomMenuBar;
import frame.statusbar.StatusBar;
import frame.toolbar.CustomToolBar;

/**
 * Glavni prozor
 * @author Grupa1
 */
public class MainFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
    protected TimerThread timerThread = null;
    public static Container contentPane = null;
    
    StatusBar statusBar = null;
    
	/**
	 * Konstruktor glavnog prozora
	 */
	public MainFrame()
	{
		Dimension screenSize = null;
		Dimension frameSize = null;
		Point location = null;
		
		JLabel leftLabel = null;
		
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
		
		//Dodavanje glavnog panela i menija
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(new CustomToolBar(), BorderLayout.NORTH);
		contentPane.add(new MainPanel(), BorderLayout.CENTER);
		setJMenuBar(new CustomMenuBar());
		
		//StatusBar
		 statusBar = new StatusBar();
	     leftLabel = new JLabel("<html><b style=\"color:gray\">Vaša aplikacija je uspješno pokrenuta</b></html>");
	     statusBar.setLeftComponent(leftLabel);
	     
	     final JLabel dateLabel = new JLabel();
	     dateLabel.setHorizontalAlignment(JLabel.CENTER);
	     statusBar.addRightComponent(dateLabel);

	     final JLabel timeLabel = new JLabel();
	     timeLabel.setHorizontalAlignment(JLabel.CENTER);
	     statusBar.addRightComponent(timeLabel);
	     
	     timerThread = new TimerThread(dateLabel, timeLabel);
	     timerThread.start();

	     contentPane.add(statusBar, BorderLayout.SOUTH);
	     setVisible(true);

	     try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e1) {	}
		leftLabel = new JLabel("<html><b style=\"color:gray\">Pristupanje repozitorijumu...</b></html>");
	    statusBar.setLeftComponent(leftLabel);
		setVisible(true);

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e1) {	}
			leftLabel = new JLabel("<html><b style=\"color:gray\">Prijavljeni korisnik: Grupa 1</b></html>");
		     statusBar.setLeftComponent(leftLabel);

		setVisible(true);
	      
	    addWindowListener(new WindowAdapter() {
	           @Override
	           public void windowClosing(WindowEvent e) {
	            
	        	   String odgovori[] = {"Da", "Ne", "Odustani"};
	        		int cuvanje = JOptionPane.showOptionDialog((Component) e.getSource(), "Da li želite da sačuvate unijete izmjene?", "Izlaz", 0, JOptionPane.WARNING_MESSAGE, null, odgovori, null);
	        		if (cuvanje == JOptionPane.YES_OPTION || cuvanje == JOptionPane.NO_OPTION)
	        		{
	        			if(cuvanje == JOptionPane.YES_OPTION)
	        			{
	        				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
	        			}
	        	        timerThread.setRunning(false);
	        			System.exit(0);
	        		}
	            }
	        });
		
	}

}
