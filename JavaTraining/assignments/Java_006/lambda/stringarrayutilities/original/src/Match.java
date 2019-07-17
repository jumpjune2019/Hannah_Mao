

public class Match {
	
	String SearchArray[];
	String key;
	boolean foundcase;
	boolean result=false;

	
	boolean arrayHasExactMatch(String SearchArray[],String key, boolean foundcase ) {
	
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

}
