import java.util.Scanner;

enum Light 
{ 
	RED, GREEN, YELLOW;
	
} 
	   
public class MultiThreads extends Thread {
	  
	private Thread t;
	private Light color;
	private boolean flag = true;
	
	public MultiThreads(Light color) {
	
	     this.color=color;     	
   }
	
	public void stopThread() {
		flag=false;
		
	}
  
	public void run() {
		
		      try {
	      
		        while(flag) {
		        		        	
		        	 switch (color) 
		 	        { 
		 	        case RED: 
		 	          Thread.sleep(3000);
		 	          System.out.println("Light is Green - GO!"); 
		 	    
		 	        case GREEN: 
		 	          Thread.sleep(5000);
		 	          System.out.println("Light is Yellow - Beware!");
		 	          
		 	        case YELLOW: 
		 	          Thread.sleep(2000);
		 	          System.out.println("Light is Red - Stop!"); 
		 	        } 
		        	   
		         }
		         
		      } catch (InterruptedException e) {
		         System.out.println("Thread " +  color + " interrupted.");
		      }
		      System.out.println("Traffic Light Simulator is Done!");
	 }
	   
	   
	public void start () {
		   
		      if (t == null) {
		    	 t = new Thread(this);
		         t.start ();  
		   }
	  }
}
