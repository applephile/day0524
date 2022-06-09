package day0524;

//class Data {
//	int x;
//}

public class Reference {
	
	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d.x) ");
		System.out.println("main() : x = " + d.x);
	}
	static void change(Data d) { 
		//change 메서드의 매개변수로 클래스 변수 Data d를 가지고 왔기 때문에 change메서드 내에서 d.x의 값을 변경한다는 것은 main메서드에 선언돼있는 d의 주소에 있는 d.x 값 자체를 변경시키는 것이다
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
