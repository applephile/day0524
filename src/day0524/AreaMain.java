package day0524;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		AreaCalculator num = new AreaCalculator();
		
		System.out.print("가로 : ");
		num.width = s.nextInt();
		System.out.print("세로 : ");
		num.height = s.nextInt();
		
		System.out.println("가로 길이가 " + num.width + "이고 세로 길이가 " + num.height + "인 직사각형의 면적은 " + num.areaResult(num.width, num.height) + "입니다.");

	}

}
