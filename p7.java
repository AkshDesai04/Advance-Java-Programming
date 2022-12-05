// Develop a java awt program that has only one button in the frame, clicking on the button cycles through the colors red, green, blue and so on. One color changes per click (use getBackGround() method to get the current color)

import java.awt.*;
import java.awt.event.*;
 
class ColorCycle extends Frame implements ActionListener {
 
    Button btn;
 
    public ColorCycle() {
        setLayout(new FlowLayout());
        btn = new Button("Colovaria");
        btn.addActionListener(this);
        add(btn);
        setSize(200, 150);
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent e) {
        Color c = getBackground();
        if (c.equals(Color.RED)) {
            setBackground(Color.GREEN);
        } else if (c.equals(Color.GREEN)) {
            setBackground(Color.BLUE);
        } else if (c.equals(Color.BLUE)) {
            setBackground(Color.CYAN);
        } else if (c.equals(Color.CYAN)) {
            setBackground(Color.MAGENTA);
        } else if (c.equals(Color.MAGENTA)) {
            setBackground(Color.YELLOW);
        } else {
            setBackground(Color.RED);
        }
    }
 
    public static void main(String args[]) {
        new ColorCycle();
    }
}