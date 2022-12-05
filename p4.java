import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class MousePositionApplet extends Applet implements MouseMotionListener {
    int x, y;
    public void init() {
        addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }
    public void paint(Graphics g) {
        g.drawString("(" + x + "," + y + ")", 0, 10);
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 10, 10);
    }

    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("ShowCircle");

        // Create an instance of the applet
        MousePositionApplet applet = new MousePositionApplet();

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