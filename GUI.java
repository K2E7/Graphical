import javax.swing.*;
import java.awt.*;
//import StdDrawing.*;

public class GUI
{
    //StdDrawing std;
    public GUI()
    {
        UX ux = new UX();
        ux.setSize(800,800);
        
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

    //--------------------------------------------------------------------------------------------------------------
    public class UX extends Canvas
    {
        int originX, originY;
        int height, width;
    // font

        public void paint(Graphics g) 
        {
            g.setColor(Color.BLACK);
            Font font = new Font("Arial", Font.PLAIN, 20);
            g.setFont(font);
            g.drawString("Hello", 40, 40);
        }
    }
}   