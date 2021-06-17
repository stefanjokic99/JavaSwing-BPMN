package listeners.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import frame.MainFrame;

public class MenuSimulacijaActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "pokretanje simulacije":
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "zatvaranje simulacije":
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "zaustavljanje simulacije":
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "verifikacija simulacije":
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
		}
	}

}
