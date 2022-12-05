import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
class MenuBarDemo extends JFrame implements ActionListener {
 
    JTextArea textArea;
    JMenuBar menuBar;
    JMenu fileMenu, editMenu;
    JMenuItem openItem, saveItem, copyItem, pasteItem;
 
    public MenuBarDemo() {
        setTitle("MenuBar Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Create Text Area
        textArea = new JTextArea();
        textArea.setBackground(Color.white);
        textArea.setEditable(true);
        add(textArea, BorderLayout.CENTER);
 
        // Create Menu Bar
        menuBar = new JMenuBar();
 
        // Create File Menu
        fileMenu = new JMenu("File");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        menuBar.add(fileMenu);
 
        // Create Edit Menu
        editMenu = new JMenu("Edit");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        menuBar.add(editMenu);
 
        // Add Menu Bar to Frame
        setJMenuBar(menuBar);
 
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == openItem) {
            textArea.append("Open menu item selected.\n");
        }
        else if(e.getSource() == saveItem) {
            textArea.append("Save menu item selected.\n");
        }
        else if(e.getSource() == copyItem) {
            textArea.append("Copy menu item selected.\n");
        }
        else if(e.getSource() == pasteItem) {
            textArea.append("Paste menu item selected.\n");
        }
    }
 
    public static void main(String[] args) {
        new MenuBarDemo();
    }
}