
package TextEditor;

/**
 *
 * @author Ben
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.Box;
import javax.swing.WindowConstants;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;


public class TextEditor{
    
    private JFrame mainFrame;
    private JPanel textPanel;
    
    private JTextArea textArea;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    
    private JMenuItem menuOpen;
    private JMenuItem menuSave;
    private JMenuItem menuQuit;
     
    public TextEditor(){
        generate();
    }
    
    private void generate(){
        mainFrame = new JFrame("SimpleTextEditor");
        mainFrame.setLayout(new FlowLayout());
    
        //mainFrame.setPreferredSize(new Dimension(600,400));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        textPanel = new JPanel();
        textPanel.setPreferredSize(new Dimension(590,300));
        textPanel.setLayout(new BorderLayout());
        
        textArea = new JTextArea();
       
        menuBar = new JMenuBar();
        
        fileMenu = new JMenu("File");
        menuOpen = new JMenuItem(new Open(textArea));
        menuSave = new JMenuItem(new Save(textArea));
        menuQuit = new JMenuItem(new Close());
        
        fileMenu.add(Box.createHorizontalGlue());
        fileMenu.add(menuOpen);
        fileMenu.add(menuSave);
        fileMenu.add(menuQuit);
        
        menuBar.add(fileMenu);
       
        textPanel.add(textArea);

        mainFrame.setJMenuBar(menuBar);
        mainFrame.add(textPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
        
        
    }
    public static void main(String args[]){
        TextEditor texteditor = new TextEditor();
    }
    
}
