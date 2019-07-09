package phone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class MyException extends Exception{
	public MyException(String s){
	
	 super(s);
  }
}


public class Main {

	public static void main(String[] args) throws FileNotFoundException, MyException {
		
		File file = new File ("/Users/hannahmao/Desktop/JavaTraining/assignements/Java_003/phone/file.txt");
		PrintWriter printWriter = new PrintWriter (file);
		
		String[][]phoneBook= new String[6][3]; //[row][column]
		phoneBook[0][0]="Name";
		phoneBook[0][1]="Phone";
		phoneBook[0][2]="City";
		
		Scanner s= new Scanner(System.in);
		//String input = " "; 
		
		 // Enter Matrix Data
        enterMatrixData( s, phoneBook, 4, 3);
        
        // Print Matrix Data
        printMatrix(phoneBook,4, 3);
        
        //Print Matrix File
        printMatrixFile(printWriter, phoneBook,4, 3);
        s.close();
	}
	
	
	 public static void enterMatrixData(Scanner s, String[][] matrix, int matrixRow, int matrixCol) throws MyException{
	     System.out.println("Enter Matrix Data in the order of Name, Phone, City,");
	       
	       String input = null;
	          for (int i = 0; i < matrixRow-1; i++)
	          {
	              for (int j = 0; j < matrixCol; j++)
	              {
	            	  input = s.nextLine();
	                  matrix[i+1][j] = input;
	                  
	                  if(input.equals("")) { 
	 	            	 throw new MyException(" You have entered an empty entry,please retry");
	 	              } 
	            
	               
	              }
	              
	              System.out.println("Do you accept the row?(press 1 to accept, press 2 to type new row");
	             // press 1 to accept
	             
//	              if(s.nextLine()=="1") {
//	              s.nextLine(); 
//	              }
	              
////	              if(s.nextLine()=="2") {
////	            	  s.nextLine(); 
////	            	  s.nextLine(); 
////	            	  //s.nextLine(); 
////	            	  
////	              }
//	              
	              
	          }   	              
	      
	     }
	          
	  
	  
//	  private static String validateInput(Scanner s) {
//		 
//		boolean flip = true;
//		
//		while(flip) {
//			//System.out.println("Enter Matrix Data in the order of Name, Phone, City,");
//			try {
//				String input = s.nextLine();
//				 if(input.equals("")) { 
//	            	 throw new MyException(" You have entered an empty entry,please retry");
//	              } 
//				 if(input.equals("1")) {
//					 System.out.println("Awesome");
//					 
//				 }
//				 
//                 if(input.equals("2")) {
//					 
//				           }
//				 
//				 
//				 else {
//	            	  //System.out.println("Input: ");
//	            	  flip = false;
//	            	  return input;
//	              }
//			} catch (MyException e) {
//				e.printStackTrace();
//				
//			}
//		}
//		return null;
//	}


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
