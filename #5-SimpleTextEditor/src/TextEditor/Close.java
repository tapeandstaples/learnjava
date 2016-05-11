/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditor;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
/**
 *
 * @author Maddy
 */
public class Close extends AbstractAction{
    public Close(){
        super("Close");
    }
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}
