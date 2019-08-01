package preterm002;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import javax.swing.*;

public class Main implements ActionListener, ItemListener {
	   private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;
	   DefaultListModel listModel;
	   JList clientlist;
	   JButton resetbutton;
	   JButton printbutton;
	   int row=10;
	   int col=10;
	   int idxselect;
	   
	   JToggleButton[][] buttons = new JToggleButton[row][col];
	   JLabel[][] labels = new JLabel[row][col];
	   JLabel [] rowlabels= new JLabel[row];
	   JLabel [] collabels= new JLabel[row];
	  
	   String textlabel;
	   
	   Stack<Client> clientstack= new Stack<Client>();
	   DefaultListModel<Client> clients= new DefaultListModel<Client>();
	   
	   Vector<Seat> seatlist= new Vector<Seat>();
	
	   public Main(){
	      prepareGUI();
	   }
	  
	   private void prepareGUI(){
	      mainFrame = new JFrame("Grid Layout Example");
	      mainFrame.setSize(1200,800);
	      mainFrame.setLayout(new FlowLayout());
	      headerLabel = new JLabel("",JLabel.CENTER );
	      headerLabel.setPreferredSize(new Dimension(2000,10));
	         
	      // old school way to close a window
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	             // this is the way to force a java application to gracefully exit
	        	 // when not going to end via the main method entry point
	        	 System.exit(0);
	         }        
	      });  
	      
 
	      ClientStore myStore = new ClientStore("clients_list.csv");
		  Client[] store = myStore.getClientStore();	
		  
		  for(int i=0; i<store.length;i++) {
			 
			  clients.addElement(new Client(store[i].getClientLastName(),store[i].getClientFirstName(), store[i].getClientId()));
			  
		  }
		
		  clientlist = new JList(clients); 
		  clientlist.setCellRenderer(new DefaultListCellRenderer() {
	            @Override
	            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
	                Component renderer = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
	                if (renderer instanceof JLabel && value instanceof Client) {
	                   
	                    ((JLabel) renderer).setText(((Client) value).getFullname());
	                }
	                return renderer;
	            }
	        });
		  
	      JScrollPane scrollpanel =new JScrollPane(clientlist);
	      
	      resetbutton= new JButton("Reset Entire Matrix");
	      resetbutton.addActionListener(this);
	      
	      printbutton= new JButton("Print List of Assigned Clients in Console");
	      printbutton.addActionListener(this);
	     
	      controlPanel = new JPanel(); 
	      mainFrame.add(headerLabel,BorderLayout.PAGE_START);
	      
	     
	      controlPanel.add(scrollpanel,BorderLayout.LINE_START);
	      JLabel alignmenthelper = new JLabel("                                              ");
	      mainFrame.add(alignmenthelper);
	      
	      for (int k = 0; k < 10; k++) {
		 		 collabels[k]=new JLabel( "            Seat " + (k+1));
		 		   mainFrame.add(collabels[k],BorderLayout.LINE_START);
		      }
	      
	      mainFrame.add(controlPanel,BorderLayout.CENTER);
	      mainFrame.add(resetbutton,BorderLayout.PAGE_END);
	      mainFrame.add(printbutton,BorderLayout.PAGE_END);
	   
	      mainFrame.setVisible(true);  
	   	}
	   
	   private void showGridLayoutDemo() throws NullPointerException {
		   
	      headerLabel.setText("My Matrix Demo");      
	     
	      JPanel panel = new JPanel();
	     
	      GridLayout layout = new GridLayout(row,col);
	      layout.setHgap(10);
	      layout.setVgap(10);
	      panel.setLayout(layout);
	     
	      textlabel="book";
	     
	      for (int i = 0; i < buttons.length; i++) {
	    	  
	    	   rowlabels[i]= new JLabel("row " + (char)('A'+i));
	    	   panel.add(rowlabels[i]);
	    	  
	    	  for (int j = 0; j < buttons[i].length; j++) {
	    		  
	    		  buttons[i][j] = new JToggleButton(textlabel);
	    		  
	    		  labels[i][j]= new JLabel("vacant");
	    		  buttons[i][j].addActionListener(this);
	    		  buttons[i][j].addItemListener(this);
	    		  buttons[i][j].setPreferredSize(new Dimension(80, 30));
	    		  buttons[i][j].putClientProperty("row", i);
	    		  buttons[i][j].putClientProperty("col", j);
	    		  
	    		  JPanel panelbutton= new JPanel();
	    		  
	    		  BoxLayout layout1 = new BoxLayout(panelbutton,BoxLayout.Y_AXIS);
	       	      panelbutton.setLayout(layout1);
	       	      panelbutton.setSize(50,50);
	    		  
	       	      panelbutton.add(labels[i][j]);
	    		  panelbutton.add(buttons[i][j]);
	    		  panelbutton.setBackground(Color.green);
	    		  
	    		  panel.add(panelbutton);
	    		    
	    	  } 
	    	  
	        }
	      
	      controlPanel.add(panel); 
	      
	      
	      mainFrame.setVisible(true);
	       
	   }
	   
	   
	   public void actionPerformed(ActionEvent ae) {
		     
		   int idx = clientlist.getSelectedIndex();
		   Object selection = clientlist.getSelectedValue(); 
		
		   Object source =  ae.getSource();
		  
              //for JToggle buttons action event
		   if (source instanceof JToggleButton) { 
		    	  
		    	  JToggleButton btn= (JToggleButton) ae.getSource();
		    	  int clickedindexr=(int) btn.getClientProperty("row");
		    	  int clickedindexc=(int) btn.getClientProperty("col");
		    	 
			   //Booking an event (Will assign the client and remove the client from JList)
		    	  if (ae.getActionCommand().equals("unbook")) { 
		    		  
		    		  
		    		  for (int i=0; i<clients.size();i++) {
		    			             
		    			  if (idx==i) {  
		    		           	    		          
				    		  labels[clickedindexr][clickedindexc].setText(clients.get(i).getInitialIDString()); //assign client to seat
				    		  
				    		  //String bookclient= labels[clickedindexr][clickedindexc].getText();
				    		  
				    		  clientstack.push(clients.get(i));
				    		    
				    		  seatlist.add(new Seat(clients.get(i).getFullname(),clients.get(i).getClientId(), clickedindexr, clickedindexc));
				          
				    		  clients.remove(i); //remove client from Jlist
				                  
		                }
		    		 }           
			      }
			  
			   //Unbooking an event (Return the client to the JList and return seat as "vacant" and "book")
		    	  else if (ae.getActionCommand().equals("book")) {
					
					String selected =labels[clickedindexr][clickedindexc].getText();
					
//					for (int i=0; i<clients.size();i++) {
//						System.out.println(clients.get(i).getInitialIDString());
//						
//					}
						
						if(!clients.contains(selected)) { //if the client is not in the JList
							
							Client obj = clientstack.pop();
							
							clients.add(0,obj);  //add the client back to JList
						
							labels[clickedindexr][clickedindexc].setText("vacant");
					
					   }	
		    	 }  	 	  
		    }   	  
	    	  
	    
		   //for JButton action events
		   if (source instanceof JButton) { 
			     
			   if (ae.getActionCommand().equals("Reset Entire Matrix")) { 
				   
				   for (int i = 0; i < buttons.length; i++) {
		    			  for (int j = 0; j < buttons[i].length; j++) {
				    			
				    		  labels[i][j].setText("vacant"); //vacant client
				    		  buttons[i][j].setText(textlabel); //reset button labels to "book"
				          }
				      }
				   
				  
				   while (!clientstack.empty()) {
					 
					   Client obj = clientstack.pop();
					   clients.add(0,obj);
				   }    
			   }
			      
			   if (ae.getActionCommand().equals("Print List of Assigned Clients in Console")) { 
				      
				   	 System.out.println("- display list of clients with seat assignment\n");
					
					 System.out.printf( "%-30s %-30s %-30s\n","Client","ID","Seat");
					 //print horizontal line
					   for(int x = 0; x < 70; x++)
					    {
					        System.out.print("-");
					    }
					   
					    System.out.print("\n");
					 
					for (int k=0;k<seatlist.size();k++) {
						
						String fullname=seatlist.get(k).getFullname();
						String id=seatlist.get(k).getID();
						String seat=seatlist.get(k).getSeat();
					    System.out.printf("%-30s %-30s %-30s\n", fullname, id, seat);
						 
					}	
					System.out.println();		   
			   }  
		   }      
	   }
	   
		public void itemStateChanged(ItemEvent e) {
			
			JToggleButton btn = (JToggleButton) e.getItem();
			if(btn.isSelected()) {
				btn.setText("unbook");
			} else {
				btn.setText("book");
			}	
		}
	 
		public static void main(String[] args) {
	
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					Main gridLayoutDemo = new Main();  
					gridLayoutDemo.showGridLayoutDemo();
				}
			});
		}
}
