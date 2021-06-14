package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MenuPomocActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand())
		{
			case "online pomoc":
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "o aplikaciji":
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "faq":
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
		}
	}

}
