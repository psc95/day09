package oop;

import java.util.Scanner;

public class TestClass08 {
	public static String[] inputName() {
		Scanner input = new Scanner(System.in);
		String[] strArr = new String[3];
		System.out.println("이름 입력");
		for(int i = 0;i<strArr.length;i++) {
			strArr[i] = input.next();
		}
		return strArr;
	}
	
	public static void printName() {
		String[] name= inputName();
		for(int i = 0;i<name.length;i++) {
			System.out.println(name[i]);
		}
	}
	
	//public static void inputName(String[] strArr) {
//	Scanner input = new Scanner(System.in);
//	System.out.println("이름 입력");
//	for(int i = 0;i<strArr.length;i++) {
//		strArr[i] = input.next();
//	}
//}
//
//public static void printName() {
//	String[] strArr = new String[3];
//	inputName(strArr);
//	for(int i = 0;i<strArr.length;i++) {
//		System.out.println(strArr[i]);
//	}
//}
	

}
