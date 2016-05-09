package pkg3.helloworldgui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class HelloWorldGUI{
    private JFrame mainFrame;
    private JLabel msg;
        
    public static void main(String args[]){
        HelloWorldGUI hello = new HelloWorldGUI();
        hello.showGUI();
    }
    public HelloWorldGUI(){
        generateGUI();
    }
    private void generateGUI(){
        mainFrame = new JFrame("HelloWorldGUI");
        mainFrame.setSize(400,400);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        msg = new JLabel("Hello World",JLabel.CENTER);
        mainFrame.add(msg);
    }
    private void showGUI(){
        mainFrame.setVisible(true);
    }
}