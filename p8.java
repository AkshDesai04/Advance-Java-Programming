import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ColorCheckbox extends JFrame implements ItemListener {
    private JCheckBox redCheckBox, greenCheckBox, blueCheckBox;
    private Canvas canvas;

    public ColorCheckbox() {
        super("Color Checkbox");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        redCheckBox = new JCheckBox("Red");
        greenCheckBox = new JCheckBox("Green");
        blueCheckBox = new JCheckBox("Blue");

        add(redCheckBox);
        add(greenCheckBox);
        add(blueCheckBox);

        redCheckBox.addItemListener(this);
        greenCheckBox.addItemListener(this);
        blueCheckBox.addItemListener(this);

        canvas = new Canvas();
        canvas.setSize(30, 30);
        add(canvas);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        Color c = null;
        if (redCheckBox.isSelected() && greenCheckBox.isSelected() && blueCheckBox.isSelected())
            c = Color.WHITE;
        else if (redCheckBox.isSelected() && greenCheckBox.isSelected())
            c = Color.YELLOW;
        else if (redCheckBox.isSelected() && blueCheckBox.isSelected())
            c = Color.MAGENTA;
        else if (greenCheckBox.isSelected() && blueCheckBox.isSelected())
            c = Color.CYAN;
        else if (redCheckBox.isSelected())
            c = Color.RED;
        else if (greenCheckBox.isSelected())
            c = Color.GREEN;
        else if (blueCheckBox.isSelected())
            c = Color.BLUE;
        else
            c = Color.GRAY;
        canvas.setBackground(c);
        canvas.repaint();
    }

    public static void main(String[] args) {
        new ColorCheckbox();
    }
}