
public class 연산자 {
	public static void main(String[] args) {
		int 합 = 0;
		합 = 1 + 2;
		System.out.println(합);
		
		합 = 합 + 3; // 합+= 3; 주석; comment; 컴퓨터가 아닌 사람에게 알리는 역할
		합 = 합 - 1; // 합 -= 1; 합--. == 같다. =! ?
		//& and. ㅣ or. % 나머지. = 대입. 
		
		// 나머지 연산자. == 은 true or false로 나와야함.
		int value = 2783;
		boolean 삼의배수   = value % 3 <= 0;
		// 풀어서 표현
		int 나머지 = value % 3;
		boolean 배수여부 = 나머지 == 0;
		
		System.out.println(삼의배수);
		
		
		
		
		
		
		
		
		
		
	}
}
