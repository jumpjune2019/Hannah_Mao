package java3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		System.out.println("Press any key to throw a die and press Enter(or Q and Enter to quit)");
			
		SimpleDie mydie= new SimpleDie();
		Scanner s= new Scanner(System.in);
		
		while (!s.hasNext("Q")) {
			
			
			//you have rolled a ?
			mydie.rolldie();
			System.out.println("Play again (Y or y) and Enter, any other key and Enter to Quit");
	       
			
	        //if input are "Y" or "y"
			if((s.hasNext("Y"))||(s.hasNext("y"))) {
				
				//continue the game
						
			}
		
			s.nextLine();	
			
            //if input is any other key than "Y" or "y"
			if(!(s.hasNext("Y")||s.hasNext("y"))) {
				break;  //quit the game
		     
			}		

		}		
		
	}
				
}


