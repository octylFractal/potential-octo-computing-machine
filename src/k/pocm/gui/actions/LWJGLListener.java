package k.pocm.gui.actions;

import java.awt.event.ActionEvent;

import k.core.util.gui.JMIActionListener;
import k.pocm.points.PointHandler;
import k.pocm.translate.POCMLanguages;

public class LWJGLListener extends JMIActionListener {

	private boolean output = false;

	public LWJGLListener(String title, boolean out, String menu) {
		super(title, "lwjgl-" + (out ? "o" : "i"), menu);
		output = out;
	}

	@Override
	public void onAction(ActionEvent e) {
		PointHandler.setForMenu(output, POCMLanguages.LWJGL);
	}

}
