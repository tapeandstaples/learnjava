/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditor;
import javax.swing.JDialog;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
/**
 *
 * @author Maddy
 */
public class Cancel extends AbstractAction{
    private JDialog d;
    public Cancel(JDialog dialog){
        super("Cancel");
        d = dialog;
        
    }
    
    public void actionPerformed(ActionEvent e){
        d.dispose();
    }
}
