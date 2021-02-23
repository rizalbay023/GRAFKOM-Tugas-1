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
 * @author Suryo Santoso
 */
public class Bresenham extends JPanel {
    private int x0,y0,x1,y1;
    
    public Bresenham(){
        
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
        int x,y,xend;
        int dx = Math.abs(x0-x1);
        int dy = Math.abs(y1-y0);
        int p = 2*dy-dx;
        int duady = 2*dy;
        int duadydx = 2*(dy-dx);
        if (x0>x1) {
            x = x1;
            y = y1;
            xend = x0;
        } else {
            x = x0;
            y = y0;
            xend = x1;
        }
        
       
        g.drawRect(x, y, 4, 4);
        while(x<xend) {
            x++;
            if(p<0) {
                p+=duady;
            } else {
                if (y0>y1) {
                    y--; } else y++;
                p+=duadydx;
            }
            g.drawRect(x, y, 4, 4);
        }
    }
}
