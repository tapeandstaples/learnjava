package pkg6.simplesnake;


import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SimpleSnake extends TimerTask implements KeyListener {
    private JFrame gameFrame;
    private Dimension gameFrameDimen = new Dimension(400,600);
    private Random randGen = new Random();
    private Snake s1;
    private Fruit f;
    
    private Body[] fullbody = new Body[100];
    private int score = 0;
    
    
    public SimpleSnake(){
        gameFrame = new JFrame("SimpleSnake");
        gameFrame.setSize(gameFrameDimen);
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setLayout(null);
        gameFrame.setVisible(true);
        gameFrame.addKeyListener(this);
        
        
        s1 = new Snake(300,100);
        gameFrame.add(s1);
        
        f = new Fruit(250,400);
        gameFrame.add(f);
        run();
        
    }
    public static void main(String args[]){
        
        SimpleSnake s = new SimpleSnake();
        
    }
    @Override
    public void run(){
        
        while(true){
            s1.update();
            if (fullbody[0]!=null){
                fullbody[0].update(s1.xpos,s1.ypos);
                for(int i=1; i<score;i++){
                    fullbody[i].update(fullbody[i-1].xpos,fullbody[i-1].ypos);
                }
            }
            boolean c = s1.check(f);
            if(c){
                int rx = randGen.nextInt(35);
                int ry = randGen.nextInt(55);
                fullbody[score]=new Body(s1.xpos,s1.ypos,s1.xpos,s1.ypos);
                score += 1;
                System.out.print(score);
                f.reset(rx*10,ry*10);
                gameFrame.add(fullbody[score-1]);
                
            }
            try {
                Thread.sleep(1000/24);
            } catch (InterruptedException ex) {
                Logger.getLogger(SimpleSnake.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    @Override
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case 37: s1.move(0); break;
            case 38: s1.move(3); break;
            case 39: s1.move(1); break;
            case 40: s1.move(2); break;
        }
        
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}