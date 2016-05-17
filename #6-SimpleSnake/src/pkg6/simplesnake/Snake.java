package pkg6.simplesnake;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Dimension;


public class Snake extends JPanel{
    private Dimension size = new Dimension(10,10);
    public int xpos = 0;
    public int ypos = 0;
    private int direction = 0; 
    
    
    
    public Snake(int x,int y){
        xpos = x;
        ypos = y; 
        super.setSize(size);
        super.setLocation(x, y);
        super.setPreferredSize(size);
        super.setBackground(Color.red);
        
    }
    public void move(int y){
        switch(y){
            case 0: direction=0; break;
            case 1: direction=1; break;
            case 2: direction=2; break;
            case 3: direction=3; break;
        }
    }
    public void update(){
        switch(direction){
            case 0: xpos-=10; break; 
            case 1: xpos+=10; break;
            case 2: ypos+=10; break;
            case 3: ypos-=10; break;
            
        }
        super.setLocation(xpos,ypos);
    }
    public boolean check(Fruit f){
        if(f.xpos==this.xpos&&f.ypos==this.ypos){
            return true;
        }else{
            return false;
        }
    }
}

