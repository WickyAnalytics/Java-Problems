/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob2;

import javax.swing.*;

/**
 *
 * @author georg
 */
public class prob2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        JFrame f = new JFrame("SNAKE GAME");
        f.add(new GamePanel());
        f.setVisible(true);
        f.setSize(600,600);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
    
}
