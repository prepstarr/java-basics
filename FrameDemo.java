import javax.swing.*;

public class FrameDemo {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("Bonjour");
		jframe.setSize(400,500);
		jframe.setVisible(true);
		jframe.addWindowListener(mwh);
		myCodetoHandleWinClose mwh = new myCodetoHandleWinClose();

	}
}
