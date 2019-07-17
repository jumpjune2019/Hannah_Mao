

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the game of Head or Tail where you will flip your life away!");
		
		System.out.println("Press the F key and flip your luck!");
		
		Scanner s= new Scanner(System.in);
		
		
		
	while (!(s.hasNext("Q")||s.hasNext("q"))) {
		

		if(s.hasNext("F")) {
			
			 MyRandom num= (m,n)-> {return (int)Math.floor(Math.random()*(m-n+n)+n);};
			
			 int result = num.Rand(2,1);
			
			 	MyFlip myflip= (f)-> { 
			 		   
			 		if (result==1) {
			 			System.out.print("The coin flip is: Head!"+"\n");
		
			 		}
			
			 		if(result==2) {
			 			System.out.print("The coin flip is: Tail!"+"\n");  
			 		}
			 	};
		
		
			 	myflip.flip(result);
	
				System.out.println("Press the F key to try again, press Q or q to quit");
				
			}
		    
		    s.nextLine();
				
			if(s.hasNext("Q")||s.hasNext("q")) {
				System.out.println("Thanks you for playing!");
				break;
			}	
			
		}

	}

}
