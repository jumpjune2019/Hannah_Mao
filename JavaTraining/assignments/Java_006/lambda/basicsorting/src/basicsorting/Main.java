package basicsorting;

import java.util.Arrays;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] numArr = {10,2,4,15,7,9,1,21};
		String[] strArr = {"claude", "Phil", "lois","clark","Arthur", "Mera","bruce"};
        
		System.out.printf("Initial String Array: %s", Arrays.toString(numArr)+'\n');
		
		//sorting array of integers in ascending and descending order
		MyTransform<Integer> sortIntArray = (v, o ,c)->{ 
			
	
			Integer[] array= new Integer[8];
			 
			for(int i=0;i<array.length;i++) {
				array[i]=v[i];
				
			}
			
			if(o==true) {       //true for sorting in ascending order
			 	
			Arrays.sort(array);
			}
			
		    if(o==false) {     //false for sorting in descending order
			
			Arrays.sort(array, Collections.reverseOrder()); 
				
		    }
					
			return array;
		};
		
		Integer[] array1 = sortIntArray.transform(numArr,true,true); //sort in ascending order
		Integer[] array2 = sortIntArray.transform(numArr,false,true); //sort in descending order
		
		System.out.printf("Sorted ASC: %s", Arrays.toString(array1)+'\n');
		System.out.printf("Sorted DESC: %s", Arrays.toString(array2)+'\n');
		  
    	System.out.printf("\n");
    	
    	System.out.printf("Initial String Array: %s", Arrays.toString(strArr)+'\n');
    		
    	//sorting array of strings in ascending order and descending with case sensitivity specified
    	MyTransform<String> ascStrArray = (v,o,c)->{
			
    		String[] array= new String[7];
    		
    		
			
    		if(c==true)	{    //if case sensitivity is on
    			for(int i=0;i<array.length;i++) {
    				array[i]=v[i];
    		}
    		  		
    		if(o==true) {       //true for sorting in ascending order
			 	
    			Arrays.sort(array);
    			}
    			
    		if(o==false) {     //false for sorting in descending order
    			
    			Arrays.sort(array, Collections.reverseOrder()); 
    				
    		}
    	}
    		
    		
    	
    		if(c==false) {  //if case sensitivity is off
    			for(int i=0;i<array.length;i++) {
    				array[i]=v[i].toLowerCase();	
    			}	
            
    			if(o==true) {       //true for sorting in ascending order
			 	
    				Arrays.sort(array);
    			}
    			
    			if(o==false) {     //false for sorting in descending order
    			
    				Arrays.sort(array, Collections.reverseOrder()); 		
    			}
    		}
    					
    			return array;
    					
		};	
		
		String[] array3= ascStrArray.transform(strArr,true,true);
		String[] array4= ascStrArray.transform(strArr,true,false);
		String[] array5= ascStrArray.transform(strArr,false,true);
		String[] array6= ascStrArray.transform(strArr,false,false);
		
		System.out.printf("Sorted ASC and CASE SENSITIVITY ON: %s", Arrays.toString(array3)+'\n');
		System.out.printf("Sorted ASC and CASE SENSITIVITY OFF: %s", Arrays.toString(array4)+'\n');
		System.out.printf("Sorted DESC and CASE SENSITIVITY ON: %s", Arrays.toString(array5)+'\n');
		System.out.printf("Sorted DESC and CASE SENSITIVITY OFF: %s", Arrays.toString(array6)+'\n');	
				
		
	}

}