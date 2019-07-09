package matrixchoice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File ("/Users/hannahmao/Desktop/JavaTraining/assignements/Java_003/matrixchoice/file1.txt");
		PrintWriter printWriter = new PrintWriter (file);
		
		
		String[][] matrix = {
				{" ","Die1","Die2","Die3","Die4","Die5","Die6"},
				{"Die1","Snake eyes","Australian yo","Little Joe From Kokomo","No field five","Easy six","Six one you're done"},
				{"Die2","Ace caught a deuce","Ballerina","The fever","Jimmie Hicks","Benny Blue","Easy eight"},
				{"Die3","Easy four","OJ","Brooklyn Forest","ig Red","Eighter from Decatur","Nina from Pasadena"},
				{"Die4","Little Pheobe","Easy six","Skinny Mckinney","Square pair","Railroad nine","Big one on the end"},
				{"Die5","Sixie from Dixie","Skinny Dugan","Easy eight","Jesse James","Puppy paws","Yo"},
				{"Die6","Devil","Easy eight","Lou Brown","Tennessee","Six five no jive","Midnight"},					
		};
		
		
		System.out.println("What do you want?");
		System.out.println("1) Print on screen only (press 1)");
		System.out.println("2) Print on file (press2)");
		System.out.println("3) Print on both (press3)");
		
		Scanner s= new Scanner(System.in);
		
		
			//press 1 to print on the screen
			if(s.hasNext("1")) {
		
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[i].length; j++) {
					System.out.printf("%-24s", matrix[i][j]);
		        
				    }
					System.out.println();
			     }
				//break;
			}	
		
			//press 2 to print on file
			if(s.hasNext("2")) {
				
		
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[i].length; j++) {
						printWriter.printf("%-23s", matrix[i][j]);
        
					}
					printWriter.println();
				}
	
				printWriter.close ();  
				
			}
			
			//press 3 to print to the screen and print on file
			if(s.hasNext("3")) {
				
				
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[i].length; j++) {
					System.out.printf("%-24s", matrix[i][j]);
				    }
					System.out.println();
			     }
				
				
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[i].length; j++) {
						printWriter.printf("%-23s", matrix[i][j]);
        
					}
					printWriter.println();
				   }
				printWriter.close ();  
				
			  }  		
			
	}
}
