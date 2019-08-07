/*
 * "Write a short program that prints each number from 1 to 100 on a new line.
 *  For each multiple of 3, print "Fizz" instead of the number. 
 *  For each multiple of 5, print "Buzz" instead of the number. 
 *  For numbers which are multiples of both 3 and 5, print "FizzBuzz" 
 *  	instead of the number." 
 *  
 */

package practice;

public class FizzBuzz {
	public static void main(String[]args){
		System.out.println("FizzBuzz: [mult 3 & 5 print FizzBuzz]");
		fizzbuzz();
		System.out.println("Fizz Buzz: [mult 3 & 5 print 'Fizz Buzz']");
		fizz_buzz();
		System.out.println("FizzBuzzFuzz: [mult 3 & 5 print 'Fuzz']");
		fizzbuzzfuzz();
	} // end method: main
	
	public static void fizzbuzz(){
		boolean multiple = false;
		
		for(int dex = 1; dex <= 100; dex++){
			multiple = false;
			
			if(dex%3 == 0){
				System.out.print("Fizz");
				multiple = true;
			}
			if(dex%5 == 0){
				System.out.print("Buzz");
				multiple = true;
			}
			if(!multiple){ System.out.print(dex); }
			
			System.out.println();
		}
	} // end method: fizzbuzz
	
	public static void fizz_buzz(){
		boolean multiple = false;
		
		for(int dex = 1; dex <= 100; dex++){
			multiple = false;
			
			if(dex%3 == 0){
				System.out.print("Fizz");
				multiple = true;
			}
			if(dex%5 == 0){
				if(multiple == true){
					System.out.print(" ");
				}
				
				System.out.print("Buzz");
				multiple = true;
			}
			
			if(!multiple){ System.out.print(dex); }
			
			System.out.println();
		}
	} // end method: fizz_buzz
	
	public static void fizzbuzzfuzz(){
		boolean mult3 = false, mult5 = false;
		
		for(int dex = 1; dex <= 100; dex++){
			mult3 = (dex%3 == 0);
			mult5 = (dex%5 == 0);
			
			if(mult3 && mult5){ System.out.println("Fuzz"); }
			else {
				if(!mult3 && !mult5){ System.out.println(dex); }
				else {
					if(mult3) { System.out.println("Fizz"); }
					if(mult5) { System.out.println("Buzz"); }
				}
			}
		}
	} // end method fizzbuzzfuzz
}
