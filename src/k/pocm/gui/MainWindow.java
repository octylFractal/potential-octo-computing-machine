package k.pocm.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import k.core.gui.JMIActionListener;
import k.core.gui.Menu;
import k.core.gui.SideConsole;
import k.core.util.Helper;
import k.pocm.OctoCompStarter;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = -8642747199227382253L;
	public static MainWindow inst = null;

	public MainWindow(String version) {
		setTitle("POCM " + version);
		addGUI();
		setupMenu();
		pack();
		Helper.Window.drop(this);
		setVisible(true);
	}

	private void addGUI() {
		JPanel mainScreen = new JPanel();
		mainScreen.setPreferredSize(new Dimension(800, 600));
		mainScreen.setSize(getPreferredSize());
		add(mainScreen);
	}

	private void setupMenu() {
		Menu m = Menu.create("pocm_main");

		m.addMenuByName("input", "Input");
		m.addMenuByName("output", "Output");

		m.addMenuItemToMenuByName("input", "gpe", "Generic Point Entering");
		m.addMenuItemToMenuByName("input", "lwjgl-i", "LWJGL Input");

		m.addMenuItemToMenuByName("output", "gpd", "Generic Point Dump");
		m.addMenuItemToMenuByName("output", "lwjgl-o", "LWJGL Output");

		m.setActionListenerAll(JMIActionListener.instForMenu("pocm_main"));

		m.display(this);
		// Disabled
		// m.addMenuItemToMenuByName("input", "opengl-obj_c",
		// "OpenGL for Objective-C");
	}

	public static void open() {
		inst = new MainWindow(OctoCompStarter.VERSION);
		inst.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				kill(SideConsole.console);
				System.exit(0);
			}

			private void kill(JFrame frame) {
				Toolkit.getDefaultToolkit()
						.getSystemEventQueue()
						.postEvent(
								new WindowEvent(frame,
										WindowEvent.WINDOW_CLOSING));
			}

		});
	}

}
