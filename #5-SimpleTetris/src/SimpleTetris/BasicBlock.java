/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleTetris;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class BasicBlock extends JPanel {
    private int xpos;
    private int ypos;
    private int size=24;
    
    public BasicBlock(int x, int y){
        xpos = x;
        ypos = y;
    }
    public void update(char d){
    
    }
    
    @Override
    public void paint(Graphics g){
        //super.paint(g);
        g.setColor(Color.red);
        g.drawRect(xpos, ypos, 24, 24); 
        g.fillRect(xpos, ypos, 24, 24);
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(240, 540); // appropriate constants
  }
}
