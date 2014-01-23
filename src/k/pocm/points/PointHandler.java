package k.pocm.points;

public class PointHandler {
    private static String in = "null";
    private static String out = "null";

    public static void setForMenu(boolean output, String identifyer) {
        if (output) {
            out = identifyer;
        } else {
            in = identifyer;
        }
    }

    public void translatePoints(String[] inputLines) {
        PointList<Point3D, PointGroup<Point3D>> points = readInput(inputLines);
        String[] out = writeOutput(points);
    }

    private String[] writeOutput(PointList<Point3D, PointGroup<Point3D>> points) {
        return null;
    }

    private PointList<Point3D, PointGroup<Point3D>> readInput(
            String[] inputLines) {
        Class<? extends Point3D> pointClass = Point3D.matchingClassForID(in);
        PointType type = Point3D.getTypeForClass(pointClass);
        return null;
    }

}
