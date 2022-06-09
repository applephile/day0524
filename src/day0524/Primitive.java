package day0524;

class Data{
	int x; 
}

public class Primitive {
	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x) ");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x ) { 
		//change 메서드의 매개변수로 인스턴스 변수인 int x를 가지고 왔기 때문에 change메서드 내에서 x의 값을 변경하더라도 main메서드에 선언돼있는 d.x의 값 자체가 변경되는 것이 아니다
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
