/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditor;
import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.FlowLayout;
/**
 *
 * @author Maddy
 */
public class FileExplorer{
    
    JDialog dialog;
    JTextField filename;
    JButton okay;
    JButton cancel;
    String mem;
    
    public FileExplorer(String s,JTextArea m){
        generate(s, m);
    }
    private void generate(String s, JTextArea m){
        dialog = new JDialog();
        dialog.setLayout(new FlowLayout());
        filename = new JTextField(".txt");
        filename.setPreferredSize(new Dimension(300,20));
        
        
        if(s=="Save"){
            mem = m.getText();
            okay = new JButton(new SaveFile(mem,dialog,filename));
        }else if(s=="Open"){
            okay = new JButton(new LoadFile(dialog,filename,m));
        }
        
        cancel = new JButton(new Cancel(dialog));
        
        dialog.add(filename);
        dialog.add(okay);
        dialog.add(cancel);
        
        dialog.pack();
        dialog.setVisible(true);
    }
    
}
