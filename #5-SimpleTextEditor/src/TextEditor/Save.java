/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditor;
import javax.swing.JTextArea;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
/**
 *
 * @author Maddy
 */
public class Save extends AbstractAction{
    JTextArea mem;
    public Save(JTextArea m){
        super("Save");
        mem = m;
        
    }
    public void actionPerformed(ActionEvent e){
        FileExplorer fileexplorer = new FileExplorer("Save",mem);
    }
}

