package javaBasic;

import java.lang.reflect.Array;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_07_Array {

	Scanner scanner = new Scanner(System.in);

	//@Test
	public void TC_01() {
		int[] arr = {2, 7, 6, 8, 9};
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i];
			}
		}
		System.out.println("Số lớn nhất là: " + max);
	}

	//@Test
	public void TC_02() {
		int[] arr = {2, 7, 6, 8, 9};
		int tong = 0;
		
			tong = arr[0] + arr[arr.length - 1];
		
		System.out.println("Tổng của phần từ đầu và cuối: " + tong);
	}

	//@Test
	public void TC_03() {
		int[] arr = {2, 7, 6, 8, 9, 16, 17, 20};
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	//@Test
	public void TC_04() {
		int[] arr = {3, -7, 2, 5, 9, -6, 10, 12};
		int tong = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 0 && arr[i] % 2 != 0) {
				tong = tong + arr[i];
			}
		}
		System.out.println(tong);
	}
	
	//@Test
	public void TC_05() {
		int[] arr = {3, -7, 2, 5, 9, -6, 10, 12};
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 0 && arr[i] <= 10) {
				System.out.println(arr[i]);
			}
		}
	}
	
	@Test
	public void TC_06() {
		int[] arr = {3, -7, 2, 5, 9, -6, 10, 12};
		int tong = 0;
		for(int i = 0; i < arr.length; i++) {
				tong = tong + arr[i];
		}
		float avg = tong / arr.length;
		System.out.println("Sum = " + tong);
		System.out.println("Average = " + avg);
	}
}
