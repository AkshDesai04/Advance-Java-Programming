import java.awt.*;
import java.applet.*;
 
class CircleApplet extends Applet {
 
  public void paint(Graphics g) {
    // Applet size
    int width = 500;
    int height = 300;
 
    // Circle centered in applet with radius of 100 pixels
    int x = width / 2;
    int y = height / 2;
    int radius = 100;
 
    // Draw circle
    g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
 
    // Draw name
    g.drawString("Aksh Desai", x, y);
  }

  public static void main(String[] args) {
    // Create a frame
    Frame frame = new Frame("ShowCircle");
 
    // Create an instance of the applet
    CircleApplet applet = new CircleApplet();
 
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