package listeners;

import java.awt.Component;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class CustomWindowListener implements WindowListener {

	@Override
	public void windowClosing(WindowEvent e) {
		String odgovori[] = {"Da", "Ne", "Odustani"};
		int cuvanje = JOptionPane.showOptionDialog((Component) e.getSource(), "Da li želite da sačuvate unijete izmjene?", "Izlaz", 0, JOptionPane.WARNING_MESSAGE, null, odgovori, null);
		if (cuvanje == JOptionPane.YES_OPTION || cuvanje == JOptionPane.NO_OPTION)
		{
			if(cuvanje == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
			System.exit(0);
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
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

	

}
