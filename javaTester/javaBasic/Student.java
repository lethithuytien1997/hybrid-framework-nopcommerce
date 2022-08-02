package javaBasic;

import java.lang.reflect.Array;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Student {

	int ID;
	String name;
	int age;
	float score;
	
	@Test
	public static void main (String[] args) {
		Student[] student= new Student[3];
		student[0] = new Student(1, "Han", 18, 7.5f);
		student[1] = new Student(2, "Tan", 18, 8.5f);
		student[2] = new Student(3, "Sang", 18, 8f);
		for(int i = 0; i < 3; i++) {
			student[i].display();
		}
	}
	
	public Student(int ID, String name, int age, float score) {
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void display() {
		System.out.println("ID: " + ID);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Score: " + score);
	}
}
