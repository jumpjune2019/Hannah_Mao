
public class Dice {

	int die1;
	int die2;
	
	public Dice(int x, int y){
		
		this.die1=x;
		this.die2=y;
		
	}
	
	public Dice() {
		
	}
	
	  
	  //A method that will return the value of die 
		int rollfirstdie() {
			
			die1=(int) Math.floor(Math.random()*(6-1+1)+1);
			
			// System.out.println("You have rolled a: "+ Num);
			 
	        return die1;
	                	
		}
		
		int rollseconddie() {
			
			die2=(int) Math.floor(Math.random()*(6-1+1)+1);
			
			// System.out.println("You have rolled a: "+ Num);
			 
	        return die2;
	                	
		}
		
	    void setDie1(int x) {
		   this.die1= x;
		  
			 	
		}
	    
	    
	    void setDie2( int y) {
			
	    	this.die2= y;
				 	
		}
	

}
