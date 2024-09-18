/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/**
 *
 * @author georg
 */
public class GamePanel extends JPanel implements ActionListener
{
final int screen_w=600;
final int screen_h=600;
final int unit_size=25;
final int game_units = (screen_w*screen_h)/unit_size;
final int x[]= new int[game_units];
final int y[]= new int[game_units];

int bodyparts=3;
int appleseaten;
int appleX,appleY;
boolean running = false;
Random rnd = new Random();
char direction='R';

//constructor
GamePanel()
{
    this.setPreferredSize(new Dimension(screen_w,screen_h));    //intisial ise 600,600
    this.setBackground(Color.BLACK);
    this.setFocusable(true);
    this.addKeyListener(new mykey());
    startgame();
}

public void startgame()
{
    newapple();
    running=true;
    Timer tm = new Timer(100,this);
    tm.start();
}

public void paintComponent(Graphics g){
    super.paintComponent(g);
    
        //grid background of unit size
    for(int i = 0; i<screen_h/unit_size;i++)
    {
        g.drawLine(i*unit_size, 0, i*unit_size, screen_h);
        g.drawLine(0, i*unit_size, screen_w, i*unit_size);    //this will loop to make it grids of size 25
    }
        //apple
        g.setColor(Color.RED);
        g.fillRect(appleX, appleY, unit_size, unit_size);
        //snake body
        g.setColor(Color.GREEN);
    for(int i=0; i<bodyparts;i++)
    {
        g.fillRect(x[i], y[i], unit_size, unit_size);
    }
        //score
        g.setColor(Color.yellow);
        g.drawString("Score: "+appleseaten, 250, 50);
}

public void newapple()
{
    appleX= rnd.nextInt((int) (screen_w/unit_size)*unit_size);  //number can be random with the screen and add to be 25
    appleY= rnd.nextInt((int) (screen_h/unit_size)*unit_size);
}
public void checkapple(){
    if((x[0] == appleX) && (y[0] == appleY))
    {
        bodyparts++;
        appleseaten++;
        newapple();
    }
}

    
    public void move()
    {
        for(int i =bodyparts; i>0 ; i--)
        {
            x[i]= x[i-1];
            y[i]= y[i-1];
        }
        switch (direction)
        {
            case 'U':
                y[0]=y[0]-unit_size;
                break;
            case 'D':
                y[0]=y[0]+unit_size;
                break;
            case 'L':
                x[0]=x[0]-unit_size;
                break;   
            case 'R':
                x[0]=x[0]+unit_size;
                break;
        }
    }
    public void checkborders(){
        if(x[0] < 0){
            running = false;
            JOptionPane.showMessageDialog(null,"you hit the borders you loser!");
          System.exit(0);
        }
        if(x[0] < screen_w){
            running = false;
            JOptionPane.showMessageDialog(null,"you hit the borders you loser!");
          System.exit(0);
        }
        if(y[0] < 0){
            running = false;
            JOptionPane.showMessageDialog(null,"you hit the borders you loser!");
          System.exit(0);
        }
        if(y[0] < screen_h){
            running = false;
            JOptionPane.showMessageDialog(null,"you hit the borders you loser!");
          System.exit(0);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(running)
        {
            move();
            checkapple();
           // checkborders();     //--->problem in checkborder and the score counter
        }
        repaint();      //every 100ms (timer) it going to repaint
    }
    
    public class mykey extends KeyAdapter
    {
        @Override
        public void keyPressed (KeyEvent ae){
            switch(ae.getKeyCode())
            {
                case KeyEvent.VK_UP:
                    direction = 'U';
                    break;
                case KeyEvent.VK_DOWN:
                    direction = 'D';
                    break;
                case KeyEvent.VK_LEFT:
                    direction = 'L';
                    break;
                case KeyEvent.VK_RIGHT:
                    direction = 'R';
                    break;    
            }
        }
    }
}
