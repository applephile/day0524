package day0524;

public class MyMath1 {
	//메소드의 오버로딩
	//여러 개의 메소드에 같은 이름으로 지정 가능
	
	//조건
	//메소드의 이름이 완전히 같아야 한다
	//매개변수의 개수 또는 자료형이 달라야 한다
	//매개변수는 같고 리턴타입이 다른 것은 성립하지 않는다
	
	
	int add (int a, int b) {
		return a + b;
	}
	float add(float a, float b) {
		return a + b;
	}
	int add(int[] a) {
		int result = 0;
		
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		
		return result;
	}
}
