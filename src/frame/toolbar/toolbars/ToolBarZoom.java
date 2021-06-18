package frame.toolbar.toolbars;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

import frame.MainFrame;
import helpers.GeneralHelper;

public class ToolBarZoom extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btnZoomIn = null;
	JButton btnZoomOut = null;
	
	public ToolBarZoom() {

		setFloatable(false);
		
		btnZoomIn = new JButton();
		btnZoomIn.setToolTipText("Uvećaj prikaz dijagrama");
		btnZoomIn.setIcon(GeneralHelper.getIconFromName("magnifier_zoom_in"));
		btnZoomIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	
		btnZoomOut = new JButton();
		btnZoomOut.setToolTipText("Umanji prikaz dijagrama");
		btnZoomOut.setIcon(GeneralHelper.getIconFromName("magnifier"));
		btnZoomOut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		add(btnZoomIn);
		add(btnZoomOut);
	}

}