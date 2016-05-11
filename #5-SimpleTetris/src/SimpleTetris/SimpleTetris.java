
package SimpleTetris;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SimpleTetris extends KeyAdapter{
    
    JFrame board;
    JPanel gameArea;
    JPanel scoreArea;
    
    SimpleBlock b1;
        
    public static void main(String args[]){
        SimpleTetris simpletetris = new SimpleTetris();
    }
    
    public SimpleTetris(){
        loadBoard();
    }
    
    private void loadBoard(){
        //Define Board
        board = new JFrame("Simple Tetris");
        board.setSize(400,600);
        board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board.setLayout(new FlowLayout());
        board.addKeyListener(this);
        //Define Panels
        gameArea = new JPanel();
        gameArea.setLocation(10, 10);
        gameArea.setPreferredSize(new Dimension(240,550));
        
        scoreArea = new JPanel();
        scoreArea.setLocation(260,10);
        scoreArea.setPreferredSize(new Dimension(130,550));
        
        gameArea.setBackground(Color.white);
        scoreArea.setBackground(Color.white);
        
        SimpleBlock b1 = new SimpleBlock(0,0);
        
        
        
        board.add(gameArea);
        board.add(scoreArea);
        
        gameArea.add(b1);
        
        
        board.setVisible(true);
    }
    @Override
    public void keyPressed(KeyEvent e){
        int keycode = e.getKeyCode();
        switch(keycode){
            case KeyEvent.VK_LEFT: b1.update('l');
                break;
            case KeyEvent.VK_RIGHT: b1.update('r');
                break;
            }
        gameArea.setVisible(false);
        
        gameArea.setVisible(true);
        
    }
    
}
