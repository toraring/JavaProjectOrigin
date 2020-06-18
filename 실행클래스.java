package object;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Random;

public class 실행클래스 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		ss.accept();
		System.out.println("클라이언트 접속!!!!");
		
		// 1. import 과정 거칠 것(쉬프트 컨트, 2. ()안에 뭔가 입력
//		Scanner s = new Scanner(System.in);
//		int input = s.nextInt();
//		System.out.println("입력값은?" + input);
//		
		//에러 없애기; shift + ctrl + o(알파벳)
		Random r = new Random();
		int num = r.nextInt(6);
		System.out.println("랜덤값은?" + num);
		
		// 주석처리; 영역지정 후  ctrl + / 또는 shift + Ctrl +c
//		for(int i = 0; i < s.nextInt(); i++) {
//			
//		}
		 
		
		TV t1 = new TV();
		TV t2 = new TV();
		
		t1.show();
		t2.show();
		
		System.out.println(t1); 
		System.out.println(t2);
		System.out.println(t1 == t2);
	}
}
