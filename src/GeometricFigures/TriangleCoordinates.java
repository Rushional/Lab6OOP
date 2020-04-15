package GeometricFigures;

public class TriangleCoordinates {
    int[] coordinatesX;
    int[] coordinatesY;

    public TriangleCoordinates(Triangle triangle) {
        int initiationX = triangle.getX();
        int initiationY = triangle.getY();
        coordinatesX = new int[]{
                initiationX,
                initiationX + triangle.getPlusX(),
                initiationX + triangle.getBase()
        };
        coordinatesY = new int[]{
                initiationY,
                initiationY - triangle.getMinusY(),
                initiationY
        };
    }

    public int[] getCoordinatesX() {
        return coordinatesX;
    }

    public int[] getCoordinatesY() {
        return coordinatesY;
    }
}
