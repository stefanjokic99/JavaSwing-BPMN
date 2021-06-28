package frame.popupmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

import frame.MainFrame;
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
	JMenuItem menuItemObrisi = null;
	JMenuItem menuItemZatvori = null;
	JMenuItem menuItemVerifikacijaSimulacije = null;
	
	MenuProjekatActionListener actionListener = null;
	
	@SuppressWarnings("deprecation")
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
		
		menuItemPreimenovanje = new JMenuItem("Preimenuj");
		menuItemPreimenovanje.setActionCommand("preimenovanje");
		menuItemPreimenovanje.addActionListener(actionListener);
		
		menuItemObrisi = new JMenuItem("Obriši");
		menuItemObrisi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		menuItemObrisi.setIcon(GeneralHelper.getMyIconFromName("delete"));
		menuItemObrisi.setActionCommand("obrisi");
		menuItemObrisi.addActionListener(actionListener);
		
		add(menuItemPreimenovanje);
		add(menuItemObrisi);
		addSeparator();
		
		menuItemZatvori = new JMenuItem("Zatvori");
		menuItemZatvori.setActionCommand("zatvori");
		menuItemZatvori.addActionListener(actionListener);
		
		add(menuItemZatvori);
		addSeparator();
		
		menuItemVerifikacijaSimulacije = new JMenuItem("Verifikuj");
		menuItemVerifikacijaSimulacije.setIcon(GeneralHelper.getIconFromName("accept"));
		menuItemVerifikacijaSimulacije.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		add(menuItemVerifikacijaSimulacije);
	}
	
}
