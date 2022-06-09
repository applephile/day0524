package day0524;

public class MyMath {
	
	long a;
	long b;
	static int c = 20;
	
	long add() {
		return a + b;
	}
	
	static void test() {
		System.out.println("c : " + c);
		
		MyMath m = new MyMath();
		System.out.println("a : " + m.a);
		//굳이 클래스 메소드에서 인스턴스 변수를 사용하려면 메소드 안에 객체를 선언해주면 된다
		
	}
	
	static long add(long a, long b) {
		return a + b;
	}
	
}
