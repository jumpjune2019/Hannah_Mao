package gridlayoutchallenge;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Main  implements ActionListener {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public Main(){
      prepareGUI();
   }
   
   
   private void prepareGUI(){
      mainFrame = new JFrame("Grid Layout Example");
      mainFrame.setSize(600,600);
      mainFrame.setLayout(new FlowLayout());
      headerLabel = new JLabel("",JLabel.CENTER );
     
      statusLabel = new JLabel("",JLabel.CENTER);  
      
      headerLabel.setPreferredSize(new Dimension(1000,10));
      statusLabel.setPreferredSize(new Dimension(1000,10));
      
      // old school way to close a window
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
             // this is the way to force a java application to gracefully exit
        	 // when not going to end via the main method entry point
        	 System.exit(0);
         }        
      });  
      
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());
     //controlPanel.setPreferredSize(new Dimension(1000,1000));

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   
   private void showGridLayoutDemo() throws NullPointerException {
	   
      headerLabel.setText("Basic Matrix Demo");      
      statusLabel.setText("No Seat Selected");
      JPanel panel = new JPanel();
      panel.setBackground(Color.CYAN);
      //panel.setSize(1000,1000);
      
      int col=(int) Math.floor(Math.random()*(5-2+2))+2; 
	  int row=(int) Math.floor(Math.random()*(5-2+2))+2;
	  
      GridLayout layout = new GridLayout(row,col);
      layout.setHgap(10);
      layout.setVgap(10);
      panel.setLayout(layout);
       
      JButton[][] buttons = new JButton[row][col];
      JLabel[][] labels = new JLabel[row][col];
      int count=0;
      String prefixLabel = "A- ";
    
      for (int i = 0; i < buttons.length; i++) {
    	  for (int j = 0; j < buttons[i].length; j++) {
    		  
    		  buttons[i][j] = new JButton(prefixLabel.concat(Integer.toString(count + 1)));
    		  labels[i][j]= new JLabel(prefixLabel.concat(Integer.toString(count + 1)));
    		  buttons[i][j].addActionListener(this);
    		  
    		  JPanel panelbutton= new JPanel();
    		  
    		  BoxLayout layout1 = new BoxLayout(panelbutton,BoxLayout.Y_AXIS);
       	      panelbutton.setLayout(layout1);
       	      panelbutton.setSize(50,50);
    		  
       	      panelbutton.add(labels[i][j]);
    		  panelbutton.add(buttons[i][j]);
    		  
    		  
    		  panel.add(panelbutton);
    		  count++;
    		  
    	  } 
      }
      
      controlPanel.add(panel);
      
      mainFrame.setVisible(true);  
   }
 
   public void actionPerformed(ActionEvent ae) {
	   statusLabel.setText(ae.getActionCommand());
   }
   
   public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Main gridLayoutDemo = new Main();  
			    gridLayoutDemo.showGridLayoutDemo();
			}
	  });      
   }
}