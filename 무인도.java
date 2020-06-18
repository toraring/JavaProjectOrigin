
public class 무인도 {
	public static void main(String[] args) {
		// 무인도에 갇혔을 때 주사위 두개를 던져서 같은 수가 나오면 탈출한다.
		
		//while 반복
		boolean 같은수 = false;
		while(같은수 != true) {

			// 1. 주사위 두개를 던진다.
			// random은 0.0보다 크거나 같고 1.0보다 적은 수를 출력
			double 주사위1 = Math.random();
			double 주사위2 = Math.random();
			System.out.printf("%s, %s", 주사위1, 주사위2);
			System.out.println(); //줄바꿈
			System.out.printf("%s, %s", (int)(주사위1*6)+1, (int)(주사위2*6)+1);
					 
			// 2. 같은 수 인지 판단해본다.
			같은수 =  (int)(주사위1*6)+1 == (int)(주사위2*6)+1;
		}
		
		// 3. 같은 수이면 탈출한다. 만약 반복하려면 1~2만 반복. 탈출을 반복할 수 없음.
		if(같은수 == true) { // if(같은수) 
			System.out.println("탈출!");
		}
		
	}
}
