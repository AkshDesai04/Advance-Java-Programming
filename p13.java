import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ProductPriceGUI {
 
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button;
    private JComboBox<String> comboBox;
    private String[] items;
    private double[] prices;
    private JLabel priceLabel;
 
    public ProductPriceGUI() {
        items = new String[] {"Product 1", "Product 2", "Product 3"};
        prices = new double[] {10.00, 20.00, 30.00};
        frame = new JFrame("Product Price");
        panel = new JPanel();
        label = new JLabel("Select a product:");
        button = new JButton("Submit");
        comboBox = new JComboBox<String>(items);
        priceLabel = new JLabel("Price: ");
 
        frame.add(panel);
        panel.add(label);
        panel.add(comboBox);
        panel.add(button);
        panel.add(priceLabel);
 
        frame.setSize(400,200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
 
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = comboBox.getSelectedIndex();
                double price = prices[index];
                priceLabel.setText("Price: " + price);
            }
        });
    }
 
    public static void main(String[] args) {
        new ProductPriceGUI();
    }
}