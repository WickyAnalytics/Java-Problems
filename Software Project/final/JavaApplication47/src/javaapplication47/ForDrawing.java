/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author georg
 */
public class ForDrawing extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.RED);
        g.drawString("I Hate M Life, also this for the Finals", 10, 10);
        
        g.setColor(Color.MAGENTA);
        g.drawLine(20, 20, 100, 20);
        
        g.setColor(Color.CYAN);
        g.drawRect(40, 40, 50, 30);
        g.fillRect(40, 80, 50, 30);
        g.fillRoundRect(40, 120, 50, 30, 10, 10);
        
        g.setColor(Color.BLACK);
        int x[]={10,20,30,40,50};
        int y[]={60,70,80,90,100};
        g.drawPolygon(x,y,x.length);
        
        g.setColor(Color.yellow);
        g.drawLine(100, 100, 150, 200);
        g.drawLine(100, 100, 50, 200);
        g.drawLine(20, 200, 150, 200);
    }
}
