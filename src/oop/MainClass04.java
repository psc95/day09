package oop;

import java.util.Scanner;

/*
 	method : 어떠한 기능을 가지고 있는 것
 	 - 소괄호가 있으면 대부분 어떠한 기능이라고 보면된다.
 	 - method이름을 만드는 방식은 변수이름 만드는 것과 동일하다.
 	 	- 해당 기능의 내용과 부합한 이름으로 만든다.
 	 	- 합성어면 합성어의 첫 문자는 대문자 sumFunc();
 */
class TestClass04{
	public void test() {
		System.out.println("test 호출");
	}
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		int sum = 0;
		for(int i = 0; i <= num; i++) {
			sum+=i;
		}
		System.out.println("1~"+num+"까지의 합 : "+sum);
		
	}
	
}

public class MainClass04 {
public static void main(String[] args) {
	TestClass04 t = new TestClass04();
	t.test();
	System.out.println("main시작");
	t.sumFunc();
	System.out.println("종료~~~");
}
}
