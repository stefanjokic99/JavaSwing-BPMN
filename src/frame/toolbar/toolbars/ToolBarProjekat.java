package frame.toolbar.toolbars;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

import frame.MainFrame;
import helpers.GeneralHelper;
import listeners.menu.MenuProjekatActionListener;

public class ToolBarProjekat extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btnNovi = null;
	JButton btnNoviPadajuci = null;
	JPopupMenu novi = null;
	JMenuItem menuItemNoviProjekat = null;
	JMenuItem menuItemNoviDijagram = null;
	JButton btnSacuvaj = null;
	JButton btnSacuvajKao = null;
	
	MenuProjekatActionListener actionListener = null;
	
	public ToolBarProjekat()
	{	
		setFloatable(false);
		
		actionListener = new MenuProjekatActionListener();

		novi = new JPopupMenu();
		
		menuItemNoviProjekat = new JMenuItem("Projekat");
		menuItemNoviProjekat.setIcon(GeneralHelper.getMyIconFromName("create_project"));
		menuItemNoviProjekat.setActionCommand("novi projekat");
		menuItemNoviProjekat.addActionListener(actionListener);
		
		menuItemNoviDijagram = new JMenuItem("Dijagram");
		menuItemNoviDijagram.setIcon(GeneralHelper.getMyIconFromName("create_diagram"));
		menuItemNoviDijagram.setActionCommand("novi dijagram");
		menuItemNoviDijagram.addActionListener(actionListener);
		
		novi.add(menuItemNoviProjekat);
		novi.add(menuItemNoviDijagram);
		
		btnNovi = new JButton();
		btnNovi.setToolTipText("Kreiranje");
		btnNovi.setIcon(GeneralHelper.getMyIconFromName("create_project"));
		btnNovi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);				
			}
		});

		
		btnNoviPadajuci = new JButton();
		btnNoviPadajuci.setToolTipText("Kreiranje");
		btnNoviPadajuci.setIcon(GeneralHelper.getMyIconFromName("create_arrow"));
		btnNoviPadajuci.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e)
			{
				novi.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
		add(btnNovi);
		add(btnNoviPadajuci);
		
		btnSacuvaj = new JButton();
		btnSacuvaj.setToolTipText("Sačuvaj");
		btnSacuvaj.setIcon(GeneralHelper.getMyIconFromName("save"));
		btnSacuvaj.setActionCommand("sacuvaj");
		btnSacuvaj.addActionListener(actionListener);
		add(btnSacuvaj);
		
		btnSacuvajKao = new JButton();
		btnSacuvajKao.setToolTipText("Sačuvaj kao");
		btnSacuvajKao.setIcon(GeneralHelper.getMyIconFromName("save_as"));
		btnSacuvajKao.setActionCommand("sacuvaj kao");
		btnSacuvajKao.addActionListener(actionListener);
		add(btnSacuvajKao);
	}

}
