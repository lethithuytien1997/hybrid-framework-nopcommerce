package javaBasic;

import java.lang.reflect.Array;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_04_Switch_Case {
	
	Scanner scanner = new Scanner (System.in);
	
	@Test
	public void TC_01() {
		int n = scanner.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
			
		default:
			break;
		}
	}

	@Test
	public void TC_02() {
		String operator = scanner.nextLine();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		switch(operator){
		case "+":
			System.out.println("A + B = " + (a+b));
			break;
		case "-":
			System.out.println("A - B = " + (a-b));
			break;
		case "*":
			System.out.println("A * B = " + (a*b));
			break;
		case "/":
			System.out.println("A / B = " + (a/b));
			break;
			
		default:
			break;
		}
	}
	
	
	@Test
	public void TC_03() {
		int a = scanner.nextInt();
		
		switch(a) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng này có 31 ngày");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng này có 30 ngày");
			break;
		
		case 2:
			System.out.println("Tháng này có 28 ngày");
			break;
			
		default:
			break;
		}
	}
}
