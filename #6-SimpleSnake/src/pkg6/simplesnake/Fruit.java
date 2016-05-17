/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.simplesnake;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
public class Fruit extends JPanel {
    
    private JPanel fruit;
    private Dimension size = new Dimension(10,10);
    public int xpos;
    public int ypos;
    
    public Fruit(int x, int y){
        xpos = x;
        ypos = y; 
        
        super.setLocation(xpos, ypos);
        super.setSize(size);
        super.setBackground(Color.GREEN);
    }
    public void reset(int x, int y){
        xpos = x;
        ypos = y;
        super.setLocation(x,y);
    }
    
}
