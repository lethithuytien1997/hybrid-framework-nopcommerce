package javaBasic;

import java.lang.reflect.Array;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_03_Condition_Stament {
	
	Scanner scanner = new Scanner (System.in);
	
	@Test
	public void TC_01() {
		int n = scanner.nextInt();
		
		String result = ((n%2) == 0) ? "n là số chẵn" : "n là số lẻ";
		System.out.println(result);
	}

	@Test
	public void TC_02() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a > b) {
			System.out.println("a lớn hơn b");
		}
		else if (a < b) {
			System.out.println("a nhỏ hơn b");
		}
		else
			System.out.println("a bằng b");
	}
	
	@Test
	public void TC_03() {
		String name1 = scanner.nextLine();
		String name2 = scanner.nextLine();
		
		if(name1.equals(name2)) {
			System.out.println("2 người cùng tên");
		}
		else
			System.out.println("2 người khác tên");
	}
	
	@Test
	public void TC_04() {
		int array[] = new int[3];
		for (int i = 0; i <= 2; i++) {
			array[i] = scanner.nextInt();
		}
		int max = 0;
		for (int i = 0; i <= 2; i++) {
			max = array[0];
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Số lớn nhất là: " + max);
	}
	
	@Test
	public void TC_05() {
		int a = scanner.nextInt();
		
		if(10 <= a && a <= 100) {
			System.out.println("a nằm trong khoảng [10,100]");
		}
		else
			System.out.println("a không nằm trong khoảng [10,100]");
	}
	
	@Test
	public void TC_06() {
		float a = scanner.nextFloat();
		
		if(a < 5) {
			System.out.println("Điểm D");
		}
		else if (5 <= a && a < 7.5) {
			System.out.println("Điểm C");
		}
		else if (7.5 <= a && a < 8.5) {
			System.out.println("Điểm B");
		}
		else if (8.5 <= a && a < 10) {
			System.out.println("Điểm A");
		}
		else
			System.out.println("Điểm không hợp lệ");
	}
	
	@Test
	public void TC_07() {
		int a = scanner.nextInt();
		
		if(a == 2) {
			System.out.println("Tháng này có 28 ngày");
		}
		else if(a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
			System.out.println("Tháng này có 31 ngày");
		}
		else if(a == 4 || a == 6 || a == 9 || a == 11) {
			System.out.println("Tháng này có 30 ngày");
		}
		else
			System.out.println("Tháng nhập vào không hợp lệ");
	}
}
