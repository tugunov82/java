package scanner;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		boolean loop = true;
		while(loop){
		
		int input1 = 0, input2 = 0, result = 0;
		String operation = null;
		String startOver = null;
		
		
		
		
		Scanner digits = new Scanner(System.in);
		Scanner loopSC = new Scanner(System.in);
		Scanner opSC = new Scanner(System.in);
		Scanner trash = new Scanner(System.in);
		
		try{
			
			System.out.println("input1 = " + input1);
			System.out.print("������� ������ �����: " + '\r');
			if(digits.hasNextInt()){
				System.out.println("input1 = " + input1);
				input1 = digits.nextInt();
				trash.nextLine();
			}else {
				System.out.println("hernya v input1");
				return;
			}
			
			System.out.print("+, -, / ��� *" + '\r');
			if(opSC.hasNextLine()){
				operation = opSC.nextLine();
			}
			
			
			switch (operation){
			
			case "+":
				System.out.println("������� ������ �����: " + '\r');
				if(digits.hasNextInt()){
					input2 = digits.nextInt();
					digits.nextLine();
				}
				result = input1 + input2;
				System.out.println("���������: " + result);
			break;
			
			case "-":
				System.out.println("������� ������ �����: " + '\r');
				if(digits.hasNextInt()){
					input2 = digits.nextInt();
					digits.nextLine();
				}
				result = input1 - input2;
				System.out.println("���������: " + result);
			break;
			
			case "*":
				System.out.println("������� ������ �����: " + '\r');
				if(digits.hasNextInt()){
					input2 = digits.nextInt();
					digits.nextLine();
				}
				result = input1 * input2;
				System.out.println("���������: " + result);
			break;
			
			case "/":
				System.out.print("������� ������ �����: " + '\r');
				if(digits.hasNextInt()){
					input2 = digits.nextInt();
					digits.nextLine();
				}
				if(input2 == 0){
					System.out.println("�� ���� ������ ������!!11");
					return;
				}
				result = input1 / input2;
				System.out.println("���������: " + result);
			break;
			
			default: System.out.println("hernya");
			}
			System.out.println("input1 = " + input1);
		}finally {
			digits.reset();
			digits.close();
			digits = null;
		}
		
		
//			System.out.print("������� ����� �������, ����� ������ ������� ��� ��� ��� ������" + '\r');
			//startOver = loopSC.nextLine();
			
			if("���".equals(startOver)){
				loop = false;
				System.out.println("���-�� ����-����");
			}
		
		
	}
	}
}
