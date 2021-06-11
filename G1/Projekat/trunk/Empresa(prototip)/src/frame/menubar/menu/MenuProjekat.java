package frame.menubar.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import helpers.GeneralHelper;

public class MenuProjekat extends JMenu {

	private static final long serialVersionUID = 1L;

	JMenuItem menuItemNoviProjekat = null;
	JMenuItem menuItemOtvoriProjekat = null;
	JMenuItem menuItemCuvanjeProjekta = null;
	
	public MenuProjekat() {
		setText("Projekat");
		setMnemonic(KeyEvent.VK_F);
		
		menuItemNoviProjekat = new JMenuItem("Novi projekat");
		menuItemNoviProjekat.setIcon(GeneralHelper.getIconFromName("application_add"));
		menuItemNoviProjekat.setMnemonic(KeyEvent.VK_N);
		menuItemNoviProjekat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		menuItemNoviProjekat.setActionCommand("novi projekat");
		menuItemNoviProjekat.addActionListener(actionListener);
		
		add(menuItemNoviProjekat);
		
		menuItemOtvoriProjekat = new JMenuItem("Otvori projekat");
		menuItemOtvoriProjekat.setIcon(GeneralHelper.getIconFromName("application_add"));
		menuItemOtvoriProjekat.setMnemonic(KeyEvent.VK_O);
		menuItemOtvoriProjekat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
		menuItemOtvoriProjekat.setActionCommand("otvori projekat");
		menuItemOtvoriProjekat.addActionListener(actionListener);
		
		add(menuItemOtvoriProjekat);
		
		addSeparator();
		
		menuItemCuvanjeProjekta = new JMenuItem("Čuvanje");
		menuItemCuvanjeProjekta.setIcon(GeneralHelper.getIconFromName("application_add"));
		menuItemCuvanjeProjekta.setMnemonic(KeyEvent.VK_S);
		menuItemCuvanjeProjekta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
		menuItemCuvanjeProjekta.addActionListener(actionListener);
		
		add(menuItemCuvanjeProjekta);
	}

}
