package frame.menubar;

import javax.swing.JMenuBar;

import frame.menubar.menu.MenuProjekat;

public class CustomMenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomMenuBar() 
	{
			add(new MenuProjekat());
	}

}
