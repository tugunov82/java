package scanner;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		String input = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a palindrome, 5 symbol max: ");
		
		try{
			if(sc.hasNextLine()){
				input = sc.nextLine().toLowerCase();
			}else System.out.println("hernya");
		}finally{
			sc.close();
		}
	// 0 1 2 3 4
		if((input.length() > 5)|(input.length() < 5)){
			System.out.println("hernya");
			return;
		}else if((input.charAt(0)== input.charAt(4))&(input.charAt(1)== input.charAt(3))){
			System.out.println("your word is a palindrome");
		}else System.out.println("your word isn't a palindrome");
	
}
	
}
