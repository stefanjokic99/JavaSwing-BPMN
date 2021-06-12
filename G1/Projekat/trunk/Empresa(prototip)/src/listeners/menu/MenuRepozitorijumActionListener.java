package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MenuRepozitorijumActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand())
		{
			case "registracija":
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "prijava":
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "odjava":
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
		}
	}

}
