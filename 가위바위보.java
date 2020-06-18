public class 가위바위보{
	public static void main(String[] args) {
		// 가위 0 바위1 보2
		double 나 = (int) (Math.random() * 3); 
		double 너 = (int) (Math.random() * 3);
		System.out.printf("%s, %s", 나, 너);
	
		
		// 비교
		if(나 == 너) { //비긴경우
			System.out.println("비겼음");
		} else {
			if( (나+ 1) % 3== 너)
				System.out.println("나 졌음");
			} else {
				System.out.println("나 이겼음");
	}
		
}
	
		