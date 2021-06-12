package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MenuSimulacijaActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "pokretanje simulacije":
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "zatvaranje simulacije":
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "zaustavljanje simulacije":
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "verifikacija simulacije":
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
		}
	}

}
