package frame.toolbar.toolbars;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

import helpers.GeneralHelper;
import listeners.menu.MenuProjekatActionListener;

public class ToolBarProjekat extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btnNovi = null;
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
		btnNovi.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e)
			{
				novi.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		add(btnNovi);
		
		btnSacuvaj = new JButton();
		btnSacuvaj.setToolTipText("Sacuvaj");
		btnSacuvaj.setIcon(GeneralHelper.getMyIconFromName("save"));
		btnSacuvaj.setActionCommand("sacuvaj");
		btnSacuvaj.addActionListener(actionListener);
		add(btnSacuvaj);
		
		btnSacuvajKao = new JButton();
		btnSacuvajKao.setIcon(GeneralHelper.getMyIconFromName("save_as"));
		btnSacuvajKao.setActionCommand("sacuvaj kao");
		btnSacuvajKao.addActionListener(actionListener);
		add(btnSacuvajKao);
	}

}
