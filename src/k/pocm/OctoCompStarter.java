package k.pocm;

import java.io.PrintStream;

import k.core.util.gui.JMIActionListener;
import k.core.util.gui.SideConsole;
import k.pocm.gui.MainWindow;
import k.pocm.gui.actions.GPListener;
import k.pocm.gui.actions.LWJGLListener;

public class OctoCompStarter {

	public static final JMIActionListener lwjgl_output = new LWJGLListener(
			"LWJGL Output", true, "output"), lwjgl_input = new LWJGLListener(
			"LWJGL Input", false, "input"), gp_e = new GPListener(
			"Generic Point Entering", "e", "input"), gp_d = new GPListener(
			"Generic Point Dump", "d", "output");

	public static final String VERSION = "1.0 alpha dev";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintStream early1 = SideConsole.earlyChainO(System.out);
		PrintStream early2 = SideConsole.earlyChainE(System.err);
		System.setOut(early1);
		System.setErr(early2);
		new SideConsole(true);
		MainWindow.open();
	}

}
