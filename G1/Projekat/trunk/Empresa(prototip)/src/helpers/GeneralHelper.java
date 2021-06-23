package helpers;

import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
	public static JPanel getHelperPanel(Component component) {
		JPanel helperPanel = new JPanel();
		helperPanel.add(component);
		return helperPanel;
	}
	public static BufferedImage getTestDiagram(String slika)
	{
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File(slika));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return myPicture;
	}
	
}
