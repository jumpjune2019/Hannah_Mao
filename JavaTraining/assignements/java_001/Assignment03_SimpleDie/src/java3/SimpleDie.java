package java3;


public class SimpleDie {

	
		int Num;
	
	  	  
	  //A method that will return the value of die 
		int rolldie() {
			
			Num=(int)Math.floor(Math.random()*(6-1+1)+1);
			
			 System.out.println("You have rolled a: "+ Num);
			 
	        return Num;
	                	
		}
		
	    void setNum(int NewNum) {
		   this.Num= NewNum;
			 	
		}
	    
	 
		
	 
}
