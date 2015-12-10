package scanner;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		int firstIn = 0, secondIn = 0, sum;

		Scanner sc = new Scanner(System.in);
		
		try{
				
				System.out.print("enter the first number: ");
				if(sc.hasNextInt()){
					firstIn = sc.nextInt();
					System.out.println(" ");
				}else System.out.println("hernya");
				
				System.out.print("enter the second number: ");
				if(sc.hasNextInt()){
					secondIn = sc.nextInt();
					System.out.println(" ");
				}else System.out.println("hernya");
				
				sum = firstIn + secondIn;
				System.out.println("the sum is " + sum);
		
	
		}finally {
			sc.close();
		}
	}	
}
