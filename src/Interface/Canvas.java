package Interface;

import GeometricFigures.Triangle;
import GeometricFigures.TriangleCoordinates;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    private TriangleCoordinates coordinatesSimple;
    private TriangleCoordinates coordinatesIsosceles;
    private TriangleCoordinates coordinatesEquilateral;


    public Canvas() {
        super();
        setBackground(new Color(173, 196, 228));
        setPreferredSize(new Dimension(900, 500));
        Triangle simple = new Triangle(100, 100, 40, 30, 90);
        coordinatesSimple = new TriangleCoordinates(simple);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        if (coordinatesSimple != null) {
            drawTriangle(g2d, coordinatesSimple);
        }
        if (coordinatesIsosceles != null) {
            drawTriangle(g2d, coordinatesIsosceles);
        }
        if (coordinatesEquilateral != null) {
            drawTriangle(g2d, coordinatesEquilateral);
        }
        g2d.setColor(Color.black);
    }

    public void drawTriangle(Graphics2D g2d, TriangleCoordinates coordinates) {
        g2d.drawPolygon(coordinates.getCoordinatesX(), coordinates.getCoordinatesY(), 3);
    }

    public void setCoordinatesSimple(TriangleCoordinates coordinatesSimple) {
        this.coordinatesSimple = coordinatesSimple;
    }

    public void setCoordinatesIsosceles(TriangleCoordinates coordinatesIsosceles) {
        this.coordinatesIsosceles = coordinatesIsosceles;
    }

    public void setCoordinatesEquilateral(TriangleCoordinates coordinatesEquilateral) {
        this.coordinatesEquilateral = coordinatesEquilateral;
    }
}
