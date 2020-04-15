import GeometricFigures.EquilateralTriangle;
import GeometricFigures.IsoscelesTriangle;
import GeometricFigures.Triangle;
import Interface.WindowInitiator;


public class Main {

    public static void main(String[] args) {
        Triangle simpleTriangle = new Triangle(40, 40, 30, 30, 50);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(100, 40, 40, 25);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(40, 80, 30);
        WindowInitiator windowInitiator = new WindowInitiator();
        windowInitiator.startWindow();
    }
}
