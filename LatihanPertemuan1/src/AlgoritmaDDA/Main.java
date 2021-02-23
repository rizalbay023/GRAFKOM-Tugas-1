/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmaDDA;

import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author Taufik
 */

public class Main {
    public static void main (String[] args){
        
        JFrame frame = new JFrame ("Algoritma Garis Taufik");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dda dda = new Dda();
        Dda2 dda2 = new Dda2();
        Dda3 dda3 = new Dda3();
        Dda4 dda4 = new Dda4();
        Dda5 dda5 = new Dda5();
  
        dda.setx0(-5);
        dda.setx1(1);
        dda.sety0(5);
        dda.sety1(2);
       
        dda2.setx0(4);
        dda2.setx1(8);
        dda2.sety0(3);
        dda2.sety1(-2);
        
        dda3.setx0(2);
        dda3.setx1(5);
        dda3.sety0(3);
        dda3.sety1(3);
        
        dda4.setx0(2);
        dda4.setx1(2);
        dda4.sety0(3);
        dda4.sety1(5);
        
        dda5.setx0(6);
        dda5.setx1(2);
        dda5.sety0(4);
        dda5.sety1(1);
       
        frame.add(dda);
        frame.add(dda2);
        frame.add(dda3);
        frame.add(dda4);
        frame.add(dda5);
        
        frame.setLayout(new GridLayout(1,2,3,4));
        
//        jika ingin melihat satu satu tambahkan tanda (//)
        frame.setBounds(450,100,700,400);
        frame.setSize(600,480);
        frame.setVisible(true);
    }
}
