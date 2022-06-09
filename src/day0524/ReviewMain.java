package day0524;

class ReviewMain {
	public static void main(String[] args) {
	
		System.out.println(sum(1));
	}
	
	public static int sum(int num) {
		System.out.println("시작 " + num);
		
		int result = 0;
		if(num > 3) {
			System.out.println("끝 " + num);
			return num;
		} else {
			result = sum(num + 1);
		}
		System.out.println("종료 " + num);
		return result;
	}

}
