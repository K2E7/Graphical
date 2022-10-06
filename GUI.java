import javax.swing.*;
import java.awt.*;
import StdDrawing.*;

public class GUI extends Canvas
{
    StdDrawing std;
    public GUI()
    {
        std = new StdDrawing();
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(0,0,1000,1000));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Testing GUI");
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String args[])
    {
        new GUI();
        
    }
}