package day0524;

public class Recursive4 {

	public static void main(String[] args) {
		
		System.out.println("n번째 fibonacci의 수는 : " + fibonacci(6));

	}
	
	public static int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
