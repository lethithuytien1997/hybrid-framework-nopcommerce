package javaBasic;

import java.lang.reflect.Array;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_08_String {

	Scanner scanner = new Scanner(System.in);

	@Test
	public void TC_01() {
		String textInput = scanner.nextLine();
		
		char arrChar[] = textInput.toCharArray();
		int count = 0;
		for (char c : arrChar) {
			if('A' <= c && c <= 'Z') {
				count += 1;
			}
		}
		System.out.println("Tổng số ký tự in hoa: " + count);
	}

	@Test
	public void TC_02() {
		String inputText = "Automation Testing 345 Tutorials Online 789";
		char inputChar[] = inputText.toCharArray();
		
		int counta = 0;
		for (char c : inputChar) {
			if(c == 'a') {
				counta += 1;
			}
		}
		System.out.println("Tổng số ký tự a: " + counta);
		
		System.out.println("Chuỗi có chứa Testing: " + inputText.contains("Testing"));
		
		System.out.println("Chuỗi bắt đầu bằng Automation: " + inputText.startsWith("Automation"));
		
		System.out.println("Chuỗi kết thúc bằng Online: " + inputText.endsWith("Online"));
		
		System.out.println("Vị trí của từ Tutorials: " + inputText.indexOf("Tutorials"));
		
		inputText = inputText.replace("Online", "Offline");
		System.out.println("Chuỗi sau khi thay thế: " + inputText);
		
		int count = 0;
		for (char c : inputChar) {
			if('0' <= c && c <= '9') {
				count += 1;
			}
		}
		System.out.println("Tổng số ký tự số: " + count);
	}

	@Test
	public void TC_03() {
		String textInput = scanner.nextLine();
		char arrChar[] = textInput.toCharArray();
		
		for(int i = arrChar.length - 1; i >= 0; i--) {
			System.out.print(arrChar[i]);
		}
	}
}
