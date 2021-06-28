package frame.menubar.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import helpers.GeneralHelper;
import listeners.menu.MenuSimulacijaActionListener;

public class MenuSimulacija extends JMenu{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JMenuItem menuItemPokretanjeSimulacije = null;
	JMenuItem menuItemZatvaranjeSimulacije = null;
	JMenuItem menuItemZaustavljanjeSimulacije = null;
	JMenuItem menuItemVerifikacijaSimulacije = null;
	
	MenuSimulacijaActionListener actionListener = null;
	
	public MenuSimulacija() {
		
		setText("Simulacija");
		
		actionListener = new MenuSimulacijaActionListener();
		
		menuItemPokretanjeSimulacije = new JMenuItem("Pokreni");
		menuItemPokretanjeSimulacije.setIcon(GeneralHelper.getMyIconFromName("start"));
		menuItemPokretanjeSimulacije.setActionCommand("pokretanje simulacije");
		menuItemPokretanjeSimulacije.addActionListener(actionListener);
		
		menuItemZatvaranjeSimulacije = new JMenuItem("Zatvori");
		menuItemZatvaranjeSimulacije.setIcon(GeneralHelper.getMyIconFromName("stop"));
		menuItemZatvaranjeSimulacije.setActionCommand("zatvaranje simulacije");
		menuItemZatvaranjeSimulacije.addActionListener(actionListener);
		
		menuItemZaustavljanjeSimulacije = new JMenuItem("Zaustavi");
		menuItemZaustavljanjeSimulacije.setIcon(GeneralHelper.getMyIconFromName("pause"));
		menuItemZaustavljanjeSimulacije.setActionCommand("zaustavljanje simulacije");
		menuItemZaustavljanjeSimulacije.addActionListener(actionListener);

		add(menuItemPokretanjeSimulacije);
		add(menuItemZatvaranjeSimulacije);
		add(menuItemZaustavljanjeSimulacije);
		
		addSeparator();
		
		menuItemVerifikacijaSimulacije = new JMenuItem("Verifikuj");
		menuItemVerifikacijaSimulacije.setIcon(GeneralHelper.getIconFromName("accept"));
		menuItemVerifikacijaSimulacije.setActionCommand("verifikacija simulacije");
		menuItemVerifikacijaSimulacije.addActionListener(actionListener);
		
		add(menuItemVerifikacijaSimulacije);
	}
}
