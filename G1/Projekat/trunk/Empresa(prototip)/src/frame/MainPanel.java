package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import frame.paletaalatki.PaletaAlatki;
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
		
		setLayout(new BorderLayout());
		
		//Pretrazivac projekata
		JPanel pretrazivacProjekata = new JPanel();
		pretrazivacProjekata.setLayout(new BorderLayout());
		pretrazivacProjekata.add(new PretrazivacProjekata());
		add(pretrazivacProjekata,BorderLayout.WEST);
		
		//Paleta alatki
		JScrollPane paleta = new JScrollPane(new PaletaAlatki());
		paleta.setPreferredSize(new Dimension(200,0));
		paleta.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		paleta.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(paleta,BorderLayout.EAST);
		
		//Radna povrsina
		JPanel centar = new JPanel();
		centar.setLayout(new BorderLayout());
		centar.add(new RadnaPovrsina(), BorderLayout.CENTER);
		add(centar, BorderLayout.CENTER);
	}
}
