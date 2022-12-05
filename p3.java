import java.awt.*;
import java.applet.*;

class HorizontalRect extends Applet {

	public void paint(Graphics g) {
		int width = getSize().width;
		int height = getSize().height;
		
		int x = width / 2;
		int y = height / 2;
		
		g.setColor(Color.black);
		g.fillRect(x - 75, y - 25, 150, 50);
		
		for (int i = 0; i < 150; i++) {
			g.setColor(new Color(i, 0,i, 0));
			g.fillRect(x - 75 + i, y - 25, 1, 50);
		}
	}

    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("ShowCircle");

        // Create an instance of the applet
        HorizontalRect applet = new HorizontalRect();

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