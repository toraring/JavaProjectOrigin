
public class 더하기 {
	public static void main(String[] args) {
		int 합 = 0;
		
		//		 1		2
		for(int 시작=1; 시작 <= 100; 시작++) {
		//		 3		 
			System.out.println(시작);
			합 = 합 + 시작;
		}
		System.out.println("합 = " + 합);
		// 1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 ...
	}
}
