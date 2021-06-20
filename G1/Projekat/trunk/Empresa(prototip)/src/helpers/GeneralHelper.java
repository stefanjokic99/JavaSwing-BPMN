package helpers;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GeneralHelper {

	public static Icon getIconFromName(String iconName) {
		Image iconImage = Toolkit.getDefaultToolkit().getImage("images/icons/" + iconName +  ".png");
		return new ImageIcon(iconImage);
	}
	public static Icon getMyIconFromName(String iconName) {
		Image iconImage = Toolkit.getDefaultToolkit().getImage("images/myIcons/" + iconName +  ".png");
		return new ImageIcon(iconImage);
	}
	public static Icon getElementIconFromName(String iconName) {
		Image iconImage = Toolkit.getDefaultToolkit().getImage("images/elements/" + iconName +  ".png");
		return new ImageIcon(iconImage);
	}
	public static JPanel getHelperPanel(JLabel lblNaslov) {
		JPanel helperPanel = new JPanel();
		helperPanel.add(lblNaslov);
		return helperPanel;
	}
}
