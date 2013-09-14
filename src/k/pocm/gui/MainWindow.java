package k.pocm.gui;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import k.core.gui.Menu;
import k.core.gui.SideConsole;
import k.core.util.Helper;
import k.pocm.OctoCompStarter;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = -8642747199227382253L;
	public static MainWindow inst = null;

	public MainWindow(String version) {
		setTitle("POCM " + version);
		setupMenu();
		pack();
		Helper.Window.drop(this);
		setVisible(true);
	}

	private void setupMenu() {
		Menu m = Menu.create("pocm_main");

		m.addMenuByName("input", "Input");
		m.addMenuByName("output", "Output");

		m.addMenuItemToMenuByName("input", "gpe", "Generic Point Entering");

	}

	public static void open() {
		inst = new MainWindow(OctoCompStarter.VERSION);
		inst.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				kill(SideConsole.console);
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
