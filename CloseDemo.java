import javax.swing.*;
import java.awt.event.*;

public class CloseDemo {
	public static void main(String args) {
		JFrame jframe = new JFrame("Exemple");
		jframe.setSize(400,300);
		jframe.setVisible(true);
		myCodeToHandleWindowClose m = new myCodeToHandleWindowClose();
		jframe.addWindowListener(m);
	}
}

