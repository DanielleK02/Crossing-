/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crossing;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 628953
 */
public class Road extends Character {
     
private int size;
private ImageIcon ii;
private Image img;
 
 


public Road(int size) {
this.size = size;
this.ii = new ImageIcon(getClass().getResource("/images/road.gif"));
this.img = ii.getImage();
}

 Road(int x, int y) {
     this(450);   
     this.x = x;
     this.y = y;
   
    }

    Road() {
        this(200); //To change body of generated methods, choose Tools | Templates.
    }


  
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);

}
          
}
