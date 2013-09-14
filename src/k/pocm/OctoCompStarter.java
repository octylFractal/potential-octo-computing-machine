package k.pocm;

import java.io.PrintStream;

import k.core.gui.SideConsole;
import k.pocm.gui.MainWindow;

public class OctoCompStarter {

	public static final String VERSION = "1.0 alpha dev";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintStream early1 = SideConsole.earlyChainO(System.out);
		PrintStream early2 = SideConsole.earlyChainE(System.err);
		System.setOut(early1);
		System.setErr(early2);
		SideConsole c = new SideConsole(true);
		MainWindow.open();
	}

}
