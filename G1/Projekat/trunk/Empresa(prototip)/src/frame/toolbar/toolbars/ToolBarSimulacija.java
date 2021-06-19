package frame.toolbar.toolbars;

import javax.swing.JButton;
import javax.swing.JToolBar;

import helpers.GeneralHelper;
import listeners.menu.MenuSimulacijaActionListener;

public class ToolBarSimulacija extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btnStart = null;
	JButton btnPause = null;
	JButton btnStop = null;
	
	MenuSimulacijaActionListener actionListener = null;
	
	public ToolBarSimulacija() {
		
		setFloatable(false);
		
		actionListener = new MenuSimulacijaActionListener();
		
		btnStart = new JButton();
		btnStart.setToolTipText("Započni simulaciju");
		btnStart.setIcon(GeneralHelper.getMyIconFromName("start"));
		btnStart.setActionCommand("pokretanje simulacije");
		btnStart.addActionListener(actionListener);
		add(btnStart);
		
		btnPause = new JButton();
		btnPause.setToolTipText("Zatvori simulaciju");
		btnPause.setIcon(GeneralHelper.getMyIconFromName("stop"));
		btnPause.setActionCommand("zatvaranje simulacije");
		btnPause.addActionListener(actionListener);
		add(btnPause);
		
		btnStop = new JButton();
		btnStop.setToolTipText("Zaustavi simulaciju");
		btnStop.setIcon(GeneralHelper.getMyIconFromName("pause"));
		btnStop.setActionCommand("zaustavljanje simulacije");
		btnStop.addActionListener(actionListener);
		add(btnStop);
	}
}
