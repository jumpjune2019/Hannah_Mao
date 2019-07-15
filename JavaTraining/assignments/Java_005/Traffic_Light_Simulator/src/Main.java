import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	
	public static boolean dealWithInput(String ch) {
    	if((ch.equals(""))) {
    		
    		return true;
    	}else {
    			return false;
    		}
  	
	}
	

	public static void main(String[] args)throws java.io.IOException {
		    
		System.out.println("Traffic Light Simulator is a Go!");
		MultiThreads T1 = new MultiThreads(Light.RED);
	    T1.start();
	   
	    boolean flag= false;
	    
		while(flag==false) {
		
		  Scanner br = new Scanner(System.in);
 		  String input =  br.nextLine();

		    if(dealWithInput(input)) {
		    	T1.stopThread();
		    }
		    
		} 
 
	}        
	  
}

