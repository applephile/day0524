package day0524;

public class MyMathMain {

	public static void main(String[] args) {

		System.out.println(MyMath.add(200L, 100L));
		//클래스 메소드 static long add를 객체 생성없이 불러온 것
		
		MyMath mm = new MyMath();
		
		mm.a = 300L;
		mm.b = 400L;
		
		System.out.println(mm.add());
		//객체를 생성하여 long add 호출 
	}

}
