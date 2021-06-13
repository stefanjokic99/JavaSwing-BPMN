package frame.menubar.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

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
	JMenuItem menuItemOznaci = null;
	JMenuItem menuItemOznaciSve = null;
	JMenuItem menuItemUbaciElement = null;
	JMenuItem menuItemObrisiOznaceneElemente = null;
	JMenuItem menuItemUrediElement = null;
	MenuUredjivanjeActionListener actionListener = null;
	
	public MenuUredjivanje()
	{
		setText("Uređivanje");
		
		actionListener = new MenuUredjivanjeActionListener();
		
		menuItemPonistiPrethodniKorak = new JMenuItem("Poništi prethodni korak");
		menuItemPonistiPrethodniKorak.setIcon(GeneralHelper.getIconFromName("arrow_undo"));
		menuItemPonistiPrethodniKorak.setActionCommand("ponisti prethodni korak");
		menuItemPonistiPrethodniKorak.addActionListener(actionListener);
		
		menuItemPovratiPonisteniKorak = new JMenuItem("Povrati poništeni korak");
		menuItemPovratiPonisteniKorak.setIcon(GeneralHelper.getIconFromName("arrow_redo"));
		menuItemPovratiPonisteniKorak.setActionCommand("povrati ponisteni korak");
		menuItemPovratiPonisteniKorak.addActionListener(actionListener);
		
		add(menuItemPonistiPrethodniKorak);
		add(menuItemPovratiPonisteniKorak);
		
		addSeparator();
		
		menuItemIsjecanje = new JMenuItem("Isjeci");
		menuItemIsjecanje.setIcon(GeneralHelper.getIconFromName("cut"));
		menuItemIsjecanje.setActionCommand("isjecanje");
		menuItemIsjecanje.addActionListener(actionListener);
		
		menuItemKopiranje = new JMenuItem("Kopiraj");
		menuItemKopiranje.setIcon(GeneralHelper.getIconFromName("clipboard_text"));
		menuItemKopiranje.setActionCommand("kopiranje");
		menuItemKopiranje.addActionListener(actionListener);
		
		menuItemLijepljenje = new JMenuItem("Zalijepi");
		menuItemLijepljenje.setIcon(GeneralHelper.getIconFromName("clipboard_paste_image"));
		menuItemLijepljenje.setActionCommand("lijepljenje");
		menuItemLijepljenje.addActionListener(actionListener);
		
		menuItemOznaci = new JMenuItem("Označi");
		menuItemOznaci.setActionCommand("oznacavanje");
		menuItemOznaci.addActionListener(actionListener);
		
		menuItemOznaciSve = new JMenuItem("Označi sve");
		menuItemOznaciSve.setActionCommand("oznaci sve");
		menuItemOznaciSve.addActionListener(actionListener);
		
		add(menuItemIsjecanje);
		add(menuItemKopiranje);
		add(menuItemLijepljenje);
		add(menuItemOznaci);
		add(menuItemOznaciSve);
		
		addSeparator();
		
		menuItemUbaciElement = new JMenuItem("Ubaci element");
		menuItemUbaciElement.setActionCommand("ubaci element");
		menuItemUbaciElement.addActionListener(actionListener);
		
		menuItemObrisiOznaceneElemente = new JMenuItem("Obriši označene elemente");
		menuItemObrisiOznaceneElemente.setActionCommand("obrisi oznacene elemente");
		menuItemObrisiOznaceneElemente.addActionListener(actionListener);
		
		menuItemUrediElement = new JMenuItem("Uredi element");
		menuItemUrediElement.setActionCommand("uredi element");
		menuItemUrediElement.addActionListener(actionListener);
		
		add(menuItemUbaciElement);
		add(menuItemObrisiOznaceneElemente);
		add(menuItemUrediElement);
	}

}
