package oop;

public class MainClass02 {
public static void main(String[] args) {
	//메인 클래스에는 메인 메소드 넣어주기
	int a;
	TestClass02 num = new TestClass02();
	//첫번째 글자가 대문자이면 new를쓰기
	num.name = "홍길동";
	num.age = 100;
	
	System.out.println("이름 : " + num.name);
	System.out.println("나이 : " + num.age);
	
	
}
}
