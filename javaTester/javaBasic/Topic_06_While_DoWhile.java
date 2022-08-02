package javaBasic;

import java.lang.reflect.Array;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

import org.testng.annotations.Test;

public class Topic_06_While_DoWhile {

	Scanner scanner = new Scanner(System.in);

	@Test
	public void TC_01() {
		int n = scanner.nextInt();

		while (n <= 100) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
			n++;
		}
	}

	@Test
	public void TC_02() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		while (a <= b) {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.println(a);
			}
			a++;
		}
	}

	@Test
	public void TC_03() {
		int n = scanner.nextInt();

		int i = 0;
		int tong = 0;
		while (i <= n) {
			if (i % 2 != 0) {
				tong = tong + i;
			}
			i++;
		}
		System.out.println(tong);
	}

	@Test
	public void TC_04() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		while (a <= b) {
			if (a % 3 == 0) {
				System.out.println(a);
			}
			a++;
		}
	}

	@Test
	public void TC_05() {
		int n = scanner.nextInt();

		int i = 1;
		int giaithua = 1;
		while (i <= n) {
			giaithua = giaithua * i;
			i++;
		}
		System.out.println(giaithua);
	}

	@Test
	public void TC_06() {
		int i = 1;
		int tong = 0;
		while (i <= 10) {
			if (i % 2 == 0) {
				tong = tong + i;
			}
			i++;
		}
		System.out.println(tong);
	}

	@Test
	public void TC_07() {
		String browser[] = {"Chrome", "Firefox", "IE", "Edge"};
		for(int i = 0; i < browser.length; i++) {
			if(browser[i].equals("IE")) {
				continue;
			}
			System.out.println(browser[i]);
		}
	}

	@Test
	public void TC_08() {
		int a = scanner.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("JAN");
			break;
		case 2:
			System.out.println("FEB");
			break;
		case 3:
			System.out.println("MAR");
			break;
		case 4:
			System.out.println("APR");
			break;
		case 5:
			System.out.println("MAY");
			break;
		case 6:
			System.out.println("JUN");
			break;
		case 7:
			System.out.println("JUL");
			break;
		case 8:
			System.out.println("AUG");
			break;
		case 9:
			System.out.println("SEP");
			break;
		case 10:
			System.out.println("OCT");
			break;
		case 11:
			System.out.println("NOV");
			break;
		case 12:
			System.out.println("DEC");
			break;
		}
	}
}
