/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmaDasar;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author UMBU INNO
 */
public class Main {
        public Main() {
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("algoritma garis Taufik");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Bresenham grs = new Bresenham();
//        untuk membuktikan di grafik anda bisa mengganti tanda didalam ();
        grs.setx0(2);
        grs.sety0(3);
        grs.setx1(5);
        grs.sety1(3);
        grs.setBackground(Color.BLUE);
        
        frame.add(grs);
        frame.setSize(600,400);
        frame.setVisible(true);
        
    }
}
