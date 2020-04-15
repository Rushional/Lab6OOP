package Interface;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private Canvas canvas;
    private InputPanel inputPanel;

    public Window() {
        super("OOP Lab6");
        setLayout(new GridBagLayout());
        canvas = new Canvas();
        inputPanel = new InputPanel();
        GridBagConstraints inputPanelConstraints = new GridBagConstraints();
        inputPanelConstraints.fill = GridBagConstraints.NONE;
        inputPanelConstraints.weightx = 0;
        inputPanelConstraints.weighty = 0;
        inputPanelConstraints.gridx = 0;
        inputPanelConstraints.gridy = 0;
        add(inputPanel, inputPanelConstraints);
        GridBagConstraints outputPanelConstraints = new GridBagConstraints();
        outputPanelConstraints.weightx = 0;
        outputPanelConstraints.weighty = 0;
        outputPanelConstraints.gridx = 1;
        outputPanelConstraints.gridy = 0;
        add(canvas, outputPanelConstraints);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
