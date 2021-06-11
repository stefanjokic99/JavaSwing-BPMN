package helpers;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GeneralHelper {

	public static Icon getIconFromName(String iconName) {
		Image iconImage = Toolkit.getDefaultToolkit().getImage("images/icons/" + iconName +  ".png");
		return new ImageIcon(iconImage);
	}
}
