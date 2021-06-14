package frame.radnapovrsina;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import helpers.GeneralHelper;

public class RadnaPovrsina extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JPanel pnlTab1 = null;
	JPanel pnlTab2 = null;
	JLabel lblTitle1 = null;
	JLabel lblTitle2 = null;
	JButton btnClose1 = null;
	JButton btnClose2 = null;
	
	GridBagConstraints gbc = null;
	
	public RadnaPovrsina() {
	
		pnlTab1 = new JPanel(new GridBagLayout());
		pnlTab2 = new JPanel(new GridBagLayout());
		
		pnlTab1.setOpaque(false);
		pnlTab2.setOpaque(false);
		
		lblTitle1 = new JLabel("Dijagram 1");
		lblTitle2 = new JLabel("Dijagram 2");
		lblTitle1.setIcon(GeneralHelper.getMyIconFromName("create_diagram"));
		lblTitle2.setIcon(GeneralHelper.getMyIconFromName("create_diagram"));
		
		btnClose1 = new JButton("X");
		btnClose1.setOpaque(false);
		btnClose1.setContentAreaFilled(false);
		btnClose1.setBorderPainted(false);
		
		btnClose2 = new JButton("X");
		btnClose2.setOpaque(false);
		btnClose2.setContentAreaFilled(false);
		btnClose2.setBorderPainted(false);
		
		btnClose1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnClose2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog((Component) e.getSource(), "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;

		pnlTab1.add(lblTitle1, gbc);
		pnlTab2.add(lblTitle2, gbc);
		
		gbc.gridx ++;
		gbc.weightx = 0;
		pnlTab1.add(btnClose1, gbc);
		pnlTab2.add(btnClose2, gbc);
		
		addTab("", null);
		setTabComponentAt(0, pnlTab1);
		addTab("", null);
		setTabComponentAt(1, pnlTab2);

	}
}
