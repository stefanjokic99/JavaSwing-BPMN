package frame.menubar.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import helpers.GeneralHelper;
import listeners.menu.MenuRepozitorijumActionListener;

public class MenuRepozitorijum extends JMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuItem menuItemEksportovanje = null;
	JMenuItem menuItemImportovanje= null;
	JMenuItem menuItemRegistracija = null;
	JMenuItem menuItemPrijava = null;
	JMenuItem menuItemOdjava = null;
	
	MenuRepozitorijumActionListener actionListener = null;
	
	public MenuRepozitorijum() {
		
		setText("Repozitorijum");
		
		actionListener = new MenuRepozitorijumActionListener();
		
		menuItemEksportovanje = new JMenuItem("Eksportovanje");
		menuItemEksportovanje.setIcon(GeneralHelper.getMyIconFromName("export"));
		menuItemEksportovanje.setActionCommand("eksportovanje");
		menuItemEksportovanje.addActionListener(actionListener);
		
		menuItemImportovanje = new JMenuItem("Importovanje");
		menuItemImportovanje.setIcon(GeneralHelper.getMyIconFromName("import"));
		menuItemImportovanje.setActionCommand("importovanje");
		menuItemImportovanje.addActionListener(actionListener);
		
		add(menuItemEksportovanje);
		add(menuItemImportovanje);
		
		addSeparator();
		
		menuItemRegistracija = new JMenuItem("Registracija");
		menuItemRegistracija.setIcon(GeneralHelper.getMyIconFromName("registration"));
		menuItemRegistracija.setActionCommand("registracija");
		menuItemRegistracija.addActionListener(actionListener);
		
		menuItemPrijava = new JMenuItem("Prijava");
		menuItemPrijava.setIcon(GeneralHelper.getMyIconFromName("login"));
		menuItemPrijava.setActionCommand("prijava");
		menuItemPrijava.addActionListener(actionListener);
		
		menuItemOdjava = new JMenuItem("Odjava");
		menuItemOdjava.setIcon(GeneralHelper.getMyIconFromName("log_out"));
		menuItemOdjava.setActionCommand("odjava");
		menuItemOdjava.addActionListener(actionListener);
		
		add(menuItemRegistracija);
		add(menuItemPrijava);
		add(menuItemOdjava);
	}

}
