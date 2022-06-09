package day0524;

import java.util.Scanner;

public class Recursive1 {
	
	public static void main(String[] args) {
		
		//팩토리얼
//		Scanner s = new Scanner(System.in);
//		
//		int fac = s.nextInt();
//		int mul = 1;
//		
//		for(int i=fac; i>0; i--) {
//			if(fac == 0) {
//				mul = 1;
//			}
//			mul *= i;
//		}
//		
//		System.out.println(mul);
		
		
		long result = factorial(3);
		System.out.println("3! = " + result);
		
	}
	
	static long factorial(int n) {
		long result = 0;
		
		if(n == 1) {
			return 1;
		} else {
			result = n * factorial(n-1);
		}
		return result;
	}
	
}
