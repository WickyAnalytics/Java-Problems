/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;

import javax.swing.*;

/**
 *
 * @author georg
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame t = new JFrame("test Panel");
        JComponentss g = new JComponentss();
        t.setVisible(true);
        t.setLocationRelativeTo(null);
        t.setSize(300,200);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.add(g);
        
        JMenuBar mb = new JMenuBar();
        JMenu File  = new JMenu("file");
        JMenu Help  = new JMenu("Help");
        JMenuItem i1 = new JMenuItem ("New Project");
        JMenuItem i2 = new JMenuItem ("Open Project");
        JMenuItem i3 = new JMenuItem ("Exit");
        
        mb.add(File);
        mb.add(Help);
        File.add(i1);
        File.add(i2);
        Help.add(i3);
        t.setJMenuBar(mb);
    }
    
}
