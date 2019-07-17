import java.util.Arrays;

public class IndexMatch {
	
	String SearchArray[];
	String key;
	boolean foundcase;
	int result=-1;
	

	int indexOfOccuranceInArray(String SearchArray[],String key, boolean foundcase) {
		
		if(foundcase==true) {
			for(int i=0; i< SearchArray.length; i++ ) {
			  
			    if((SearchArray[i]).equals(key)) {
			    	result=i;	
			    	break;
		    
			    }
			}
		}
		
		
		//case insensitive
		else if(foundcase==false) {
			
			for(int j=0; j< SearchArray.length; j++ ) {
				
			    
			    if((SearchArray[j].toUpperCase()).equals(key.toUpperCase())) {
			    	result=j;	
			    	break;
			    }
			}		
		}
		
		return result;
		
	}
	
}
