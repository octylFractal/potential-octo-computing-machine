package k.pocm.points;

public class PointType {

    public static PointType shape = new ShapePointType("shape",
            ShapePoint.class), generic = new PointType("g", Point3D.class);

    public String id;

    public PointType(String _id, Class<?> pointClass) {
        id = _id;
    }

    public PointGroup<?>[] getPointGroups() {
        return new PointGroup<?>[0];
    }
}
