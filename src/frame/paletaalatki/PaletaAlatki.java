package frame.paletaalatki;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import frame.paletaalatki.palete.Artefakti;
import frame.paletaalatki.palete.ElementiSpajanja;
import frame.paletaalatki.palete.ElementiToka;
import frame.paletaalatki.palete.Particije;

public class PaletaAlatki extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PaletaAlatki() {

		JLabel lblNaslovElementiToka = null;
		JLabel lblNaslovElementiSpajanja = null;
		JLabel lblNaslovParticije = null;
		JLabel lblNaslovArtefakti = null;
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(BorderFactory.createEtchedBorder());
		
		lblNaslovElementiToka = new JLabel("<html><font size=\"4\"><b>Elementi toka<b></fontsize></html>");
		lblNaslovElementiToka.setPreferredSize(new Dimension(200, 30));
		lblNaslovElementiToka.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(lblNaslovElementiToka);
		
		add(new ElementiToka());
		
		lblNaslovElementiSpajanja = new JLabel("<html><font size=\"4\"><b>Elementi spajanja<b></fontsize></html>");
		lblNaslovElementiSpajanja.setPreferredSize(new Dimension(200, 30));
		lblNaslovElementiSpajanja.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(lblNaslovElementiSpajanja);
		
		add(new ElementiSpajanja());
		
		lblNaslovParticije = new JLabel("<html><font size=\"4\"><b>Particije<b></fontsize></html>");
		lblNaslovParticije.setPreferredSize(new Dimension(200, 30));
		lblNaslovParticije.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(lblNaslovParticije);
		
		add(new Particije());
		
		lblNaslovArtefakti = new JLabel("<html><font size=\"4\"><b>Artefakti<b></fontsize></html>");
		lblNaslovArtefakti.setPreferredSize(new Dimension(200, 30));
		lblNaslovArtefakti.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(lblNaslovArtefakti);
		
		add(new Artefakti());
	}

}
