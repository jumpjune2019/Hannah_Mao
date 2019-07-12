package java1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String result1="Str1";
		
		System.out.println("Coin Flip Program\n");
		  
		Coinflip myObj1= new Coinflip();
		
       //calling the method that will return 1 or 2
		myObj1.flip();
		  
		//calling the method that will assign head if 1 is passed, and assign tail if 2 is passed
		myObj1.Flipresult(result1);
		  
	}

}
