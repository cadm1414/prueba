package prb;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class PanelTab extends JPanel{    
        
    public PanelTab(JTabbedPane pestania, int op){
        if(pestania != null){            
             setOpaque(false);
             JLabel titulo = new JLabel(){
               public String getText(){
                   int i = pestania.indexOfTabComponent(PanelTab.this);                   
                   if(i!=-1){
                       return pestania.getTitleAt(i);
                   }
                   return null;
               }  
             };
             add(titulo);             
             JButton button = new BotonX(pestania,this,op);
             add(button);
        }
    }

   
    
}
