package frame.popupmenu;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import listeners.menu.MenuProjekatActionListener;

public class PopupMenuPanelProjekat extends JPopupMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuItem menuItemZatvoriSveProjekte = null;
	
	MenuProjekatActionListener actionListener = null;

	public PopupMenuPanelProjekat() {
		
		actionListener = new MenuProjekatActionListener();

		menuItemZatvoriSveProjekte = new JMenuItem("<html><b>Zatvori sve projekte</b></html>");
		menuItemZatvoriSveProjekte.setActionCommand("zatvori sve projekte");
		menuItemZatvoriSveProjekte.addActionListener(actionListener);
		
		add(menuItemZatvoriSveProjekte);
	}

}
