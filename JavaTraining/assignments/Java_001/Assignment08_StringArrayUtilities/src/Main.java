
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myList[]= {"Bozo","Foobar","Delta","Foozball","Demo","Money","zoo"};
		
		
		Match mySearch1 = new Match();
		Match mySearch2 = new Match();
		Match mySearch3 = new Match();
		Match mySearch4 = new Match();
		Match mySearch5 = new Match();
		Match mySearch6 = new Match();
		Match mySearch7 = new Match();
		
		
		boolean Scenario1= mySearch1.arrayHasExactMatch(myList,"zo", false);
		boolean Scenario2= mySearch2.arrayHasExactMatch(myList,"zoo", false);
		boolean Scenario3= mySearch3.arrayHasExactMatch(myList,"zoo", true);
		boolean Scenario4= mySearch4.arrayHasExactMatch(myList,"foo", true);
		boolean Scenario5= mySearch5.arrayHasExactMatch(myList,"foo", false);
		boolean Scenario6= mySearch6.arrayHasExactMatch(myList,"delta", true);
		boolean Scenario7= mySearch7.arrayHasExactMatch(myList,"Delta", true);
		
		
        IndexMatch mySearch8 = new IndexMatch();
        IndexMatch mySearch9 = new IndexMatch();
        IndexMatch mySearch10 = new IndexMatch();
        IndexMatch mySearch11 = new IndexMatch();
        IndexMatch mySearch12 = new IndexMatch();
        IndexMatch mySearch13 = new IndexMatch();
        IndexMatch mySearch14 = new IndexMatch();
		
		int Scenario8= mySearch8.indexOfOccuranceInArray(myList,"zo", false);
		int Scenario9= mySearch9.indexOfOccuranceInArray(myList,"zoo", false);
		int Scenario10= mySearch10.indexOfOccuranceInArray(myList,"zoo", true);
		int Scenario11= mySearch11.indexOfOccuranceInArray(myList,"foo", true);
		int Scenario12= mySearch12.indexOfOccuranceInArray(myList,"foo", false);
		int Scenario13= mySearch13.indexOfOccuranceInArray(myList,"delta", true);
		int Scenario14= mySearch14.indexOfOccuranceInArray(myList,"Delta", true);
	
			
		System.out.println("This is a test of the arrayHasExactMatch and indexOfOccurenceInArray methods");
		System.out.println("The array to test contains the following items");
		System.out.println("{“Bozo”, “FooBar”, “Delta”, “Foozball”, “Demo”, “Money”, “Zoo”}");
		
		System.out.println("\nScenario 1\n"+"arrayHasExactMatch(myList,\"zo\", false): is "+Scenario1);
		System.out.println("\nScenario 2\n"+"arrayHasExactMatch(myList,\"zoo\", false): is "+Scenario2);
		System.out.println("\nScenario 3\n"+"arrayHasExactMatch(myList,\"zoo\", true): is "+Scenario3);
		System.out.println("\nScenario 4\n"+"arrayHasExactMatch(myList,\"foo\", true): is "+Scenario4);
		System.out.println("\nScenario 5\n"+"arrayHasExactMatch(myList,\"foo\", false): is "+Scenario5);
		System.out.println("\nScenario 6\n"+"arrayHasExactMatch(myList,\"delta\", true): is "+Scenario6);
		System.out.println("\nScenario 7\n"+"arrayHasExactMatch(myList,\"Delta\", true): is "+Scenario7);
		
		System.out.println("\nScenario 8\n"+"indexOfOccuranceInArray(myList,\"zo\", false): is "+Scenario8);
		System.out.println("\nScenario 9\n"+"indexOfOccuranceInArray(myList,\"zoo\", false): is "+Scenario9);
		System.out.println("\nScenario 10\n"+"indexOfOccuranceInArray(myList,\"zoo\", true): is "+Scenario10);
		System.out.println("\nScenario 11\n"+"indexOfOccuranceInArray(myList,\"foo\", true): is "+Scenario11);
		System.out.println("\nScenario 12\n"+"indexOfOccuranceInArray(myList,\"foo\", false): is "+Scenario12);
		System.out.println("\nScenario 13\n"+"indexOfOccuranceInArray(myList,\"delta\", true): is "+Scenario13);
		System.out.println("\nScenario 14\n"+"indexOfOccuranceInArray(myList,\"Delta\", true): is "+Scenario14);
			

	}

}


