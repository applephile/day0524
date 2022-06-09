package day0524;

public class CarSta {

	static int sum = 0; //클래스 변수
	int num;
	double gas;
	
	public CarSta() { //객체 생성과 동시에 실행되는 코드
		sum++;
	}
	
	void setCarSta(int n, double g) {
		num = n;
		gas = g;
		
		System.out.println("차량 번호 : " + num + ", 연료량 : " + gas + "로 설정");
	}
	
	public static void showSumSta() {
//		System.out.println("차량 번호 : " + num); num은 클래스 변수가 아니고 인스턴스 변수이기 때문에 클래스 메서드에서는 사용할 수 없다
//		클래서 메서드가 객체 생성 없이 사용될 경우 인스턴스 변수가 선언이 불가능하기 때문
//		반대로 인스턴스 메서드 안에는 클래스 변수, 인스턴스 변수 둘 다 사용할 수 있다
		System.out.println("자동차의 수 : " + sum + "대");
	}
	
	void showCarSta() {
		System.out.println("차량 번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
	
}
