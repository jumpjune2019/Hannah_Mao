package gridlayoutchallenge;


import java.awt.*;
import javax.swing.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	public static void centerAndSizeJFrameOnScreen(JFrame frm, int width, int height, BorderLayout layout) {
		// set the size of the frame to half in width and height
		frm.setSize(width/2, height/2);
		// here's the part where the JFrame gets actually centered
		frm.setLocationRelativeTo(null);
		
	
	}

	public static JFrame setFrameStuff(JFrame frm, int onExit, int width, int height) {
		
		// this will center and size the JFrame on screen
		// it will have a height and width of half the screen
		
		BorderLayout layout= new BorderLayout();
		
		centerAndSizeJFrameOnScreen(frm, width, height, layout);
		frm.setDefaultCloseOperation(onExit);
		
		          	
		JPanel paneltop= new JPanel();
		paneltop.add(new JLabel("Basic Matrix Demo"));
		
		JPanel panelbottom= new JPanel();
		JLabel selected = new JLabel("no seat selected ");
		panelbottom.add(selected,BorderLayout.PAGE_END);
		
		
		int column=(int) Math.floor(Math.random()*(5-2+2))+2; 
		int row=(int) Math.floor(Math.random()*(5-2+2))+2;
		
		
		
		JPanel panelgrid = new JPanel();
		GridLayout grid= new GridLayout(row,column);
		panelgrid.setLayout(grid);
		
		JPanel panelb= new JPanel();
		ButtonDemo kk = new ButtonDemo(panelb, " " , " "); 
		System.out.print(kk.getLabel());
		
		
		int sum=row*column+1;
		
        for(int i=1; i<sum;i++) {
           
    		ButtonDemo bd = new ButtonDemo();  	
           	JPanel panebutton= new JPanel();  
		    panelgrid.add(bd.getButtonPane(panebutton, "A-"+i,"A-"+i));     
		    
        }

		frm.add(paneltop);	
		frm.add(panelgrid);
	    frm.add(panelbottom);
		
		return frm;
		}
	

	public static void main(String[] args) {

	
	SwingUtilities.invokeLater(new Runnable() {
		SwingDemo demo;
		JFrame frm;
		
		public void run() {
			demo = new SwingDemo("Basic Matrix Demo");
			frm = demo.getFrame();
			frm = setFrameStuff(frm, JFrame.EXIT_ON_CLOSE, 2000, 1000);
			frm.setVisible(true);
		}
	});
	

	}

}