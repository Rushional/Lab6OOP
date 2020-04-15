package GeometricFigures;

public class Triangle extends Figure {
    private int base; //the length of the bottom side
    private int plusX, minusY; //distance from initiating point to the highest point;

    public Triangle(int leftmostX, int leftmostY, int plusX, int minusY, int base) {
        super(leftmostX, leftmostY);
        this.plusX = plusX;
        this.minusY = minusY;
        this.base = base;
    }

    int getPlusX() {
        return plusX;
    }

    int getMinusY() {
        return minusY;
    }

    int getBase() {
        return base;
    }
}
