package k.pocm.points;

import java.util.HashMap;

public abstract class Point3D {
	private static final HashMap<String, Class<? extends Point3D>> classStorage = new HashMap<String, Class<? extends Point3D>>();

	private static final HashMap<Class<? extends Point3D>, PointType> types = new HashMap<Class<? extends Point3D>, PointType>();

	public Point3D(String id) {
		if(classStorage.get(id) == getClass()) {
			return;
		}
		if (classStorage.containsKey(id)) {
			System.err.println("An point id is being overwritten! ID:" + id
					+ ", Class:" + getClass().getName());
		}
		classStorage.put(id, getClass());
	}

	public static Class<? extends Point3D> matchingClassForID(String id) {
		return classStorage.get(id);
	}

	public static PointType getTypeForClass(Class<? extends Point3D> pointClass) {
		return types.get(pointClass);
	}

}
