package GeometricFigures;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(int x, int y, int side) {
        super(x, y, round(side/2), (int) round(sqrt(3)/2 * side), side);
    }
}
