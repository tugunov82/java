package scanner;

import java.util.Scanner;

public class Calculator {

//<<<<<<< HEAD
	public static void main(String[] args) {
		
		boolean loop = true;
		while(loop){
		
		int input1 = 0, input2 = 0, result = 0;
		String operation = null;
		
		
		
		
		Scanner digits = new Scanner(System.in);
//		Scanner loopSC = new Scanner(System.in);
		Scanner opSC = new Scanner(System.in);
		
		try{
			
			System.out.print("������� ������ �����: ");
			if(digits.hasNextInt()){
				input1 = digits.nextInt();
			}else {
				System.out.println("hernya v input1");
				continue;
			}
			
			System.out.print("+, -, / ��� *");
			if(opSC.hasNextLine()){
				operation = opSC.nextLine();
			}
			
			
			switch (operation){
			
			case "+":
				System.out.print("������� ������ �����: ");
				if(digits.hasNextInt()){
					input2 = digits.nextInt();
					digits.nextLine();
				}
				result = input1 + input2;
				System.out.println("���������: " + result);
			break;
			
			case "-":
				System.out.print("������� ������ �����: ");
				if(digits.hasNextInt()){
					input2 = digits.nextInt();
					digits.nextLine();
				}
				result = input1 - input2;
				System.out.println("���������: " + result);
			break;
			
			case "*":
				System.out.print("������� ������ �����: ");
				if(digits.hasNextInt()){
					input2 = digits.nextInt();
					digits.nextLine();
				}
				result = input1 * input2;
				System.out.print("���������: " + result);
			break;
			
			case "/":
				System.out.print("������� ������ �����: ");
				if(digits.hasNextInt()){
					input2 = digits.nextInt();
					digits.nextLine();
				}
				if(input2 == 0){
					System.out.println("�� ���� ������ ������!!11");
					continue;
				}
				result = input1 / input2;
				System.out.println("���������: " + result);
			break;
			
			default: System.out.println("hernya");
			}
			
		}catch (Exception scanner){
			digits.close();
			opSC.close();
		}
		
		
////=======
//    public static void main(String[] args) {
//
//        boolean loop = true;
//
//        String operation = null;
//        Scanner digits = new Scanner(System.in);
//        Scanner opSC = new Scanner(System.in);
//        Integer result;
//
//        do {
//            int input1 = 0, input2 = 0;
//            result = null;
//            try {
//                System.out.print("������� ������ �����: ");
//                if (digits.hasNextInt()) {
//                    input1 = digits.nextInt();
//                } else {
//                    System.out.println("hernya v input1");
//                }
//
//                System.out.print("+, -, / ��� * ");
//                if (opSC.hasNextLine()) {
//                    operation = opSC.nextLine();
//                }
//
//                System.out.print("������� ������ �����: ");
//                if (digits.hasNextInt()) {
//                    input2 = digits.nextInt();
//                    digits.nextLine();
//                }
//
//                switch (operation) {
//                    case "+":
//                        result = input1 + input2;
//                        break;
//                    case "-":
//                        result = input1 - input2;
//                        break;
//                    case "*":
//                        result = input1 * input2;
//                        break;
//                    case "/":
//                        if (input2 == 0) {
//                            System.out.println("�� ���� ������ ������!!11");
//                            continue;
//                        }
//                        result = input1 / input2;
//                        break;
//                    default:
//                        System.out.println("hernya");
//                }
//            } catch (Exception scanner) {
//                System.out.println(scanner);
//            }
//            if (result != null) {
//                System.out.println("���������: " + result);
//            }
////>>>>>>> c7e76e40f1ba6134c3415773881a7b082dc607c5
////			System.out.print("������� ����� �������, ����� ������ ������� ��� ��� ��� ������" + '\r');
//            //startOver = loopSC.nextLine();
////            if ("���".equals(startOver)) {
////                loop = false;
////                System.out.println("���-�� ����-����");
////            }
//        } while (result != null && loop);
//        digits.close();
//        opSC.close();
    }
}
}
