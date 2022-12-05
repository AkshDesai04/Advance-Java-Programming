import javax.swing.*;
import java.awt.event.*;

class MyApplet extends JApplet 
{
  JButton startButton;
  
  public void init()
  {
    startButton = new JButton("Start");
    startButton.addActionListener(new ButtonListener());
    add(startButton);
  }
  
  class ButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
        if (startButton.getText().equals("Start")) 
        {
            startButton.setText("Stop");
        }
        else 
        {
            startButton.setText("Start");
        }
    }
  }
  public static void main(String[] args) {
    // Create a frame
    JFrame frame = new JFrame("MyApplet");

    // Create an instance of the applet
    MyApplet applet = new MyApplet();

    // Add the applet instance to the frame
    frame.add(applet);

    // Invoke init() and start()
    applet.init();
    applet.start();

    // Display the frame
    frame.setSize(500, 300);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}