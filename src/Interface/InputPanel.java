package Interface;

import GeometricFigures.EquilateralTriangle;
import GeometricFigures.IsoscelesTriangle;
import GeometricFigures.Triangle;
import GeometricFigures.TriangleCoordinates;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class InputPanel extends JPanel {
    private int coordinateX, coordinateY;
    private boolean isSimple = true, isIsosceles = false, isEquilateral = false;

    InputPanel(Canvas canvas) {
        super();
        //        setBackground(new Color(116, 255, 207));
        setBackground(new Color(235, 240, 255));
        setPreferredSize(new Dimension(300, 500));
        setLayout(new GridBagLayout());
        JLabel labelEnterCoordinates = new JLabel("Please enter the initiating point's coordinates: ");
        GridBagConstraints enterCoordinatesConstraints = new GridBagConstraints();
        enterCoordinatesConstraints.fill = GridBagConstraints.NONE;
        enterCoordinatesConstraints.weightx = 0;
        enterCoordinatesConstraints.weighty = 0;
        enterCoordinatesConstraints.gridx = 0;
        enterCoordinatesConstraints.gridy = 0;
        enterCoordinatesConstraints.gridwidth = 4;
        add(labelEnterCoordinates, enterCoordinatesConstraints);
        JLabel labelX = new JLabel("X: ");
        GridBagConstraints labelXConstraints = new GridBagConstraints();
        labelXConstraints.insets.top = 20;
        labelXConstraints.insets.left = 10;
        labelXConstraints.weightx = 0;
        labelXConstraints.weighty = 0;
        labelXConstraints.gridx = 0;
        labelXConstraints.gridy = 1;
        add(labelX, labelXConstraints);
        JTextField textX = new JTextField(7);
//        textX.setBorder(BorderFactory.createEmptyBorder());
        textX.setMinimumSize(textX.getPreferredSize());
        GridBagConstraints textXConstraints = new GridBagConstraints();
        textXConstraints.anchor = GridBagConstraints.WEST;
        textXConstraints.insets.top = 20;
        textXConstraints.weightx = 1;
        textXConstraints.weighty = 0;
        textXConstraints.gridx = 1;
        textXConstraints.gridy = 1;
        add(textX, textXConstraints);
        JLabel labelY = new JLabel("Y: ");
        GridBagConstraints labelYConstraints = new GridBagConstraints();
        labelYConstraints.insets.top = 20;
        labelYConstraints.insets.left = 10;
        labelYConstraints.weightx = 0;
        labelYConstraints.weighty = 0;
        labelYConstraints.gridx = 0;
        labelYConstraints.gridy = 2;
        add(labelY, labelYConstraints);
        JTextField textY = new JTextField(7);
//        textY.setBorder(BorderFactory.createEmptyBorder());
        textY.setMinimumSize(textX.getPreferredSize());
        GridBagConstraints textYConstraints = new GridBagConstraints();
        textYConstraints.anchor = GridBagConstraints.WEST;
        textYConstraints.insets.top = 20;
        textYConstraints.weightx = 1;
        textYConstraints.weighty = 0;
        textYConstraints.gridx = 1;
        textYConstraints.gridy = 2;
        add(textY, textYConstraints);
        JLabel labelIsSimple = new JLabel("A simple triangle:");
        GridBagConstraints labelIsSimpleConstraints = new GridBagConstraints();
        labelIsSimpleConstraints.anchor = GridBagConstraints.WEST;
        labelIsSimpleConstraints.insets.left = 10;
        labelIsSimpleConstraints.insets.top = 20;
        labelIsSimpleConstraints.fill = GridBagConstraints.NONE;
        labelIsSimpleConstraints.weightx = 0;
        labelIsSimpleConstraints.weighty = 0;
        labelIsSimpleConstraints.gridx = 0;
        labelIsSimpleConstraints.gridy = 3;
        labelIsSimpleConstraints.gridwidth = 3;
        add(labelIsSimple, labelIsSimpleConstraints);

        JRadioButton radioSimple = new JRadioButton();
        radioSimple.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioSimpleConstraints = new GridBagConstraints();
        radioSimpleConstraints.insets.top = 20;
        radioSimpleConstraints.fill = GridBagConstraints.NONE;
        radioSimpleConstraints.weightx = 0;
        radioSimpleConstraints.weighty = 0;
        radioSimpleConstraints.gridx = 3;
        radioSimpleConstraints.gridy = 3;
//        radioSimpleConstraints.gridwidth = 1;
        add(radioSimple, radioSimpleConstraints);

        JLabel labelIsIsosceles= new JLabel("An isosceles triangle:");
        GridBagConstraints labelIsIsoscelesConstraints = new GridBagConstraints();
        labelIsIsoscelesConstraints.anchor = GridBagConstraints.WEST;
        labelIsIsoscelesConstraints.insets.left = 10;
        labelIsIsoscelesConstraints.insets.top = 20;
        labelIsIsoscelesConstraints.fill = GridBagConstraints.NONE;
        labelIsIsoscelesConstraints.weightx = 0;
        labelIsIsoscelesConstraints.weighty = 0;
        labelIsIsoscelesConstraints.gridx = 0;
        labelIsIsoscelesConstraints.gridy = 4;
        labelIsIsoscelesConstraints.gridwidth = 3;
        add(labelIsIsosceles, labelIsIsoscelesConstraints);

        JRadioButton radioIsosceles = new JRadioButton();
        radioIsosceles.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioIsoscelesConstraints = new GridBagConstraints();
        radioIsoscelesConstraints.insets.top = 20;
        radioIsoscelesConstraints.fill = GridBagConstraints.NONE;
        radioIsoscelesConstraints.weightx = 0;
        radioIsoscelesConstraints.weighty = 0;
        radioIsoscelesConstraints.gridx = 3;
        radioIsoscelesConstraints.gridy = 4;
//        radioIsoscelesConstraints.gridwidth = 1;
        add(radioIsosceles, radioIsoscelesConstraints);

        JLabel labelIsEquilateral= new JLabel("An equilateral triangle:");
        GridBagConstraints labelIsEquilateralConstraints = new GridBagConstraints();
        labelIsEquilateralConstraints.anchor = GridBagConstraints.WEST;
        labelIsEquilateralConstraints.insets.left = 10;
        labelIsEquilateralConstraints.insets.top = 20;
        labelIsEquilateralConstraints.fill = GridBagConstraints.NONE;
        labelIsEquilateralConstraints.weightx = 0;
        labelIsEquilateralConstraints.weighty = 0;
        labelIsEquilateralConstraints.gridx = 0;
        labelIsEquilateralConstraints.gridy = 5;
        labelIsEquilateralConstraints.gridwidth = 3;
        add(labelIsEquilateral, labelIsEquilateralConstraints);

        JRadioButton radioEquilateral = new JRadioButton();
        radioEquilateral.setBackground(new Color(235, 240, 255));
        GridBagConstraints radioEquilateralConstraints = new GridBagConstraints();
        radioEquilateralConstraints.insets.top = 20;
        radioEquilateralConstraints.fill = GridBagConstraints.NONE;
        radioEquilateralConstraints.weightx = 0;
        radioEquilateralConstraints.weighty = 0;
        radioEquilateralConstraints.gridx = 3;
        radioEquilateralConstraints.gridy = 5;
//        radioEquilateralConstraints.gridwidth = 1;
        add(radioEquilateral, radioEquilateralConstraints);

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioSimple);
        radioGroup.add(radioIsosceles);
        radioGroup.add(radioEquilateral);
        radioSimple.setSelected(true);

        JButton buttonCalculateRoots = new JButton("Draw the triangle");
        GridBagConstraints buttonRootsConstraints = new GridBagConstraints();
        buttonRootsConstraints.anchor = GridBagConstraints.WEST;
        buttonRootsConstraints.insets.left = 10;
        buttonRootsConstraints.insets.top = 20;
        buttonRootsConstraints.weightx = 0;
        buttonRootsConstraints.weighty = 0;
        buttonRootsConstraints.gridx = 0;
        buttonRootsConstraints.gridy = 6;
        buttonRootsConstraints.gridwidth = 3;
        add(buttonCalculateRoots, buttonRootsConstraints);

        JButton buttonClear = new JButton("Clear");
        GridBagConstraints buttonClearConstraints = new GridBagConstraints();
        buttonClearConstraints.anchor = GridBagConstraints.WEST;
        buttonClearConstraints.insets.left = 10;
        buttonClearConstraints.insets.top = 20;
        buttonClearConstraints.weightx = 0;
        buttonClearConstraints.weighty = 0;
        buttonClearConstraints.gridx = 0;
        buttonClearConstraints.gridy = 7;
        buttonClearConstraints.gridwidth = 3;
        add(buttonClear, buttonClearConstraints);

        textX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coordinateX = Integer.parseInt(textX.getText());
            }
        });
        textY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coordinateY = Integer.parseInt(textY.getText());
            }
        });
        radioSimple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isSimple = true;
                isIsosceles = false;
                isEquilateral = false;
            }
        });
        radioIsosceles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isIsosceles = true;
                isSimple = false;
                isEquilateral = false;
            }
        });
        radioEquilateral.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isEquilateral = true;
                isSimple = false;
                isIsosceles = false;
            }
        });
        buttonCalculateRoots.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textX.getText().equals("") && !textY.getText().equals("")) {
                    if (isSimple) {
                        Triangle triangleSimple = new Triangle(
                                Integer.parseInt(textX.getText()), Integer.parseInt(textY.getText()),
                                40, 50, 90
                        );
                        TriangleCoordinates simpleCoordinates = new TriangleCoordinates(triangleSimple);
                        canvas.setCoordinatesSimple(simpleCoordinates);
                    } else if (isIsosceles) {
                        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(
                                Integer.parseInt(textX.getText()), Integer.parseInt(textY.getText()),
                                80, 50
                        );
                        TriangleCoordinates isoscelesCoordinates = new TriangleCoordinates(isoscelesTriangle);
                        canvas.setCoordinatesIsosceles(isoscelesCoordinates);
                    } else if (isEquilateral) {
                        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(
                                Integer.parseInt(textX.getText()), Integer.parseInt(textY.getText()),
                                55
                        );
                        TriangleCoordinates equilateralCoordinates = new TriangleCoordinates(equilateralTriangle);
                        canvas.setCoordinatesEquilateral(equilateralCoordinates);
                    } else throw new RuntimeException();
                }
                canvas.repaint();
            }
        });

        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.setCoordinatesSimple(null);
                canvas.setCoordinatesIsosceles(null);
                canvas.setCoordinatesEquilateral(null);
                canvas.repaint();
            }
        });
    }

}
