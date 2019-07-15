package arraySwap;

public class genSwap {

	 public static <T> void swap(T[] a, int i, int j) {
	        T temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	    }
	 
	 
	 
	 public static void main(String[] args) {

	
		 Integer[] Array = new Integer[]{ 1,4,3,2,5 }; 
		 
		 swap(Array, 1, 3);
		 
		 //expected output should be "1,2,3,4,5"
		
		 for (int i = 0; i < Array.length; i++) {
			 
			 System.out.print( Array[i] + " ");	 
	
	     }
		 
		 System.out.print( "\n\n");
		 
		 
		 //swap the word "to" and "like"
		 String[] StrArray = new String[]{ "I","to","like","code"}; 
		 
		 swap(StrArray, 1, 2);
		 
		 //expected output should be "I like to code"
		 
            for (int i = 0; i < StrArray.length; i++) {
			 
			 System.out.print( StrArray[i]+" ");	 
	
	       }
		 
   }

}
