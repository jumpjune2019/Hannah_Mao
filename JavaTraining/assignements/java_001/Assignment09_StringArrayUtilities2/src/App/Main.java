package App;

import arrayutils.ArrUtil;

public class Main {

	public static void main(String[] args) {
		
		
String myList[]= {"Bozo","Foobar","Delta","Foozball","Demo","Money","zoo"};
		
			
		System.out.println("This is a test of the arrayHasExactMatch and indexOfOccurenceInArray methods");
		System.out.println("The array to test contains the following items");
		System.out.println("{“Bozo”, “FooBar”, “Delta”, “Foozball”, “Demo”, “Money”, “Zoo”}");
		
		System.out.println("\nScenario 1\n"+"arrayHasExactMatch(myList,\"zo\", false): is "+ArrUtil.arrayHasExactMatch(myList,"zo", false));
		System.out.println("\nScenario 2\n"+"arrayHasExactMatch(myList,\"zoo\", false): is "+ArrUtil.arrayHasExactMatch(myList,"zoo", false));
		System.out.println("\nScenario 3\n"+"arrayHasExactMatch(myList,\"zoo\", true): is "+ArrUtil.arrayHasExactMatch(myList,"zoo", true));
		System.out.println("\nScenario 4\n"+"arrayHasExactMatch(myList,\"foo\", true): is "+ArrUtil.arrayHasExactMatch(myList,"foo", true));
		System.out.println("\nScenario 5\n"+"arrayHasExactMatch(myList,\"foo\", false): is "+ArrUtil.arrayHasExactMatch(myList,"foo", false));
		System.out.println("\nScenario 6\n"+"arrayHasExactMatch(myList,\"delta\", true): is "+ArrUtil.arrayHasExactMatch(myList,"delta", true));
		System.out.println("\nScenario 7\n"+"arrayHasExactMatchmyList,\"Delta\", true): is "+ArrUtil.arrayHasExactMatch(myList,"Delta", true));
	
		
		System.out.println("\nScenario 8\n"+"indexOfOccuranceInArray(myList,\"zo\", false): is "+ArrUtil.indexOfOccuranceInArray(myList,"zo", false));
		System.out.println("\nScenario 9\n"+"indexOfOccuranceInArray(myList,\"zoo\", false): is "+ArrUtil.indexOfOccuranceInArray(myList,"zoo", false));
		System.out.println("\nScenario 10\n"+"indexOfOccuranceInArray(myList,\"zoo\", true): is "+ArrUtil.indexOfOccuranceInArray(myList,"zoo", true));
		System.out.println("\nScenario 11\n"+"indexOfOccuranceInArray(myList,\"foo\", true): is "+ArrUtil.indexOfOccuranceInArray(myList,"foo", true));
		System.out.println("\nScenario 12\n"+"indexOfOccuranceInArray(myList,\"foo\", false): is "+ArrUtil.indexOfOccuranceInArray(myList,"foo", false));
		System.out.println("\nScenario 13\n"+"indexOfOccuranceInArray(myList,\"delta\", true): is "+ArrUtil.indexOfOccuranceInArray(myList,"delta", true));
		System.out.println("\nScenario 14\n"+"indexOfOccuranceInArray(myList,\"Delta\", true): is "+ ArrUtil.indexOfOccuranceInArray(myList,"Delta", true));
				

	}

}
