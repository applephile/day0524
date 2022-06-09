package day0524;

public class MyMathMain1 {

	public static void main(String[] args) {
		MyMath1 mm1 = new MyMath1();
		
		System.out.println(mm1.add(3, 3));
		System.out.println(mm1.add(3.5f, 4.6f));
		
		int[] arr = {10, 20, 30};
		
		System.out.println(mm1.add(arr));
	}
	
}
