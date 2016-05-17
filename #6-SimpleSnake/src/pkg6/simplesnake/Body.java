/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.simplesnake;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Dimension;

public class Body extends JPanel {
    
    public int xpos;
    public int ypos;
    public int parent_xpos;
    public int parent_ypos;
    
    private Dimension size = new Dimension(10,10);
    
    public Body(int x, int y,int i,int j){
        xpos = x;
        ypos = y;
        parent_xpos = x;
        parent_ypos = y;
        this.setLocation(xpos, ypos);
        this.setBackground(Color.RED);
        this.setSize(size);
    }
    public void update(int i, int j){
        xpos = parent_xpos;
        ypos = parent_ypos;
        parent_xpos = i;
        parent_ypos = j;
        this.setLocation(xpos,ypos);
    }
    
}
