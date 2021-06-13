package frame.toolbar;

import javax.swing.JToolBar;

import frame.toolbar.toolbars.ToolBarProjekat;
import frame.toolbar.toolbars.ToolBarSimulacija;
import frame.toolbar.toolbars.ToolBarUredjivanjeDijagrama;
import frame.toolbar.toolbars.ToolBarUredjivanjeSvojstvaElementa;

public class CustomToolBar extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public CustomToolBar()
	{
		addSeparator();
		add(new ToolBarProjekat());
		addSeparator();
		add(new ToolBarSimulacija());
		addSeparator();
		add(new ToolBarUredjivanjeDijagrama());
		addSeparator();
		add(new ToolBarUredjivanjeSvojstvaElementa());
	}
	
}
