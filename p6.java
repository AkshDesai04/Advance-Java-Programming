import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
class MouseListenerExample extends JApplet implements MouseListener
{
    private JLabel label;
    private int x, y;
 
    public void init()
    {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.addMouseListener(this);
 
        label = new JLabel();
        label.setText("No Mouse Event");
        contentPane.add(label);
    }
 
    public void mousePressed(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        label.setText("Mouse Pressed at (" + x + ", " + y + ")");
    }
 
    public void mouseReleased(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        label.setText("Mouse Released at (" + x + ", " + y + ")");
    }
 
    public void mouseClicked(MouseEvent e) { }
 
    public void mouseEntered(MouseEvent e) { }
 
    public void mouseExited(MouseEvent e) { }

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("MouseListenerExample");

        // Create an instance of the applet
        MouseListenerExample applet = new MouseListenerExample();

        // Add the applet instance to the frame
        frame.add(applet, BorderLayout.CENTER);

        // Invoke init() and start()
        applet.init();
        applet.start();

        // Display the frame
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}