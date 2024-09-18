/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComponentss extends JPanel implements ActionListener 
{   
    JFrame f;
    JPanel p,p1,p2,p3,p4;
    
    JMenuBar mb;
    JMenu File,Help;
    JMenuItem i1,i2,i3;
    
    JButton b;
    JTextField f1,f2;  
    JLabel l1,l2;
    
    JCheckBox cb1,cb2,cb3;
    JRadioButton rb1,rb2,rb3;
    JComboBox c;
    ImageIcon img;
    
    public JComponentss()
    {
        f = new JFrame();
        p = new JPanel();   //main sheet
        p.setBackground(Color.YELLOW);
        p.setLayout(new GridLayout(3,2));
                 //----------------------------------------for making menuBar---
        
        p1 = new JPanel();
        l1 = new JLabel("Username");
        f1 = new JTextField();
        f1.setColumns(15);
        p1.add(l1);
        p1.add(f1);
        p.add(p1);
        
        p2 = new JPanel();
        l2 = new JLabel("Password");
        f2 = new JTextField();
        f2.setColumns(15);
        p2.add(l2);
        p2.add(f2);
        p.add(p2);
        
        p3 = new JPanel();
        b = new JButton("login");
        b.setBounds(65,10,90,30);
        b.addActionListener(this);
        img = new ImageIcon("");
        b.setIcon(img);
        p3.add(b);
        p.add(p3);
        
        
        p4 = new JPanel();
        cb1 = new JCheckBox("first time");
        cb2 = new JCheckBox("second time");
        cb3 = new JCheckBox("thrid charm");
        cb3.addActionListener(this);
        p4.add(cb1);
        p4.add(cb2);
        p4.add(cb3);
        
        
        rb1 = new JRadioButton("poof");
        rb2 = new JRadioButton("woof");
        rb3 = new JRadioButton("poop");
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        
        p4.add(rb1);
        p4.add(rb2);
        p4.add(rb3);
        p.add(p4);
        
        
        c = new JComboBox();
        int[]array={18,19,20,1000};
        for (int i = 0; i < 4; i++)
           {
                c.addItem(array[i]);
           }
        p4.add(c);

        this.add(p); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj==b)
        {
            System.out.print("iamDickHead");
        }
        if(obj==cb3)
        {
            System.out.print("fuckingWinner");
        }
    }
}
