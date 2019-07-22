package gridlayoutchallenge;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

class SwingDemo {
	private JFrame jfrm;
	SwingDemo(String title) {
		// Create a new JFrame container.
		jfrm = new JFrame(title);
		jfrm.setLayout(new BoxLayout(jfrm.getContentPane(), BoxLayout.Y_AXIS));
	}
	public JFrame getFrame() {
		return jfrm;
	}
}