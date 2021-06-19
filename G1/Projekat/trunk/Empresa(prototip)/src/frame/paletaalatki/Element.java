package frame.paletaalatki;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import frame.MainFrame;
import helpers.GeneralHelper;

public class Element extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Element(String slika) {
	
		setPreferredSize(new Dimension(50,70));
		
		setOpaque(false);             
		setContentAreaFilled(false);  
		setBorderPainted(false);   
		
		setIcon(GeneralHelper.getElementIconFromName(slika));
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}

}
