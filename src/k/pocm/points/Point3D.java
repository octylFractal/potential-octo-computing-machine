package k.pocm.points;

import java.util.HashMap;

public abstract class Point3D {
	private static final HashMap<String, Class<? extends Point3D>> classStorage = new HashMap<String, Class<? extends Point3D>>();

	private static final HashMap<Class<? extends Point3D>, PointType> types = new HashMap<Class<? extends Point3D>, PointType>();

	public static Class<? extends Point3D> matchingClassForID(String id) {
		return classStorage.get(id);
	}

	public static PointType getTypeForClass(Class<? extends Point3D> pointClass) {
		return types.get(pointClass);
	}

	public static void registerPointWithType(String id,
			Class<? extends Point3D> clazz, PointType type) {
		classStorage.put(id, clazz);
		types.put(clazz, type);
	}

}
