import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	   // creating 21 dices by creating an array of objects
	//ArrayList<PairDice> tally= new ArrayList<Pair  Dice> ();
		PairDice pair= new PairDice();
		
		int totalcount=0;
		int occurance[]= new int [21];
		
		for  (int j=0;j<21;j++) {
			occurance[j]=0;
		
		}
		
		
	 for (int i=0;i<1000;i++) {
		 
			double firstroll=pair.rollfirstdie();
			double secondroll=pair.rollseconddie();
			
	
		if(((firstroll==2)&&(secondroll==1))||((firstroll==1)&&(secondroll==2))) {
			occurance[0]++;
			totalcount++;
		}
		
		if(((firstroll==3)&&(secondroll==1))||((firstroll==1)&&(secondroll==3))) {
			occurance[1]++;
			totalcount++;
		}
		
		if(((firstroll==3)&&(secondroll==2))||((firstroll==2)&&(secondroll==3))) {
			occurance[2]++;
			totalcount++;
		}
		
		
		if(((firstroll==4)&&(secondroll==1))||((firstroll==1)&&(secondroll==4))) {
			occurance[3]++;
			totalcount++;
		}
		
		if(((firstroll==4)&&(secondroll==2))||((firstroll==2)&&(secondroll==4))) {
			occurance[4]++;
			totalcount++;
		}
		
		if(((firstroll==4)&&(secondroll==3))||((firstroll==3)&&(secondroll==4))) {
			occurance[5]++;
			totalcount++;
		}
		
		if(((firstroll==5)&&(secondroll==1))||((firstroll==1)&&(secondroll==5))) {
			occurance[6]++;
			totalcount++;
		}
		
		if(((firstroll==5)&&(secondroll==2))||((firstroll==2)&&(secondroll==5))) {
			occurance[7]++;
			totalcount++;
		}
		
		
		if(((firstroll==5)&&(secondroll==3))||((firstroll==3)&&(secondroll==5))){
			occurance[8]++;
			totalcount++;
		}
		
		if(((firstroll==5)&&(secondroll==4))||((firstroll==4)&&(secondroll==5))) {
			occurance[9]++;
			totalcount++;
		}
		
		if(((firstroll==6)&&(secondroll==1))||((firstroll==1)&&(secondroll==6))) {
			occurance[10]++;
			totalcount++;
		}
		
		
		if(((firstroll==6)&&(secondroll==2))||((firstroll==2)&&(secondroll==6))) {
			occurance[11]++;
			totalcount++;
		}
		
		if(((firstroll==6)&&(secondroll==3))||((firstroll==3)&&(secondroll==6))) {
			occurance[12]++;
			totalcount++;
		}
		
		if(((firstroll==6)&&(secondroll==4))||((firstroll==4)&&(secondroll==6))) {
			occurance[13]++;
			totalcount++;
		}
		
		if(((firstroll==6)&&(secondroll==5))||((firstroll==5)&&(secondroll==6))) {
			occurance[14]++;
			totalcount++;
		}
		
		if((firstroll==1)&&(secondroll==1)) {
			occurance[15]++;
			totalcount++;
		}
		
		if((firstroll==2)&&(secondroll==2)) {
			occurance[16]++;
			totalcount++;	
		}
		
		
		if((firstroll==3)&&(secondroll==3)) {
			occurance[17]++;
			totalcount++;	
		}
		
		if((firstroll==4)&&(secondroll==4)) {
			occurance[18]++;
			totalcount++;	
		}
		
		if((firstroll==5)&&(secondroll==5)) {
			occurance[19]++;
			totalcount++;	
		}
		
		if((firstroll==6)&&(secondroll==6)) {
			occurance[20]++;
			totalcount++;	
		}
	 
}
		
	System.out.println("1000 Random 2 dice toss stats\n");
	
	System.out.println("Dice 2 and 1: "+ occurance[0]+" times");
	System.out.println("Dice 3 and 1: "+ occurance[1]+" times");
	System.out.println("Dice 3 and 2: "+ occurance[2]+" times");
	System.out.println("Dice 4 and 1: "+ occurance[3]+" times");
	System.out.println("Dice 4 and 2: "+ occurance[4]+" times");
	System.out.println("Dice 4 and 3: "+ occurance[5]+" times");
	System.out.println("Dice 5 and 1: "+ occurance[6]+" times");
	System.out.println("Dice 5 and 2: "+ occurance[7]+" times");
	System.out.println("Dice 5 and 3: "+ occurance[8]+" times");
	System.out.println("Dice 5 and 4: "+ occurance[9]+" times");
	System.out.println("Dice 6 and 1: "+ occurance[10]+" times");
	System.out.println("Dice 6 and 2: "+ occurance[11]+" times");
	System.out.println("Dice 6 and 3: "+ occurance[12]+" times");
	System.out.println("Dice 6 and 4: "+ occurance[13]+" times");
	System.out.println("Dice 6 and 5: "+ occurance[14]+" times");
	System.out.println("Dice 1 and 1: "+ occurance[15]+" times");
	System.out.println("Dice 2 and 2: "+ occurance[16]+" times");
	System.out.println("Dice 3 and 3: "+ occurance[17]+" times");
	System.out.println("Dice 4 and 4: "+ occurance[18]+" times");
	System.out.println("Dice 5 and 5: "+ occurance[19]+" times");
	System.out.println("Dice 6 and 6: "+ occurance[20]+" times");
	System.out.println("\ntotal counts: "+ totalcount);
		
	    
	}
}
