package frame.popupmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

import frame.MainFrame;
import helpers.GeneralHelper;
import listeners.menu.MenuUredjivanjeActionListener;

public class PopupMenuPovrsinaZaCrtanje extends JPopupMenu {

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
	JCheckBoxMenuItem cbMreza = null;
	JMenuItem menuItemObrisiOznaceneElemente = null;
	JMenuItem menuItemUrediElement = null;
	JMenuItem menuItemZatvori = null;
	
	MenuUredjivanjeActionListener actionListener = null;
	
	@SuppressWarnings("deprecation")
	public PopupMenuPovrsinaZaCrtanje() {
		
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
		
		cbMreza = new JCheckBoxMenuItem("Prikaz mreže za crtanje");
		cbMreza.setState(true);
		cbMreza.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cbMreza.setState(true);
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		add(cbMreza);
		addSeparator();
		
		menuItemObrisiOznaceneElemente = new JMenuItem("Obriši označene elemente     ");
		menuItemObrisiOznaceneElemente.setIcon(GeneralHelper.getMyIconFromName("eraser"));
		menuItemObrisiOznaceneElemente.setActionCommand("obrisi oznacene elemente");
		menuItemObrisiOznaceneElemente.addActionListener(actionListener);
		
		menuItemUrediElement = new JMenuItem("Uredi element");
		menuItemUrediElement.setIcon(GeneralHelper.getMyIconFromName("edit"));
		menuItemUrediElement.setActionCommand("uredi element");
		menuItemUrediElement.addActionListener(actionListener);

		add(menuItemObrisiOznaceneElemente);
		add(menuItemUrediElement);
		
		addSeparator();
		
		menuItemZatvori = new JMenuItem("Zatvori");
		menuItemZatvori.setActionCommand("zatvori");
		menuItemZatvori.addActionListener(actionListener);
		
		add(menuItemZatvori);
	}
}
