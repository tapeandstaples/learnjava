package pkg4.basiccalculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class BasicCalculator implements ActionListener{
    private JFrame mainFrame;
            
    private JTextArea answer; 
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonp;
    private JButton buttonm;
    private JButton buttone;
    private JButton buttonc; 
        
    private String MEMORY = "";
       
    
    public static void main(String args[]){
        BasicCalculator basiccalculator = new BasicCalculator();
        basiccalculator.refreshCalculator();
        
    }
    public BasicCalculator(){
        generateCalculator();
    }
    private void generateCalculator(){
        mainFrame = new JFrame("Basic Calculator");
        mainFrame.setSize(400,400);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout(4,4));
        
        
        answer = new JTextArea(MEMORY); 
    
        
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonp = new JButton("+");
        buttonm = new JButton("-");
        buttone = new JButton("=");
        buttonc = new JButton("AC");
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonp.addActionListener(this);
        buttonm.addActionListener(this);
        buttone.addActionListener(this);
        buttonc.addActionListener(this);
        
        mainFrame.add(answer);
        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(button5);
        mainFrame.add(button6);
        mainFrame.add(button7);
        mainFrame.add(button8);
        mainFrame.add(button9);
        mainFrame.add(buttonp);
        mainFrame.add(buttonm);
        mainFrame.add(buttone);
        mainFrame.add(buttonc);
            
               
    }
    private void refreshCalculator(){
        mainFrame.setVisible(true);
    }
    private void parseMemory(){
        int val=0;
        String temp = "";
        for(int i=0;i<MEMORY.length();i++){
            if(MEMORY.charAt(i)=='+'||MEMORY.charAt(i)=='-' && temp.length()>0){
                val+=Integer.parseInt(temp);
                temp=""+MEMORY.charAt(i);
            }else{
            temp += MEMORY.charAt(i);
            }            
        }
        val+=Integer.parseInt(temp);
        MEMORY=String.valueOf(val);
        answer.setText(MEMORY);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==buttone){
            if (MEMORY.length()==0){
                MEMORY=answer.getText();
            }
            parseMemory();
        }else if (e.getSource()==buttonc){
            MEMORY="";
            answer.setText(MEMORY);
        }else{
            MEMORY=MEMORY+(((JButton) e.getSource()).getText());
            answer.setText(MEMORY);
        }
    }
}