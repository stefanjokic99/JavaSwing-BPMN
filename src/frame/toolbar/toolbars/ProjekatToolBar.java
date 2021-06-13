package frame.toolbar.toolbars;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.Popup;

import helpers.GeneralHelper;
import listeners.menu.MenuProjekatActionListener;

public class ProjekatToolBar extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btnNovi = null;
	JPopupMenu novi = null;
	JMenuItem menuItemNoviProjekat = null;
	JMenuItem menuItemNoviDijagram = null;
	MenuProjekatActionListener actionListener = null;
	
	public ProjekatToolBar()
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
		btnNovi.setIcon(GeneralHelper.getMyIconFromName("create_project"));
		btnNovi.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e)
			{
				novi.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		add(btnNovi);
	}

}
