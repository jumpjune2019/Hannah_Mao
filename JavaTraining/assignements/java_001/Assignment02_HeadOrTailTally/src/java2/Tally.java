package java2;

public class Tally {
	
	
	int countHead;
	int countTail;
	
	//int tally[] = new int[2];

	int Num;
	String result;
	  	  
	  //A method that will return the value of 1 or 2
	int flip() {
			
			Num=(int)Math.floor(Math.random()*(2-1+1)+1);
			 
	        return Num;
	        	
	}
		
	void setNum(int NewNum) {
	this.Num= NewNum;
			 	
	}
		
	    //A method that will assign head if "1" is passed, tail if "2" is passed.
	void Flipresult(String result) {
			
		if(Num==1.0) {
				
				result="Head";
				
				System.out.println("The Coin flip is: "+ result);
				
		}
			
		if(Num==2.0) {
				 
				 result="Tail";
				 
				 System.out.println("The Coin fip is: "+result);
				 	
			}		
			
		}	

}