package k.pocm.points;

public class ShapePoint extends Point3D {
	static {
		Point3D.registerPointWithType("shape", Point3D.class, PointType.shape);
	}

}
