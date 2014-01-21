package k.pocm.translate;

import java.util.HashMap;

import k.core.util.translate.Translate;

public class POCMLanguages {

	public static final String LWJGL = "lwjgl-opengl-java";
	private static HashMap<String, HashMap<String, String>> errorMap = new HashMap<String, HashMap<String, String>>();

	public static void init() {
		loadUntranslatedErrors();
		registerErrors();
		// DEBUG
		debugErrors();
	}

	private static void registerErrors() {
		Translate.registerNewLanguages(errorMap);
	}

	private static void debugErrors() {
		System.out.println("E_NOTRANS -> "
				+ Translate.E_NOTRANS.translate(LWJGL, "fakeInvocation"));
	}

	private static void loadUntranslatedErrors() {
	}

}
