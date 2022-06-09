package day0524;

public class Re {
	
	int max(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
		
		//반환값이 있을 경우엔 모든 경우의 수에서 반환될 수 있는 수를 모두 반환해줘야 한다
		//아래와 같이 모든 경우의 수를 따지지 않고 일부만 반환하게 될 경우 오류가 발생한다
//		int max(int a, int b) {
//			if(a > b) {
//				return a;
//			}
//		}
	}	
}
