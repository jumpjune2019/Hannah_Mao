public class PairDice {

	double die1;
	double die2;
	
	public PairDice(double x, double y){
		
		this.die1=x;
		this.die2=y;
		
	}
	
	public PairDice() {
		
	}
	
	  
	  //A method that will return the value of die 
		double rollfirstdie() {
			
			die1=Math.floor(Math.random()*(6-1+1)+1);
			
			// System.out.println("You have rolled a: "+ Num);
			 
	        return die1;
	                	
		}
		
		double rollseconddie() {
			
			die2=Math.floor(Math.random()*(6-1+1)+1);
			
			// System.out.println("You have rolled a: "+ Num);
			 
	        return die2;
	                	
		}
		
	    void setDie1(double x) {
		   this.die1= x;
		  
			 	
		}
	    
	    
	    void setDie2( double y) {
			
	    	this.die2= y;
				 	
		}

}
