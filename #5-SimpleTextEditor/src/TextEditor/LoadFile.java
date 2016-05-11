/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditor;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JTextArea;

/**
 *
 * @author Maddy
 */
public class LoadFile extends AbstractAction{
    private JDialog d;
    private JTextField filename;
    private JTextArea txt;
    private String tmp;
    private BufferedReader br; 
    
    public LoadFile(JDialog dialog, JTextField f, JTextArea m){
        super("Open");
        txt = m;
        d = dialog;
        filename = f;
    }
    public void actionPerformed(ActionEvent e){
        
        String fullfilename = filename.getText();
        try {
            br = new BufferedReader(new FileReader(fullfilename));
    
            try {
                while ((tmp = br.readLine())!=null){
                txt.append(tmp);
                txt.append("\n");
                }
            } catch (IOException ex) {
                Logger.getLogger(LoadFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        d.dispose();
    }
}
