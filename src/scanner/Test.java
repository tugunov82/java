package scanner;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		boolean loop = true;
		
		while (loop){
		
		String operation = null;
		int in1 = 0, in2 = 0, result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.print("enter 1: " + '\n');
			if(sc.hasNextInt()){
				in1 = sc.nextInt();
				sc.nextLine();
			}
			
			System.out.print("enter op: " + '\n');
			if(sc.hasNextLine()){
			operation = sc.nextLine();
			}
			
			
			System.out.print("enter 2: " + '\n');
			if(sc.hasNextInt()){
				in2 = sc.nextInt();
				sc.nextLine();
			}
			
			switch (operation){
			
			case "+":
				result = in1 + in2;
				System.out.print("result: " + result + '\n');
				break;
				
			case "-":
				result = in1 - in2;
				System.out.print("result: " + result + '\n');
				break;
				
			case "*":
				result = in1 * in2;
				System.out.print("result: " + result + '\n');
				break;
				
			case "/":
				if(in2 == 0){
					System.out.print("divide by zero");
					return;
				}else{
					result = in1 / in2;
					System.out.print("result: " + result + '\n');
				}
				
			}
		}catch(Exception scanner) {
			sc.close();
		}
		
	}
  }	
}
