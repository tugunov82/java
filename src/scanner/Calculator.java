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
			
			System.out.print("Введите первое число: ");
			if(digits.hasNextInt()){
				input1 = digits.nextInt();
			}else {
				System.out.println("hernya v input1");
				continue;
			}
			
			System.out.print("+, -, / или *");
			if(opSC.hasNextLine()){
				operation = opSC.nextLine();
			}
			
			
			switch (operation){
			
			case "+":
				System.out.print("Введите второе число: ");
				if(digits.hasNextInt()){
					input2 = digits.nextInt();
					digits.nextLine();
				}
				result = input1 + input2;
				System.out.println("Результат: " + result);
			break;
			
			case "-":
				System.out.print("Введите второе число: ");
				if(digits.hasNextInt()){
					input2 = digits.nextInt();
					digits.nextLine();
				}
				result = input1 - input2;
				System.out.println("Результат: " + result);
			break;
			
			case "*":
				System.out.print("Введите второе число: ");
				if(digits.hasNextInt()){
					input2 = digits.nextInt();
					digits.nextLine();
				}
				result = input1 * input2;
				System.out.print("Результат: " + result);
			break;
			
			case "/":
				System.out.print("Введите второе число: ");
				if(digits.hasNextInt()){
					input2 = digits.nextInt();
					digits.nextLine();
				}
				if(input2 == 0){
					System.out.println("на ноль делить нельзя!!11");
					continue;
				}
				result = input1 / input2;
				System.out.println("Результат: " + result);
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
//                System.out.print("Введите первое число: ");
//                if (digits.hasNextInt()) {
//                    input1 = digits.nextInt();
//                } else {
//                    System.out.println("hernya v input1");
//                }
//
//                System.out.print("+, -, / или * ");
//                if (opSC.hasNextLine()) {
//                    operation = opSC.nextLine();
//                }
//
//                System.out.print("Введите второе число: ");
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
//                            System.out.println("на ноль делить нельзя!!11");
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
//                System.out.println("Результат: " + result);
//            }
////>>>>>>> c7e76e40f1ba6134c3415773881a7b082dc607c5
////			System.out.print("Нажмите любую клавишу, чтобы начать сначала или нет для выхода" + '\r');
//            //startOver = loopSC.nextLine();
////            if ("нет".equals(startOver)) {
////                loop = false;
////                System.out.println("Все-го хоро-шего");
////            }
//        } while (result != null && loop);
//        digits.close();
//        opSC.close();
    }
}
}
