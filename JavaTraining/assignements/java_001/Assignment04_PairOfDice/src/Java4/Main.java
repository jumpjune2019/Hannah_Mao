package Java4;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		System.out.println("Press any key to throw a die and press Enter(or Q and Enter to quit)");
		
		PairOfDice mydie1= new PairOfDice();
		PairOfDice mydie2= new PairOfDice();
		Scanner s= new Scanner(System.in);
		
		while (!s.hasNext("Q")) {
			
			//you have rolled a ?
			System.out.println("You have roll the following: ");
			System.out.println("Firstdie: "+ mydie1.rolldie());
			System.out.println("Seconddie: "+ mydie2.rolldie());
			System.out.println("Play again (Y or y) and Enter, any other key and Enter to Quit");
			
			
	        //if input are "Y" or "y"
			if((s.hasNext("Y"))||(s.hasNext("y"))) {
				
		
			}
		
			s.nextLine();	
			
            //if input is any other key than "Y" or "y"
			if(!(s.hasNext("Y")||s.hasNext("y"))) {
				break;  //quit the game
		     
			}		

		}		
		
	}
}
				