package k.pocm.gui.actions;

import java.awt.event.ActionEvent;

import k.core.gui.JMIActionListener;

public class LWJGLListener extends JMIActionListener {

	public LWJGLListener(String title, String suffix, String menu) {
		super(title, "lwjgl-" + suffix, menu);
	}

	@Override
	public void onAction(ActionEvent e) {
		System.err.println("Activated on menu " + super.menu);
	}

}
