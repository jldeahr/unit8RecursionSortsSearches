//********************************************************************
//  KochPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;
import java.util.Random;
import java.util.Scanner;

public class TreePanel extends JPanel
{
    private final int PANEL_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int PANEL_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();

    private final int BX = 500, BY = 475;
    private final int BX2 = 1100, BY2 = 475;

    private final int ANGLE1 = 0;
    private final int ANGLE2 = 45;
    private final int ANGLE3 = 90;
    private final int ANGLE4 = 135;
    private final int ANGLE5 = 180;
    private final int ANGLE6 = 225;
    private final int ANGLE7 = 270;
    private final int ANGLE8 = 315;

    private int current; //current order

    //-----------------------------------------------------------------
    //  Sets the initial fractal order to the value specified.
    //-----------------------------------------------------------------
    public TreePanel (int currentOrder)
    {
        current = currentOrder;
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    //-----------------------------------------------------------------
    //  Draws the fractal recursively. Base case is an order of 1 for
    //  which a simple straight line is drawn. Otherwise three
    //  intermediate points are computed, and each line segment is
    //  drawn as a fractal.
    //-----------------------------------------------------------------
    public void drawTree (int order, int x1, int y1, double angle, Graphics page)
    {
        if (order == 0)
        {

        }
        else
        {
            int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * order * 10);    
            int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * order * 10);

            page.drawLine(x1,y1,x2,y2);

            drawTree(order-1,x2,y2,angle+125,page);
            drawTree(order-1,x2,y2,angle-125,page);
        }
    }
    
    public void drawTree2 (int order, int x1, int y1, double angle, Graphics page)
    {
        if (order == 0)
        {

        }
        else
        {
            int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * order * 10);    
            int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * order * 10);

            page.drawLine(x1,y1,x2,y2);

            drawTree2(order-1,x2,y2,angle+20,page);
            drawTree2(order-1,x2,y2,angle-20,page);
        }
    }

    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawTree method.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);

        //each order is changed, each tree's color will change.

        page.setColor (randomColor());
        drawTree(current, BX, BY, ANGLE1, page);

        page.setColor (randomColor());
        drawTree(current, BX, BY, ANGLE2, page);

        page.setColor (randomColor());
        drawTree(current, BX, BY, ANGLE3, page);

        page.setColor (randomColor());
        drawTree(current, BX, BY, ANGLE4, page);

        page.setColor (randomColor());
        drawTree(current, BX, BY, ANGLE5, page);

        page.setColor (randomColor());
        drawTree(current, BX, BY, ANGLE6, page);

        page.setColor (randomColor());
        drawTree(current, BX, BY, ANGLE7, page);

        page.setColor (randomColor());
        drawTree(current, BX, BY, ANGLE8, page);
        
        page.setColor (randomColor());
        drawTree2(current, BX2, BY2, ANGLE1, page);

        page.setColor (randomColor());
        drawTree2(current, BX2, BY2, ANGLE2, page);

        page.setColor (randomColor());
        drawTree2(current, BX2, BY2, ANGLE3, page);

        page.setColor (randomColor());
        drawTree2(current, BX2, BY2, ANGLE4, page);

        page.setColor (randomColor());
        drawTree2(current, BX2, BY2, ANGLE5, page);

        page.setColor (randomColor());
        drawTree2(current, BX2, BY2, ANGLE6, page);

        page.setColor (randomColor());
        drawTree2(current, BX2, BY2, ANGLE7, page);

        page.setColor (randomColor());
        drawTree2(current, BX2, BY2, ANGLE8, page);
    }

    //-----------------------------------------------------------------
    //  Sets the fractal order to the value specified.
    //-----------------------------------------------------------------
    public void setOrder (int order)
    {
        current = order;
    }

    //-----------------------------------------------------------------
    //  Returns the current order.
    //-----------------------------------------------------------------
    public int getOrder ()
    {
        return current;
    }

    public Color randomColor()
    {
        Random rand = new Random();

        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();

        Color randomColor = new Color(r,g,b);
        return randomColor;
    }
}
