package k.pocm.gui.actions;

import java.awt.event.ActionEvent;

import k.core.util.gui.JMIActionListener;

public class GPListener extends JMIActionListener {

	public GPListener(String command, String suffix, String mtitle) {
		super(command, "gp" + suffix, mtitle);
	}

	@Override
	public void onAction(ActionEvent e) {

	}

}
