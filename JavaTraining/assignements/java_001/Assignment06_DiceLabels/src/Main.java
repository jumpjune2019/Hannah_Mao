public class Main {

    public static void printRow(String[] row) {
        for (String i : row) {
            System.out.print(i);
            System.out.print("\t\t");
        }
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		//initialize the matrix
		String[][] matrix = {
				{" ","Die1		","Die2   	","Die3	   	","Die4	 ","Die5		","Die6	"},
				{"Die1","Snake eyes","        Australian yo","Little Joe From Kokomo","No field five","Easy six","        Six one you're done"},
				{"Die2","Ace caught a deuce","Ballerina","The fever","        Jimmie Hicks","Benny Blue","        Easy eight"},
				{"Die3","Easy four","        OJ","        Brooklyn Forest","        Big Red","        Eighter from Decatur","Nina from Pasadena"},
				{"Die4","Little Pheobe","        Easy six","Skinny Mckinney","        Square pair","Railroad nine","        Big one on the end"},
				{"Die5","Sixie from Dixie","Skinny Dugan","Easy eight","        Jesse James","Puppy paws","        Yo"},
				{"Die6","Devil","                Easy eight","Lou Brown","        Tennessee","Six five no jive","Midnight"},					
		};
		
	//print the matrix
	System.out.println("Dice Combinations Label Matrix");
  
       for(String[] row : matrix) {
          printRow(row);
       }    
	}
}

