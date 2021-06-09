package listeners;

import java.awt.Component;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class CustomWindowListener implements WindowListener {

	@Override
	public void windowClosing(WindowEvent e) {
		int cuvanje = JOptionPane.showConfirmDialog((Component) e.getSource(), "Da li želite da sačuvate unijete izmjene?", "Čuvanje izmjena", JOptionPane.YES_NO_CANCEL_OPTION);
		if (cuvanje == JOptionPane.YES_OPTION || cuvanje == JOptionPane.NO_OPTION)
		{
			if(cuvanje == JOptionPane.YES_OPTION)
			{
				JOptionPane.showConfirmDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.CLOSED_OPTION);
			}
			System.exit(0);
		}
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
