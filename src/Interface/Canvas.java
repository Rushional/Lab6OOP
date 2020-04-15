package Interface;

import GeometricFigures.TriangleCoordinates;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    private TriangleCoordinates coordinatesSimple;
    private TriangleCoordinates coordinatesIsosceles;
    private TriangleCoordinates coordinatesEquilateral;


    Canvas() {
        super();
        setBackground(new Color(173, 196, 228));
        setPreferredSize(new Dimension(900, 500));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        drawCoordinatesGrid(g2d);
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

    private void drawCoordinatesGrid(Graphics2D g2d){
        int step = 50;
        int sizeX = getSize().width;
        int sizeY = getSize().height;
        int i;
        for (i = 0; i < sizeX; i+= step){
            g2d.drawString((String.valueOf(i)), i + 1, 11);
        }
        for (i = 0; i < sizeY; i+= step){
            g2d.drawString((String.valueOf(i)), 1, i-1);
        }
        //gray
        Color colorOld = g2d.getColor();
//        java.awt.Color color = new java.awt.Color(142, 145, 180); //I used this to comfortably choose color in idea
        g2d.setColor(new Color(142, 145, 180));
        for (i = 0; i < sizeX; i+= step){
            g2d.drawLine(i, 0, i, sizeY);
        }
        for (i = 0; i < sizeY; i+= step){
            g2d.drawLine(0, i, sizeX, i);
        }
        g2d.setColor(colorOld);
    }

    private void drawTriangle(Graphics2D g2d, TriangleCoordinates coordinates) {
        g2d.drawPolygon(coordinates.getCoordinatesX(), coordinates.getCoordinatesY(), 3);
    }

    void setCoordinatesSimple(TriangleCoordinates coordinatesSimple) {
        this.coordinatesSimple = coordinatesSimple;
    }

    void setCoordinatesIsosceles(TriangleCoordinates coordinatesIsosceles) {
        this.coordinatesIsosceles = coordinatesIsosceles;
    }

    void setCoordinatesEquilateral(TriangleCoordinates coordinatesEquilateral) {
        this.coordinatesEquilateral = coordinatesEquilateral;
    }
}
