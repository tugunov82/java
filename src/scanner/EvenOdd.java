package scanner;

import java.util.Scanner;




public class EvenOdd {
	
	public static void main(String[] args) {
		
		int input;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		
		
		try{
				if(sc.hasNextInt()){
					input = sc.nextInt();
					result = input % 2;
					if(result == 0){
					System.out.println("Your number is even");
					}else System.out.println("Your number is odd");
				}
				else System.out.println("hernya");
				
		}finally {
			sc.close();
		}
		
	}

}
