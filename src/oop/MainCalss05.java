package oop;

import java.util.Scanner;

public class MainCalss05 {
public static void main(String[] args) {
	//첫번째 글자가 소문자면 변수 대문자면 객체!!
	TestClass05 t = new TestClass05();
	//		t는 참조형 변수
	
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("수 입력");
	num = input.nextInt();
	
	//인자값 또는 parameta
	t.sumFunc( num );
	//전달해주는 값과 받아주는 값에 자료형을 같게해줘야함
	System.out.println("sumFunc222");
	
	int s = 55;
	t.sumFunc2(num);
	System.out.println("1~"+num+"까지의 합 : "+s);
}
}
