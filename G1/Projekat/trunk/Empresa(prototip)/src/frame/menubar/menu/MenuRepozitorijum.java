package frame.menubar.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeners.menu.MenuRepozitorijumActionListener;

public class MenuRepozitorijum extends JMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuItem menuItemRegistracija = null;
	JMenuItem menuItemPrijava = null;
	JMenuItem menuItemOdjava = null;
	MenuRepozitorijumActionListener actionListener = null;
	
	public MenuRepozitorijum()
	{
		setText("Repozitorijum");
		
		actionListener = new MenuRepozitorijumActionListener();
		
		menuItemRegistracija = new JMenuItem("Registracija");
		menuItemRegistracija.setActionCommand("registracija");
		menuItemRegistracija.addActionListener(actionListener);
		
		menuItemPrijava = new JMenuItem("Prijava");
		menuItemPrijava.setActionCommand("prijava");
		menuItemPrijava.addActionListener(actionListener);
		
		menuItemOdjava = new JMenuItem("Odjava");
		menuItemOdjava.setActionCommand("odjava");
		menuItemOdjava.addActionListener(actionListener);
		
		add(menuItemRegistracija);
		add(menuItemPrijava);
		add(menuItemOdjava);
	}

}
