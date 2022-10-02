import javax.swing.*;
import java.awt.*;

public class GUI extends Canvas
{
    
    public GUI()
    {
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

    public void paint(Graphics g) 
    {
        setBackground(Color.YELLOW);
        g.setColor(Color.BLUE);
        g.fillOval(0, 0, 100, 100);
        g.drawString("Arnab", 200, 200);
    }
    
    public static void main(String args[])
    {
        new GUI();
        
    }
}