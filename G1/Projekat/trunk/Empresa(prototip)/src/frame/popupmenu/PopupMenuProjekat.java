package frame.popupmenu;

import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

import helpers.GeneralHelper;
import listeners.menu.MenuProjekatActionListener;

public class PopupMenuProjekat extends JPopupMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuItem menuItemNoviDijagram = null;
	JMenuItem menuItemSacuvaj = null;
	JMenuItem menuItemSacuvajKao = null;
	JMenuItem menuItemPreimenovanje = null;
	JMenuItem menuItemZatvoriProjekat = null;
	
	MenuProjekatActionListener actionListener = null;
	
	public PopupMenuProjekat() {
		
		actionListener = new MenuProjekatActionListener();

		menuItemNoviDijagram = new JMenuItem("Kreiraj dijagram");
		menuItemNoviDijagram.setIcon(GeneralHelper.getMyIconFromName("create_diagram"));
		menuItemNoviDijagram.setActionCommand("novi dijagram");
		menuItemNoviDijagram.addActionListener(actionListener);
		
		add(menuItemNoviDijagram);
		addSeparator();
		
		menuItemSacuvaj = new JMenuItem("Sačuvaj");
		menuItemSacuvaj.setMnemonic(KeyEvent.VK_S);
		menuItemSacuvaj.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
		menuItemSacuvaj.setIcon(GeneralHelper.getMyIconFromName("save"));
		menuItemSacuvaj.setActionCommand("sacuvaj");
		menuItemSacuvaj.addActionListener(actionListener);
		
		menuItemSacuvajKao = new JMenuItem("Sačuvaj kao");
		menuItemSacuvajKao.setActionCommand("sacuvaj kao");
		menuItemSacuvajKao.setIcon(GeneralHelper.getMyIconFromName("save_as"));
		menuItemSacuvajKao.addActionListener(actionListener);
		
		add(menuItemSacuvaj);
		add(menuItemSacuvajKao);
		addSeparator();
		
		menuItemPreimenovanje = new JMenuItem("Preimenovanje");
		menuItemPreimenovanje.setActionCommand("preimenovanje");
		menuItemPreimenovanje.addActionListener(actionListener);
		
		add(menuItemPreimenovanje);
		addSeparator();
		
		menuItemZatvoriProjekat = new JMenuItem("Zatvori projekat");
		menuItemZatvoriProjekat.setActionCommand("zatvori projekat");
		menuItemZatvoriProjekat.addActionListener(actionListener);
		
		add(menuItemZatvoriProjekat);
	}

}
