package listeners.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import frame.MainFrame;

public class MenuPomocActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand())
		{
			case "online pomoc":
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "o aplikaciji":
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "faq":
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
		}
	}

}
