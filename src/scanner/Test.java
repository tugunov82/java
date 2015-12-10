package scanner;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		String operation;
		
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.print("enter: ");
			if(sc.hasNextLine()){
				operation = sc.nextLine();
			}
			
		}finally{
			
		}sc.close();
		
	}

}
