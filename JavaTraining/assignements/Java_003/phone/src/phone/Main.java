package phone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File ("/Users/hannahmao/Desktop/JavaTraining/assignements/Java_003/phone/file.txt");
		PrintWriter printWriter = new PrintWriter (file);
		
		String[][]phoneBook= new String[6][3]; //[row][column]
		phoneBook[0][0]="Name";
		phoneBook[0][1]="Phone";
		phoneBook[0][2]="City";
		
		Scanner s= new Scanner(System.in);
		

		
		 // Enter Matrix Data
        enterMatrixData(s, phoneBook, 6, 3);
        
        // Print Matrix Data
        printMatrix(phoneBook,6, 3);
        
        //Print Matrix File
        printMatrixFile(printWriter, phoneBook,6, 3);

	}
	
	
	 public static void enterMatrixData(Scanner s, String[][] matrix, int matrixRow, int matrixCol){
	     System.out.println("Enter Matrix Data in the order of Name, Phone, City,");
	          
	          for (int i = 0; i < matrixRow-1; i++)
	          {
	              for (int j = 0; j < matrixCol; j++)
	              {
	                  matrix[i+1][j] = s.nextLine();
	              }
	          }
	  }
	  
	  public static void printMatrix(String[][] matrix, int matrixRow, int matrixCol){
	    System.out.println("Your Matrix is : ");
	    
	    System.out.printf("%-20s", matrix[0][0]);
	    System.out.printf("%-20s", matrix[0][1]);
	    System.out.printf("%-20s", matrix[0][2]);
	    System.out.println();
	        
	        for (int i = 0; i < matrixRow-1; i++)
	        {
	            for (int j = 0; j < matrixCol; j++)
	            {
	                System.out.printf("%-20s",matrix[i+1][j]);
	            }
	             
	            System.out.println();
	        }
	  }
	  
	  
	  public static void printMatrixFile(PrintWriter writefile, String[][] matrix, int matrixRow, int matrixCol){
		    writefile.println("Your Matrix is : ");
		    
		    writefile.printf("%-20s", matrix[0][0]);
		    writefile.printf("%-20s", matrix[0][1]);
		    writefile.printf("%-20s", matrix[0][2]);
		    writefile.println();
		        
		        for (int i = 0; i < matrixRow-1; i++)
		        {
		            for (int j = 0; j < matrixCol; j++)
		            {
		                writefile.printf("%-20s",matrix[i+1][j]);
		            }
		             
		            writefile.println();
		        }
		        writefile.close (); 
		  }	
	  
	
}
