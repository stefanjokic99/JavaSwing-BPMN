package frame.menubar.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import helpers.GeneralHelper;
import listeners.menu.MenuUredjivanjeActionListener;

public class MenuUredjivanje extends JMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuItem menuItemPonistiPrethodniKorak = null;
	JMenuItem menuItemPovratiPonisteniKorak = null;
	JMenuItem menuItemIsjecanje = null;
	JMenuItem menuItemKopiranje = null;
	JMenuItem menuItemLijepljenje = null;
	JMenuItem menuItemOznaciSve = null;
	JMenuItem menuItemUbaciElement = null;
	JMenuItem menuItemObrisiOznaceneElemente = null;
	JMenuItem menuItemUrediElement = null;
	
	MenuUredjivanjeActionListener actionListener = null;
	
	@SuppressWarnings("deprecation")
	public MenuUredjivanje()
	{
		setText("Uređivanje");
		setMnemonic(KeyEvent.VK_E);
		
		actionListener = new MenuUredjivanjeActionListener();
		
		menuItemPonistiPrethodniKorak = new JMenuItem("Poništi prethodni korak");
		menuItemPonistiPrethodniKorak.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK));
		menuItemPonistiPrethodniKorak.setIcon(GeneralHelper.getIconFromName("arrow_undo"));
		menuItemPonistiPrethodniKorak.setActionCommand("ponisti prethodni korak");
		menuItemPonistiPrethodniKorak.addActionListener(actionListener);
		
		menuItemPovratiPonisteniKorak = new JMenuItem("Povrati poništeni korak");
		menuItemPovratiPonisteniKorak.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_MASK));
		menuItemPovratiPonisteniKorak.setIcon(GeneralHelper.getIconFromName("arrow_redo"));
		menuItemPovratiPonisteniKorak.setActionCommand("povrati ponisteni korak");
		menuItemPovratiPonisteniKorak.addActionListener(actionListener);
		
		add(menuItemPonistiPrethodniKorak);
		add(menuItemPovratiPonisteniKorak);
		
		addSeparator();
		
		menuItemIsjecanje = new JMenuItem("Isjeci");
		menuItemIsjecanje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
		menuItemIsjecanje.setIcon(GeneralHelper.getIconFromName("cut"));
		menuItemIsjecanje.setActionCommand("isjecanje");
		menuItemIsjecanje.addActionListener(actionListener);
		
		menuItemKopiranje = new JMenuItem("Kopiraj");
		menuItemKopiranje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
		menuItemKopiranje.setIcon(GeneralHelper.getIconFromName("clipboard_text"));
		menuItemKopiranje.setActionCommand("kopiranje");
		menuItemKopiranje.addActionListener(actionListener);
		
		menuItemLijepljenje = new JMenuItem("Zalijepi");
		menuItemLijepljenje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
		menuItemLijepljenje.setIcon(GeneralHelper.getIconFromName("clipboard_paste_image"));
		menuItemLijepljenje.setActionCommand("lijepljenje");
		menuItemLijepljenje.addActionListener(actionListener);
		
		menuItemOznaciSve = new JMenuItem("Označi sve");
		menuItemOznaciSve.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
		menuItemOznaciSve.setActionCommand("oznaci sve");
		menuItemOznaciSve.addActionListener(actionListener);
		
		add(menuItemIsjecanje);
		add(menuItemKopiranje);
		add(menuItemLijepljenje);
		add(menuItemOznaciSve);
		
		addSeparator();
		
		menuItemUbaciElement = new JMenuItem("Ubaci element");
		menuItemUbaciElement.setActionCommand("ubaci element");
		menuItemUbaciElement.addActionListener(actionListener);
		
		menuItemObrisiOznaceneElemente = new JMenuItem("Obriši označene elemente     ");
		menuItemObrisiOznaceneElemente.setIcon(GeneralHelper.getMyIconFromName("eraser"));
		menuItemObrisiOznaceneElemente.setActionCommand("obrisi oznacene elemente");
		menuItemObrisiOznaceneElemente.addActionListener(actionListener);
		
		menuItemUrediElement = new JMenuItem("Uredi element");
		menuItemUrediElement.setIcon(GeneralHelper.getMyIconFromName("edit"));
		menuItemUrediElement.setActionCommand("uredi element");
		menuItemUrediElement.addActionListener(actionListener);
		
		add(menuItemUbaciElement);
		add(menuItemObrisiOznaceneElemente);
		add(menuItemUrediElement);
	}

}
