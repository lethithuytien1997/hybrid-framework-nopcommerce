package javaBasic;

import org.testng.annotations.Test;

public class Topic_01_Data_Type {
	
	@Test
	public void TC_01() {
		int a = 6;
		int b = 2;
		
		System.out.println("Tong = " + (a + b));
		System.out.println("Hieu = " + (a - b));
		System.out.println("Tich = " + (a * b));
		System.out.println("Thuong = " + (a / b));
	}

	@Test
	public void TC_02() {
		float a = 7.8f;
		float b = 3.5f;
		
		System.out.println("Dien tich = " + (a * b));
	}
	
	@Test
	public void TC_03() {
		String name = "Automation Testing";
		
		System.out.println("Hello " + name);
	}
}
