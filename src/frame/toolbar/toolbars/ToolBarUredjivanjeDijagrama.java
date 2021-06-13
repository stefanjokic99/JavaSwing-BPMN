package frame.toolbar.toolbars;

import javax.swing.JButton;
import javax.swing.JToolBar;

import frame.menubar.menu.MenuUredjivanje;
import helpers.GeneralHelper;
import listeners.menu.MenuUredjivanjeActionListener;

public class ToolBarUredjivanjeDijagrama extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btnUndo = null;
	JButton btnRedo = null;
	JButton btnCut = null;
	JButton btnCopy = null;
	JButton btnPaste = null;
	
	MenuUredjivanjeActionListener actionListener = null;
	
	public ToolBarUredjivanjeDijagrama(){
		
		setFloatable(false);
		
		actionListener = new MenuUredjivanjeActionListener();
		
		btnUndo = new JButton();
		btnUndo.setToolTipText("Poništi poslednju promjenu");
		btnUndo.setIcon(GeneralHelper.getIconFromName("arrow_undo"));
		btnUndo.setActionCommand("ponisti prethodni korak");
		btnUndo.addActionListener(actionListener);
		add(btnUndo);
		
		btnRedo = new JButton();
		btnRedo.setToolTipText("Povrati poništeni korak");
		btnRedo.setIcon(GeneralHelper.getIconFromName("arrow_redo"));
		btnRedo.setActionCommand("povrati ponisteni korak");
		btnRedo.addActionListener(actionListener);
		add(btnRedo);
		
		btnCut = new JButton();
		btnCut.setToolTipText("Isjeci");
		btnCut.setIcon(GeneralHelper.getIconFromName("cut"));
		btnCut.setActionCommand("isjecanje");
		btnCut.addActionListener(actionListener);
		add(btnCut);
		
		btnCopy = new JButton();
		btnCopy.setToolTipText("Kopiraj");
		btnCopy.setIcon(GeneralHelper.getIconFromName("clipboard_text"));
		btnCopy.setActionCommand("kopiranje");
		btnCopy.addActionListener(actionListener);
		add(btnCopy);
		
		btnPaste = new JButton();
		btnPaste.setToolTipText("Zalijepi");
		btnPaste.setIcon(GeneralHelper.getIconFromName("clipboard_paste_image"));
		btnPaste.setActionCommand("lijepljenje");
		btnPaste.addActionListener(actionListener);
		add(btnPaste);
	}

}
