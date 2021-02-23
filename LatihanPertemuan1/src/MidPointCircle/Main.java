/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MidPointCircle;


import javax.swing.*;

/**
 *
 * @author Tufik
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("algoritma pembuat lingkaran");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Lingkaran gbr = new Lingkaran();
        gbr.setxc(150);
        gbr.setyc(250);
        gbr.setr(100);
        frame.add(gbr);
    }

}
