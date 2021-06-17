package frame.menubar.menu;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import helpers.GeneralHelper;
import listeners.menu.MenuPomocActionListener;

public class MenuPomoc extends JMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuItem menuItemOnlinePomoc = null;
	JMenuItem menuItemOAplikaciji = null;
	JMenuItem menuItemFAQ = null;
	
	MenuPomocActionListener actionListener = null;
	
	public MenuPomoc()
	{
		setText("Pomoć");
		
		actionListener = new MenuPomocActionListener();
		
		menuItemOnlinePomoc = new JMenuItem("Online pomoć");
		menuItemOnlinePomoc.setIcon(GeneralHelper.getIconFromName("help"));
		menuItemOnlinePomoc.setActionCommand("online pomoc");
		menuItemOnlinePomoc.addActionListener(actionListener);
		
		menuItemOAplikaciji = new JMenuItem("O Empresa editoru");
		menuItemOAplikaciji.setIcon(new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getImage("images/logo/logo_no_background.png").getScaledInstance(16, 16, Image.SCALE_SMOOTH)));
		menuItemOAplikaciji.setActionCommand("o aplikaciji");
		menuItemOAplikaciji.addActionListener(actionListener);
		
		menuItemFAQ = new JMenuItem("FAQ");
		menuItemFAQ.setIcon(GeneralHelper.getMyIconFromName("faq"));
		menuItemFAQ.setActionCommand("faq");
		menuItemFAQ.addActionListener(actionListener);
		
		add(menuItemOnlinePomoc);
		add(menuItemOAplikaciji);
		add(menuItemFAQ);
		
	}

}
