/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditor;

import javax.swing.JTextField;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JDialog;
/**
 *
 * @author Maddy
 */
public class SaveFile extends AbstractAction{
    private JDialog d;
    private String mem;
    private JTextField filename;
    public SaveFile(String m, JDialog dialog, JTextField f){
        super("Save");
        mem = m;
        d = dialog;
        filename = f;
    }
    public void actionPerformed(ActionEvent e){
        File file = new File(filename.getText());
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(SaveFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            FileWriter write = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(write);
            bw.write(mem);
            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(SaveFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        d.dispose();
    }
}

