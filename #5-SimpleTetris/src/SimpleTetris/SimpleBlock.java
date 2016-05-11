/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleTetris;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.FlowLayout;

/**
 *
 * @author Maddy
 */
public class SimpleBlock extends JPanel{
    private int size = 24;
    private int xpos;
    private int ypos;
    
    public SimpleBlock(int x, int y){
        xpos = x;
        ypos = x; 
    }
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(Color.yellow);
        g.drawRect(xpos, ypos, size, size);
        g.fillRect(xpos, ypos, size, size);
        g.dispose();
    }
    
    public void update(char d){
        if(d=='l'){
            xpos+=size;
        }else if(d=='r'){
            xpos-=size;
        }
    }
}
