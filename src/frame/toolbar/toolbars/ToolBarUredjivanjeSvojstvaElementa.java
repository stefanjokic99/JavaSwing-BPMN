package frame.toolbar.toolbars;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

import frame.MainFrame;
import helpers.GeneralHelper;

public class ToolBarUredjivanjeSvojstvaElementa extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btnVelicina = null;
	JButton btnBold = null;
	JButton btnItalic = null;
	JButton btnUnderline = null;
	JButton btnAlignLeft = null;
	JButton btnAlignCenter = null;
	JButton btnAlignRight = null;
	JButton btnEditText = null;
	
	public ToolBarUredjivanjeSvojstvaElementa() {
		
		setFloatable(false);

		btnVelicina = new JButton();
		btnVelicina.setToolTipText("Veličina elementa");
		btnVelicina.setIcon(GeneralHelper.getIconFromName("arrow_out"));
		btnVelicina.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		add(btnVelicina);
		
		addSeparator();
		
		btnBold = new JButton();
		btnBold.setToolTipText("<html><b>Podebljaj tekst</b></html>");
		btnBold.setIcon(GeneralHelper.getIconFromName("text_bold"));
		btnBold.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		//btnBold.setMnemonic('b');
		add(btnBold);
		
		btnItalic = new JButton();
		btnItalic.setToolTipText("<html><i>Nakosi tekst</i></html");
		btnItalic.setIcon(GeneralHelper.getIconFromName("text_italic"));
		btnItalic.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		add(btnItalic);
		
		btnUnderline = new JButton();
		btnUnderline.setToolTipText("<html><u>Podvuci tekst</u></html>");
		btnUnderline.setIcon(GeneralHelper.getMyIconFromName("text_underline"));
		btnUnderline.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		add(btnUnderline);
		
		addSeparator();
		
		btnAlignLeft = new JButton();
		btnAlignLeft.setToolTipText("Lijevo poravnanje teksta");
		btnAlignLeft.setIcon(GeneralHelper.getIconFromName("text_align_left"));
		btnAlignLeft.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		add(btnAlignLeft);
		
		btnAlignCenter = new JButton();
		btnAlignCenter.setToolTipText("Centriraj tekst");
		btnAlignCenter.setIcon(GeneralHelper.getIconFromName("text_align_center"));
		btnAlignCenter.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		add(btnAlignCenter);
		
		btnAlignRight = new JButton();
		btnAlignRight.setToolTipText("Desno poravnanje teksta");
		btnAlignRight.setIcon(GeneralHelper.getIconFromName("text_align_right"));
		btnAlignRight.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		add(btnAlignRight);
		
		btnEditText = new JButton();
		btnEditText.setToolTipText("Uredi tekst");
		btnEditText.setIcon(GeneralHelper.getIconFromName("page_white_edit"));
		btnEditText.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		add(btnEditText);
	}

}
