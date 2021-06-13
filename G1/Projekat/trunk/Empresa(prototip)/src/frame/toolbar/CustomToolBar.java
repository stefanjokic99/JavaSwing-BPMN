package frame.toolbar;

import javax.swing.JToolBar;

import frame.toolbar.toolbars.ProjekatToolBar;

public class CustomToolBar extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public CustomToolBar()
	{
		setFloatable(false);
		addSeparator();
		add(new ProjekatToolBar());
	}
	
}
