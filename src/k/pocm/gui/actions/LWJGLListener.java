package k.pocm.gui.actions;

import java.awt.event.ActionEvent;

import k.core.util.gui.JMIActionListener;
import k.pocm.points.PointHandler;
import k.pocm.translate.POCMLanguages;

public class LWJGLListener extends JMIActionListener {

	public LWJGLListener(String title, String suffix, String menu) {
		super(title, "lwjgl-" + suffix, menu);
	}

	@Override
	public void onAction(ActionEvent e) {
		PointHandler.setForMenu(
				(e.getActionCommand().equalsIgnoreCase("lwjgl output")),
				POCMLanguages.LWJGL);
	}

}
