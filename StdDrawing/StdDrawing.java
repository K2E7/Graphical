package StdDrawing;

import java.awt.*;

public class StdDrawing extends Canvas
{
    //public class Grid extends Canvas
    //{
        int originX, originY;
        int height, width;

        Color baseDark = new Color(48,48,48);
        public void paint(Graphics g)
        {
            setBackground(baseDark);
            g.setColor(Color.white);
            g.drawString("Hello World", 10, 10);
        }
    //}
}