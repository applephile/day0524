package day0524;

public class StaticClass {

	public static void main(String[] args) {
		
		CarSta.showSumSta();
		
		CarSta cs1 = new CarSta();
		
		cs1.setCarSta(1111, 11.22);
		
		CarSta.showSumSta();
		
		CarSta cs2 = new CarSta();
		
		CarSta.showSumSta();
	}

}
