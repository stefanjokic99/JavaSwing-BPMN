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
		btnStart.setIcon(GeneralHelper.getIconFromName("control_start"));
		btnStart.setActionCommand("pokretanje simulacije");
		btnStart.addActionListener(actionListener);
		add(btnStart);
		
		btnPause = new JButton();
		btnPause.setToolTipText("Pauziraj simulaciju");
		btnPause.setIcon(GeneralHelper.getIconFromName("control_pause"));
		btnPause.setActionCommand("zaustavljanje simulacije");
		btnPause.addActionListener(actionListener);
		add(btnPause);
		
		btnStop = new JButton();
		btnStop.setToolTipText("Zatvarnje simulacije");
		btnStop.setIcon(GeneralHelper.getIconFromName("control_stop"));
		btnStop.setActionCommand("zatvaranje simulacije");
		btnStop.addActionListener(actionListener);
		add(btnStop);
	}
}
