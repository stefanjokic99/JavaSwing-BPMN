package listeners.menu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MenuProjekatActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
			
		switch(e.getActionCommand())
		{
			case "novi projekat":
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "novi dijagram":
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "otvori projekat": 
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "otvori dijagram": 
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "zatvori projekat": 
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "zatvori sve projekte": 
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "sacuvaj": 
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "sacuvaj kao": 
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "stampanje": 
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "preimenovanje": 
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "izlaz": 
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				break;
		}
	}

}
