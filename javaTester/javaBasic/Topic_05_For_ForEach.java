package javaBasic;

import java.lang.reflect.Array;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_05_For_ForEach {

	Scanner scanner = new Scanner(System.in);

	@Test
	public void TC_01() {
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

	@Test
	public void TC_02() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}

	@Test
	public void TC_03() {
		int tong = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				tong = tong + i;
			}
		}
		System.out.println("Tổng các số chẵn từ 1 đến 10 là: " + tong);
	}
	
	@Test
	public void TC_04() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int tong = 0;

		for (int i = a; i <= b; i++) {
			tong = tong + i;
		}
		System.out.println("Tổng các số từ " + a + " đến " + b + " là: " + tong);
	}
	
	@Test
	public void TC_05() {
		int n = scanner.nextInt();
		int tong = 0;

		for (int i = 0; i <= n; i++) {
			if(i % 2 != 0) {
				tong = tong + i;
			}
		}
		System.out.println("Tổng các số lẻ từ 0 đến " + n + " là: " + tong);
	}
	
	@Test
	public void TC_06() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		for (int i = a; i <= b; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	@Test
	public void TC_07() {
		int n = scanner.nextInt();
		int giaithua = 1;
		for (int i = 1; i <= n; i++) {
			giaithua = giaithua * i;
		}
		System.out.println(n + " giai thừa =  " + giaithua);
	}
}
