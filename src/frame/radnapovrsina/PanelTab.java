package frame.radnapovrsina;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import frame.MainFrame;
import helpers.GeneralHelper;

public class PanelTab extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel lblNaslov = null;
	JButton btnClose = null;
	
	GridBagConstraints gbc = null;
	
	public PanelTab()
	{
		setLayout(new GridBagLayout());
		setOpaque(false);
		
		lblNaslov = new JLabel();
		lblNaslov.setIcon(GeneralHelper.getMyIconFromName("create_diagram"));
		
		btnClose = new JButton("X");
		btnClose.setOpaque(false);
		btnClose.setContentAreaFilled(false);
		btnClose.setBorderPainted(false);
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		
		add(lblNaslov, gbc);
		
		gbc.gridx ++;
		gbc.weightx = 0;
		add(btnClose, gbc);
	}

	
	public PanelTab(String naslov)
	{
		setLayout(new GridBagLayout());
		setOpaque(false);
		
		lblNaslov = new JLabel(naslov);
		lblNaslov.setIcon(GeneralHelper.getMyIconFromName("create_diagram"));
		
		btnClose = new JButton("X");
		btnClose.setOpaque(false);
		btnClose.setContentAreaFilled(false);
		btnClose.setBorderPainted(false);
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		
		add(lblNaslov, gbc);
		
		gbc.gridx ++;
		gbc.weightx = 0;
		add(btnClose, gbc);
	}

}
