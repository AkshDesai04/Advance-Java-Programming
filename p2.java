// Draw ten red circles in a vertical column in the center of the applet using java

//Graphic
import java.awt.*;
import javax.swing.*;

class TenRedCircles extends JApplet {
   public void paint(Graphics g) {
      for (int count = 0; count < 10; count++) {
         int x = getWidth()/2;
         int y = (count * 20) + 20;
         g.setColor(Color.red);
         g.fillOval(x, y, 15, 15);
      }
   }

   public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("TenRedCircles");
    
        // Create an instance of the applet
        TenRedCircles applet = new TenRedCircles();
    
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