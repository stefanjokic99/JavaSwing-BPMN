package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import frame.MainFrame;
import helpers.GeneralHelper;

public class MainClass {

	public static void main(String[] args) {
		
		try {
		UIManager.setLookAndFeel(
				"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		UIManager.put("Tree.collapsedIcon", GeneralHelper.getMyIconFromName("arrow_right"));
		UIManager.put("Tree.expandedIcon", GeneralHelper.getMyIconFromName("arrow_down"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new MainFrame();
	}

}
