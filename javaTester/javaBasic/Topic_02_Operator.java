package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_02_Operator {
	
	Scanner scanner = new Scanner (System.in);
	
	@Test
	public void TC_01() {
		String name = scanner.nextLine();
		int age = scanner.nextInt();
		
		System.out.println("After 15 years, " + name + " will be " + (age + 15) + " years old!");
	}

	@Test
	public void TC_02() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping then a = " + a + ", b = " + b);
	}
	
	@Test
	public void TC_03() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a > b)
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
	}
}
