package frame.menubar.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import helpers.GeneralHelper;
import listeners.menu.MenuProjekatActionListener;

public class MenuProjekat extends JMenu {

	private static final long serialVersionUID = 1L;

	JMenu menuNovi = null;
	JMenu menuOtvori = null;
	JMenuItem menuItemNoviProjekat = null;
	JMenuItem menuItemNoviDijagram = null;
	JMenuItem menuItemOtvoriProjekat = null;
	JMenuItem menuItemOtvoriDijagram = null;
	JMenuItem menuItemSacuvaj = null;
	JMenuItem menuItemSacuvajKao = null;
	JMenuItem menuItemStampanje = null;
	JMenuItem menuItemPreimenovanje = null;
	JMenuItem menuItemZatvoriProjekat = null;
	JMenuItem menuItemIzlaz = null;
	
	MenuProjekatActionListener actionListener = null;
	
	public MenuProjekat() {
		
		setText("Projekat");
		setMnemonic(KeyEvent.VK_F);
		
		actionListener = new MenuProjekatActionListener();
		
		menuNovi = new JMenu("Novi");
		menuNovi.setMnemonic(KeyEvent.VK_N);
		
		menuItemNoviProjekat = new JMenuItem("Projekat");
		menuItemNoviProjekat.setIcon(GeneralHelper.getMyIconFromName("create_project"));
		menuItemNoviProjekat.setActionCommand("novi projekat");
		menuItemNoviProjekat.addActionListener(actionListener);
		
		menuItemNoviDijagram = new JMenuItem("Dijagram");
		menuItemNoviDijagram.setIcon(GeneralHelper.getMyIconFromName("create_diagram"));
		menuItemNoviDijagram.setActionCommand("novi dijagram");
		menuItemNoviDijagram.addActionListener(actionListener);
		
		menuNovi.add(menuItemNoviProjekat);
		menuNovi.add(menuItemNoviDijagram);
		add(menuNovi);
		
		menuOtvori = new JMenu("Otvori iz pretraživača datoteka");
		menuOtvori.setMnemonic(KeyEvent.VK_O);
		
		menuItemOtvoriProjekat = new JMenuItem("Projekat");
		menuItemOtvoriProjekat.setIcon(GeneralHelper.getMyIconFromName("create_project"));
		menuItemOtvoriProjekat.setActionCommand("otvori projekat");
		menuItemOtvoriProjekat.addActionListener(actionListener);
		
		menuItemOtvoriDijagram = new JMenuItem("Dijagram");
		menuItemOtvoriDijagram.setIcon(GeneralHelper.getMyIconFromName("create_diagram"));
		menuItemOtvoriDijagram.setActionCommand("otvori dijagram");
		menuItemOtvoriDijagram.addActionListener(actionListener);
		
		menuOtvori.add(menuItemOtvoriProjekat);
		menuOtvori.add(menuItemOtvoriDijagram);
		add(menuOtvori);
		
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
		
		menuItemStampanje = new JMenuItem("Štampanje");
		menuItemStampanje.setMnemonic(KeyEvent.VK_P);
		menuItemStampanje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));
		menuItemStampanje.setIcon(GeneralHelper.getIconFromName("printer"));
		menuItemStampanje.setActionCommand("stampanje");
		menuItemStampanje.addActionListener(actionListener);
		
		menuItemPreimenovanje = new JMenuItem("Preimenuj");
		menuItemPreimenovanje.setActionCommand("preimenovanje");
		menuItemPreimenovanje.addActionListener(actionListener);
		
		add(menuItemStampanje);
		add(menuItemPreimenovanje);
		
		addSeparator();
		
		menuItemZatvoriProjekat = new JMenuItem("Zatvori projekat");
		menuItemZatvoriProjekat.setActionCommand("zatvori projekat");
		menuItemZatvoriProjekat.addActionListener(actionListener);
		
		add(menuItemZatvoriProjekat);   
		
		addSeparator();

		
		menuItemIzlaz = new JMenuItem("Izlaz");
		menuItemIzlaz.setIcon(GeneralHelper.getMyIconFromName("exit"));
		menuItemIzlaz.setActionCommand("izlaz");
		menuItemIzlaz.addActionListener(actionListener);
		
		add(menuItemIzlaz);
	}
}
