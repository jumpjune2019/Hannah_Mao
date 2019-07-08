package arrayutils;

public class ArrUtil {
	
	String SearchArray[];
	String key;
	boolean foundcase;
	
	public static boolean result=false;
	public static int resulti=-1;

	
	public static boolean arrayHasExactMatch(String SearchArray[],String key, boolean foundcase ) {
		result=false;
		//case sensitive
		if(foundcase==true) {
			
				for(int i=0; i< SearchArray.length; i++ ) {
			 
			    if((SearchArray[i]).equals(key)) {
			    	result=true;
			    	break;
			    	
			    }
			    
			}		
		}
		
		
		//case insensitive
		else if(foundcase==false) {
			
			for(int i=0; i< SearchArray.length; i++ ) {
			
			    
			    if((SearchArray[i].toUpperCase()).equals(key.toUpperCase())) {
			    	result=true;
			    	break;
			    	
			    }	        
			
			}		
			
		}
		
		return result;	
	}
	
	
	
 public static int indexOfOccuranceInArray(String SearchArray[],String key, boolean foundcase) {
	   resulti=-1;
		if(foundcase==true) {
			for(int i=0; i< SearchArray.length; i++ ) {
			  
			    if((SearchArray[i]).equals(key)) {
			    	resulti=i;	
			    	break;
		    
			    }
			}
		}
		
		
		//case insensitive
		else if(foundcase==false) {
			
			for(int j=0; j< SearchArray.length; j++ ) {
				
			    
			    if((SearchArray[j].toUpperCase()).equals(key.toUpperCase())) {
			    	resulti=j;	
			    	break;
			    }
			}		
		}
		
		return resulti;	
	}	

}
