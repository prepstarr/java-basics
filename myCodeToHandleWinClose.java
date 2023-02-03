import javax.swing.*;
import java.awt.event.*;

class myCodeToHandleWinClose implements WindowListener {
	public void windowClosing(WindowEvent e) { System.exit(0); }
	public void windowClosed(WindowEvent e) { }
	public void windowOpened(WindowEvent e) { }
	public void windowIconified(WindowEvent e) { }
	public void windowDeiconified(WindowEvent e) { }
	public void windowActivated(WindowEvent e) { }
	public void windowDeactivated(WindowEvent e) { }
}
