package GeometricFigures;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(int leftmostX, int leftmostY, int base, int height) {
        super(leftmostX, leftmostY, Math.round(base/2), height, base);
    }
}
