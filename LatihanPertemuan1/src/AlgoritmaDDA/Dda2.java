/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmaDDA;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Taufik
 */

    public class Dda2 extends JPanel{
    //untuk memasukkan x dan y
    private int x0,y0,x1,y1;
    
    public Dda2(){
        
    }
      public void setx0 (int x0){
        this.x0 = x0*100;
    }
    public void setx1 (int x1){
        this.x1 = x1*100;
    }
    public void sety0 (int y0){
        this.y0 = y0*100;
    }
    public void sety1 (int y1){
        this.y1 = y1*100;
    }
    
    @Override
     public void paint(Graphics g) {
        int dx = x0-x1;
        int dy = y0-y1;
        int steps,k; 

        float x=x1;
        float y=y1;
        float x_inc,y_inc;
        

        super.paint(g);
        this.setBackground(Color.CYAN);
        g.setColor(Color.BLACK);

        if(Math.abs(dx)>Math.abs(dy)) steps = Math.abs(dx);
        else steps = Math.abs(dy);

        x_inc = dx/(float)steps;
        y_inc = dy/(float)steps;

        g.drawRect(Math.round(x), Math.round(y), 10, 10);
        for(k=0;k<steps;k++) {
            x+=x_inc;
            y+=y_inc;
            g.drawRect(Math.round(x), Math.round(y), 10, 10);
        }
    }

}
